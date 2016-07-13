/*
 * Esta clase concuerda con el diagrama de clases en componentes y nombre
 * */
package UsuarioNoRegistrado;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;

public class ZonaUsuariosRegistrados extends JPanel {
	private JButton recuperarClaveB;
	private JButton reactivarCuentaB;
	private UsuarioNoRegistrado padre;

	ZonaUsuariosRegistrados(final UsuarioNoRegistrado padre) {
		setLayout(null);
		this.padre = padre;

		recuperarClaveB = new JButton("Recuperar Clave");
		recuperarClaveB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recuperarClave();
			}
		});
		recuperarClaveB.setBounds(32, 69, 147, 29);
		add(recuperarClaveB);

		reactivarCuentaB = new JButton("Reactivar cuenta");
		reactivarCuentaB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				reactivarCuenta();
			}
		});
		reactivarCuentaB.setBounds(32, 29, 147, 29);
		add(reactivarCuentaB);

	}

	public void recuperarClave() {
		JFrame recuperar = new RecuperarClave(padre);
	}

	public void reactivarCuenta() {
		JFrame reactivar = new ReactivarCuenta();
	}

}
