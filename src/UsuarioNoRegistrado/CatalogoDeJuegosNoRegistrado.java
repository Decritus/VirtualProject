/*
x * Esta clase concuerda con el diagrama de clases en componentes y nombre 
 * Pero le falta la herencia de catalogo de juegos
 * */
package UsuarioNoRegistrado;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTextArea;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JScrollBar;

import Interfaz.IAdministrador;
import Interfaz.IUsuarioNoRegistrado;
import basededatos.BDPrincipal;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Timer;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CatalogoDeJuegosNoRegistrado extends CatalogoDeJuegos {

	private JPanel contentPane;
	// private JTable juegosT;
	private JLabel tiempoRestanteL;
	private JButton salirB;
	private JButton registrarseB;
	private Long horasDePartida;
	private Long horasJugadas;
	private UsuarioNoRegistrado padre;
	private CatalogoDeJuegosNoRegistrado este;

	/**
	 * Create the frame.
	 * 
	 * @throws NotBoundException
	 */
	public CatalogoDeJuegosNoRegistrado(final UsuarioNoRegistrado padre)
			throws RemoteException, NotBoundException {
		this.padre = padre;
		este = this;
		horasJugadas = devolverHorasJugadas();
		if (horasJugadas >= 24) {
			padre.setVisible(true);
			
			MensajeTiempoRestante men = new MensajeTiempoRestante();
			men.setLocationRelativeTo(padre);
			dispose();

		} else {
			this.setVisible(true);
			padre.setVisible(false);
			horasDePartida = System.currentTimeMillis();
			setTitle("Casino Virtual (No Registrado)");
			setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			setBounds(100, 100, 576, 384);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);

			super.contentPane.setBounds(10, 11, 372, 324);
			contentPane.add(super.contentPane);

			tiempoRestanteL = new JLabel("Le quedan " + (24 - horasJugadas)
					+ " horas de juego");
			tiempoRestanteL.setBounds(392, 11, 163, 14);
			contentPane.add(tiempoRestanteL);

			salirB = new JButton("Salir");
			salirB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					salir();

				}
			});
			salirB.setBounds(392, 70, 123, 23);
			contentPane.add(salirB);

			registrarseB = new JButton("Registrarse");
			registrarseB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					registrarse();
				}
			});
			registrarseB.setBounds(392, 36, 123, 23);
			contentPane.add(registrarseB);
			super.listarJuegos(padre);
		}
	}

	public void registrarse() {
		JFrame registrarse = new Registrarse(este);
	}

	public long devolverHorasJugadas() throws RemoteException,
			NotBoundException {
		Registry registry = LocateRegistry.getRegistry();
		IUsuarioNoRegistrado IA = null;

		IA = (IUsuarioNoRegistrado) registry.lookup("NoRegistrado");

		String ip = "";

		try {
			ip = InetAddress.getLocalHost().toString();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		long horas = 0;
		try {
			horas = IA.devolverHorasJugadas(ip);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return horas;

	}

	public void salir() {
		JFrame confirmarSalir = new MensajeConfirmarSalirNoRegistrado(
				horasDePartida, este, padre);
	}

}
