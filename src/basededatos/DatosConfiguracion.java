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
public class DatosConfiguracion implements Serializable {
	public DatosConfiguracion() {
	}
	
	private int idDatosConfiguracion;
	
	private int partidasSimultaneas;
	
	private void setIdDatosConfiguracion(int value) {
		this.idDatosConfiguracion = value;
	}
	
	public int getIdDatosConfiguracion() {
		return idDatosConfiguracion;
	}
	
	public int getORMID() {
		return getIdDatosConfiguracion();
	}
	
	public void setPartidasSimultaneas(int value) {
		this.partidasSimultaneas = value;
	}
	
	public int getPartidasSimultaneas() {
		return partidasSimultaneas;
	}
	
	public String toString() {
		return String.valueOf(getIdDatosConfiguracion());
	}
	
}
