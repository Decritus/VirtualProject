package AbrirJuego;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;

import javax.swing.JList;

import AbrirJuego.AbrirFichaJuego;
import Interfaz.IUsuarioNoRegistrado;
import Interfaz.IUsuarioRegistrado;
import basededatos.BDPrincipal;
import basededatos.Juego;
import basededatos.UsuarioActivado;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.StringTokenizer;

public class IntroducirCantidadInicial extends JPanel {

	JLabel introducirCantidadL;
	JTextField cantidadTF;
	JButton crearTicketB;
	String idJugador;
	AbrirFichaJuego padre;
	final UsuarioActivado u;

	public IntroducirCantidadInicial(final AbrirFichaJuego padre,
			final String idJugador) {
		this.padre = padre;
		this.idJugador = idJugador;
		u = obtenerUsuario();
		if (u == null) {
			cantidadTF = new JTextField();
			cantidadTF.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {

					if (isNumeric(cantidadTF.getText())) {
						if (Integer.parseInt(cantidadTF.getText()) != 0
								&& Integer.parseInt(cantidadTF.getText()) >= padre.juego
										.getImporte())
							padre.entrarB.setEnabled(true);
					} else {
						padre.entrarB.setEnabled(false);
					}
				}
			});
		} else {
			cantidadTF = new JTextField();
			cantidadTF.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {

					activarBoton();
				}
			});
		}
		setLayout(null);
		cantidadTF.setBounds(0, 69, 191, 20);
		add(cantidadTF);
		cantidadTF.setColumns(10);
		padre.entrarB.setEnabled(false);
		crearTicketB = new JButton("Crear Ticket");
		crearTicketB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearTicket();
			}
		});
		crearTicketB.setBounds(0, 0, 191, 23);
		add(crearTicketB);

		introducirCantidadL = new JLabel("Introduzca la cantidad inicial");
		introducirCantidadL.setBounds(0, 22, 191, 23);
		add(introducirCantidadL);

		JLabel minimoL = new JLabel("minimo: " + padre.juego.getImporte() + "");

		minimoL.setBounds(0, 46, 191, 14);
		add(minimoL);

	}

	/**
	 * La idea es evitar el registry que se crea en los juegos
	 * 
	 * @return
	 * @throws RemoteException
	 * @throws NotBoundException
	 */
	private UsuarioActivado obtenerUsuario() {
		Registry registryLocal = null;
		try {
			registryLocal = LocateRegistry.getRegistry();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		IUsuarioRegistrado IALocal = null;
		try {
			IALocal = (IUsuarioRegistrado) registryLocal.lookup("Registrado");
		} catch (AccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			return IALocal.obtenerDatosUsuario(idJugador);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private static boolean isNumeric(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	public void activarBoton() {
		if (isNumeric(cantidadTF.getText())) {
			if (Integer.parseInt(cantidadTF.getText()) <= u.getGanancias()
					&& Integer.parseInt(cantidadTF.getText()) != 0
					&& Integer.parseInt(cantidadTF.getText()) >= padre.juego
							.getImporte())
				padre.entrarB.setEnabled(true);
		} else {
			padre.entrarB.setEnabled(false);
		}
	}

	public void crearTicket() {
		CrearTicket cT = new CrearTicket(idJugador);
	}
}
