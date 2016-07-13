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
public class BDUsuariosActivados {

	public BDUsuariosActivados() {

	}

	public basededatos.UsuarioActivado[] obtenerUsuarios() {
		basededatos.UsuarioActivado[] baseDeDatosUsuariosActivados;
		try {
			baseDeDatosUsuariosActivados = basededatos.UsuarioActivadoDAO
					.listUsuarioActivadoByQuery(null, null);
			return baseDeDatosUsuariosActivados;
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

	public basededatos.UsuarioActivado obtenerUnUsuario(String idDNI) {
		PersistentTransaction t;
		try {
			// iniciamos esto para que haga las transiciones
			t = basededatos.CasinoVirtualMDS2PersistentManager.instance()
					.getSession().beginTransaction();
			UsuarioActivado usuario = basededatos.UsuarioActivadoDAO
					.listUsuarioActivadoByQuery("idDNI = '" + idDNI+"'", null)[0];
			return usuario;
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
		return null;
	}

	public void eliminarUsuario(String idDNI) {
		PersistentTransaction t;
		try {
			// iniciamos esto para que haga las transiciones
			t = basededatos.CasinoVirtualMDS2PersistentManager.instance()
					.getSession().beginTransaction();
			UsuarioActivado usuario = basededatos.UsuarioActivadoDAO
					.listUsuarioActivadoByQuery("idDNI = '" + idDNI+"'", null)[0];
			basededatos.UsuarioActivadoDAO.delete(usuario);
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

	public void actualizarDatosPerfil(String password, String preguntaSecreta,
			String respuestaSecreta, String email, String idDNI,
			String numCuenta, String foto) {
		// TODO: Implement Method
		throw new UnsupportedOperationException();
	}


	public int entrar(String correo, String contrasena) {
		basededatos.UsuarioActivado[] baseDeDatosUsuarioActivados;
		try {
			baseDeDatosUsuarioActivados = basededatos.UsuarioActivadoDAO
					.listUsuarioActivadoByQuery(null, null);

			for (basededatos.UsuarioActivado usuarioActivado : baseDeDatosUsuarioActivados) {
				if (usuarioActivado.getContrasena().equals(contrasena)
						&& usuarioActivado.getEmail().equals(correo)) {
					return 2;
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

		return -1;
	}

	public String obtenerPregunta(String correo) {
		basededatos.UsuarioActivado[] baseDeDatosUsuarioActivados;
		try {
			baseDeDatosUsuarioActivados = basededatos.UsuarioActivadoDAO
					.listUsuarioActivadoByQuery(null, null);
			for (basededatos.UsuarioActivado usuarioActivado : baseDeDatosUsuarioActivados) {
				if (usuarioActivado.getEmail().equals(correo)) {
					return usuarioActivado.getPreguntaSecreta();
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
		return null;
	}

	public String recuperar(String respuesta, String correo) {
		basededatos.UsuarioActivado[] baseDeDatosUsuarioActivados;
		try {
			baseDeDatosUsuarioActivados = basededatos.UsuarioActivadoDAO
					.listUsuarioActivadoByQuery(null, null);

			for (basededatos.UsuarioActivado usuarioActivado : baseDeDatosUsuarioActivados) {
				if (usuarioActivado.getRespuestaSecreta().equals(respuesta)
						&& usuarioActivado.getEmail().equals(correo)) {
					return usuarioActivado.getContrasena();
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
		return null;
	}

	public boolean registrarse(String nombreUsuario, String contrasena,
			String preguntaSecreta, String respuestaSecreta,
			String correoElectronico, String DNI, String numeroDeCuenta,
			java.util.Date fechaRegistro) {
		basededatos.UsuarioActivado user = new UsuarioActivado();
		basededatos.UsuarioActivado[] baseDeDatosUsuarioActivados;
		try {
			baseDeDatosUsuarioActivados = basededatos.UsuarioActivadoDAO
					.listUsuarioActivadoByQuery(null, null);
			for (basededatos.UsuarioActivado usuarioActivado : baseDeDatosUsuarioActivados) {
				if (usuarioActivado.getIdDNI().equals(DNI)) {
					return false;
				}
			}

			user.setNombreUsuario(nombreUsuario);
			user.setContrasena(contrasena);
			user.setPreguntaSecreta(preguntaSecreta);
			user.setRespuestaSecreta(respuestaSecreta);
			user.setEmail(correoElectronico);
			user.setIdDNI(DNI);
			user.setNumCuenta(numeroDeCuenta);
			user.setFechaAlta(fechaRegistro);
			user.setFoto("avatar1.png");
			user.setGanancias(500);
			PersistentTransaction t = basededatos.CasinoVirtualMDS2PersistentManager
					.instance().getSession().beginTransaction();

			basededatos.UsuarioActivadoDAO.save(user);
			t.commit();
			return true;

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
		return false;
		// TODO: Implement Method
		// throw new UnsupportedOperationException();
	}

	public basededatos.UsuarioActivado obtenerDatosUsuario(String idDNI) {
		basededatos.UsuarioActivado usuario = null;
		try {
			UsuarioActivado[] usuarios = basededatos.UsuarioActivadoDAO
					.listUsuarioActivadoByQuery("idDNI = '" + idDNI + "'", null);
			if(usuarios.length>0){
				return usuarios[0];
			}else{
				return null;
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
		return usuario;
	}

	public void actualizarDatosUsuario(basededatos.UsuarioActivado usuario) {
		PersistentTransaction t;
		try {
			// iniciamos esto para que haga las transiciones
			t = basededatos.CasinoVirtualMDS2PersistentManager.instance()
					.getSession().beginTransaction();

			basededatos.UsuarioActivadoDAO.save(usuario);
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

	public basededatos.UsuarioActivado bajaUsuario(String idDNI) {
		PersistentTransaction t;
		try {
			// iniciamos esto para que haga las transiciones
			t = basededatos.CasinoVirtualMDS2PersistentManager.instance()
					.getSession().beginTransaction();
			UsuarioActivado usuario = basededatos.UsuarioActivadoDAO
					.listUsuarioActivadoByQuery("idDNI = '" + idDNI + "'", null)[0];
			basededatos.UsuarioActivadoDAO.delete(usuario);
			t.commit();
			return usuario;
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
		return null;
	}



	private basededatos.BDPrincipal esDe;

	public basededatos.BDPrincipal getEsDe() {
		return this.esDe;
	}

	public void setEsDe(basededatos.BDPrincipal value) {
		this.esDe = value;
	}

	public String obtenerDNIUsuarioRegistrado(String email, String contrasena) {
		basededatos.UsuarioActivado[] usuario = null;
		try {
			usuario = basededatos.UsuarioActivadoDAO
					.listUsuarioActivadoByQuery(null, null);
			for (UsuarioActivado usuarioActivado : usuario) {
				if (usuarioActivado.getEmail().equals(email)
						&& usuarioActivado.getContrasena().equals(contrasena)) {
					return usuarioActivado.getIdDNI();
				}
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
		return null;

	}

	public void anadirMasJugado(Juego juego, UsuarioActivado usuario) {
		PersistentTransaction t;

		// iniciamos esto para que haga las transiciones
		try {
			t = basededatos.CasinoVirtualMDS2PersistentManager.instance()
					.getSession().beginTransaction();
			

			Fecha fecha = new Fecha();
			//basededatos.FechaDAO.save(fecha);
			basededatos.JuegoDAO.save(juego);
			basededatos.UsuarioActivadoDAO.save(usuario);
			fecha.setJuego(juego);
			fecha.setUsuarioRegistrado(usuario);

			t.commit();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
