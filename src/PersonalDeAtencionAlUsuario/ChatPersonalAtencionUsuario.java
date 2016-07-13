package PersonalDeAtencionAlUsuario;

import javax.swing.JPanel;
import javax.swing.JList;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JButton;

import UsuarioRegistrado.Chat;
import Chat.publico;

import java.awt.BorderLayout;
import java.io.IOException;

public class ChatPersonalAtencionUsuario extends Chat {

	/**
	 * Create the panel.
	 * @param string 
	 */
	public ChatPersonalAtencionUsuario(String nombre) {
		publico p = new publico();
		p.crear();
		try {
			p.conexion();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		p.setSize(303, 430);
		p.setLocation(660, 90);
		p.show();
		p.flujo(nombre);
	}
}
