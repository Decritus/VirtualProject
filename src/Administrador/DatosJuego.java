package Administrador;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DatosJuego extends JFrame {
	
	protected JLabel nombreL;
	protected JLabel importeInicialL;
	protected JLabel ubicacionL;
	protected JLabel imagenL;
	protected JLabel rutaL;
	protected JTextField nombreTF;
	protected JTextField ubicacionTF;
	protected JTextField importeInicialTF;
	protected JTextField rutaTF;
	protected JButton buscarImagenB;
	protected JButton cerrarB;
	protected JPanel imagenP;
	protected JLabel imageL;
	protected JPanel contentPane;
	

	

	/**
	 * Create the frame.
	 */
	public DatosJuego() {
		
		this.setVisible(true);
		setTitle("A\u00F1adir Juego");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 352, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nombreTF = new JTextField();
		nombreTF.setBounds(137, 11, 190, 20);
		contentPane.add(nombreTF);
		nombreTF.setColumns(10);
		
		nombreL = new JLabel("Nombre");
		nombreL.setBounds(27, 14, 95, 14);
		contentPane.add(nombreL);
		
		ubicacionL = new JLabel("Ubicaci\u00F3n");
		ubicacionL.setBounds(27, 45, 95, 14);
		contentPane.add(ubicacionL);
		
		ubicacionTF = new JTextField();
		ubicacionTF.setColumns(10);
		ubicacionTF.setBounds(137, 42, 190, 20);
		contentPane.add(ubicacionTF);
		
		importeInicialL = new JLabel("Importe Inicial");
		importeInicialL.setBounds(27, 73, 95, 14);
		contentPane.add(importeInicialL);
		
		importeInicialTF = new JTextField();
		importeInicialTF.setColumns(10);
		importeInicialTF.setBounds(137, 70, 190, 20);
		contentPane.add(importeInicialTF);
		
		imagenP = new JPanel();
		imagenP.setBackground(new Color(255, 127, 80));
		imagenP.setBounds(27, 123, 144, 119);
		contentPane.add(imagenP);
		
		imageL = new JLabel("");
		imageL.setBounds(0, 0, 315, 224);
		imageL.setHorizontalAlignment(SwingConstants.CENTER);
		imageL.setToolTipText("");
		
		imagenP.add(imageL);
		
		cerrarB = new JButton("Cerrar");
		cerrarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cerrar();
			}
		});
		cerrarB.setBounds(238, 254, 89, 23);
		contentPane.add(cerrarB);
		
		buscarImagenB = new JButton("Buscar Imagen");
		buscarImagenB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarImagen();
			}
		});
		buscarImagenB.setBounds(183, 123, 144, 23);
		contentPane.add(buscarImagenB);
		
		imagenL = new JLabel("Imagen");
		imagenL.setBounds(27, 98, 46, 14);
		contentPane.add(imagenL);
		
		rutaTF = new JTextField();
		rutaTF.setBounds(181, 175, 146, 20);
		contentPane.add(rutaTF);
		rutaTF.setColumns(10);
		
		rutaL = new JLabel("Ruta");
		rutaL.setBounds(181, 157, 46, 14);
		contentPane.add(rutaL);
	}
	
	public void buscarImagen(){
		try{
			imageL.setIcon(new ImageIcon(DatosJuego.class
					.getResource("/imagenes/"+rutaTF.getText())));
			}
			catch(Exception i){
				imageL.setIcon(new ImageIcon(DatosJuego.class
						.getResource("/imagenes/defecto.png")));
				repaint();
				imagenP.repaint();
				contentPane.repaint();
			}
			repaint();
			imagenP.repaint();
			contentPane.repaint();
	}
	public void cerrar(){
		dispose();
	}
	
	
}
