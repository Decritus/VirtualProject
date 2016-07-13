/*
 * Esta clase concuerda con el diagrama de clases en componentes y nombre
 * */
package AbrirJuego;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import basededatos.Juego;
import basededatos.UsuarioActivado;
import Interfaz.IAdministrador;
import Interfaz.IUsuarioRegistrado;
import RMI.ICasino;
import RMI.IJuego;
import UsuarioRegistrado.UsuarioRegistrado;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import javax.swing.JTextField;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AbrirFichaJuego extends JFrame implements ICasino {

	private JPanel contentPane;
	private JPanel imagenP;
	JButton entrarB;
	private JButton cerrarB;
	static AbrirFichaJuego frame;
	static Registry registry;
	static IJuego stub2;
	static ICasino stub;
	private IntroducirCantidadInicial icip;

	Juego juego;
	private String dni;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AbrirFichaJuego();
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		// SERVIDOR

		try {
			registry = LocateRegistry.createRegistry(2500);

			stub = (ICasino) UnicastRemoteObject.exportObject(frame, 0);
			registry.rebind("Casino", stub);

			System.err.println("Casino listo");
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}

		// SERVIDOR

	}

	public AbrirFichaJuego() {

		setTitle("Juego");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		imagenP = new JPanel();
		imagenP.setBackground(new Color(233, 150, 122));
		imagenP.setBounds(233, 11, 191, 127);
		contentPane.add(imagenP);

		entrarB = new JButton("Entrar");
		entrarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					registry = LocateRegistry.getRegistry(2500);
					stub2 = (IJuego) registry.lookup("Crasp");
					stub2.ponerSaldo(100, null);

				} catch (Exception e1) {
					System.err.println("Client exception: " + e1.toString());
					e1.printStackTrace();
				}
			}

		});
		entrarB.setBounds(233, 181, 191, 23);
		contentPane.add(entrarB);

		cerrarB = new JButton("Cerrar");

		cerrarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		cerrarB.setBounds(233, 215, 191, 23);
		contentPane.add(cerrarB);

	}

	/**
	 * Create the frame.
	 */
	public AbrirFichaJuego(final Juego juego, final boolean registrado,
			final String idJugador) {

		// SERVIDOR

		try {
			registry = LocateRegistry.getRegistry(2500);
			// registry = LocateRegistry.createRegistry(2500);
			frame = this;
			stub = (ICasino) UnicastRemoteObject.exportObject(frame, 0);
			registry.rebind("Casino", stub);

			System.err.println("Casino listo");
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}

		// SERVIDOR

		this.juego = juego;
		this.dni = idJugador;
		this.setVisible(true);
		setTitle("Estas jugando a: " + juego.getNombre());
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		imagenP = new JPanel();
		imagenP.setBackground(new Color(0, 0, 0));
		imagenP.setBounds(233, 11, 191, 127);
		contentPane.add(imagenP);
		JLabel image = new JLabel("");
		image.setBounds(0, 0, 191, 127);
		image.setHorizontalAlignment(SwingConstants.CENTER);
		image.setToolTipText("");
		// image.setIcon(new ImageIcon(AbrirFichaJuego.class
		// .getResource("/imagenes/crapsEditado.jpg")));
		try {
			image.setIcon(new ImageIcon(AbrirFichaJuego.class
					.getResource("/imagenes/" + juego.getImagen())));
		} catch (Exception e) {
			image.setIcon(new ImageIcon(AbrirFichaJuego.class
					.getResource("/imagenes/defecto.png")));
		}
		imagenP.add(image);

		JPanel ImagenInfo = new JPanel();
		ImagenInfo.setBounds(6, 6, 213, 240);
		contentPane.add(ImagenInfo);

		JLabel imagenInfo = new JLabel("");
		imagenInfo.setBounds(0, 0, 213, 240);
		imagenInfo.setHorizontalAlignment(SwingConstants.CENTER);
		imagenInfo.setToolTipText("");
		imagenInfo.setIcon(new ImageIcon(AbrirFichaJuego.class
				.getResource("/imagenes/info.jpg")));

		ImagenInfo.add(imagenInfo);
		entrarB = new JButton("Entrar");
		entrarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				entrar(registrado);
			}
		});
		entrarB.setBounds(233, 240, 191, 23);
		contentPane.add(entrarB);

		cerrarB = new JButton("Cerrar");

		cerrarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cerrar();
			}
		});
		cerrarB.setBounds(233, 274, 191, 23);
		contentPane.add(cerrarB);
		if (registrado) {
			icip = new IntroducirCantidadInicial(this, idJugador);
			icip.setBounds(233, 140, 200, 100);
			contentPane.add(icip);
		}

	}

	@Override
	public void acabado(int ganancias, UsuarioActivado usuario)
			throws RemoteException {
		System.out.println("El juego ha acabado");
		System.out.println("Aqui va el saldo: " + ganancias);
		if (usuario != null) {
			usuario.setGanancias(usuario.getGanancias() + ganancias);
			try {
				actualizarSaldo(usuario);
			} catch (NotBoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private void anadirMasJugado() throws RemoteException, NotBoundException {
		Registry registry = LocateRegistry.getRegistry();
		IUsuarioRegistrado IA = (IUsuarioRegistrado) registry
				.lookup("Registrado");
		IAdministrador IB = (IAdministrador) registry.lookup("Administrador");
		UsuarioActivado usuario = IA.obtenerDatosUsuario(dni);
		Juego j = IB.obtenerDatos(juego.getIdJuego());
		IA.anadirMasJugado(j, usuario);

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
			return IALocal.obtenerDatosUsuario(dni);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private void actualizarSaldo(UsuarioActivado usuario)
			throws RemoteException, NotBoundException {
		Registry registryLocal = LocateRegistry.getRegistry(1099);
		IUsuarioRegistrado IALocal = (IUsuarioRegistrado) registryLocal
				.lookup("Registrado");
		IALocal.actualizarDatosUsuario(usuario);

	}

	public void entrar(boolean registrado) {
		try {

			registry = LocateRegistry.getRegistry(2500);

			stub2 = (IJuego) registry.lookup(juego.getUbicacion().toString());
			if (registrado) {
				anadirMasJugado();
				UsuarioActivado usuario = obtenerUsuario();

				usuario.setGanancias(usuario.getGanancias()
						- Integer.parseInt(icip.cantidadTF.getText()));
				System.out.println("Cuanto me quitas:"
						+ icip.cantidadTF.getText());
				actualizarSaldo(usuario);
				stub2.ponerSaldo(Integer.parseInt(icip.cantidadTF.getText()),
						usuario);

			} else {
				stub2.ponerSaldo(1000000, null);
			}

		} catch (Exception e1) {
			System.err.println("Client exception: " + e1.toString());
			e1.printStackTrace();
		}
	}

	public void cerrar() {
		dispose();

	}
	
	public int obtenerPartidasPermitidas(){
		return 0;
	}

}