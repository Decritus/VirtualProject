package UsuarioRegistrado;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JRootPane;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JButton;

import Chat.publico;

import java.awt.BorderLayout;
import java.io.IOException;

public class ChatUsuario extends Chat {

	/**
	 * Create the panel.
	 * @param email 
	 */
	public ChatUsuario(String email) {
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
		p.flujo(email);
	
	
	}
}
