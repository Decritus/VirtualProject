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
public class UsuarioInhabilitado extends basededatos.UsuarioRegistrado implements Serializable {
	public UsuarioInhabilitado() {
	}
	
	private java.util.Date fechaInhabilitado;
	
	private int tiempoInhabilitacion;
	
	public void setFechaInhabilitado(java.util.Date value) {
		this.fechaInhabilitado = value;
	}
	
	public java.util.Date getFechaInhabilitado() {
		return fechaInhabilitado;
	}
	
	public void setTiempoInhabilitacion(int value) {
		this.tiempoInhabilitacion = value;
	}
	
	public int getTiempoInhabilitacion() {
		return tiempoInhabilitacion;
	}
	
	public String toString() {
		return super.toString();
	}
	
	private basededatos.BDUsuariosInhabilitados esDe;
	
	public basededatos.BDUsuariosInhabilitados getEsDe()  {
		return this.esDe;
	}
	
	public void setEsDe(basededatos.BDUsuariosInhabilitados value)  {
		this.esDe = value;
	}
	
}
