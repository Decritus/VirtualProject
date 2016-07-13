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
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JPasswordField;

import Interfaz.IUsuarioNoRegistrado;
import basededatos.BDPrincipal;
import basededatos.Fecha;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Date;

public class Registrarse extends JFrame {

	private JPanel contentPane;
	private JTextField nombreUsuarioTF;
	private JTextField respuestaSecretaTF;
	private JTextField emailTF;
	private JTextField dniTF;
	private JTextField numeroCuentaTF;
	private JLabel campoObligatorioL;
	private JLabel tituloL;
	private JLabel nombreUsuarioL;
	private JLabel passwordL;
	private JLabel preguntaSecretaL;
	private JLabel respuestaSecretaL;
	private JLabel emailL;
	private JLabel dniL;
	private JLabel numeroCuentaL;
	private JComboBox preguntaSecretaCoB;
	private JButton registrarseB;
	private JButton cancelarB;
	private JLabel repetirPasswordL;
	private JPasswordField passwordPF;
	private JPasswordField repetirPasswordPF;
	private JFrame abuelo;

	/**
	 * Create the frame.
	 */
	public Registrarse(final JFrame abuelo) {
		this.abuelo = abuelo;
		this.setVisible(true);
		setTitle("Formulario de Registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		abuelo.setVisible(false);
		tituloL = new JLabel("FORMULARIO DE REGISTRO");
		tituloL.setBounds(133, 11, 163, 14);
		contentPane.add(tituloL);
		nombreUsuarioTF = new JTextField();
		nombreUsuarioTF.setBounds(220, 36, 145, 20);
		contentPane.add(nombreUsuarioTF);
		nombreUsuarioTF.setColumns(10);

		nombreUsuarioL = new JLabel("Nombre de Usuario*");
		nombreUsuarioL.setBounds(60, 39, 129, 14);
		contentPane.add(nombreUsuarioL);

		passwordL = new JLabel("Contrase\u00F1a*");
		passwordL.setBounds(60, 70, 129, 14);
		contentPane.add(passwordL);

		preguntaSecretaL = new JLabel("Pregunta Secreta*");
		preguntaSecretaL.setBounds(60, 150, 129, 14);
		contentPane.add(preguntaSecretaL);

		respuestaSecretaL = new JLabel("Respuesta Secreta*");
		respuestaSecretaL.setBounds(60, 182, 129, 14);
		contentPane.add(respuestaSecretaL);

		respuestaSecretaTF = new JTextField();
		respuestaSecretaTF.setColumns(10);
		respuestaSecretaTF.setBounds(220, 179, 145, 20);
		contentPane.add(respuestaSecretaTF);

		emailL = new JLabel("Correo Electr\u00F3nico*");
		emailL.setBounds(60, 211, 129, 14);
		contentPane.add(emailL);

		emailTF = new JTextField();
		emailTF.setColumns(10);
		emailTF.setBounds(220, 208, 145, 20);
		contentPane.add(emailTF);

		dniL = new JLabel("DNI*");
		dniL.setBounds(60, 246, 129, 14);
		contentPane.add(dniL);

		dniTF = new JTextField();
		dniTF.setColumns(10);
		dniTF.setBounds(220, 243, 145, 20);
		contentPane.add(dniTF);

		numeroCuentaL = new JLabel("N\u00FAmero de Cuenta*");
		numeroCuentaL.setBounds(60, 271, 129, 14);
		contentPane.add(numeroCuentaL);

		numeroCuentaTF = new JTextField();
		numeroCuentaTF.setColumns(10);
		numeroCuentaTF.setBounds(220, 268, 145, 20);
		contentPane.add(numeroCuentaTF);

		preguntaSecretaCoB = new JComboBox();
		preguntaSecretaCoB.setBounds(220, 147, 145, 20);
		contentPane.add(preguntaSecretaCoB);
		preguntaSecretaCoB.addItem("¿Hola que tal?");
		preguntaSecretaCoB.addItem("¿Nombre de tu mascota?");
		preguntaSecretaCoB.addItem("¿Nombre de tu mejor amigo?");
		preguntaSecretaCoB.addItem("¿Cual fue tu primer colegio?");

		registrarseB = new JButton("Registrarse");
		registrarseB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					registrarse();
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// sentencia SQL o metodo que guarde los parametros de registro
				catch (NotBoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		registrarseB.setBounds(69, 338, 117, 23);
		contentPane.add(registrarseB);

		cancelarB = new JButton("Cancelar");
		cancelarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancelar();
			}
		});
		cancelarB.setBounds(254, 338, 89, 23);
		contentPane.add(cancelarB);

