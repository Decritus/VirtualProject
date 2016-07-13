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
public class BDUsuariosInhabilitados {
	

	public BDUsuariosInhabilitados() {
	
	}
	
	public void inhabilitar(UsuarioActivado usuario) {		
		PersistentTransaction t;
		try {
			//iniciamos esto para que haga las transiciones
			t = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().beginTransaction();
			//creamos un objeto juego
			basededatos.UsuarioInhabilitado usuarioInhabilitado = basededatos.UsuarioInhabilitadoDAO.createUsuarioInhabilitado();
			//le metemos los valores
			usuarioInhabilitado.setContrasena(usuario.getContrasena());
			usuarioInhabilitado.setEmail(usuario.getEmail());
			usuarioInhabilitado.setFechaInhabilitado(new Date());
			usuarioInhabilitado.setTiempoInhabilitacion(100);
			usuarioInhabilitado.setFoto(usuario.getFoto());
			usuarioInhabilitado.setGanancias(usuario.getGanancias());
			usuarioInhabilitado.setIdDNI(usuario.getIdDNI());
			usuarioInhabilitado.setNombreUsuario(usuario.getNombreUsuario());
			usuarioInhabilitado.setNumCuenta(usuario.getNumCuenta());
			usuarioInhabilitado.setPreguntaSecreta(usuario.getPreguntaSecreta());
			usuarioInhabilitado.setRespuestaSecreta(usuario.getRespuestaSecreta());
			//y si todo va bien, lo guardamos
			basededatos.UsuarioInhabilitadoDAO.save(usuarioInhabilitado);
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
