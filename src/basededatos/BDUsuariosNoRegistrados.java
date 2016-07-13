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
public class BDUsuariosNoRegistrados {
	

	public BDUsuariosNoRegistrados() {
		
	}

	public basededatos.UsuariosNoRegistrados[] obtenerVisitas() {
		basededatos.UsuariosNoRegistrados[] baseDeDatosUsuariosNoRegistrados;
		try {
			baseDeDatosUsuariosNoRegistrados = basededatos.UsuariosNoRegistradosDAO
					.listUsuariosNoRegistradosByQuery(null, null);
			return baseDeDatosUsuariosNoRegistrados;
		} catch (PersistentException e) {
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

		return null;
	}

	private basededatos.BDPrincipal esDe;

	public basededatos.BDPrincipal getEsDe() {
		return this.esDe;
	}

	public void setEsDe(basededatos.BDPrincipal value) {
		this.esDe = value;
	}

	public void nuevaVisita(UsuariosNoRegistrados usuario) {
		PersistentTransaction t;
		basededatos.UsuariosNoRegistrados[] baseDeDatosUsuariosNoRegistrados;

		try {
			// iniciamos esto para que haga las transiciones
			t = basededatos.CasinoVirtualMDS2PersistentManager.instance()
					.getSession().beginTransaction();
			boolean encontrado = false;
			baseDeDatosUsuariosNoRegistrados = basededatos.UsuariosNoRegistradosDAO
					.listUsuariosNoRegistradosByQuery(null, null);
			for (UsuariosNoRegistrados usuariosNoRegistrados : baseDeDatosUsuariosNoRegistrados) {
				if (usuariosNoRegistrados.getIdIp().equals(usuario.getIdIp())) {
					encontrado = true;
				}
			}
			if (!encontrado) {
				basededatos.UsuariosNoRegistradosDAO.save(usuario);
				t.commit();
			}

			// y si todo va bien, lo guardamos
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

	public long devolverHorasJugadas(String ip) {
		basededatos.UsuariosNoRegistrados[] baseDeDatosUsuariosNoRegistrados;
		try {
			baseDeDatosUsuariosNoRegistrados = basededatos.UsuariosNoRegistradosDAO
					.listUsuariosNoRegistradosByQuery(null, null);
			for (UsuariosNoRegistrados usuariosNoRegistrados : baseDeDatosUsuariosNoRegistrados) {
				if (usuariosNoRegistrados.getIdIp().equals(ip)) {
					return usuariosNoRegistrados.getHorasJugadas();
				}
			}
		} catch (PersistentException e) {
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
		return 0;
	}

	public void aumentarHorasJugadas(long horas, String ip) {
		PersistentTransaction t = null;
		try {
			t = basededatos.CasinoVirtualMDS2PersistentManager.instance()
					.getSession().beginTransaction();
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
				basededatos.UsuariosNoRegistrados[] baseDeDatosUsuariosNoRegistrados;
		try {
			baseDeDatosUsuariosNoRegistrados = basededatos.UsuariosNoRegistradosDAO
					.listUsuariosNoRegistradosByQuery(null, null);
			for (UsuariosNoRegistrados usuariosNoRegistrados : baseDeDatosUsuariosNoRegistrados) {
				if (usuariosNoRegistrados.getIdIp().equals(ip)) {
					usuariosNoRegistrados.setHorasJugadas(usuariosNoRegistrados
							.getHorasJugadas() + horas);
					basededatos.UsuariosNoRegistradosDAO
							.save(usuariosNoRegistrados);
					t.commit();
				}
			}
		} catch (PersistentException e) {
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
}
