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

import java.util.Date;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

/**
 * ORM-Component Class
 */
public class BDUsuariosExpulsados {
	public BDUsuariosExpulsados() {
	}
	
	public void insertarUsuario(basededatos.UsuarioActivado usuario) {
		PersistentTransaction t;
		try {
			//iniciamos esto para que haga las transiciones
			t = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().beginTransaction();
			//creamos un objeto juego
			basededatos.UsuarioExpulsado usuarioExpulsado = basededatos.UsuarioExpulsadoDAO.createUsuarioExpulsado();
			//le metemos los valores
			usuarioExpulsado.setContrasena(usuario.getContrasena());
			usuarioExpulsado.setEmail(usuario.getEmail());
			usuarioExpulsado.setTiempoExpulsion(100);
			usuarioExpulsado.setNumExpulsiones(1);
			usuarioExpulsado.setFechaExpulsion(new Date());
			usuarioExpulsado.setFoto(usuario.getFoto());
			usuarioExpulsado.setGanancias(usuario.getGanancias());
			usuarioExpulsado.setIdDNI(usuario.getIdDNI());
			usuarioExpulsado.setNombreUsuario(usuario.getNombreUsuario());
			usuarioExpulsado.setNumCuenta(usuario.getNumCuenta());
			usuarioExpulsado.setPreguntaSecreta(usuario.getPreguntaSecreta());
			usuarioExpulsado.setRespuestaSecreta(usuario.getRespuestaSecreta());
			//y si todo va bien, lo guardamos
			basededatos.UsuarioExpulsadoDAO.save(usuarioExpulsado);
			t.commit();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				basededatos.CasinoVirtualMDS2PersistentManager.instance().disposePersistentManager();
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private basededatos.BDPrincipal esDe;
	
	public basededatos.BDPrincipal getEsDe()  {
		return this.esDe;
	}
	
	public void setEsDe(basededatos.BDPrincipal value)  {
		this.esDe = value;
	}
	
}
