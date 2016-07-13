package PersonalDeAtencionAlUsuario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

import java.awt.Font;

import javax.swing.JButton;

import basededatos.BDPrincipal;
import basededatos.UsuarioActivado;
import Interfaz.IPersonalAtencionUsuario;
import UsuarioRegistrado.AjustesPerfil;
import UsuarioRegistrado.DatosUsuario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class AdministrarUsuario extends DatosUsuario {

	private JButton inhabilitarB;
	private PersonalDeAtencionAlUsuario padre;
	String dni;

	/**
	 * Create the frame.
	 * @throws RemoteException 
	 * @throws NotBoundException 
	 */

	public AdministrarUsuario(final PersonalDeAtencionAlUsuario padre, String dni) throws RemoteException, NotBoundException {
		this.dni = dni;
		this.padre = padre;
		this.setVisible(true);
		setTitle("Administrar Perfil Usuario");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 410, 403);
		super.contentPane.setBounds(10, 11, 372, 354);

		inhabilitarB = new JButton("Inhabilitar");
		inhabilitarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					inhabilitar();
					PersonalDeAtencionAlUsuario pad= new PersonalDeAtencionAlUsuario(padre.padre,false);
					padre.dispose();
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NotBoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		inhabilitarB.setBounds(157, 331, 112, 23);
		super.contentPane.add(inhabilitarB);
		setVisible(true);
		super.setVisible(true);
		super.repaint();
		super.obtenerDatosUsuario(dni);
	}

	public void inhabilitar() throws RemoteException, NotBoundException {
		Registry registry = LocateRegistry.getRegistry();
		IPersonalAtencionUsuario IA = null;
		
			IA = (IPersonalAtencionUsuario) registry.lookup("Personal");
		UsuarioActivado user=IA.administrarUsuario(dni);
		IA.inhabilitar(user);
		
	}
	

}
