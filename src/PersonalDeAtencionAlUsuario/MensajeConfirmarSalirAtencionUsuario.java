package PersonalDeAtencionAlUsuario;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Chat.publico;


public class MensajeConfirmarSalirAtencionUsuario extends JFrame {
	private JPanel contentPane;
	private JLabel mensajeL;
	private JButton siB;
	private JButton noB;
	final PersonalDeAtencionAlUsuario padre;
	
	/**
	 * Create the frame.
	 */
	public MensajeConfirmarSalirAtencionUsuario(final PersonalDeAtencionAlUsuario padre) {
		this.padre=padre;
		this.setVisible(true);
		setTitle("Confirmar salir");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 392, 142);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		mensajeL = new JLabel("\u00BFDesea salir?");
		mensajeL.setToolTipText("");
		mensajeL.setBounds(131, 35, 106, 23);
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
		for (Frame miFrame : JFrame.getFrames()) {
			if(miFrame instanceof publico){
				miFrame.dispose();
				
			}
		}
		//a?adir la consulta con la base de datos
		padre.devolverVisibilidad();
		padre.dispose();
		dispose();
	}
	public void no(){
		dispose();
	}
}
