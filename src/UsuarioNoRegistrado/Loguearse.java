package UsuarioNoRegistrado;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.TextField;
import java.awt.Toolkit;

import javax.swing.JPasswordField;
import javax.swing.JButton;

import basededatos.BDPrincipal;
import Administrador.Administrador;
import Interfaz.IUsuarioNoRegistrado;
import PersonalDeAtencionAlUsuario.PersonalDeAtencionAlUsuario;
import UsuarioRegistrado.UsuarioRegistrado;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Loguearse extends JPanel {

	private JLabel emailL;
	private TextField emailTF;
	private JLabel passwordL;
	private JPasswordField passwordPF;
	private JButton entrarB;
	final UsuarioNoRegistrado padre;

	
	/**
	 * Create the panel.
	 */

	public Loguearse(final UsuarioNoRegistrado padre) {

		this.padre = padre;

		setLayout(null);

		emailL = new JLabel("Correo Electr\u00F3nico");
		emailL.setBounds(27, 11, 116, 16);
		add(emailL);

		emailTF = new TextField();
		emailTF.setBounds(27, 33, 172, 22);
		add(emailTF);

		passwordL = new JLabel("Contrase\u00F1a");
		passwordL.setBounds(27, 61, 71, 16);
		add(passwordL);

		passwordPF = new JPasswordField();
		passwordPF.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					entrarB.doClick();
				}
			}
		});

		passwordPF.setBounds(27, 88, 172, 22);
		add(passwordPF);

		entrarB = new JButton("Entrar");

		entrarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					entrar();
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (NotBoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		entrarB.setBounds(40, 131, 147, 29);
		add(entrarB);

	}

	public JLabel getEmailL() {
		return emailL;
	}

	public void setEmailL(JLabel emailL) {
		this.emailL = emailL;
	}

	public TextField getEmailTF() {
		return emailTF;
	}

	public void setEmailTF(TextField emailTF) {
		this.emailTF = emailTF;
	}

	public JButton getEntrarB() {
		return entrarB;
	}

	public void setEntrarB(JButton entrarB) {
		this.entrarB = entrarB;
	}

	public void entrar() throws RemoteException, NotBoundException {
		Registry registry = LocateRegistry.getRegistry();
		IUsuarioNoRegistrado IA = (IUsuarioNoRegistrado) registry.lookup("NoRegistrado");
		
		
		
		int valor = IA.entrar(emailTF.getText(), passwordPF.getText());
		if (valor ==-1) {
			passwordPF.setBackground(Color.RED);
			emailTF.setBackground(Color.RED);
		} else if (valor==2) {
			JFrame UsuarioReg = new UsuarioRegistrado(padre, emailTF.getText(), passwordPF.getText(),true);
		} else if (valor==1) {
			JFrame PesonalAT = new PersonalDeAtencionAlUsuario(padre,true);
		} else if (valor ==0) {
			JFrame Admin = new Administrador(padre);
		}
	}

	public void coloresCorrecto() {
		passwordPF.setBackground(Color.WHITE);
		emailTF.setBackground(Color.WHITE);		
	}
}
