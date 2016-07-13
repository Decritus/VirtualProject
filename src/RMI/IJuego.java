package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

import basededatos.UsuarioActivado;

public interface IJuego extends Remote{
	public void ponerSaldo(int saldo, UsuarioActivado usuario) throws RemoteException;
	public int darSaldo() throws RemoteException;
}
