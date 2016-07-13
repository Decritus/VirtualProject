package PersonalDeAtencionAlUsuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;

import Interfaz.IAdministrador;
import Interfaz.IPersonalAtencionUsuario;
import basededatos.BDPrincipal;
import basededatos.QuejaUsuario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class QuejasUsuario extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton abrirTicketB;
	private JButton cerrarB;
	public PersonalDeAtencionAlUsuario padre;
	final QuejasUsuario este;
	/**
	 * Create the frame.
	 * @throws NotBoundException 
	 * @throws RemoteException 
	 */
	public QuejasUsuario(final PersonalDeAtencionAlUsuario padre) throws RemoteException, NotBoundException {
		this.padre=padre;
		este= this;
		this.setVisible(true);
		setTitle("Quejas De Usuarios");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 452, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		llenarTabla();
		dibujarTabla();
		
		
		cerrarB = new JButton("Cerrar");
		cerrarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cerrar();
			}
		});
		cerrarB.setBounds(277, 241, 147, 34);
		contentPane.add(cerrarB);
		
		abrirTicketB = new JButton("Abrir Ticket");
		abrirTicketB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirTicket();
			}
		});
		abrirTicketB.setBounds(10, 241, 147, 34);
		contentPane.add(abrirTicketB);
	}

	public QuejaUsuario[] listarQuejas() throws RemoteException,
			NotBoundException {
		Registry registry = LocateRegistry.getRegistry();
		IPersonalAtencionUsuario IA = null;
		
			IA = (IPersonalAtencionUsuario) registry.lookup("Personal");
		return IA.listarQuejas();
	}
	public void abrirTicket(){
		int idSeleccionada=Integer.parseInt(table.getValueAt(
				table.getSelectedRow(), 0).toString());
		
		AbrirTickets abr = null;
		try {
			abr = new AbrirTickets(este,idSeleccionada);
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NotBoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		abr.setVisible(true);
	}
	public void llenarTabla() throws RemoteException, NotBoundException {
		table = new JTable();
		String[] cabecera = { "IdQueja","Nombre Usuario", "Asunto"};
		QuejaUsuario [] quejas= null;
		try {
			quejas=listarQuejas();
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NotBoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Object[][] datos = new Object[quejas.length][3];

		for (int i = 0; i < quejas.length; i++) {
			datos[i][0] = quejas[i].getIdQueja();
			datos[i][1] = quejas[i].getUsuario();
			datos[i][2] = quejas[i].getAsunto();
		}
		table = new JTable(datos, cabecera);

	}

	/**
	 * Dibuja la tabla
	 */
	public void dibujarTabla() {

		table.setRowSelectionAllowed(false);
		table.setBackground(new Color(127, 255, 212));

		table.setRowSelectionAllowed(true);
		table.setColumnSelectionAllowed(false);
		JScrollPane scrollTabla = new JScrollPane(table);
		
		scrollTabla.setBackground(new Color(255, 127, 80));
		scrollTabla.setBounds(10, 11, 414, 208);
		contentPane.add(scrollTabla);

	}
	public void cerrar(){
		dispose();
	}
}
