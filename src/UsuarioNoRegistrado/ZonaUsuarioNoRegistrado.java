/*
 * Esta clase concuerda con el diagrama de clases en componentes y nombre
 * */
package UsuarioNoRegistrado;

import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ZonaUsuarioNoRegistrado extends JPanel {

	private JButton registrarseB;
	private JButton probarJuegosB;
	UsuarioNoRegistrado padre;
	
	public ZonaUsuarioNoRegistrado(final UsuarioNoRegistrado padre) {
		this.padre = padre;
		registrarseB = new JButton("Registrarse");
		registrarseB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			
				registrarse();
				}
		});
		setLayout(null);
		
		registrarseB.setBounds(16, 18, 130, 73);
		add(registrarseB);
		
		probarJuegosB = new JButton("Probar Juegos");
		probarJuegosB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					probarJuegos();
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (NotBoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		probarJuegosB.setBounds(16, 103, 130, 73);
		add(probarJuegosB);
		
	}
	public void registrarse(){
		  JFrame registrarse= new Registrarse(padre);
	}
	public void probarJuegos() throws RemoteException, NotBoundException{
		JFrame catalogoNoRegistrado = new CatalogoDeJuegosNoRegistrado(padre);
	}


}
