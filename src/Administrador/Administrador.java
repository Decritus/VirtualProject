package Administrador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTable;

import Interfaz.IAdministrador;
import basededatos.BDPrincipal;
import basededatos.DatosConfiguracion;
import basededatos.Juego;
import basededatos.Publico;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Administrador extends JFrame {

	// no le encuentro sentido al diagrama de clases
	private JPanel contentPane;
	private JSpinner numeroPartidasSimultaneasS;
	private JButton anadirJuegoB;
	private JButton actualizarJuegoB;
	private JButton salirB;
	private JLabel psimultaneasL;
	public JTable juegosT;
	final Administrador este;
	final JFrame padre;
	/**
	 * Permite que la tabla sea scrollable
	 */
	JScrollPane scrollTabla;

	/**
	 * Create the frame.
	 * 
	 * @param padre
	 * @throws RemoteException 
	 * @throws NotBoundException 
	 */
	public Administrador(final JFrame padre) throws RemoteException, NotBoundException {
		this.padre = padre;
		este = this;
		this.setVisible(true);
		padre.setVisible(false);
		setTitle("Administración de Aplicación");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 319, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		anadirJuegoB = new JButton("Añadir Juego");
		anadirJuegoB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				anadirJuego();
			}
		});
		contentPane.setLayout(null);
		anadirJuegoB.setBounds(10, 21, 132, 55);
		contentPane.add(anadirJuegoB);

		actualizarJuegoB = new JButton("Actualizar Juego");
		actualizarJuegoB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int linea = juegosT.getSelectedRow();
				String idJuego = juegosT.getValueAt(linea, 0).toString();
				try {
					actualizarJuego(idJuego, este);
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (NotBoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		actualizarJuegoB.setBounds(152, 21, 132, 55);
		contentPane.add(actualizarJuegoB);

		salirB = new JButton("Salir");
		salirB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salir();
			}
		});
		salirB.setBounds(178, 286, 112, 34);
		contentPane.add(salirB);

		numeroPartidasSimultaneasS = new JSpinner();
		numeroPartidasSimultaneasS.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				cambiarNumeroPartidasSimultaneas();
		}});
		numeroPartidasSimultaneasS.setBounds(232, 87, 52, 34);
		
		cargarNumeroPermitidas();
		contentPane.add(numeroPartidasSimultaneasS);

		psimultaneasL = new JLabel("Partidas Simultáneas Permitidas");
		psimultaneasL.setBounds(10, 97, 188, 14);
		contentPane.add(psimultaneasL);

		listarJuegos();
		dibujarTabla();
	}

	/**
	 * Rellena la tabla
	 * @throws RemoteException 
	 * @throws NotBoundException 
	 */
	public void listarJuegos() throws RemoteException, NotBoundException {
		juegosT = new JTable();
		String[] cabecera = { "Id", "Juego", "Fecha", "Público" };
		Registry registry = LocateRegistry.getRegistry();
		IAdministrador IA = (IAdministrador) registry.lookup("Administrador");
	

		Juego[] juegos = IA.listarJuegos();
		Object[][] datos = new Object[juegos.length][4];

		for (int i = 0; i < juegos.length; i++) {
			datos[i][0] = juegos[i].getIdJuego();
			datos[i][1] = juegos[i].getNombre();
			datos[i][2] = juegos[i].getFechaAlta();
			datos[i][3] = IA.esPublico(juegos[i].getIdJuego());
		}
		juegosT = new JTable(datos, cabecera);

	}

	/**
	 * Dibuja la tabla
	 */
	public void dibujarTabla() {

		juegosT.setRowSelectionAllowed(false);
		juegosT.setBackground(new Color(127, 255, 212));

		juegosT.setRowSelectionAllowed(true);
		juegosT.setColumnSelectionAllowed(false);
		// juegosT.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollTabla = new JScrollPane(juegosT);
		scrollTabla.setBounds(10, 132, 293, 150);
		// scrollTabla.setBounds(5, 5, 440, 395);
		// contentPane.add(scrollTabla, BorderLayout.CENTER);
		contentPane.add(scrollTabla);

	}

	public void actualizarJuego(String idJuego, Administrador este) throws NumberFormatException, RemoteException, NotBoundException {
		Registry registry = LocateRegistry.getRegistry();
		IAdministrador IA = (IAdministrador) registry.lookup("Administrador");
		ActualizarJuego ac = new ActualizarJuego(idJuego);
		ac.obtenerDatos(idJuego, este);
	}
	public void anadirJuego(){
		JFrame aJuego = new AnadirJuego(este);	
	}
	public void salir(){
		JFrame sal = new MensajeConfirmarSalirAdministradorJuegos(este,
				padre);
	}
	public void cargarNumeroPermitidas() throws RemoteException, NotBoundException{
		Registry registry = LocateRegistry.getRegistry();
		IAdministrador IA = null;
		
			IA = (IAdministrador) registry.lookup("Administrador");
		int partidassimultaneas = IA.cargarNumeroPermitidas()
				.getPartidasSimultaneas();
		numeroPartidasSimultaneasS.setValue(partidassimultaneas);
	}
	
	public void cambiarNumeroPartidasSimultaneas(){
		Registry registry;
		IAdministrador IA = null;
		try {
			registry = LocateRegistry.getRegistry();
			IA = (IAdministrador) registry.lookup("Administrador");
		} catch (RemoteException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (NotBoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
		try {
			IA.cambiarNumeroPartidasSimultaneas((Integer
					.parseInt(numeroPartidasSimultaneasS.getValue()
							.toString())));
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	}
}
