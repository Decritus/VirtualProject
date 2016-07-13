/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Daniel Landa
 * License Type: Purchased
 */
package basededatos;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.TreeMap;

import org.omg.PortableServer.IdUniquenessPolicy;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import Interfaz.IAdministrador;
import Interfaz.IPersonalAtencionUsuario;
import Interfaz.IUsuarioNoRegistrado;
import Interfaz.IUsuarioRegistrado;

import com.mysql.jdbc.EscapeTokenizer;

/**
 * ORM-Component Class
 */
public class BDPrincipal implements IUsuarioNoRegistrado, IUsuarioRegistrado,
		IAdministrador, IPersonalAtencionUsuario {

	private basededatos.BDUsuariosInhabilitados deInhabilitados = new BDUsuariosInhabilitados();

	private basededatos.BDUsuariosNoRegistrados deUserNR = new BDUsuariosNoRegistrados();

	private basededatos.BDAdministradores deAdmin = new BDAdministradores();

	private basededatos.BDPersonalDeAtencionAlUsuario dePersonalAtencion = new BDPersonalDeAtencionAlUsuario();

	private basededatos.BDQuejasUsuarios deQuejas = new BDQuejasUsuarios();

	private basededatos.BDChats deChat = new BDChats();

	private basededatos.BDUsuariosActivados deUserActiv = new BDUsuariosActivados();

	private basededatos.BDUsuariosInactivos deUserInac = new BDUsuariosInactivos();

	private basededatos.BDUsuariosExpulsados deUserExpul = new BDUsuariosExpulsados();

	private basededatos.BDPublicos dePublico = new BDPublicos();

	private basededatos.BDJuegos deJuegos = new BDJuegos();

	private basededatos.BDDatosConfiguracion deConfig = new BDDatosConfiguracion();

	public BDPrincipal() {
		
	}
	
	public static void main(String args[]) {

		try {
			LocateRegistry.getRegistry();
			//LocateRegistry.createRegistry(2200);
			LocateRegistry.createRegistry(1099);
			BDPrincipal obj = new BDPrincipal();
			BDPrincipal obj2 = new BDPrincipal();
			BDPrincipal obj3 = new BDPrincipal();
			BDPrincipal obj4 = new BDPrincipal();
			/*IUsuarioNoRegistrado stubNR = (IUsuarioNoRegistrado) UnicastRemoteObject.exportObject(obj, 5000);
			IUsuarioRegistrado stubR = (IUsuarioRegistrado) UnicastRemoteObject.exportObject(obj2, 5001);
			IAdministrador stubA = (IAdministrador) UnicastRemoteObject.exportObject(obj3, 5002);
			IPersonalAtencionUsuario stubP = (IPersonalAtencionUsuario) UnicastRemoteObject.exportObject(obj4, 5003);*/
			
			IUsuarioNoRegistrado stubNR = (IUsuarioNoRegistrado) UnicastRemoteObject.exportObject(obj, 0);
			IUsuarioRegistrado stubR = (IUsuarioRegistrado) UnicastRemoteObject.exportObject(obj2, 0);
			IAdministrador stubA = (IAdministrador) UnicastRemoteObject.exportObject(obj3, 0);
			IPersonalAtencionUsuario stubP = (IPersonalAtencionUsuario) UnicastRemoteObject.exportObject(obj4, 0);
			
			// Bind the remote object's stub in the registry
			Registry registry = LocateRegistry.getRegistry();
			registry.rebind("NoRegistrado", stubNR);
			registry.rebind("Registrado", stubR);
			registry.rebind("Administrador", stubA);
			registry.rebind("Personal", stubP);

			System.err.println("Base de datos lista");
		} catch (Exception e) {
			System.err.println("Excepcion de la base de datos: " + e.toString());
			e.printStackTrace();
		}
    }

	public void actualizarDatosUsuario(basededatos.UsuarioActivado usuario) {
		deUserActiv.actualizarDatosUsuario(usuario);
	}

	public void actualizarJuego(Juego juego, boolean vistaPublica) {
		boolean t = esPublico(juego.getIdJuego());
		if (vistaPublica) {
			// Savins
			if (t) {
				dePublico.actualizarjuego((Publico) juego);
			} else {
				Publico p = new Publico();
				p.setDesactivado(juego.getDesactivado());
				p.setFecha(new Date());
				p.setFechaAlta(new Date());
				p.setImagen(juego.getImagen());
				p.setImporte(0);
				p.setNombre(juego.getNombre());
				p.setUbicacion(juego.getUbicacion());
				deJuegos.eliminarJuego(juego.getIdJuego());
				dePublico.actualizarjuego(p);

			}
		} else {
			if (t) {
				dePublico.eliminarJuego(juego.getIdJuego());
				Juego j = new Juego();
				j.setDesactivado(juego.getDesactivado());
				j.setFechaAlta(new Date());
				j.setImagen(juego.getImagen());
				j.setImporte(juego.getIdJuego());
				j.setNombre(juego.getNombre());
				j.setUbicacion(juego.getUbicacion());
				deJuegos.actualizarJuego(j);
			} else {

				deJuegos.actualizarJuego(juego);
			}
		}
	}

	public void actualizarUsuario(String contrasena, String preguntaSecreta,
			String respuestaSecreta, String email, String idDNI,
			String numCuenta, String foto) {
		// TODO: Implement Method
		throw new UnsupportedOperationException();
	}

	public basededatos.UsuarioActivado administrarUsuario(String idDNI) {
		return deUserActiv.obtenerUnUsuario(idDNI);
	}


	public void anadirAFavorito(int idJuego, String idDNI) {
		deJuegos.anadirAFavorito(idJuego, idDNI);
	}

	public void anadirJuego(String nombre, String ubicacion, String imagen,
			int importe) {

		deJuegos.anadirJuego(nombre, ubicacion, imagen, importe);

	}

	public void bajaUsuario(basededatos.UsuarioActivado usuario) {
		deUserInac.bajaUsuario(usuario);

	}

	public basededatos.UsuarioActivado bajaUsuario(String idDNI) {
		return deUserActiv.bajaUsuario(idDNI);
	}

	public basededatos.DatosConfiguracion cambiarNumeroPartidasSimultaneas(
			int partidasSimultaneas) {
		try {
			deConfig.cambiarNumeroPartidasSimultaneas(partidasSimultaneas);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public basededatos.DatosConfiguracion cargarNumeroPermitidas() {

		return deConfig.cargarNumeroPermitidas();
	}

	public boolean comprobarDatos(String correo, String contrasena) {
		return deUserInac.comprobarDatos(correo, contrasena);
	}

	public void crearTicket(QuejaUsuario queja, UsuarioActivado usuario) {
		deQuejas.crearTicket(queja, usuario);
	}

	public void eliminarJuego(int idJuego) {
		boolean publico = dePublico.esPublico(idJuego);
		if (publico) {
			dePublico.eliminarJuego(idJuego);
		} else {
			deJuegos.eliminarJuego(idJuego);
		}

	}

	public int entrar(String correo, String contrasena) {
		int valor = -1;

		if (deUserActiv.entrar(correo, contrasena) == 2) {
			valor = 2;
		} else if (deAdmin.entrar(correo, contrasena) == 0) {
			valor = 0;
		} else if (dePersonalAtencion.entrar(correo, contrasena) == 1) {
			valor = 1;
		}

		return valor;

	}


	public void expulsarUsuario(UsuarioActivado usuario) {
		deUserActiv.eliminarUsuario(usuario.getIdDNI());
		deUserExpul.insertarUsuario(usuario);
	}

	public basededatos.BDAdministradores getDeAdmin() {
		return this.deAdmin;
	}

	public basededatos.BDChats getDeChat() {
		return this.deChat;
	}

	public basededatos.BDUsuariosInhabilitados getDeInhabilitados() {
		return this.deInhabilitados;
	}

	public basededatos.BDJuegos getDeJuegos() {
		return this.deJuegos;
	}

	public basededatos.BDPersonalDeAtencionAlUsuario getDePersonalAtencion() {
		return this.dePersonalAtencion;
	}

	public basededatos.BDPublicos getDePublico() {
		return this.dePublico;
	}

	public basededatos.BDQuejasUsuarios getDeQuejas() {
		return this.deQuejas;
	}

	public basededatos.BDUsuariosActivados getDeUserActiv() {
		return this.deUserActiv;
	}

	public basededatos.BDUsuariosExpulsados getDeUserExpul() {
		return this.deUserExpul;
	}

	public basededatos.BDUsuariosInactivos getDeUserInac() {
		return this.deUserInac;
	}

	public basededatos.BDUsuariosNoRegistrados getDeUserNR() {
		return this.deUserNR;
	}

	public void inhabilitar(UsuarioActivado usuario) {
		deUserActiv.eliminarUsuario(usuario.getIdDNI());
		deInhabilitados.inhabilitar(usuario);
	}

	public basededatos.Juego[] listarJuegos() {
		return deJuegos.listarJuegos();
	}

	public basededatos.Publico[] listarJuegosPublicos() {
		return dePublico.listarJuegosPublicos();
	}

	public TreeMap<String, Integer> listarMasJugados(String idDNI) {
		return deJuegos.listarMasJugados(idDNI);
	}

	public basededatos.Juego[] listarMisFavoritos(String idDNI) {
		return deJuegos.listarMisFavoritos(idDNI);
	}

	public basededatos.QuejaUsuario[] listarQuejas() {
		return deQuejas.listarQuejas();
	}

	public Juego obtenerDatos(int idJuego) {
		return deJuegos.obtenerDatosJuegos(idJuego);
	}

	public basededatos.UsuarioActivado obtenerDatosUsuario(String idDNI) {
		return deUserActiv.obtenerDatosUsuario(idDNI);
	}

	public String obtenerPregunta(String correo) {
		return deUserActiv.obtenerPregunta(correo);
	}

	public basededatos.QuejaUsuario obtenerTicket(int idQueja) {
		return deQuejas.obtenerTicket(idQueja);
	}

	public basededatos.UsuarioActivado[] obtenerUsuarios() {
		return deUserActiv.obtenerUsuarios();
	}

	public basededatos.UsuariosNoRegistrados[] obtenerVisitas() {
		return deUserNR.obtenerVisitas();
	}

	public boolean quitarFavorito(String idDNI, int idJuego) {
		return deJuegos.quitarFavorito(idDNI, idJuego);
	}

	public String recuperar(String respuesta, String correo) {
		return deUserActiv.recuperar(respuesta, correo);
	}

	public boolean registrarse(String nombreUsuario, String contrasena,
			String preguntaSecreta, String respuestaSecreta,
			String correoElectronico, String DNI, String numeroDeCuenta,
			java.util.Date fechaRegistro) {
		return deUserActiv.registrarse(nombreUsuario, contrasena,
				preguntaSecreta, respuestaSecreta, correoElectronico, DNI,
				numeroDeCuenta, fechaRegistro);
	}

	public void setDeAdmin(basededatos.BDAdministradores value) {
		this.deAdmin = value;
	}

	public void setDeChat(basededatos.BDChats value) {
		this.deChat = value;
	}

	public void setDeInhabilitados(basededatos.BDUsuariosInhabilitados value) {
		this.deInhabilitados = value;
	}

	public void setDeJuegos(basededatos.BDJuegos value) {
		this.deJuegos = value;
	}

	public void setDePersonalAtencion(
			basededatos.BDPersonalDeAtencionAlUsuario value) {
		this.dePersonalAtencion = value;
	}

	public void setDePublico(basededatos.BDPublicos value) {
		this.dePublico = value;
	}

	public void setDeQuejas(basededatos.BDQuejasUsuarios value) {
		this.deQuejas = value;
	}

	public void setDeUserActiv(basededatos.BDUsuariosActivados value) {
		this.deUserActiv = value;
	}

	public void setDeUserExpul(basededatos.BDUsuariosExpulsados value) {
		this.deUserExpul = value;
	}

	public void setDeUserInac(basededatos.BDUsuariosInactivos value) {
		this.deUserInac = value;
	}

	public void setDeUserNR(basededatos.BDUsuariosNoRegistrados value) {
		this.deUserNR = value;
	}

	public String obtenerDNIUsuarioRegistrado(String email, String contrasena) {
		return deUserActiv.obtenerDNIUsuarioRegistrado(email, contrasena);

	}

	public boolean esPublico(int idJuego) {
		return dePublico.esPublico(idJuego);
	}

	@Override
	public UsuarioInactivo reactivar(String correo) {
		UsuarioInactivo user = deUserInac.reactivar(correo);
		UsuarioActivado reg = new UsuarioActivado();
		deUserActiv.registrarse(user.getNombreUsuario(), user.getContrasena(),
				user.getPreguntaSecreta(), user.getRespuestaSecreta(),
				user.getEmail(), user.getIdDNI(), user.getNumCuenta(),
				new Date());
		return user;
	}

	@Override
	public void nuevaVisita(UsuariosNoRegistrados usuario) {
		deUserNR.nuevaVisita(usuario);

	}

	@Override
	public long devolverHorasJugadas(String ip) {
		return deUserNR.devolverHorasJugadas(ip);
	}

	@Override
	public void aumentarHorasJugadas(long horas, String ip) {
		deUserNR.aumentarHorasJugadas(horas,ip); 
	}

	@Override
	public void anadirMasJugado(Juego juego, UsuarioActivado usuario)
			throws RemoteException {
		deUserActiv.anadirMasJugado(juego, usuario);
		
	}

	
	

}
