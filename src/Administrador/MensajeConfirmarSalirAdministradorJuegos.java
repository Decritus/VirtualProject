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

public class MensajeConfirmarSalirAdministradorJuegos extends JFrame {

	private JPanel contentPane;
	private JLabel mensajeL;
	private JButton siB;
	private JButton noB;
	final JFrame abuelo;
	final JFrame padre;
	/**
	 * Create the frame.
	 */
	public MensajeConfirmarSalirAdministradorJuegos(final JFrame padre,
			final JFrame abuelo) {
		this.abuelo=abuelo;
		this.padre=padre;
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 359, 142);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		mensajeL = new JLabel("¿Está seguro que desea salir?");
		mensajeL.setToolTipText("");
		mensajeL.setBounds(72, 26, 239, 23);
		contentPane.add(mensajeL);

		siB = new JButton("Si");
		siB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
	public void si(){
		abuelo.setVisible(true);
		padre.dispose();
		
		dispose();
	}
	public void no(){
		dispose();
	}
}
