package Administrador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import Interfaz.IAdministrador;
import basededatos.BDPrincipal;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MensajeConfirmarBorrar extends JFrame {

	private JPanel contentPane;
	private JButton siB;
	private JButton noB;
	private JLabel mensajeL;
	private String idJuego;
	private ActualizarJuego padre;

	/**
	 * Create the frame.
	 * @param padre 
	 * @param idJuego 
	 */
	public MensajeConfirmarBorrar(String idJuego, ActualizarJuego padre) {
		this.idJuego = idJuego;
		this.padre = padre;
		this.setVisible(true);
		this.setTitle("Confirmar borrar usuario");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 359, 142);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		mensajeL = new JLabel("\u00BFDesea eliminar el juego con id: "+idJuego+"?");
		mensajeL.setToolTipText("");
		mensajeL.setBounds(26, 24, 327, 23);
		contentPane.add(mensajeL);
		
		siB = new JButton("Si");
		siB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					eliminarJuego();
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
	public void no(){
		dispose();
	}
	
	public void eliminarJuego() throws NumberFormatException, RemoteException, NotBoundException{
		Registry registry = LocateRegistry.getRegistry();
		IAdministrador IA = null;
	
			IA = (IAdministrador) registry.lookup("Administrador");
		
		//Savins
		IA.eliminarJuego(Integer.parseInt(idJuego));
		dispose();
		padre.dispose();
		padre.padre.listarJuegos();
		padre.padre.dibujarTabla();
	}

}
