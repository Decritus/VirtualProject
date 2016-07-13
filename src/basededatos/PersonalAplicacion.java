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
public class PersonalAplicacion implements Serializable {
	public PersonalAplicacion() {
	}
	
	private int idPersonal;
	
	private String usuario;
	
	private String contrasena;
	
	private void setIdPersonal(int value) {
		this.idPersonal = value;
	}
	
	public int getIdPersonal() {
		return idPersonal;
	}
	
	public int getORMID() {
		return getIdPersonal();
	}
	
	public void setUsuario(String value) {
		this.usuario = value;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setContrasena(String value) {
		this.contrasena = value;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	
	public String toString() {
		return String.valueOf(getIdPersonal());
	}
	
}
