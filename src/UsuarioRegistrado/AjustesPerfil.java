  package UsuarioRegistrado;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import basededatos.UsuarioActivado;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class AjustesPerfil extends DatosUsuario {

	private JButton darBajaB;
	UsuarioRegistrado padre;

	/**
	 * Create the frame.
	 * @throws RemoteException 
	 * @throws NotBoundException 
	 */
	public AjustesPerfil(final UsuarioRegistrado padre) throws RemoteException, NotBoundException {
		this.padre = padre;
		setVisible(true);

		super.setVisible(true);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 410, 400);

		super.contentPane.setBounds(10, 11, 372, 354);

		darBajaB = new JButton("Dar de Baja");
		darBajaB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			darBaja();
			}
		});
		darBajaB.setBounds(160, 331, 106, 23);
		super.getContentPane().add(darBajaB);
		super.obtenerDatosUsuario(padre.dNI);
	}

	public void darBaja() {
		JFrame baja = new MensajeDarDeBaja(this, padre.dNI);
	}
}
