package UsuarioRegistrado;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.swing.JPasswordField;

import Interfaz.IUsuarioRegistrado;
import basededatos.BDPrincipal;
import basededatos.UsuarioActivado;

public class DatosUsuario extends JFrame {
	
	protected JPanel contentPane;
	protected JTextField respuestaSecretaTF;
	protected JTextField emailTF;
	protected JTextField dniTF;
	protected JTextField numeroCuentaTF;
	protected JPasswordField passwordPF;
	protected JPasswordField repetirPasswordPF;
	protected JLabel fotoL;
	protected JLabel cambiarFotoL;
	protected JLabel passwordL;
	protected JLabel repetirPasswordL;
	protected JLabel preguntaSecretaL;
	protected JLabel emailL;
	protected JLabel respuestaSecretaL;
	protected JLabel dniL;
	protected JLabel numeroCuentaL;
	protected JLabel gananciasL ;
	protected JComboBox preguntaSecretaCoB;
	protected JButton actualizarB;
	protected JButton cancelarB;
	protected JLabel gananciasDineroL;
	protected JLabel nombreUsuarioL;
	protected JLabel nombreL;
	protected JComboBox elegirFotoCoB;
	public UsuarioRegistrado abuelo;
	protected String dni;

	/**
	 * Create the frame.
	 */
	public DatosUsuario() {
		setTitle("Editar Perfil Usuario");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 410, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		fotoL = new JLabel("");
		fotoL.setBackground(Color.BLACK);
		fotoL.setBounds(30, 5, 75, 75);
		fotoL.setHorizontalAlignment(SwingConstants.CENTER);
		fotoL.setToolTipText("");
		contentPane.add(fotoL);		
		
		
		elegirFotoCoB = new JComboBox();
		elegirFotoCoB.setBounds(193, 79, 149, 17);
		contentPane.add(elegirFotoCoB);
		elegirFotoCoB.addItem("avatar1.png");
		elegirFotoCoB.addItem("avatar2.png");
		elegirFotoCoB.addItem("avatar3.png");
		elegirFotoCoB.addItem("avatar4.png");
		
		cambiarFotoL = new JLabel("Cambiar Foto de Perfil");
	//	cambiarFotoL.setFont(new Font("Tahoma", Font.PLAIN, 9));
		cambiarFotoL.setBounds(30, 76, 151, 20);
		contentPane.add(cambiarFotoL);	
		
		passwordL = new JLabel("Contrase\u00F1a");
		passwordL.setBounds(30, 110, 121, 14);
		contentPane.add(passwordL);
		
		repetirPasswordL = new JLabel("Repetir Contrase\u00F1a");
		repetirPasswordL.setBounds(30, 138, 121, 14);
		contentPane.add(repetirPasswordL);
		
		preguntaSecretaL = new JLabel("Pregunta Secreta");
		preguntaSecretaL.setBounds(30, 166, 121, 14);
		contentPane.add(preguntaSecretaL);
		
		respuestaSecretaL = new JLabel("Respuesta Secreta");
		respuestaSecretaL.setBounds(30, 194, 121, 14);
		contentPane.add(respuestaSecretaL);
		
		respuestaSecretaTF = new JTextField();
		respuestaSecretaTF.setColumns(10);
		respuestaSecretaTF.setBounds(193, 191, 149, 20);
		contentPane.add(respuestaSecretaTF);
		
		emailL = new JLabel("Correo Electr\u00F3nico");
		emailL.setBounds(30, 222, 121, 14);
		contentPane.add(emailL);
		
		emailTF = new JTextField();
		emailTF.setColumns(10);
		emailTF.setBounds(193, 219, 149, 20);
		contentPane.add(emailTF);
		
		dniL = new JLabel("DNI");
		dniL.setBounds(30, 250, 121, 14);
		contentPane.add(dniL);
		
		dniTF = new JTextField();
		dniTF.setEditable(false);
		dniTF.setColumns(10);
		dniTF.setBounds(193, 247, 149, 20);
		contentPane.add(dniTF);
		
		numeroCuentaL = new JLabel("N\u00FAmero de Cuenta");
		numeroCuentaL.setBounds(30, 278, 121, 14);
		contentPane.add(numeroCuentaL);
		
		numeroCuentaTF = new JTextField();
		numeroCuentaTF.setColumns(10);
		numeroCuentaTF.setBounds(193, 275, 149, 20);
		contentPane.add(numeroCuentaTF);
		
		gananciasL = new JLabel("Ganancias");
		gananciasL.setBounds(30, 306, 121, 14);
		contentPane.add(gananciasL);
		
		preguntaSecretaCoB = new JComboBox();
		preguntaSecretaCoB.setBounds(193, 163, 149, 17);
		contentPane.add(preguntaSecretaCoB);
		preguntaSecretaCoB.addItem("¿Hola que tal?");
		preguntaSecretaCoB.addItem("¿Nombre de tu mascota?");
		preguntaSecretaCoB.addItem("¿Nombre de tu mejor amigo?");
		preguntaSecretaCoB.addItem("¿Cual fue tu primer colegio?");
		actualizarB = new JButton("Actualizar");
		actualizarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizar();
			}
		});
		actualizarB.setBounds(30, 331, 106, 23);
		contentPane.add(actualizarB);
		
		cancelarB = new JButton("Cancelar");
		cancelarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancelar();
			}
		});
		cancelarB.setBounds(275, 331, 89, 23);
		contentPane.add(cancelarB);
		
		gananciasDineroL = new JLabel("X.XX Euros");
		gananciasDineroL.setBounds(193, 306, 149, 14);
		contentPane.add(gananciasDineroL);
		
		nombreUsuarioL = new JLabel("Nombre de Usuario:");
		nombreUsuarioL.setBounds(193, 23, 132, 14);
		contentPane.add(nombreUsuarioL);
		
		nombreL = new JLabel("nombre");
		nombreL.setBounds(193, 48, 121, 14);
		contentPane.add(nombreL);
		
		passwordPF = new JPasswordField();
		passwordPF.setBounds(193, 107, 149, 20);
		contentPane.add(passwordPF);
		
		repetirPasswordPF = new JPasswordField();
		repetirPasswordPF.setBounds(193, 135, 149, 20);
		contentPane.add(repetirPasswordPF);
	}
	public void actualizar(){
		UsuarioActivado usuario = new UsuarioActivado();
		usuario.setNombreUsuario(nombreL.getText());
		if(passwordPF.getText().equals(repetirPasswordPF.getText())){
			usuario.setContrasena(passwordPF.getText());	
		}else{
			
		}
		usuario.setEmail(emailTF.getText());
		//Hay que tener cuidado con los dni
		usuario.setIdDNI(dniTF.getText());
		usuario.setNumCuenta(numeroCuentaTF.getText());
		usuario.setPreguntaSecreta(preguntaSecretaCoB.getSelectedItem().toString());
		usuario.setRespuestaSecreta(respuestaSecretaTF.getText());
		usuario.setFoto(elegirFotoCoB.getSelectedItem().toString());
		
	
		JFrame act= new MensajeConfirmarActualizarPerfil(this, usuario);
	}
	
	public void obtenerDatosUsuario(String dNI) throws RemoteException, NotBoundException{
		Registry registry = LocateRegistry.getRegistry();
		IUsuarioRegistrado IA = (IUsuarioRegistrado) registry.lookup("Registrado");
		//IUsuarioRegistrado IA = new BDPrincipal();
		
		UsuarioActivado usuario = IA.obtenerDatosUsuario(dNI);
		nombreL.setText(usuario.getNombreUsuario());
		respuestaSecretaTF.setText(usuario.getRespuestaSecreta());
		emailTF.setText(usuario.getEmail());
		numeroCuentaTF.setText(usuario.getNumCuenta());
		passwordPF.setText(usuario.getContrasena());
		repetirPasswordPF.setText(usuario.getContrasena());
		preguntaSecretaCoB.addItem(usuario.getPreguntaSecreta());
		dniTF.setText(usuario.getIdDNI());
		gananciasDineroL.setText(usuario.getGanancias()+" €");	
		fotoL.setIcon(new ImageIcon(DatosUsuario.class
				.getResource("/imagenes/"+usuario.getFoto())));
		repaint();
		
	}
	public void cancelar(){
		dispose();
	}
}
