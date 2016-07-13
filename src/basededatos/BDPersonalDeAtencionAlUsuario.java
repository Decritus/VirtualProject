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

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

/**
 * ORM-Component Class
 */
public class BDPersonalDeAtencionAlUsuario {


	public BDPersonalDeAtencionAlUsuario() {
		
	}

	public int entrar(String correo, String contrasena) {
		basededatos.PersonaDeAtencionAlUsuario[] baseDeDatosPersonaDeAtencionAlUsuarios;

		try {
		baseDeDatosPersonaDeAtencionAlUsuarios = basededatos.PersonaDeAtencionAlUsuarioDAO.listPersonaDeAtencionAlUsuarioByQuery(null, null);
			
			for (PersonaDeAtencionAlUsuario personaAtencion : baseDeDatosPersonaDeAtencionAlUsuarios) {
				if (personaAtencion.getContrasena().equals(contrasena)
						&& personaAtencion.getUsuario().equals(correo)) {
					return 1;
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

		return -1;

	}

	private basededatos.BDPrincipal esDe;

	public basededatos.BDPrincipal getEsDe() {
		return this.esDe;
	}

	public void setEsDe(basededatos.BDPrincipal value) {
		this.esDe = value;
	}
}
