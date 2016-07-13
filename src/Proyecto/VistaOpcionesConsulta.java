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

public class VistaOpcionesConsulta extends JFrame {
	
	private JPanel contentPane;
	private JTextField nombreTF;
	private TextArea consultaTA;

	private JLabel lblConsultaEnXquery;
	private JButton btnModificarConsulta;
	private JButton btnBorrarConsulta;
	private JButton btnCancelar;
	
	public VistaOpcionesConsulta(){
		
		this.setTitle("Opciones de Consulta");
		setBounds(100, 100, 800, 400);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre archivo: ");
		lblNombre.setBounds(306, 16, 142, 16);
		contentPane.add(lblNombre);
		
		nombreTF = new JTextField();
		nombreTF.setBounds(23, 43, 644, 28);
		contentPane.add(nombreTF);
		nombreTF.setColumns(10);
		
		consultaTA= new TextArea();
		
		consultaTA.setBounds(23, 104, 644, 211);
		contentPane.add(consultaTA);
		
		lblConsultaEnXquery = new JLabel("Consulta en XQuery");
		lblConsultaEnXquery.setBounds(201, 82, 187, 16);
		contentPane.add(lblConsultaEnXquery);
		
		btnModificarConsulta = new JButton("Modificar consulta");
		btnModificarConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificarConsulta.setBounds(696, 104, 78, 77);
		contentPane.add(btnModificarConsulta);
		
		btnBorrarConsulta = new JButton("Borrar consulta");
		btnBorrarConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBorrarConsulta.setBounds(696, 206, 84, 77);
		contentPane.add(btnBorrarConsulta);
		
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancelar.setBounds(23, 337, 117, 29);
		contentPane.add(btnCancelar);
		
	}
	
}
