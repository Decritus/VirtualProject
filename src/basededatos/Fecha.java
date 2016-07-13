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

import java.io.Serializable;
public class Fecha implements Serializable {
	public Fecha() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == basededatos.ORMConstants.KEY_FECHA_USUARIOREGISTRADO) {
			this.usuarioRegistrado = (basededatos.UsuarioRegistrado) owner;
		}
		
		else if (key == basededatos.ORMConstants.KEY_FECHA_JUEGO) {
			this.juego = (basededatos.Juego) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int idFecha;
	
	private basededatos.Juego juego;
	
	private basededatos.UsuarioRegistrado usuarioRegistrado;
	
	private void setIdFecha(int value) {
		this.idFecha = value;
	}
	
	public int getIdFecha() {
		return idFecha;
	}
	
	public int getORMID() {
		return getIdFecha();
	}
	
	public void setUsuarioRegistrado(basededatos.UsuarioRegistrado value) {
		if (usuarioRegistrado != null) {
			usuarioRegistrado.fechas.remove(this);
		}
		if (value != null) {
			value.fechas.add(this);
		}
	}
	
	public basededatos.UsuarioRegistrado getUsuarioRegistrado() {
		return usuarioRegistrado;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_UsuarioRegistrado(basededatos.UsuarioRegistrado value) {
		this.usuarioRegistrado = value;
	}
	
	private basededatos.UsuarioRegistrado getORM_UsuarioRegistrado() {
		return usuarioRegistrado;
	}
	
	public void setJuego(basededatos.Juego value) {
		if (juego != null) {
			juego.fechas.remove(this);
		}
		if (value != null) {
			value.fechas.add(this);
		}
	}
	
	public basededatos.Juego getJuego() {
		return juego;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Juego(basededatos.Juego value) {
		this.juego = value;
	}
	
	private basededatos.Juego getORM_Juego() {
		return juego;
	}
	
	public String toString() {
		return String.valueOf(getIdFecha());
	}
	
}
