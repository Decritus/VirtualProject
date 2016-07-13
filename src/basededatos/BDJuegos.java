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
import java.util.TreeMap;
import java.util.TreeSet;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;
//no se k hace eso ahi.... y da error 
//import com.sun.org.apache.xerces.internal.impl.dv.xs.BaseSchemaDVFactory;

/**
 * ORM-Component Class
 */
public class BDJuegos {
	public BDJuegos() {
	}

	public basededatos.Juego[] listarJuegos() {
		basededatos.Juego[] baseDeDatosJuegos = null;
		try {
			baseDeDatosJuegos = basededatos.JuegoDAO.listJuegoByQuery(null,
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

	public basededatos.Publico[] listarJuegosPublicos() {
		// TODO: Implement Method
		throw new UnsupportedOperationException();
	}

	public void anadirJuego(String nombre, String ubicacion, String imagen,
			int importe) {
		PersistentTransaction t;
		try {
			// iniciamos esto para que haga las transiciones
			t = basededatos.CasinoVirtualMDS2PersistentManager.instance()
					.getSession().beginTransaction();
			// creamos un objeto juego
			basededatos.Juego baseDeDatosJuego = basededatos.JuegoDAO
					.createJuego();
			// le metemos los valores
			baseDeDatosJuego.setNombre(nombre);
			baseDeDatosJuego.setUbicacion(ubicacion);
			baseDeDatosJuego.setImagen(imagen);
			baseDeDatosJuego.setImporte(importe);
			baseDeDatosJuego.setFechaAlta(new Date());
			// y si todo va bien, lo guardamos
			basededatos.JuegoDAO.save(baseDeDatosJuego);
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

	public basededatos.Juego obtenerDatosJuegos(int idJuego) {
		basededatos.Juego juego = null;
		try {
			juego = basededatos.JuegoDAO.listJuegoByQuery("idJuego = "
					+ idJuego, null)[0];
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
		return juego;
	}

	public boolean actualizarJuego(Juego juego) {
		PersistentTransaction t;
		try {
			// iniciamos esto para que haga las transiciones
			t = basededatos.CasinoVirtualMDS2PersistentManager.instance()
					.getSession().beginTransaction();

			basededatos.JuegoDAO.save(juego);
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
			Juego juego = basededatos.JuegoDAO.listJuegoByQuery("idJuego = "
					+ idJuego, null)[0];
			basededatos.JuegoDAO.delete(juego);
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

	public basededatos.Juego[] listarMisFavoritos(String idDNI) {
		basededatos.Juego[] baseDeDatosJuegos = null;

		try {
			UsuarioRegistrado[] usuarios = basededatos.UsuarioRegistradoDAO
					.listUsuarioRegistradoByQuery("idDNI = '" + idDNI+"'", null);
			if (usuarios.length > 0) {
				baseDeDatosJuegos = usuarios[0].favorito.toArray();
			}

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

	public boolean quitarFavorito(String idDNI, int idJuego) {
		PersistentTransaction t;
		
		Juego juego= obtenerDatosJuegos(idJuego);
		
		try {
			// iniciamos esto para que haga las transiciones
			t = basededatos.CasinoVirtualMDS2PersistentManager.instance()
					.getSession().beginTransaction();
			
			UsuarioActivado[] usuarios = basededatos.UsuarioActivadoDAO
					.listUsuarioActivadoByQuery("idDNI = '" + idDNI+"'", null);
			t = basededatos.CasinoVirtualMDS2PersistentManager.instance()
					.getSession().beginTransaction();
			if (usuarios.length > 0 && idJuego > 0) {
	 	
				basededatos.UsuarioRegistradoDAO.refresh(usuarios[0]);
				basededatos.JuegoDAO.refresh(juego);
						usuarios[0].favorito.remove(juego);
						juego.favoritoDe.remove(usuarios[0]);
						t.commit();
						return true;
					}
				
		} catch (PersistentException e) {
			
			e.printStackTrace();
			return false;
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

	public TreeMap<String, Integer> listarMasJugados(String idDNI) {
		Fecha[] baseDeDatosJuegos = null;
		Juego[] juegos = null;
		TreeMap<String, Integer> juegosRepetidos = null;
		try {
			baseDeDatosJuegos = basededatos.FechaDAO.listFechaByQuery("UsuarioRegistradoIdDNI = '" + idDNI+"'", null);
			juegosRepetidos= new TreeMap<String, Integer>();
			for (int i = 0; i < baseDeDatosJuegos.length; i++) {
				String clave = "("+baseDeDatosJuegos[i].getJuego().getIdJuego()+") "+
						baseDeDatosJuegos[i].getJuego().getNombre();
				if(juegosRepetidos.containsKey(clave)){
					juegosRepetidos.put(clave, juegosRepetidos.get(clave)+1);
				}else{
					juegosRepetidos.put(clave, 1);
				}
			}
			
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
		
		return juegosRepetidos;
	}

	public void anadirAFavorito(int idJuego, String idDNI) {
		PersistentTransaction t = null;
		
		Juego[] listadoFav = listarMisFavoritos(idDNI);
		Juego juego= obtenerDatosJuegos(idJuego);
		UsuarioActivado[] usuarios = null;
		try {
			t = basededatos.CasinoVirtualMDS2PersistentManager.instance()
					.getSession().beginTransaction();
			usuarios = basededatos.UsuarioActivadoDAO
					.listUsuarioActivadoByQuery("idDNI = '" + idDNI+"'", null);
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		boolean aux = false;
		try {
			
			for (Juego juego2 : listadoFav) {
				if(juego2.getIdJuego()==juego.getIdJuego()){
					aux = true;
				}
			}
			if(!aux&&usuarios.length>0){
				basededatos.UsuarioRegistradoDAO.save(usuarios[0]);
				basededatos.JuegoDAO.save(juego);
				usuarios[0].favorito.add(juego);
				juego.favoritoDe.add(usuarios[0]);
				aux= false;
				t.commit();
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
	}


	private basededatos.BDPrincipal esDe;

	public basededatos.BDPrincipal getEsDe() {
		return this.esDe;
	}

	public void setEsDe(basededatos.BDPrincipal value) {
		this.esDe = value;
	}

}
