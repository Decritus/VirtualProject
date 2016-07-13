package PersonalDeAtencionAlUsuario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import basededatos.UsuarioActivado;

import Interfaz.IPersonalAtencionUsuario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MensajeExpulsarUsuario extends JFrame {

	private JPanel contentPane;
	private JLabel mensajeL;
	private JButton siB;
	private JButton noB;
	PersonalDeAtencionAlUsuario abuelo;
	private String dni;
	/**
	 * Create the frame.
	 * @param dni 
	 * @param padre 
	 */
	public MensajeExpulsarUsuario(final String dni, final PersonalDeAtencionAlUsuario abuelo) {
		this.abuelo=abuelo;
		this.dni=dni;
		this.setVisible(true);
		setTitle("Expulsar Jugador");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 392, 142);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		mensajeL = new JLabel("\u00BFDesea realmente expulsar al jugador con dni"+ dni +" ?");
		mensajeL.setToolTipText("");
		mensajeL.setBounds(56, 36, 338, 23);
		contentPane.add(mensajeL);
		
		siB = new JButton("Si");
		siB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//a?adir la consulta con la base de datos
				expulsarUsuario();
				//abuelo.reconstruirClase(abuelo.padre);		
				try {
					PersonalDeAtencionAlUsuario abu= new PersonalDeAtencionAlUsuario(abuelo.padre,false);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NotBoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				abuelo.dispose();
				dispose();
			}
		});
		siB.setBounds(66, 70, 89, 23);
		contentPane.add(siB);
		
		noB = new JButton("No");
		noB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				no();
			}
		});
		noB.setBounds(198, 70, 89, 23);
		contentPane.add(noB);
	}
	
	public void expulsarUsuario(){
		Registry registry;
		IPersonalAtencionUsuario IA = null;
		
		try {
			registry = LocateRegistry.getRegistry();
		
			IA = (IPersonalAtencionUsuario) registry.lookup("Personal");
			UsuarioActivado user=IA.administrarUsuario(dni);
			IA.expulsarUsuario(user);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void no(){
		dispose();
	}

}
