/*
 * Esta clase concuerda con el diagrama de clases en componentes y nombre
 * */
package UsuarioNoRegistrado;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import UsuarioRegistrado.UsuarioRegistrado;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JPasswordField;

public class ReactivarCuenta extends JFrame {

	private JPanel contentPane;
	private JTextField correoTF;
	private JLabel passwordL;
	private JButton reactivarCuentaB;
	private JLabel correoL;
	private JButton cancelarB;
	private JPasswordField passwordPF;

	/**
	 * Create the frame.
	 */
	public ReactivarCuenta() {
		this.setVisible(true);
		setTitle("Reactivar Cuenta");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 327, 211);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		reactivarCuentaB = new JButton("Reactivar Cuenta");
		reactivarCuentaB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {					
					try {
						reactivarCuenta();
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (NotBoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					dispose();
		
			}
		});
		reactivarCuentaB.setBounds(10, 141, 140, 23);
		contentPane.add(reactivarCuentaB);

		passwordL = new JLabel("Contrase\u00F1a");
		passwordL.setBounds(10, 76, 274, 14);
		contentPane.add(passwordL);

		correoL = new JLabel("Correo");
		correoL.setBounds(10, 11, 274, 14);
		contentPane.add(correoL);

		correoTF = new JTextField();
		correoTF.setColumns(10);
		correoTF.setBounds(10, 36, 290, 29);
		contentPane.add(correoTF);

		cancelarB = new JButton("Cancelar");
		cancelarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		cancelarB.setBounds(160, 141, 140, 23);
		contentPane.add(cancelarB);

		passwordPF = new JPasswordField();
		passwordPF.setBounds(10, 101, 291, 29);
		contentPane.add(passwordPF);
	}
	public void cancelar(){
		dispose();
	}
	public void reactivarCuenta() throws RemoteException, NotBoundException{
		JFrame incorrecto = new VentanaDeAviso(correoTF.getText(),passwordPF.getText());
	}
}
