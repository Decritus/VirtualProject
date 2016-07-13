package Interfaz;
import java.rmi.Remote;
import java.rmi.RemoteException;

import basededatos.Juego;
import basededatos.Publico;
import basededatos.DatosConfiguracion;

public interface IAdministrador extends Remote {

	public Juego[] listarJuegos() throws RemoteException;

	public Publico[] listarJuegosPublicos() throws RemoteException;

	public void anadirJuego(String nombre, String ubicacion, String imagen, int importe) throws RemoteException;

	public Juego obtenerDatos(int idJuego) throws RemoteException;

	public DatosConfiguracion cargarNumeroPermitidas() throws RemoteException;

	public DatosConfiguracion cambiarNumeroPartidasSimultaneas(int partidasSimultaneas) throws RemoteException;

	public void actualizarJuego(Juego juego, boolean vistaPublica) throws RemoteException;

	public void eliminarJuego(int idJuego) throws RemoteException;
	public boolean esPublico (int idJuego) throws RemoteException;
}