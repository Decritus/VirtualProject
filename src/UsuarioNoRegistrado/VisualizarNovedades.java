/*
 * Esta clase concuerda con el diagrama de clases en componentes y nombre
 * */
package UsuarioNoRegistrado;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.BorderLayout;

public class VisualizarNovedades extends JPanel {
	private JTextArea novedades;

	public VisualizarNovedades() {
		setLayout(new BorderLayout(0, 0));

		novedades = new JTextArea();
		novedades
				.setText("�ltimas actualizaciones: "
						+ "\n\nActualizaci�n de 1 juego:\n\tA�adidos juego Craps."
						+ "\n\nActualizaci�n de 2 juegos:\n\tA�adidos juego Escoba, GBoard."
						+ "\n\nActualizaci�n de 2 juegos:\n\tA�adidos juego MasterMind y Parejas_Simpson.");
		novedades.setEditable(false);
		novedades.setBackground(new Color(144, 238, 144));
		this.add(novedades);
	}

}
