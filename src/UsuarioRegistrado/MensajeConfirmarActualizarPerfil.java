package UsuarioRegistrado;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import Interfaz.IUsuarioRegistrado;
import basededatos.BDPrincipal;
import basededatos.UsuarioActivado;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MensajeConfirmarActualizarPerfil extends JFrame {

	private JPanel contentPane;
	private JLabel mensajeL;
	private JButton siB;
	private JButton noB;
	final DatosUsuario padre;
	final UsuarioActivado usuario;

	/**
	 * Create the frame.
	 */
	public MensajeConfirmarActualizarPerfil(final DatosUsuario padre,
			 UsuarioActivado usuario) {
		
		this.padre = padre;
		this.usuario = usuario;
		this.setVisible(true);
		setTitle("Actualizar Jugador");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 392, 142);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		mensajeL = new JLabel("\u00BFDesea realmente actualizar los datos?");
		mensajeL.setToolTipText("");
		mensajeL.setBounds(66, 32, 338, 23);
		contentPane.add(mensajeL);

		siB = new JButton("Si");
		siB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					actualizarDatosUsuario();
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NotBoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(padre instanceof AjustesPerfil){

				try {
					((AjustesPerfil) padre).padre.obtenerDatosUsuario();
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NotBoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
		});
		siB.setBounds(66, 70, 89, 23);
		contentPane.add(siB);

		noB = new JButton("No");
		noB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				no();
			}
		});
		noB.setBounds(198, 70, 89, 23);
		contentPane.add(noB);
	}

	public void actualizarDatosUsuario() throws RemoteException, NotBoundException {
		Registry registry = LocateRegistry.getRegistry();
		IUsuarioRegistrado IA = (IUsuarioRegistrado) registry.lookup("Registrado");
		//IUsuarioRegistrado IA = new BDPrincipal();
		IA.actualizarDatosUsuario(usuario);
		dispose();
		padre.dispose();
	}

	
	public void no() {
		dispose();
	}

}
