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

public class EnviarCorreoConClave extends JFrame {

	private JPanel contentPane;
	private JLabel textoL;
	private JButton aceptarB;
	
	
	public EnviarCorreoConClave(String recuperar) {
		this.setVisible(true);
		setTitle("Mensaje");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 392, 142);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textoL = new JLabel("Su clave es: "+ recuperar);
		textoL.setToolTipText("asd\r\nasd");
		textoL.setBounds(59, 6, 275, 53);
		contentPane.add(textoL);

		aceptarB = new JButton("Aceptar");
		aceptarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aceptar();
			}
		});
		aceptarB.setBounds(143, 67, 89, 23);
		contentPane.add(aceptarB);
	}
	public void aceptar(){
		dispose();
	}

}
