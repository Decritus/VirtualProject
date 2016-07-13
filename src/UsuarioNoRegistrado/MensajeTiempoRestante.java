/*
 * Esta clase concuerda con el diagrama de clases en componentes y nombre
 * */
package UsuarioNoRegistrado;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MensajeTiempoRestante extends JFrame {

	private JPanel contentPane;
	private JButton aceptarB;
	private JLabel textoL;

	/**
	 * Create the frame.
	 */
	public MensajeTiempoRestante() {
		setVisible(true);
		setTitle("Mensaje Tiempo Agotado");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 392, 142);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textoL = new JLabel("Para continuar jugando es necesario registrarse.");
		textoL.setToolTipText("");
		textoL.setBounds(43, 22, 382, 23);
		contentPane.add(textoL);

		aceptarB = new JButton("Aceptar");
		aceptarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				aceptar();
			}
		});
		aceptarB.setBounds(144, 70, 89, 23);
		contentPane.add(aceptarB);
	}
	public void aceptar(){
		dispose();
	}

}
