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
public class BDPublicos {
	public BDPublicos() {
	}

	public boolean esPublico(int idJuego) {

		try {
			// iniciamos esto para que haga las transiciones
			Publico []juego = basededatos.PublicoDAO.listPublicoByQuery(
					"idJuego = '" + idJuego+"'", null);
			if(juego.length==0){
				return false;
			}else{
				return true;
			}
			

		} catch (PersistentException e) {
			e.printStackTrace();
		} finally {
			try {
				basededatos.CasinoVirtualMDS2PersistentManager.instance()
						.disposePersistentManager();
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public basededatos.Publico obtenerDatosPublicos(int idJuego) {
		// TODO: Implement Method
		throw new UnsupportedOperationException();
	}

	public boolean actualizarjuego(Publico juego) {
		PersistentTransaction t;
		try {
			// iniciamos esto para que haga las transiciones
			t = basededatos.CasinoVirtualMDS2PersistentManager.instance()
					.getSession().beginTransaction();

			basededatos.PublicoDAO.save(juego);
			t.commit();
			return true;
		} catch (PersistentException e) {
			e.printStackTrace();
		} finally {
			try {
				basededatos.CasinoVirtualMDS2PersistentManager.instance()
						.disposePersistentManager();
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		}
		return true;
	}

	public void eliminarJuego(int idJuego) {
		PersistentTransaction t;
		try {
			// iniciamos esto para que haga las transiciones
			t = basededatos.CasinoVirtualMDS2PersistentManager.instance()
					.getSession().beginTransaction();
			Publico juego = basededatos.PublicoDAO.listPublicoByQuery(
					"idJuego = '" + idJuego+"'", null)[0];
			basededatos.PublicoDAO.delete(juego);
			t.commit();
		} catch (PersistentException e) {
			e.printStackTrace();
		} finally {
			try {
				basededatos.CasinoVirtualMDS2PersistentManager.instance()
						.disposePersistentManager();
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		}
	}

	public basededatos.Publico[] listarJuegosPublicos() {
		basededatos.Publico[] baseDeDatosJuegos = null;
		try {
			baseDeDatosJuegos = basededatos.PublicoDAO.listPublicoByQuery(null,
					null);
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
		return baseDeDatosJuegos;
	}

	private basededatos.BDPrincipal esDe;

	public basededatos.BDPrincipal getEsDe() {
		return this.esDe;
	}

	public void setEsDe(basededatos.BDPrincipal value) {
		this.esDe = value;
	}
}
