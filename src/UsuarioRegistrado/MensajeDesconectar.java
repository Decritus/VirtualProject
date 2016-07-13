package UsuarioRegistrado;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import AbrirJuego.AbrirFichaJuego;
import Chat.publico;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MensajeDesconectar extends JFrame {

	private JPanel contentPane;
	private JLabel mensajeL;
	private JButton siB;
	private JButton noB;
private JFrame padre;
private JFrame abuelo;

	
	/**
	 * Create the frame.
	 */
	public MensajeDesconectar(final JFrame padre,final JFrame abuelo) {
		this.padre=padre;
		this.abuelo=abuelo;
		this.setVisible(true);
		setTitle("Desconexion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 392, 142);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		mensajeL = new JLabel("\u00BFEst\u00E1 seguro que desea desconectarse?");
		mensajeL.setToolTipText("");
		mensajeL.setBounds(66, 27, 269, 23);
		contentPane.add(mensajeL);
		
		siB = new JButton("Si");
		
		siB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				si();

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
	public void si(){
		for (Frame miFrame : JFrame.getFrames()) {
			if(miFrame instanceof publico){
				miFrame.dispose();
				
			}if(miFrame instanceof CatalogoDeJuegosUsuarioRegistrado){
				miFrame.dispose();
				
			}if(miFrame instanceof AbrirFichaJuego){
				miFrame.dispose();
			}
			
		}
		dispose();
		padre.dispose();
		abuelo.setVisible(true);
	}
}
