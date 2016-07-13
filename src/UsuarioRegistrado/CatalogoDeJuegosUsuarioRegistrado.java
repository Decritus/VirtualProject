package UsuarioRegistrado;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Interfaz.IAdministrador;
import Interfaz.IUsuarioRegistrado;
import UsuarioNoRegistrado.CatalogoDeJuegos;
import UsuarioNoRegistrado.UsuarioNoRegistrado;

import javax.swing.JButton;

import basededatos.BDPrincipal;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CatalogoDeJuegosUsuarioRegistrado extends CatalogoDeJuegos {

	private JPanel contentPane;
	JButton cerrarCatalogoB;
	JButton anadirFavoritoB;
	UsuarioRegistrado padre;

	/**
	 * Create the frame.
	 * 
	 * @param este
	 * @throws RemoteException 
	 */
	public CatalogoDeJuegosUsuarioRegistrado(final UsuarioRegistrado padre) throws RemoteException {
		this.padre = padre;
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 409, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		super.contentPane.setBounds(10, 11, 372, 324);
		contentPane.add(super.contentPane);
		contentPane.setLayout(null);

		cerrarCatalogoB = new JButton("Cerrar Catalogo");
		cerrarCatalogoB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cerrarCatalogo();
			}
		});
		cerrarCatalogoB.setBounds(232, 346, 151, 23);
		contentPane.add(cerrarCatalogoB);

		anadirFavoritoB = new JButton("A\u00F1adir a Favoritos");
		anadirFavoritoB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					anadirAFavorito();
					padre.setVisible(false);
					UsuarioRegistrado user = new UsuarioRegistrado(padre.padre,padre.email,padre.contrasena,false);
					padre.dispose();
					setPadre(user);
				} catch (NumberFormatException e1) {
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

		});
		anadirFavoritoB.setBounds(10, 346, 151, 23);
		contentPane.add(anadirFavoritoB);
		super.listarJuegos(padre);
	}

	public JPanel getContentPane() {
		return this.contentPane;
	}

	private void anadirAFavorito() throws NumberFormatException, RemoteException, NotBoundException {
		int linea = super.juegosT.getSelectedRow();
		String idJuego = juegosT.getValueAt(linea, 0).toString();
		Registry registry = LocateRegistry.getRegistry();
		IUsuarioRegistrado IA = (IUsuarioRegistrado) registry.lookup("Registrado");
		
		IA.anadirAFavorito(Integer.parseInt(idJuego), padre.dNI);

	}
	public void setPadre(UsuarioRegistrado pad){
		padre=pad;
	}
	public void cerrarCatalogo(){
		dispose();
	}
}
