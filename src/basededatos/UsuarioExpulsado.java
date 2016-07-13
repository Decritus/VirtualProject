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
public class UsuarioExpulsado extends basededatos.UsuarioRegistrado implements Serializable {
	public UsuarioExpulsado() {
	}
	
	private java.util.Date fechaExpulsion;
	
	private int tiempoExpulsion;
	
	private int numExpulsiones;
	
	public void setFechaExpulsion(java.util.Date value) {
		this.fechaExpulsion = value;
	}
	
	public java.util.Date getFechaExpulsion() {
		return fechaExpulsion;
	}
	
	public void setTiempoExpulsion(int value) {
		this.tiempoExpulsion = value;
	}
	
	public int getTiempoExpulsion() {
		return tiempoExpulsion;
	}
	
	public void setNumExpulsiones(int value) {
		this.numExpulsiones = value;
	}
	
	public int getNumExpulsiones() {
		return numExpulsiones;
	}
	
	public String toString() {
		return super.toString();
	}
	
	private basededatos.BDUsuariosExpulsados esDe;
	
	public basededatos.BDUsuariosExpulsados getEsDe()  {
		return this.esDe;
	}
	
	public void setEsDe(basededatos.BDUsuariosExpulsados value)  {
		this.esDe = value;
	}
	
}
