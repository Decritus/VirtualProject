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

import basededatos.BDPrincipal;
import Interfaz.IUsuarioNoRegistrado;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RecuperarClave extends JFrame {

	private JPanel contentPane;
	private JTextField correoTF;
	private JLabel correoL;
	private JButton siguienteB;
	private JButton cancelarB;
	private JLabel campoObligatorioL;
	private UsuarioNoRegistrado padre = new UsuarioNoRegistrado();

	/**
	 * Create the frame.
	 */
	public RecuperarClave(final UsuarioNoRegistrado padre) {
		this.padre = padre;
		this.setVisible(true);
		setTitle("Recuperar clave");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 160);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		campoObligatorioL = new JLabel("No existe el correo proporcionado");
		campoObligatorioL.setFont(new Font("Tahoma", Font.PLAIN, 10));
		campoObligatorioL.setForeground(Color.RED);
		campoObligatorioL.setBounds(30, 72, 370, 14);
		campoObligatorioL.setVisible(false);
		contentPane.add(campoObligatorioL);

		correoL = new JLabel("Correo");
		correoL.setBounds(20, 21, 46, 14);
		contentPane.add(correoL);

		correoTF = new JTextField();
		correoTF.setBounds(20, 45, 394, 29);
		contentPane.add(correoTF);
		if (correoTF.getText() != "") {
			correoTF.setText("Correo");
			correoTF.setColumns(10);
		} else {
			campoObligatorioL.setVisible(true);
		}
		siguienteB = new JButton("Siguiente");
		siguienteB.setBounds(197, 88, 117, 23);
		contentPane.add(siguienteB);

		cancelarB = new JButton("Cancelar");
		cancelarB.setBounds(325, 88, 89, 23);
		contentPane.add(cancelarB);
		cancelarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancelar();
			}
		});
		siguienteB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pregunta = "";
				try {
					pregunta = obtenerPregunta();
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (NotBoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if (pregunta == null) {
					campoObligatorio();

				} else {
					JFrame rec = new IntroducirDatosRequeridos(pregunta, padre,
							correoTF.getText());
					dispose();
				}
			}
		});
	}

	public void campoObligatorio() {
		campoObligatorioL.setVisible(true);
	}

	public void cancelar() {
		dispose();
	}

	public String obtenerPregunta() throws RemoteException, NotBoundException {
		Registry registry = LocateRegistry.getRegistry();
		IUsuarioNoRegistrado IA = (IUsuarioNoRegistrado) registry
				.lookup("NoRegistrado");

		return IA.obtenerPregunta(correoTF.getText());
	}

}
