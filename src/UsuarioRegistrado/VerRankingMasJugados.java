package UsuarioRegistrado;

import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JList;

import edu.emory.mathcs.backport.java.util.Arrays;
import edu.emory.mathcs.backport.java.util.Collections;
import Interfaz.IAdministrador;
import Interfaz.IUsuarioRegistrado;
import basededatos.BDPrincipal;
import basededatos.Juego;

import java.awt.Color;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public class VerRankingMasJugados extends JPanel {
	UsuarioRegistrado padre;
	JList listadoMasJugadosLt;

	/**
	 * Create the panel.
	 * 
	 * @throws RemoteException
	 * @throws NotBoundException
	 */
	public VerRankingMasJugados(UsuarioRegistrado padre)
			throws RemoteException, NotBoundException {
		this.padre = padre;
		setLayout(new BorderLayout(0, 0));
		listarMasJugados();

		listadoMasJugadosLt.setBackground(Color.YELLOW);
		add(listadoMasJugadosLt, BorderLayout.CENTER);

	}

	public void listarMasJugados() throws RemoteException, NotBoundException {
		Registry registry = LocateRegistry.getRegistry();
		IUsuarioRegistrado IA = (IUsuarioRegistrado) registry
				.lookup("Registrado");
		TreeMap<String, Integer> juegos = IA.listarMasJugados(padre.dNI);
		String[] nombres = new String[juegos.size()];
		int i = 0;
		for (Iterator it = juegos.keySet().iterator(); it.hasNext();) {
			String juego = (String) it.next();
			int valor = juegos.get(juego);
			nombres[i] = valor + " veces has jugado a " + juego;

			i++;
		}
		
		Arrays.sort(nombres);
		
		listadoMasJugadosLt = new JList(nombres);

	}

}
