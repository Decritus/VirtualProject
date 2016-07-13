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
public class Administrador extends basededatos.PersonalAplicacion implements Serializable {
	public Administrador() {
	}
	
	public String toString() {
		return super.toString();
	}
	
	private basededatos.BDAdministradores esDe;
	
	public basededatos.BDAdministradores getEsDe()  {
		return this.esDe;
	}
	
	public void setEsDe(basededatos.BDAdministradores value)  {
		this.esDe = value;
	}
	
}
