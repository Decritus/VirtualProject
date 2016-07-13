package Interfaz;
import java.rmi.Remote;
import java.rmi.RemoteException;

import basededatos.QuejaUsuario;
import basededatos.UsuariosNoRegistrados;
import basededatos.UsuarioActivado;

public interface IPersonalAtencionUsuario extends Remote {

	public QuejaUsuario obtenerTicket(int idQueja)  throws RemoteException;

	public UsuariosNoRegistrados[] obtenerVisitas() throws RemoteException;

	public QuejaUsuario[] listarQuejas() throws RemoteException;

	public UsuarioActivado[] obtenerUsuarios() throws RemoteException;

	public void expulsarUsuario(UsuarioActivado usuario) throws RemoteException;

	public UsuarioActivado administrarUsuario(String idDNI) throws RemoteException;

	public void inhabilitar(UsuarioActivado usuario) throws RemoteException;

	public void actualizarUsuario(String contrasena, String preguntaSecreta, String respuestaSecreta, String email, String idDNI, String numCuenta, String foto) throws RemoteException;
}