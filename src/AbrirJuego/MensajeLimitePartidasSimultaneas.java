package AbrirJuego;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MensajeLimitePartidasSimultaneas extends JFrame {

	private JPanel contentPane;
	private JButton aceptarB;
	private JLabel seHaRecibidoL;
	/**
	 * Create the frame.
	 */
	public MensajeLimitePartidasSimultaneas() {
		final JFrame este= this;
		this.setVisible(true);
		setTitle("Partidas simultaneas");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 407, 142);
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
		
		seHaRecibidoL = new JLabel("Ha superado el l\u00EDmite de partidas simultaneas");
		seHaRecibidoL.setBounds(65, 28, 336, 14);
		contentPane.add(seHaRecibidoL);
	}
	public void aceptar(){
		dispose();
	}

}