		campoObligatorioL = new JLabel(
				"Compruebe que ha introducido bien la información en los Campos Obligatorios(*)");
		campoObligatorioL.setFont(new Font("Tahoma", Font.PLAIN, 10));
		campoObligatorioL.setForeground(Color.RED);
		campoObligatorioL.setBounds(60, 297, 370, 14);
		campoObligatorioL.setVisible(false);
		contentPane.add(campoObligatorioL);

		repetirPasswordL = new JLabel("Repetir contrase\u00F1a*");
		repetirPasswordL.setBounds(60, 98, 129, 14);
		contentPane.add(repetirPasswordL);

		passwordPF = new JPasswordField();
		passwordPF.setBounds(220, 67, 145, 20);
		contentPane.add(passwordPF);

		repetirPasswordPF = new JPasswordField();
		repetirPasswordPF.setBounds(220, 95, 145, 20);
		contentPane.add(repetirPasswordPF);

	}

	private boolean esNumero(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	public boolean registrarse() throws RemoteException, NotBoundException {

		if (nombreUsuarioTF.getText().equalsIgnoreCase("")
				|| nombreUsuarioTF.getText().equalsIgnoreCase("")
				|| passwordPF.getText().equalsIgnoreCase("")
				|| preguntaSecretaCoB.getSelectedItem().toString()
						.equalsIgnoreCase("")
				|| respuestaSecretaTF.getText().equalsIgnoreCase("")
				|| emailTF.equals("") || dniTF.getText().equalsIgnoreCase("")
				|| numeroCuentaTF.getText().equalsIgnoreCase("")) {
			campoObligatorioL.setVisible(true);
		} else {

			for (int i = 0; i < passwordPF.getText().length(); i++) {
				if (passwordPF.getText().equals(repetirPasswordPF.getText())
						&& (esNumero(passwordPF.getText().substring(i, i + 1)) == true)
						&& (passwordPF.getText().length() >= 8)
						&& passwordPF.getText().equals(
								repetirPasswordPF.getText())) {

					Registry registry = LocateRegistry.getRegistry();
					IUsuarioNoRegistrado IA = null;

					IA = (IUsuarioNoRegistrado) registry.lookup("NoRegistrado");
					java.util.Date fecha = new Date();
					i = passwordPF.getText().length();
					if (IA.registrarse(nombreUsuarioTF.getText(), passwordPF
							.getText(), preguntaSecretaCoB.getSelectedItem()
							.toString(), respuestaSecretaTF.getText(), emailTF
							.getText(), dniTF.getText(), numeroCuentaTF
							.getText(), fecha)) {

						abuelo.setVisible(true);
						JFrame men = new MandarCorreoConfirmacion();
						men.setLocationRelativeTo(abuelo);
						dispose();
						return true;

					} else {
						return false;
					}

				} else {
					campoObligatorio();
				}
			}
			return false;
		}
		return false;
	}

	public void cancelar() {
		if (abuelo instanceof UsuarioNoRegistrado)
			abuelo.setVisible(true);
		dispose();
		if (abuelo instanceof CatalogoDeJuegosNoRegistrado)
			abuelo.setVisible(true);
		dispose();
	}

	public void campoObligatorio() {
		campoObligatorioL.setVisible(true);

	}
}
