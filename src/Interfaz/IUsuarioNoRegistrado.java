package Interfaz;
import java.rmi.Remote;
import java.util.Date;
import java.rmi.RemoteException;
import basededatos.Juego;
import basededatos.Publico;
import basededatos.UsuarioInactivo;
import basededatos.UsuarioInhabilitado;
import basededatos.UsuariosNoRegistrados;


public interface IUsuarioNoRegistrado extends Remote {

	public int entrar(String nombreUsuario, String contrasena)  throws RemoteException;

	public String obtenerPregunta(String correo)  throws RemoteException;

	public String recuperar(String respuesta, String correo)  throws RemoteException;

	public boolean comprobarDatos(String correo, String contrasena)  throws RemoteException;

	public boolean registrarse(String nombreUsuario, String contrasena, String preguntaSecreta,String respuestaSecreta,String correoElectronico, String DNI, String numeroDeCuenta, Date fechaRegistro)  throws RemoteException;



	public UsuarioInactivo reactivar(String correo)  throws RemoteException;
	
	public Juego[] listarJuegos()  throws RemoteException;

	public Publico[] listarJuegosPublicos()  throws RemoteException;
	
	public void nuevaVisita(UsuariosNoRegistrados usuario)  throws RemoteException;


	public long devolverHorasJugadas(String ip) throws RemoteException;

	public void aumentarHorasJugadas(long horas, String ip) throws RemoteException;

}