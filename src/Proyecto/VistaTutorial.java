package Proyecto;

import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaTutorial extends JFrame {
	
	private JPanel contentPane;
	private JTextField nombreTF;
	private TextArea consultaTA;

	private JLabel lblConsultaEnXquery;
	private JButton btnModificarConsulta;
	private JButton btnBorrarConsulta;
	private JButton btnCancelar;
	
	public VistaTutorial(){
		
		this.setTitle("Tutorial");
		setBounds(100, 100, 692, 400);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("JOSM - URBAN ");
		lblNombre.setBounds(390, 18, 142, 16);
		contentPane.add(lblNombre);
		
		nombreTF = new JTextField();
		nombreTF.setBounds(189, 43, 478, 28);
		contentPane.add(nombreTF);
		nombreTF.setColumns(10);
		
		consultaTA= new TextArea();
		
		consultaTA.setBounds(189, 104, 478, 211);
		contentPane.add(consultaTA);
		
		lblConsultaEnXquery = new JLabel("ÀQue es JOSM - URBAN");
		lblConsultaEnXquery.setBounds(363, 83, 187, 16);
		contentPane.add(lblConsultaEnXquery);
		
		btnModificarConsulta = new JButton("Tutorial");
		btnModificarConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificarConsulta.setBounds(529, 337, 78, 28);
		contentPane.add(btnModificarConsulta);
		
		btnBorrarConsulta = new JButton("Opciones de servidor");
		btnBorrarConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBorrarConsulta.setBounds(265, 337, 187, 28);
		contentPane.add(btnBorrarConsulta);
		
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancelar.setBounds(27, 337, 117, 29);
		contentPane.add(btnCancelar);
		
		JLabel lblNewLabel = new JLabel("Icono aplicacion");
		lblNewLabel.setBounds(27, 36, 138, 143);
		contentPane.add(lblNewLabel);
		
	}
}
