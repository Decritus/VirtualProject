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
public class UsuarioActivado extends basededatos.UsuarioRegistrado implements Serializable {
	public UsuarioActivado() {
	}
	
	private java.util.Date fechaAlta;
	
	public void setFechaAlta(java.util.Date value) {
		this.fechaAlta = value;
	}
	
	public java.util.Date getFechaAlta() {
		return fechaAlta;
	}
	
	public String toString() {
		return super.toString();
	}
	
	private basededatos.BDUsuariosActivados esDe;
	
	public basededatos.BDUsuariosActivados getEsDe()  {
		return this.esDe;
	}
	
	public void setEsDe(basededatos.BDUsuariosActivados value)  {
		this.esDe = value;
	}
	
}
