package PersonalDeAtencionAlUsuario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;

import Interfaz.IPersonalAtencionUsuario;
import basededatos.BDPrincipal;
import basededatos.QuejaUsuario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AbrirTickets extends JFrame {

	private JPanel contentPane;
	private JButton cerrarB;
	private JTextArea cuerpoTA;
	private QuejasUsuario padre;
	private int id;
	/**
	 * Create the frame.
	 * @throws NotBoundException 
	 * @throws RemoteException 
	 */
	public AbrirTickets(final QuejasUsuario padre, int id) throws RemoteException, NotBoundException {
		this.padre=padre;
		this.id=id;
		this.setVisible(true);
		QuejaUsuario que=obtenerTicket();
		setTitle("Ticket Usuario "+ que.getUsuario());
		//Esta operacion para que no se pueda cerrar sin salir.
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cuerpoTA = new JTextArea();
		cuerpoTA.setText(que.getTexto());
		cuerpoTA.setEditable(false);
		cuerpoTA.setLineWrap(true);
		cuerpoTA.setBounds(10, 11, 414, 196);
		contentPane.add(cuerpoTA);
		
		cerrarB = new JButton("Cerrar");
		cerrarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cerrar();
			}
		});
		cerrarB.setBounds(297, 218, 127, 33);
		contentPane.add(cerrarB);
	}
	public QuejaUsuario obtenerTicket () throws RemoteException, NotBoundException{
		Registry registry = LocateRegistry.getRegistry();
		IPersonalAtencionUsuario IA = null;
		
			IA = (IPersonalAtencionUsuario) registry.lookup("Personal");
		return 	IA.obtenerTicket(id);
	}
	public void cerrar(){
		dispose();
	}
}
