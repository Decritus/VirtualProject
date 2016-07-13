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
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MensajeConfirmarSalirNoRegistrado extends JFrame {

	private JPanel contentPane;
	long horasDePartida;
	private JLabel mensajeL;
	private JButton siB;
	private JButton noB;

	/**
	 * Create the frame.
	 */
	public MensajeConfirmarSalirNoRegistrado(Long horasDePartida,
			final JFrame padre, final JFrame abuelo) {
		this.horasDePartida = horasDePartida;
		final JFrame este = this;
		this.setVisible(true);

		setTitle("Cerrar Aplicaci\u00F3n");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 392, 142);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		mensajeL = new JLabel("\u00BFDesea realmente salir?");
		mensajeL.setToolTipText("");
		mensajeL.setBounds(122, 26, 165, 23);
		contentPane.add(mensajeL);

		siB = new JButton("Si");
		siB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					aumentarHorasJugadas();
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (NotBoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
				padre.dispose();
				abuelo.setVisible(true);
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

	public void aumentarHorasJugadas() throws RemoteException,
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
		// horasDePartida.
		long horas = (System.currentTimeMillis() - horasDePartida) / 3600000;

		IA.aumentarHorasJugadas(horas, ip);
	}

	public void no() {
		dispose();
	}
}
