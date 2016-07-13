/*
 * Esta clase concuerda con el diagrama de clases en componentes y nombre
 * */
package AbrirJuego;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;

import basededatos.QuejaUsuario;
import basededatos.UsuarioActivado;
import Interfaz.IUsuarioRegistrado;
import PersonalDeAtencionAlUsuario.QuejasUsuario;

import java.awt.Choice;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CrearTicket extends JFrame {

	private JPanel contentPane;
	private JComboBox asuntoCoB;
	private JLabel asuntoL;
	private JTextArea textoTA;
	private JButton cerrarB;
	private JButton enviarB;
	private JLabel textoL;
	private String idJugador;
	private CrearTicket este;

	/**
	 * Create the frame.
	 * @param idJugador 
	 */
	public CrearTicket(final String idJugador) {
		
		este= this;
		this.setVisible(true);
		this.idJugador = idJugador;
		
		setTitle("Abrir Ticket");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		asuntoCoB = new JComboBox();
		asuntoCoB.setBounds(10, 36, 414, 20);
		asuntoCoB.addItem("Problema al jugar");
		asuntoCoB.addItem("Problema con mi dinero");
		asuntoCoB.addItem("Problema con otros jugadores");
		asuntoCoB.addItem("Problema con las intrucciones del juego");
		
		contentPane.add(asuntoCoB);

		asuntoL = new JLabel("Asunto");
		asuntoL.setBounds(10, 11, 46, 14);
		contentPane.add(asuntoL);

		textoTA = new JTextArea();
		textoTA.setBounds(10, 94, 414, 140);
		textoTA.setLineWrap(true);
		contentPane.add(textoTA);

		cerrarB = new JButton("Cerrar");
		cerrarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cerrar();
			}
		});
		cerrarB.setBounds(335, 245, 89, 23);
		contentPane.add(cerrarB);

		enviarB = new JButton("Enviar");
		enviarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 enviar();
			}
		});
		enviarB.setBounds(236, 245, 89, 23);
		contentPane.add(enviarB);

		textoL = new JLabel("Texto");
		textoL.setBounds(10, 67, 46, 14);
		contentPane.add(textoL);
	}
	public void enviar(){
		QuejaUsuario queja = new QuejaUsuario();
		queja.setTexto(textoTA.getText());
		queja.setAsunto(asuntoCoB.getSelectedItem().toString());
		Registry registry = null;
		try {
			registry = LocateRegistry.getRegistry();
		} catch (RemoteException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		IUsuarioRegistrado IA = null;
		try {
			IA = (IUsuarioRegistrado) registry.lookup("Registrado");
		} catch (AccessException e2) {
		
			e2.printStackTrace();
		} catch (RemoteException e2) {
			
			e2.printStackTrace();
		} catch (NotBoundException e2) {
		
			e2.printStackTrace();
		}
		UsuarioActivado usuario = null;
		try {
			usuario = IA.obtenerDatosUsuario(idJugador);
		} catch (RemoteException e1) {
		
			e1.printStackTrace();
		}
		queja.setUsuario(usuario.getNombreUsuario());
		JFrame enviarTicket = new EnviarTicket(este, queja, usuario);

	}
	public void cerrar(){
		este.dispose();
	}
	
}
