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
public class UsuarioInactivo extends basededatos.UsuarioRegistrado implements Serializable {
	public UsuarioInactivo() {
	}
	
	private java.util.Date fechaInicioBaja;
	
	private java.util.Date fechaFinBaja;
	
	public void setFechaInicioBaja(java.util.Date value) {
		this.fechaInicioBaja = value;
	}
	
	public java.util.Date getFechaInicioBaja() {
		return fechaInicioBaja;
	}
	
	public void setFechaFinBaja(java.util.Date value) {
		this.fechaFinBaja = value;
	}
	
	public java.util.Date getFechaFinBaja() {
		return fechaFinBaja;
	}
	
	public String toString() {
		return super.toString();
	}
	
	private basededatos.BDUsuariosInactivos esDe;
	
	public basededatos.BDUsuariosInactivos getEsDe()  {
		return this.esDe;
	}
	
	public void setEsDe(basededatos.BDUsuariosInactivos value)  {
		this.esDe = value;
	}
	
}
