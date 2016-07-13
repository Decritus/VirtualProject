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
public class BDQuejasUsuarios {
	

	public BDQuejasUsuarios() {
		
	}
	
	public basededatos.QuejaUsuario obtenerTicket(int idQueja) {
		basededatos.QuejaUsuario [] baseDeDatosQuejaUsuario;
		try {
			baseDeDatosQuejaUsuario = basededatos.QuejaUsuarioDAO.listQuejaUsuarioByQuery(null, null);
			for (basededatos.QuejaUsuario quejaUser : baseDeDatosQuejaUsuario) {
				if(quejaUser.getIdQueja()==idQueja){
					return quejaUser;
				}
			}
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
		
		return null;
	}
	
	public basededatos.QuejaUsuario[] listarQuejas() {
		basededatos.QuejaUsuario [] baseDeDatosQuejaUsuario;
		try {
			baseDeDatosQuejaUsuario = basededatos.QuejaUsuarioDAO.listQuejaUsuarioByQuery(null, null);
			return baseDeDatosQuejaUsuario;
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
		
		return null;
	}
	
	public void crearTicket(QuejaUsuario queja, UsuarioActivado usuario) {
		PersistentTransaction t;
		try {
			// iniciamos esto para que haga las transiciones
			t = basededatos.CasinoVirtualMDS2PersistentManager.instance()
					.getSession().beginTransaction();
			// y si todo va bien, lo guardamos
			basededatos.UsuarioActivadoDAO.save(usuario);
			queja.setSonReportadas(usuario);
			basededatos.QuejaUsuarioDAO.save(queja);
			
		
			t.commit();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				basededatos.CasinoVirtualMDS2PersistentManager.instance()
						.disposePersistentManager();
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
