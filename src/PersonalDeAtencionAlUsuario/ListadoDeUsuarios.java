package PersonalDeAtencionAlUsuario;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Interfaz.IPersonalAtencionUsuario;
import basededatos.BDPrincipal;
import basededatos.UsuarioActivado;

import java.awt.BorderLayout;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ListadoDeUsuarios extends JPanel {
	JTable tablaUsuariosT;
	JButton expulsarUsuarioB;
	JButton administrarUsuarioB;
	PersonalDeAtencionAlUsuario padre;
	private JScrollPane scrollTabla;

	public ListadoDeUsuarios(final PersonalDeAtencionAlUsuario padre) throws RemoteException, NotBoundException {
		this.padre = padre;
		final ListadoDeUsuarios este = this;
		this.setVisible(true);
		expulsarUsuarioB = new JButton("Expulsar Seleccionado");
		expulsarUsuarioB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expulsarUsuario();
			}
		});
		setLayout(new BorderLayout(0, 0));
		expulsarUsuarioB.setBounds(215, 304, 291, 27);
		add(expulsarUsuarioB, BorderLayout.NORTH);

		obtenerUsuarios();

		administrarUsuarioB = new JButton("Modificar Seleccionado");
		administrarUsuarioB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				administrarUsuario();

			}
		});
		administrarUsuarioB.setBounds(345, 17, 161, 66);
		add(administrarUsuarioB, BorderLayout.SOUTH);

	}

	public void expulsarUsuario() {
		// Con esto obtienes el dni
		String dni = tablaUsuariosT.getValueAt(
				tablaUsuariosT.getSelectedRow(), 0).toString();
		
		JFrame mensajeE = new MensajeExpulsarUsuario(dni,padre);
	}

	public void administrarUsuario() {
		String dni = tablaUsuariosT.getValueAt(
				tablaUsuariosT.getSelectedRow(), 0).toString();
		try {
			AdministrarUsuario adminUsuario = new AdministrarUsuario(padre,
					dni);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void obtenerUsuarios() throws RemoteException, NotBoundException {
		Registry registry = LocateRegistry.getRegistry();
		IPersonalAtencionUsuario IA = null;
		
			IA = (IPersonalAtencionUsuario) registry.lookup("Personal");
		UsuarioActivado[] usuarios = IA.obtenerUsuarios();
		llenarTabla(usuarios);
		dibujarTabla();

	}

	/**
	 * Rellena la tabla
	 * 
	 * @param juegos
	 */
	private void llenarTabla(UsuarioActivado[] usuarios) {
		String[] cabecera = { "DNI", "Nombre" };

		Object[][] datos = new Object[usuarios.length][2];

		for (int i = 0; i < datos.length; i++) {
			datos[i][0] = usuarios[i].getIdDNI();
			datos[i][1] = usuarios[i].getNombreUsuario();

		}
		tablaUsuariosT = new JTable(datos, cabecera);

	}

	/**
	 * Dibuja la tabla
	 */
	private void dibujarTabla() {

		tablaUsuariosT.setRowSelectionAllowed(false);
		tablaUsuariosT.setBackground(new Color(65, 105, 225));
		tablaUsuariosT.setBounds(216, 92, 291, 213);
		tablaUsuariosT.setRowSelectionAllowed(true);
		tablaUsuariosT.setColumnSelectionAllowed(false);

		// juegosT.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollTabla = new JScrollPane(tablaUsuariosT);

		add(scrollTabla, BorderLayout.CENTER);

	}
}
