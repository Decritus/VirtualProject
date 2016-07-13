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
public class BDAdministradores {
	private PersistentTransaction t;

	public BDAdministradores() {
		try {
			t = basededatos.CasinoVirtualMDS2PersistentManager.instance()
					.getSession().beginTransaction();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	}
	
	public int entrar(String correo, String contrasena) {
		basededatos.Administrador[] baseDeDatosAdministradores;
		try {
			baseDeDatosAdministradores = basededatos.AdministradorDAO.listAdministradorByQuery(null, null);
			
			for (basededatos.Administrador admin : baseDeDatosAdministradores) {
				if(admin.getContrasena().equals(contrasena) && admin.getUsuario().equals(correo)){
					return 0;
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
	
	public basededatos.BDPrincipal getEsDe()  {
		return this.esDe;
	}
	
	public void setEsDe(basededatos.BDPrincipal value)  {
		this.esDe = value;
	}
	
}
