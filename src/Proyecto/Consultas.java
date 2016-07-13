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

public class Consultas extends JFrame {
	
	private JPanel contentPane;
	private JTextField nombreTF;
	private TextArea consultaTA;
	private TextArea solucionTA;

	private JLabel lblConsultaEnXquery;
	private JLabel lblSolucion;
	private JButton btnGuardarConsulta;
	private JButton btnG;
	private JButton btnEjecutar;
	private JButton btnCancelar;
	
	public Consultas(){
		
		this.setTitle("Introducir Consultas");
		setBounds(100, 100, 800, 600);
		
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
		
		solucionTA= new TextArea();
		solucionTA.setBounds(23, 366, 644, 174);
		contentPane.add(solucionTA);
		
		lblSolucion = new JLabel("Solucion");
		lblSolucion.setBounds(201, 331, 146, 16);
		contentPane.add(lblSolucion);
		
		btnGuardarConsulta = new JButton("Guardar consulta");
		btnGuardarConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardarConsulta.setBounds(696, 173, 78, 77);
		contentPane.add(btnGuardarConsulta);
		
		btnG = new JButton("Guardar solucion");
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnG.setBounds(696, 408, 84, 77);
		contentPane.add(btnG);
		
		btnEjecutar = new JButton("Probar");
		btnEjecutar.setBounds(696, 29, 78, 58);
		contentPane.add(btnEjecutar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(23, 546, 117, 29);
		contentPane.add(btnCancelar);
		
	}
	
}
