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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class MandarCorreoConfirmacion extends JFrame {

	private JPanel contentPane;
	private JTextArea mensajeTA;
	private JButton aceptarB;


	/**
	 * Create the frame.
	 */
	public MandarCorreoConfirmacion() {
		this.setVisible(true);
		setTitle("Mensaje");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 415, 142);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		aceptarB = new JButton("Aceptar");
		aceptarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aceptar();
			}
		});
		aceptarB.setBounds(166, 62, 89, 23);
		contentPane.add(aceptarB);

		mensajeTA = new JTextArea();
		mensajeTA
				.setText("Se ha recibido su formulario.\r\nSe le ha enviado un mensaje a su correo que debe confirmar");
		mensajeTA.setBounds(17, 6, 403, 58);
		mensajeTA.setEditable(false);
		mensajeTA.setBackground(Color.LIGHT_GRAY);
		contentPane.add(mensajeTA);
	}
	public void aceptar(){
		dispose();
	}
}
