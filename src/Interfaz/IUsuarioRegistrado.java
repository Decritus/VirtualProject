package Interfaz;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.TreeMap;

import basededatos.Juego;
import basededatos.QuejaUsuario;
import basededatos.UsuarioActivado;
import basededatos.UsuarioRegistrado;

public interface IUsuarioRegistrado extends Remote{

	public void actualizarUsuario(String contrasena, String preguntaSecreta, String respuestaSecreta, String email, String idDNI, String numCuenta, String foto)  throws RemoteException;

	public Juego[] listarMisFavoritos(String idDNI) throws RemoteException;

	public boolean quitarFavorito(String idDNI, int idJuego) throws RemoteException;

	public TreeMap<String, Integer> listarMasJugados(String idDNI) throws RemoteException;
	
	public Juego[] listarJuegos() throws RemoteException;

	public UsuarioActivado obtenerDatosUsuario(String idDNI) throws RemoteException;

	public void actualizarDatosUsuario(UsuarioActivado usuario) throws RemoteException;

	public UsuarioActivado bajaUsuario(String idDNI) throws RemoteException;

	public void bajaUsuario(UsuarioActivado usuario) throws RemoteException;

	public void anadirAFavorito(int idJuego, String idDNI) throws RemoteException;

	public void crearTicket(QuejaUsuario queja, UsuarioActivado usuario) throws RemoteException;

	public String obtenerDNIUsuarioRegistrado(String email, String contrasena)  throws RemoteException;
	
	public void anadirMasJugado(Juego juego, UsuarioActivado usuario) throws RemoteException;

}