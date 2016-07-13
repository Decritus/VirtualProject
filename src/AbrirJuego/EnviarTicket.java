/*
 * Esta clase concuerda con el diagrama de clases en componentes y nombre
 * */
package AbrirJuego;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import Interfaz.IUsuarioRegistrado;
import basededatos.QuejaUsuario;
import basededatos.UsuarioActivado;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class EnviarTicket extends JFrame {

	private JPanel contentPane;
	private JLabel textoL;
	private JButton aceptarB;
	JFrame padre;
	QuejaUsuario queja;
	UsuarioActivado usuario;
	/**
	 * Create the frame.
	 */
	public EnviarTicket(final JFrame padre, final QuejaUsuario queja, final UsuarioActivado usuario) {
		final JFrame este= this;
		this.queja=queja;
		this.usuario=usuario;
		this.padre=padre;
		this.setVisible(true);
		padre.setVisible(false);
		setTitle("Mensaje");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 392, 142);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textoL = new JLabel("Su queja/sugerencia ha sido mandada");
		textoL.setToolTipText("");
		textoL.setBounds(93, 0, 240, 67);
		contentPane.add(textoL);

		aceptarB = new JButton("Aceptar");
		aceptarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aceptar();
			}
		});
		aceptarB.setBounds(143, 67, 89, 23);
		contentPane.add(aceptarB);
	}
	public void aceptar(){
		Registry registry = null;
		try {
			registry = LocateRegistry.getRegistry();
		} catch (RemoteException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			IUsuarioRegistrado IA = (IUsuarioRegistrado) registry.lookup("Registrado");
		IA.crearTicket(queja, usuario);
		} catch (AccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NotBoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	
		dispose();
		padre.dispose();
	
	}

}
