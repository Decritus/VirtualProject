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
				.setText("Últimas actualizaciones: "
						+ "\n\nActualización de 1 juego:\n\tAñadidos juego Craps."
						+ "\n\nActualización de 2 juegos:\n\tAñadidos juego Escoba, GBoard."
						+ "\n\nActualización de 2 juegos:\n\tAñadidos juego MasterMind y Parejas_Simpson.");
		novedades.setEditable(false);
		novedades.setBackground(new Color(144, 238, 144));
		this.add(novedades);
	}

}
