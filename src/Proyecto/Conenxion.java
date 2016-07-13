package Proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class Conenxion extends JFrame{
	
	private JPanel contentPane;
	private JLabel textoL;
	private JButton guardarB;
	private JTextField direccionIPTF;
	private JTextField nombreServidorTF;
	private JLabel lblPuertoDeConexion;
	private JTextField puertoTF;
	private JLabel lblUsuarioDeAcceso;
	private JLabel lblContrasea;
	private JTextField usuarioTF;
	private JTextField contrasenaTF;
	private JTextField probarConTF;
	
	public Conenxion(){
		
	this.setTitle("Parametros de conexion");
	setBounds(100, 100, 392, 400);
	
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);

	textoL = new JLabel("Introduzca los parametros de acceso al servidor");
	textoL.setToolTipText("");
	textoL.setBounds(40, 6, 346, 61);
	contentPane.add(textoL);

	guardarB = new JButton("Guardar");
	guardarB.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			//metodos de la clase controladora
			//llamar a la accion correspondiente en el controlador
		}
	});
	guardarB.setBounds(269, 292, 92, 23);
	contentPane.add(guardarB);
	
	direccionIPTF = new JTextField();
	direccionIPTF.setBounds(155, 61, 186, 28);
	contentPane.add(direccionIPTF);
	direccionIPTF.setColumns(10);
	
	JLabel lblDireccionIp = new JLabel("Direccion IP");
	lblDireccionIp.setBounds(6, 67, 81, 16);
	contentPane.add(lblDireccionIp);
	
	JLabel lblNombreBaseDe = new JLabel("Nombre del servidor");
	lblNombreBaseDe.setBounds(6, 115, 146, 23);
	contentPane.add(lblNombreBaseDe);
	
	nombreServidorTF = new JTextField();
	nombreServidorTF.setBounds(155, 112, 186, 28);
	contentPane.add(nombreServidorTF);
	nombreServidorTF.setColumns(10);
	
	lblPuertoDeConexion = new JLabel("Puerto de conexion");
	lblPuertoDeConexion.setBounds(6, 160, 146, 16);
	contentPane.add(lblPuertoDeConexion);
	
	puertoTF = new JTextField();
	puertoTF.setBounds(155, 154, 186, 28);
	contentPane.add(puertoTF);
	puertoTF.setColumns(10);
	
	lblUsuarioDeAcceso = new JLabel("Usuario de acceso");
	lblUsuarioDeAcceso.setBounds(6, 196, 127, 16);
	contentPane.add(lblUsuarioDeAcceso);
	
	lblContrasea = new JLabel("Contrase\u00F1a");
	lblContrasea.setBounds(6, 234, 110, 16);
	contentPane.add(lblContrasea);
	
	usuarioTF = new JTextField();
	usuarioTF.setBounds(155, 188, 186, 28);
	contentPane.add(usuarioTF);
	usuarioTF.setColumns(10);
	
	contrasenaTF = new JTextField();
	contrasenaTF.setBounds(155, 228, 186, 28);
	contentPane.add(contrasenaTF);
	contrasenaTF.setColumns(10);
	
	probarConTF = new JTextField();
	probarConTF.setBounds(20, 330, 331, 28);
	contentPane.add(probarConTF);
	probarConTF.setColumns(10);
	
	JButton btnProbar = new JButton("Probar");
	btnProbar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//llamar a la accion correspondiente en el controlador
		}
	});
	btnProbar.setBounds(145, 289, 117, 29);
	contentPane.add(btnProbar);
	
	JButton btnCancelar = new JButton("Cancelar");
	btnCancelar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			//llamar a la accion correspondiente en el controlador
			
			//dispose();
		}
	});
	btnCancelar.setBounds(16, 289, 117, 29);
	contentPane.add(btnCancelar);
}
}
