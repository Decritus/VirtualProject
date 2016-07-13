package Administrador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.JSpinner;

import Interfaz.IAdministrador;
import Interfaz.IPersonalAtencionUsuario;
import basededatos.BDPrincipal;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AnadirJuego extends DatosJuego {

	private JButton anadirB;
	public Administrador padre;



	/**
	 * Create the frame.
	 */
	public AnadirJuego(final Administrador padre) {
		this.setVisible(true);
		super.setTitle("A\u00F1adir Juego");
		super.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		super.setBounds(100, 100, 352, 319);
		this.padre = padre;
		anadirB = new JButton("A\u00F1adir");

		anadirB.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				

				try {
					padre.setVisible(false);
					anadirJuego();
					Administrador admin = new Administrador(padre.padre);
					padre.dispose();
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
		anadirB.setBounds(27, 254, 89, 23);
		super.add(anadirB);

	}

	public void anadirJuego() throws NumberFormatException, RemoteException, NotBoundException {
		Registry registry = LocateRegistry.getRegistry();
		IAdministrador IA = null;
		
			IA = (IAdministrador) registry.lookup("Administrador");
		
		IA.anadirJuego(super.nombreTF.getText(),
				super.ubicacionTF.getText(), super.rutaTF.getText(),
				Integer.parseInt(super.importeInicialTF.getText()));
		
		JFrame ana = new MensajeJuegoCreado(this);
		
		
		
	}

}
