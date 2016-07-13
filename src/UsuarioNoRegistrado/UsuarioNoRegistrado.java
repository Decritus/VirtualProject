/*
 * Esta clase concuerda con el diagrama de clases en componentes y nombre
 * */
package UsuarioNoRegistrado;

import java.awt.EventQueue;
import java.awt.TextField;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JLabel;

import basededatos.Administrador;
import basededatos.BDPrincipal;
import basededatos.BDUsuariosActivados;
import basededatos.Juego;
import basededatos.UsuariosNoRegistrados;
import Interfaz.IUsuarioNoRegistrado;
import RMI.ICasino;
import UsuarioRegistrado.UsuarioRegistrado;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Date;

public class UsuarioNoRegistrado extends JFrame {

	private JPanel fotoAplicacionP;
	private JPanel contentPane;
	private ZonaUsuariosRegistrados zonaReg;
	private VisualizarNovedades visNovedades;
	private ZonaUsuarioNoRegistrado zonaNReg;
	private Loguearse loguearse;
	String respuesta;
	final UsuarioNoRegistrado este;
	public Loguearse getLoguearse(){
		return loguearse;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UsuarioNoRegistrado frame = new UsuarioNoRegistrado();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws RemoteException 
	 */
	public UsuarioNoRegistrado() {

		este = this;

		setTitle("Casino Virtual");
		
		
		setBounds(100, 100, 1010, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		fotoAplicacionP = new JPanel();
		fotoAplicacionP.setBackground(Color.DARK_GRAY);
		fotoAplicacionP.setBounds(22, 11, 302, 192);
		contentPane.add(fotoAplicacionP);

		JLabel image = new JLabel("");
		image.setBounds(0, 0, 315, 224);
		image.setHorizontalAlignment(SwingConstants.CENTER);
		image.setToolTipText("");
		image.setIcon(new ImageIcon(UsuarioNoRegistrado.class
				.getResource("/imagenes/portada(redimensionada).png")));
		fotoAplicacionP.add(image);

		zonaReg = new ZonaUsuariosRegistrados(este);
		zonaReg.setBounds(786, 6, 198, 188);
		contentPane.add(zonaReg);

		visNovedades = new VisualizarNovedades();
		visNovedades.setBounds(22, 214, 962, 188);
		contentPane.add(visNovedades);

		loguearse = new Loguearse(este);
		loguearse.setBounds(524, 6, 252, 188);
		contentPane.add(loguearse);

		zonaNReg = new ZonaUsuarioNoRegistrado(este);
		zonaNReg.setBounds(352, 6, 162, 188);
		contentPane.add(zonaNReg);

		try {
			nuevaVisita();
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	public void nuevaVisita() throws RemoteException, NotBoundException {
		// Savins
		Registry registry = LocateRegistry.getRegistry();
		IUsuarioNoRegistrado IA = (IUsuarioNoRegistrado) registry.lookup("NoRegistrado");
		UsuariosNoRegistrados usuario = new UsuariosNoRegistrados();
		usuario.setFechaHoraEntrada(new Date());
		try {
			usuario.setIdIp(InetAddress.getLocalHost().toString());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		IA.nuevaVisita(usuario);
	}
	
	
}
