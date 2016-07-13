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
public class BDUsuariosInactivos {
	public BDUsuariosInactivos() {
	}
	
	public boolean comprobarDatos(String correo, String contrasena) {
		PersistentTransaction t;
		try {
			//iniciamos esto para que haga las transiciones
			t = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().beginTransaction();
			
			
			UsuarioInactivo[] baseDeDatosInac;
			baseDeDatosInac = basededatos.UsuarioInactivoDAO.listUsuarioInactivoByQuery(null, null);		
			for (UsuarioInactivo user : baseDeDatosInac) {
				if(user.getContrasena().equals(contrasena) && user.getEmail().equals(correo)){
					return true;
				}
			}
			return false;
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
		return false;

	}
	
	public void bajaUsuario(basededatos.UsuarioActivado usuario) {
		PersistentTransaction t;
		try {
			//iniciamos esto para que haga las transiciones
			t = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().beginTransaction();
			//creamos un objeto juego
			basededatos.UsuarioInactivo usuarioInactivo = basededatos.UsuarioInactivoDAO.createUsuarioInactivo();
			//le metemos los valores
			usuarioInactivo.setContrasena(usuario.getContrasena());
			usuarioInactivo.setEmail(usuario.getEmail());
			usuarioInactivo.setFechaFinBaja(new Date(2100,12,30));
			usuarioInactivo.setFechaInicioBaja(new Date());
			usuarioInactivo.setFoto(usuario.getFoto());
			usuarioInactivo.setGanancias(usuario.getGanancias());
			usuarioInactivo.setIdDNI(usuario.getIdDNI());
			usuarioInactivo.setNombreUsuario(usuario.getNombreUsuario());
			usuarioInactivo.setNumCuenta(usuario.getNumCuenta());
			usuarioInactivo.setPreguntaSecreta(usuario.getPreguntaSecreta());
			usuarioInactivo.setRespuestaSecreta(usuario.getRespuestaSecreta());
			//y si todo va bien, lo guardamos
			basededatos.UsuarioInactivoDAO.save(usuarioInactivo);
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

	public UsuarioInactivo reactivar(String correo) {
		PersistentTransaction t;
		UsuarioInactivo devolver=new UsuarioInactivo();

		try{
		
		t = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().beginTransaction();

		UsuarioInactivo[] baseDeDatosInac;
		baseDeDatosInac = basededatos.UsuarioInactivoDAO.listUsuarioInactivoByQuery(null, null);		
		for (UsuarioInactivo user : baseDeDatosInac) {
			if( user.getEmail().equals(correo)){
				devolver= user;
			}
		}
		basededatos.UsuarioInactivoDAO.delete(devolver);
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
		return devolver;
	}
	
}
