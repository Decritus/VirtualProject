package Administrador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MensajeJuegoCreado extends JFrame {

	private JPanel contentPane;
	private JButton aceptarB;
	private JLabel mensajeL;
	AnadirJuego padre;

	/**
	 * Create the frame.
	 * 
	 * @param anadirJuego
	 */
	public MensajeJuegoCreado(AnadirJuego anadirJuego) {
		padre = anadirJuego;
		this.setVisible(true);
		setTitle("Mensaje");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 392, 142);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		aceptarB = new JButton("Aceptar");
		aceptarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aceptar();
			}
		});
		aceptarB.setBounds(143, 67, 89, 23);
		contentPane.add(aceptarB);

		mensajeL = new JLabel("El juego se ha creado correctamente");
		mensajeL.setBounds(87, 28, 260, 14);
		contentPane.add(mensajeL);
	}

	public void aceptar() {
		dispose();
		padre.dispose();
		
	}

}
