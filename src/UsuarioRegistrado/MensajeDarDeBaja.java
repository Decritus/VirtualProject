package UsuarioRegistrado;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import Chat.publico;
import Interfaz.IUsuarioRegistrado;
import basededatos.BDPrincipal;
import basededatos.UsuarioActivado;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MensajeDarDeBaja extends JFrame {

	private JPanel contentPane;
	private JLabel mensajeL;
	private JButton siB;
	private JButton noB;
private AjustesPerfil padre;
private String dni;

	/**
	 * Create the frame.
	 * @param dNI 
	 * @param padre 
	 */
	public MensajeDarDeBaja(AjustesPerfil padre, String dNI) {
		this.padre = padre;
		this.dni = dNI;
		this.setVisible(true);
		setTitle("Mensaje Dar de Baja");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 392, 142);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		mensajeL = new JLabel("\u00BFDesea realmente darse de baja?");
		mensajeL.setToolTipText("");
		mensajeL.setBounds(82, 27, 221, 23);
		contentPane.add(mensajeL);
		
		siB = new JButton("Si");
		siB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			try {
				bajaUsuario();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NotBoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
	public void bajaUsuario() throws RemoteException, NotBoundException{
		Registry registry = LocateRegistry.getRegistry();
		IUsuarioRegistrado IA = (IUsuarioRegistrado) registry.lookup("Registrado");
		UsuarioActivado usuario = IA.bajaUsuario(dni);
		IA.bajaUsuario(usuario);
		for (Frame miFrame : JFrame.getFrames()) {
			if(miFrame instanceof publico){
				miFrame.dispose();
				
			}if(miFrame instanceof CatalogoDeJuegosUsuarioRegistrado){
				miFrame.dispose();		
			}			
		}
		dispose();
		padre.dispose();
		padre.padre.dispose();
		padre.padre.padre.setVisible(true);
		
	}
	public void no(){
		dispose();
	}
	
}
