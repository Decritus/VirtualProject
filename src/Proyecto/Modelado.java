package Proyecto;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Modelado extends JPanel{
	JPanel norte, sur, centro;
	JTextField tituloPrincipal;
	JTextField tituloGuardadas;
	JTextField tituloPreview;
	JTextArea areaPreview;
	
	JButton anadirConsulta;
	JTextField tituloSecundario;
	JPanel panelTituloSecundario;
	JPanel panelBotonesConsultas;

	JButton acercaDe;
	JButton cargar;
	JButton eliminar;
	JTextArea areaConsultas;
	
	public Modelado(){
		
		setLayout(new BorderLayout(0, 0));
		
		norte = new JPanel();
		add(norte, BorderLayout.NORTH);
		norte.setLayout(new BorderLayout(0,0));

		panelTituloSecundario = new JPanel();
		norte.add(panelTituloSecundario, BorderLayout.CENTER);
		panelTituloSecundario.setLayout(new BorderLayout(0,0));
		
		
		
		acercaDe = new JButton("acerca de");
		acercaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panelTituloSecundario.add(acercaDe, BorderLayout.EAST);

		
		tituloPrincipal = new JTextField("Titulo Principal");
		norte.add(tituloPrincipal, BorderLayout.NORTH);
		
		tituloSecundario = new JTextField("Titulo Secundario");
		panelTituloSecundario.add(tituloSecundario, BorderLayout.WEST);
		
		tituloGuardadas = new JTextField("Titulo Guardadas");
		norte.add(tituloGuardadas, BorderLayout.SOUTH);
		
		centro = new JPanel();
		add(centro, BorderLayout.CENTER);
		centro.setLayout(new BorderLayout(0,0));
		
		panelBotonesConsultas = new JPanel();
		centro.add(panelBotonesConsultas, BorderLayout.SOUTH);
		panelBotonesConsultas.setLayout(new BorderLayout(0,0));
	
		
		cargar = new JButton("cargar");
		panelBotonesConsultas.add(cargar, BorderLayout.EAST);		
		
		eliminar = new JButton("eliminar");
		panelBotonesConsultas.add(eliminar, BorderLayout.WEST);
		
		areaConsultas= new JTextArea ("consultas");
		centro.add(areaConsultas,BorderLayout.CENTER);
		
		
		sur = new JPanel();
		add(sur, BorderLayout.SOUTH);
		sur.setLayout(new BorderLayout(0,0));
		
		tituloPreview = new JTextField("preview");
		sur.add(tituloPreview,BorderLayout.NORTH);
		
		areaPreview= new JTextArea ("preview\n\n\n\n\n\n\n\n\n\n\n");
		areaPreview.setBounds(0, 0, 50, 50);
		sur.add(areaPreview,BorderLayout.CENTER);
		
		anadirConsulta= new JButton ("anadir consulta");
		sur.add(anadirConsulta,BorderLayout.SOUTH);
		
		this.setVisible(true);
	}

}
