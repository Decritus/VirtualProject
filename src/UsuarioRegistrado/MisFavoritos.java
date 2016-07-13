package UsuarioRegistrado;

import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JList;

import AbrirJuego.AbrirFichaJuego;
import Interfaz.IUsuarioNoRegistrado;
import Interfaz.IUsuarioRegistrado;
import basededatos.BDPrincipal;
import basededatos.Juego;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.StringTokenizer;

public class MisFavoritos extends JPanel {

	UsuarioRegistrado padre;
	JList listadoFavoritosLt;

	/**
	 * Create the panel.
	 * @throws RemoteException 
	 * @throws NotBoundException 
	 */
	public MisFavoritos(final UsuarioRegistrado padre) throws RemoteException, NotBoundException {
		this.padre = padre;

		setLayout(new BorderLayout(0, 0));

		listarMisFavoritos();
		listadoFavoritosLt.setBackground(Color.PINK);
		listadoFavoritosLt.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (e.getClickCount() == 2 && !e.isConsumed()) {
					quitarFavorito();
					e.consume();
					padre.dispose();
				}
			}
		});
		add(listadoFavoritosLt, BorderLayout.CENTER);

	}

	public void listarMisFavoritos() throws RemoteException, NotBoundException {
		Registry registry = LocateRegistry.getRegistry();
		IUsuarioRegistrado IA = (IUsuarioRegistrado) registry.lookup("Registrado");
		Juego[] juegos = IA.listarMisFavoritos(padre.dNI);
		String[] nombres;
		if (juegos.length>0) {
			nombres = new String[juegos.length];
			for (int i = 0; i < juegos.length; i++) {
				nombres[i] = juegos[i].getIdJuego() + " | "
						+ juegos[i].getNombre() + " | "
						+ juegos[i].getFechaAlta();
			}
		} else {
			nombres = new String[] { "Aun no tienes juegos favoritos" };
		}
		listadoFavoritosLt = new JList(nombres);

	}
	private void quitarFavorito() {
		String selectedFileFavoritos = listadoFavoritosLt.getSelectedValue().toString();
		StringTokenizer token = new StringTokenizer(selectedFileFavoritos);
		String idJuego = token.nextToken();	
		Registry registry = null;
	
		try {
			registry = LocateRegistry.getRegistry();
			IUsuarioRegistrado IA = (IUsuarioRegistrado) registry.lookup("Registrado");
			IA.quitarFavorito(padre.dNI, Integer.parseInt(idJuego));
			padre.setVisible(false);
			UsuarioRegistrado user = new UsuarioRegistrado(padre.padre,padre.email,padre.contrasena,false);
		} catch (AccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NotBoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	
			}
}
