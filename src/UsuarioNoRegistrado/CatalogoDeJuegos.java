package UsuarioNoRegistrado;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JTable;

import basededatos.BDPrincipal;
import basededatos.Juego;
import UsuarioRegistrado.UsuarioRegistrado;
import AbrirJuego.AbrirFichaJuego;
import Interfaz.IAdministrador;
import Interfaz.IUsuarioNoRegistrado;
import Interfaz.IUsuarioRegistrado;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CatalogoDeJuegos extends JFrame {

	protected JPanel contentPane;
	protected JTable juegosT;
	protected Juego[] juegos;
	protected UsuarioRegistrado registrado = null;
	protected UsuarioNoRegistrado noRegistrado = null;
	/**
	 * Permite que la tabla sea scrollable
	 */
	JScrollPane scrollTabla;

	/**
	 * Create the frame.
	 */
	public CatalogoDeJuegos() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

	}

	public void listarJuegos(UsuarioRegistrado este) throws RemoteException {
		this.registrado = este;
		Registry registry = LocateRegistry.getRegistry();
		IUsuarioRegistrado IA = null;
		try {
			IA = (IUsuarioRegistrado) registry.lookup("Registrado");
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		llenarTabla(IA.listarJuegos());
		dibujarTabla();

	}

	/**
	 * Rellena la tabla
	 * 
	 * @param juegos
	 */
	private void llenarTabla(final Juego[] juegos) {
		this.juegos = juegos;
		String[] cabecera = { "Id", "Juego", "Fecha"};

		Object[][] datos = new Object[juegos.length][3];

		for (int i = 0; i < datos.length; i++) {
			datos[i][0] = juegos[i].getIdJuego();
			datos[i][1] = juegos[i].getNombre();
			datos[i][2] = juegos[i].getFechaAlta();
		}
		juegosT = new JTable(datos, cabecera);

		juegosT.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (e.getClickCount() == 2 && !e.isConsumed()) {
					String idJuego = juegosT.getValueAt(
							juegosT.getSelectedRow(), 0).toString();

					for (Juego juego : juegos) {
					System.out.println(juego.getIdJuego());
						if (Integer.toString(juego.getIdJuego()).equals(idJuego)) {
							
							if(registrado !=null){
								AbrirFichaJuego a=	new AbrirFichaJuego(juego, true, registrado.dNI);
							}else{
								try {
									AbrirFichaJuego a=	new AbrirFichaJuego(juego,false, InetAddress.getLocalHost().toString());
								} catch (UnknownHostException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
						
							break;
						}
					}
					
					e.consume();
				}
			}
		});

	}

	/**
	 * Dibuja la tabla
	 */
	private void dibujarTabla() {

		juegosT.setRowSelectionAllowed(false);
		juegosT.setBackground(new Color(127, 255, 212));

		juegosT.setRowSelectionAllowed(true);
		juegosT.setColumnSelectionAllowed(false);
		// juegosT.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollTabla = new JScrollPane(juegosT);

		contentPane.add(scrollTabla);

	}

	public void listarJuegos(UsuarioNoRegistrado este) throws RemoteException {
		this.noRegistrado = este;
		Registry registry = LocateRegistry.getRegistry();
		IUsuarioNoRegistrado IA = null;
		try {
			IA = (IUsuarioNoRegistrado) registry.lookup("NoRegistrado");
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		llenarTabla(IA.listarJuegosPublicos());
		dibujarTabla();

	}

}
