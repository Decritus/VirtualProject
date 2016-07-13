package Administrador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.JSpinner;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.swing.JCheckBox;

import Interfaz.IAdministrador;
import Interfaz.IUsuarioNoRegistrado;
import basededatos.BDPrincipal;
import basededatos.Juego;

public class ActualizarJuego extends DatosJuego  {

	public JCheckBox vistaPublicaChB;
	public JCheckBox habilitarMantenimientoChB;
	public JButton actualizarB;
	public JButton borrarB;
	public String idJuego;
	public Administrador padre;
	private Juego juego;
	

	/**
	 * Create the frame.
	 * 
	 * @param idJuego
	 */
	public ActualizarJuego(String idJuego) {
		this.setVisible(true);
		setTitle("Modificar Juego");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 352, 319);
		borrarB = new JButton("Borrar");
		borrarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					borrar();
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NotBoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		borrarB.setBounds(135, 254, 89, 23);
		super.add(borrarB);

		actualizarB = new JButton("Actualizar");
		actualizarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			try {
				actualizarJuego();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NotBoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		});
		actualizarB.setBounds(27, 254, 89, 23);
		super.add(actualizarB);

		habilitarMantenimientoChB = new JCheckBox("Habilitar Mantenimiento");
		habilitarMantenimientoChB.setBounds(177, 202, 213, 23);
		super.add(habilitarMantenimientoChB);

		vistaPublicaChB = new JCheckBox("Vista P\u00FAblica");
		vistaPublicaChB.setBounds(177, 224, 235, 23);
		super.add(vistaPublicaChB);
	}

	public void obtenerDatos(String idJuego, Administrador padre) throws NumberFormatException, RemoteException, NotBoundException {
		this.idJuego = idJuego;
		this.padre = padre;
		Registry registry = LocateRegistry.getRegistry();
		IAdministrador IA = null;
		
			IA = (IAdministrador) registry.lookup("Administrador");
		
		juego = IA.obtenerDatos(Integer.parseInt(idJuego));
		super.importeInicialTF.setText(Integer.toString(juego.getImporte()));
		super.nombreTF.setText(juego.getNombre());
		super.rutaTF.setText(juego.getImagen());
		super.ubicacionTF.setText(juego.getImagen());
		try{
			super.imageL.setIcon(new ImageIcon(DatosJuego.class
				.getResource("/imagenes/"+juego.getUbicacion())));
			habilitarMantenimientoChB.setSelected(juego.getDesactivado());
		}
		catch(Exception e){
			super.imageL.setIcon(new ImageIcon(DatosJuego.class
					.getResource("/imagenes/defecto.png")));
		}
		if ( IA.esPublico(juego.getIdJuego())) {
			vistaPublicaChB.setSelected(true);
		} else {
			vistaPublicaChB.setSelected(false);
		}

	}
	
	public void borrar() throws RemoteException, NotBoundException{
		
		JFrame bor = new MensajeConfirmarBorrar(idJuego, this);
		Administrador admin = new Administrador(padre.padre);
		padre.dispose();
	}
	
	public void actualizarJuego() throws RemoteException, NotBoundException{
		Registry registry = LocateRegistry.getRegistry();
		IAdministrador IA = (IAdministrador) registry.lookup("Administrador");
		juego.setNombre(super.nombreTF.getText());
		juego.setUbicacion(super.ubicacionTF.getText());
		juego.setImagen(super.rutaTF.getText());
		juego.setImporte(Integer.parseInt(super.importeInicialTF.getText()));
		juego.setDesactivado(habilitarMantenimientoChB.isSelected());
	
		
		IA.actualizarJuego(juego, vistaPublicaChB.isSelected());
		//Savins
		padre.listarJuegos();
		padre.dibujarTabla();
		this.dispose();
		JFrame ac = new MensajeJuegoTrasActualizar();
		
	}
}
