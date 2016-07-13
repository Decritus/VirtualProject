package UsuarioNoRegistrado;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import Interfaz.IUsuarioNoRegistrado;
import basededatos.BDPrincipal;
import basededatos.UsuarioActivado;
import basededatos.UsuarioRegistrado;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class IntroducirDatosRequeridos extends JFrame {

	private JPanel contentPane;
	private JTextField respuestaTF;
	private JLabel preguntaL;
	private JComboBox preguntaCoB;
	private JButton recuperarB;
	private JButton cancelarB;
	private UsuarioNoRegistrado padre = new UsuarioNoRegistrado();
	private JLabel campoObligatorioL;
	String pregunta;
	String correo;

	/**
	 * Create the frame.
	 * 
	 * @param Correo
	 */
	public IntroducirDatosRequeridos(String pregunta,
			UsuarioNoRegistrado padre, String Correo) {
		this.pregunta=pregunta;
		this.correo = Correo;
		this.setVisible(true);
		setTitle("Recuperar clave");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 330, 188);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		campoObligatorioL = new JLabel("Respuesta introducida incorrecta");
		campoObligatorioL.setFont(new Font("Tahoma", Font.PLAIN, 10));
		campoObligatorioL.setForeground(Color.RED);
		campoObligatorioL.setBounds(20, 97, 288, 14);
		campoObligatorioL.setVisible(false);
		contentPane.add(campoObligatorioL);

		preguntaL = new JLabel("Pregunta ");
		preguntaL.setBounds(20, 11, 274, 14);
		contentPane.add(preguntaL);

	
		rellenarPregunta();
	

		respuestaTF = new JTextField();
		respuestaTF.setBounds(20, 68, 274, 29);
		contentPane.add(respuestaTF);
		respuestaTF.setText("Respuesta");
		respuestaTF.setColumns(10);

		recuperarB = new JButton("Recuperar");
		recuperarB.setBounds(30, 123, 117, 23);
		contentPane.add(recuperarB);

		cancelarB = new JButton("Cancelar");
		cancelarB.setBounds(205, 123, 89, 23);
		contentPane.add(cancelarB);
		cancelarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancelar();
			}
		});
		recuperarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String recuperar = "";
				try {
					try {
						recuperar = recuperar();
					} catch (NotBoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				if (recuperar == null) {
					campoObligatorio();
				}
			}
		});
	}

	public void cancelar() {
		dispose();
	}

	public void rellenarPregunta() {
		preguntaCoB = new JComboBox();
		preguntaCoB.addItem(pregunta);
		preguntaCoB.setBounds(20, 34, 274, 23);
		contentPane.add(preguntaCoB);
	}
	public void campoObligatorio() {
		campoObligatorioL.setVisible(true);
	}
	public String recuperar() throws RemoteException, NotBoundException {
		Registry registry = LocateRegistry.getRegistry();
		IUsuarioNoRegistrado IA = (IUsuarioNoRegistrado) registry
				.lookup("NoRegistrado");

		String recuperar = IA.recuperar(respuestaTF.getText(), correo);

		if (recuperar==null) {
			return null;
		} else {
			JFrame respuest = new EnviarCorreoConClave(recuperar);
			dispose();
			return recuperar;
		}
	}
}