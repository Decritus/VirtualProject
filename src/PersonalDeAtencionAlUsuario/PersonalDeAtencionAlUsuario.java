package PersonalDeAtencionAlUsuario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JList;

import java.awt.Color;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;

import basededatos.BDPrincipal;
import basededatos.QuejaUsuario;
import basededatos.UsuarioActivado;
import basededatos.UsuariosNoRegistrados;
import Chat.publico;
import Interfaz.IPersonalAtencionUsuario;

public class PersonalDeAtencionAlUsuario extends JFrame {

	private JPanel contentPane;
	private JButton salirB;
	private JButton quejasUsuarioB;
	private JButton controlVisitasB;
	private ListadoDeUsuarios lisUser;
	JFrame padre;
	ChatPersonalAtencionUsuario chat;
	final PersonalDeAtencionAlUsuario este;
	// Union con el sistema
	/**
	 * Create the frame.
	 * @throws RemoteException 
	 * @throws NotBoundException 
	 */
	public PersonalDeAtencionAlUsuario(final JFrame padre, boolean lanzarChat) throws RemoteException, NotBoundException {
	 este= this;
		this.setVisible(true);
		padre.setVisible(false);
		this.setVisible(true);
		setTitle("Administraci\u00F3n De Usuarios");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 534, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.padre = padre;
		padre.setVisible(false);
		lisUser = new ListadoDeUsuarios(this);
		lisUser.setBounds(23, 95, 494, 245);
		contentPane.add(lisUser);

		quejasUsuarioB = new JButton("Quejas De Usuarios");
		quejasUsuarioB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quejasUsuario();
			}
		});
		quejasUsuarioB.setBounds(73, 17, 161, 66);
		contentPane.add(quejasUsuarioB);

		controlVisitasB = new JButton("Control De Visitas");
		controlVisitasB.setBounds(317, 17, 161, 66);
		controlVisitasB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlVisitas();
			}
		});
		contentPane.add(controlVisitasB);

		salirB = new JButton("Salir");
		salirB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salir();
			}
		});
		salirB.setBounds(432, 350, 85, 47);
		contentPane.add(salirB);
		if(lanzarChat==true){
			// Este es el chat
			chat = new ChatPersonalAtencionUsuario("Atencion");
			chat.setBounds(0, 0, 156, 346);
			contentPane.add(chat);
		}
		
	}

	public void devolverVisibilidad() {
		padre.setVisible(true);
	}
	public void quejasUsuario(){
		try {
			QuejasUsuario que = new QuejasUsuario(este);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void controlVisitas(){
		ControldeVisitas conV = new ControldeVisitas(este);
	}
	public void salir(){
		JFrame salir = new MensajeConfirmarSalirAtencionUsuario(
				este);
	}
}
