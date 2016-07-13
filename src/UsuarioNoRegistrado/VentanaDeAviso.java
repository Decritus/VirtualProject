/*
 * Esta clase concuerda con el diagrama de clases en componentes y nombre
 * */
package UsuarioNoRegistrado;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import Interfaz.IUsuarioNoRegistrado;
import basededatos.BDPrincipal;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class VentanaDeAviso extends JFrame {

	private JPanel contentPane;
	private JLabel textoL;
	private JButton aceptarB;
	private String correo;
	private String contrasena;

	/**
	 * Create the frame.
	 * 
	 * @throws RemoteException
	 * @throws NotBoundException
	 */
	public VentanaDeAviso(String correo, String contrasena)
			throws RemoteException, NotBoundException {
		this.correo = correo;
		this.contrasena = contrasena;
		this.setVisible(true);
		setTitle("Mensaje");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 392, 142);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		if (comprobarDatos()) {
			textoL = new JLabel(
					"Cuenta reactivada.");
			textoL.setToolTipText("");
			textoL.setBounds(133, 0, 129, 59);
			contentPane.add(textoL);
			reactivar();
		} else {

		
		}
		aceptarB = new JButton("Aceptar");
		aceptarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aceptar();
			}
		});
		aceptarB.setBounds(143, 67, 89, 23);
		contentPane.add(aceptarB);
	}

	public void reactivar() throws RemoteException, NotBoundException {
		Registry registry = LocateRegistry.getRegistry();
		IUsuarioNoRegistrado IA = null;

		IA = (IUsuarioNoRegistrado) registry.lookup("NoRegistrado");
		IA.reactivar(correo);
	}

	public void aceptar() {
		dispose();
	}

	public boolean comprobarDatos() throws RemoteException, NotBoundException {
		Registry registry = LocateRegistry.getRegistry();
		IUsuarioNoRegistrado IA = null;

		IA = (IUsuarioNoRegistrado) registry.lookup("NoRegistrado");
		return IA.comprobarDatos(correo, contrasena);
	}

}
