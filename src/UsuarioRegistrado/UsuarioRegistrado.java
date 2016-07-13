package UsuarioRegistrado;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTextArea;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JScrollBar;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.swing.SwingConstants;

import basededatos.BDPrincipal;
import basededatos.Juego;
import basededatos.UsuarioActivado;
import Interfaz.IUsuarioNoRegistrado;
import Interfaz.IUsuarioRegistrado;
import UsuarioNoRegistrado.UsuarioNoRegistrado;
import Chat.*;

public class UsuarioRegistrado extends JFrame {

	private JPanel contentPane;
	private JLabel fotoPerfilL;
	private JLabel nombreUsuarioL;
	private JButton misFavoritosB;
	private JButton rankingMasJugadosB;
	private JButton cambiarPerfilB;
	private JButton juegosB;
	private JPanel cargarListadoP;
	private JButton desconectarB;
	private MisFavoritos fav;
	private VerRankingMasJugados verR;
	private AjustesPerfil ajus;
	private ChatUsuario chat;
	// JFrame abc;
	final UsuarioRegistrado este;
	public String dNI;
	UsuarioNoRegistrado padre;
	String email;
	String contrasena;

	/**
	 * Create the frame.
	 * 
	 * @param padre
	 * @param lanzarChat
	 * @throws RemoteException
	 * @throws NotBoundException
	 */
	public UsuarioRegistrado(final UsuarioNoRegistrado padre, String email,
			String contrasena, boolean lanzarChat) throws RemoteException,
			NotBoundException {
		this.email = email;
		this.contrasena = contrasena;
		// servidor ser = new servidor();
		este = this;
		this.setVisible(true);
		this.padre = padre;
		padre.getLoguearse().coloresCorrecto();
		padre.setVisible(false);
		obtenerDNIUsuarioRegistrado();
		setTitle("Casino Virtual");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 561, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		fotoPerfilL = new JLabel();
		fotoPerfilL.setBackground(new Color(0, 255, 0));
		fotoPerfilL.setBounds(444, 11, 75, 75);
		contentPane.add(fotoPerfilL);

		nombreUsuarioL = new JLabel("DNI: " + dNI);
		nombreUsuarioL.setBounds(336, 37, 98, 14);
		contentPane.add(nombreUsuarioL);

		cargarListadoP = new JPanel();
		cargarListadoP.setBounds(24, 131, 511, 204);
		fav = new MisFavoritos(this);
		fav.setBounds(0, 0, 511, 204);
		fav.setVisible(true);
		cargarListadoP.add(fav, BorderLayout.NORTH);

		contentPane.add(cargarListadoP);
		cargarListadoP.setLayout(new BorderLayout(0, 0));

		misFavoritosB = new JButton("Mis Favoritos");
		misFavoritosB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				misFavoritos();
			}
		});

		misFavoritosB.setBounds(167, 97, 183, 23);
		contentPane.add(misFavoritosB);

		rankingMasJugadosB = new JButton("Ranking M\u00E1s Jugados");
		rankingMasJugadosB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rankingMasJugados();
			}
		});
		rankingMasJugadosB.setBounds(348, 97, 183, 23);
		contentPane.add(rankingMasJugadosB);

		cambiarPerfilB = new JButton("Cambiar Perfil");
		cambiarPerfilB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cambiarPerfil();
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (NotBoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		cambiarPerfilB.setBounds(311, 63, 123, 23);
		contentPane.add(cambiarPerfilB);

		juegosB = new JButton("\r\nJuegos");
		juegosB = new JButton("");
		juegosB.setHorizontalAlignment(SwingConstants.CENTER);
		juegosB.setToolTipText("");
		juegosB.setIcon(new ImageIcon(UsuarioNoRegistrado.class
				.getResource("/imagenes/btonJugar.png")));
		juegosB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				juegos();
			}
		});
		juegosB.setBounds(125, 11, 155, 75);
		contentPane.add(juegosB);

		desconectarB = new JButton("");
		desconectarB.setHorizontalAlignment(SwingConstants.CENTER);
		desconectarB.setToolTipText("");
		desconectarB.setIcon(new ImageIcon(UsuarioNoRegistrado.class
				.getResource("/imagenes/exit.png")));
		desconectarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desconectar();

			}
		});
		desconectarB.setBounds(24, 6, 75, 65);
		contentPane.add(desconectarB);
		verR = new VerRankingMasJugados(this);
		// contentPane.add(verR);
		verR.setBounds(24, 131, 504, 204);
		verR.setVisible(false);
		cargarListadoP.add(verR);
		obtenerDatosUsuario();
		if (lanzarChat)
			chat = new ChatUsuario(email);
		//
	}

	public void cambiarPerfil() throws RemoteException, NotBoundException {
		try {
			JFrame datos = new AjustesPerfil(este);
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NotBoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public void obtenerDNIUsuarioRegistrado() throws RemoteException,
			NotBoundException {
		Registry registry = LocateRegistry.getRegistry();
		IUsuarioRegistrado IA = (IUsuarioRegistrado) registry
				.lookup("Registrado");
		this.dNI = IA.obtenerDNIUsuarioRegistrado(email, contrasena);

	}

	public void obtenerDatosUsuario() throws RemoteException, NotBoundException {
		Registry registry = LocateRegistry.getRegistry();
		IUsuarioRegistrado IA = (IUsuarioRegistrado) registry
				.lookup("Registrado");
		UsuarioActivado usuario = IA.obtenerDatosUsuario(dNI);
		fotoPerfilL.setIcon(new ImageIcon(DatosUsuario.class
				.getResource("/imagenes/" + usuario.getFoto())));
		repaint();
	}

	public void misFavoritos() {
		fav.setVisible(true);
		verR.setVisible(false);
		cargarListadoP.repaint();
		contentPane.repaint();
		repaint();
	}

	public void rankingMasJugados() {
		fav.setVisible(false);
		verR.setVisible(true);
		cargarListadoP.repaint();
		contentPane.repaint();
		repaint();
	}

	public void desconectar() {
		JFrame confirmar = new MensajeDesconectar(este, padre);
	}

	public void juegos() {
		JFrame juegos = null;
		try {
			juegos = new CatalogoDeJuegosUsuarioRegistrado(este);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

}