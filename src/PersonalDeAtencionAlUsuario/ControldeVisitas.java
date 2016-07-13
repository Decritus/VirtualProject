package PersonalDeAtencionAlUsuario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTable;

import Interfaz.IPersonalAtencionUsuario;
import basededatos.BDPrincipal;
import basededatos.UsuariosNoRegistrados;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ControldeVisitas extends JFrame {

	private JPanel contentPane;
	private JTable tablaVisitas;
	private JButton cerrarB;
	private PersonalDeAtencionAlUsuario padre;
	/**
	 * Create the frame.
	 */
	public ControldeVisitas(final PersonalDeAtencionAlUsuario padre) {
		this.padre=padre;
		this.setVisible(true);
		setTitle("Control de Visitas");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cerrarB = new JButton("Cerrar");
		cerrarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			cerrar();
			}
		});
		cerrarB.setBounds(335, 228, 89, 23);
		contentPane.add(cerrarB);
		try {
			llenarTabla();
			dibujarTabla();
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NotBoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

		
	}
	public UsuariosNoRegistrados[] obtenerVisitas() throws RemoteException, NotBoundException {
		Registry registry = LocateRegistry.getRegistry();
		IPersonalAtencionUsuario IA = null;
		
			IA = (IPersonalAtencionUsuario) registry.lookup("Personal");
	   return IA.obtenerVisitas();
	}

	
	public void llenarTabla() throws RemoteException, NotBoundException {
		tablaVisitas = new JTable();
		String[] cabecera = { "Ip", "horasJugadas", "FechaHoraEntrada", "fechaHoraSalida" };
		UsuariosNoRegistrados [] users= null;
		try {
			users=obtenerVisitas();
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NotBoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		Object[][] datos = new Object[users.length][4];

		for (int i = 0; i < users.length; i++) {
			datos[i][0] = users[i].getIdIp();
			datos[i][1] = users[i].getHorasJugadas();
			datos[i][2] = users[i].getFechaHoraEntrada();
			datos[i][3] = users[i].getFechaHoraSalida();
		}
		tablaVisitas = new JTable(datos, cabecera);

	}

	/**
	 * Dibuja la tabla
	 */
	public void dibujarTabla() {

		tablaVisitas.setRowSelectionAllowed(false);
		tablaVisitas.setBackground(new Color(127, 255, 212));

		tablaVisitas.setRowSelectionAllowed(true);
		tablaVisitas.setColumnSelectionAllowed(false);
			JScrollPane scrollTabla = new JScrollPane(tablaVisitas);
			
		scrollTabla.setBackground(new Color(255, 127, 80));
		scrollTabla.setBounds(10, 11, 414, 208);
		contentPane.add(scrollTabla);

	}
	public void cerrar(){
		dispose();
	}
}
