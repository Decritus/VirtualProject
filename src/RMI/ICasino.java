package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

import basededatos.UsuarioActivado;

public interface ICasino extends Remote{
	public void acabado(int ganancias, UsuarioActivado usuario) throws RemoteException;
	 
}
