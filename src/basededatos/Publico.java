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
public class Publico extends basededatos.Juego implements Serializable {
	public Publico() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatos.ORMConstants.KEY_PUBLICO_ESJUGADOPORNOREGISTRADO) {
			return ORM_esJugadoPorNoRegistrado;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private java.util.Date fecha;
	
	private java.util.Set ORM_esJugadoPorNoRegistrado = new java.util.HashSet();
	
	public void setFecha(java.util.Date value) {
		this.fecha = value;
	}
	
	public java.util.Date getFecha() {
		return fecha;
	}
	
	private void setORM_EsJugadoPorNoRegistrado(java.util.Set value) {
		this.ORM_esJugadoPorNoRegistrado = value;
	}
	
	private java.util.Set getORM_EsJugadoPorNoRegistrado() {
		return ORM_esJugadoPorNoRegistrado;
	}
	
	public final basededatos.UsuariosNoRegistradosSetCollection esJugadoPorNoRegistrado = new basededatos.UsuariosNoRegistradosSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_PUBLICO_ESJUGADOPORNOREGISTRADO, basededatos.ORMConstants.KEY_USUARIOSNOREGISTRADOS_JUEGAAPUBLICOS, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
	private basededatos.BDPublicos esDe;
	
	public basededatos.BDPublicos getEsDe()  {
		return this.esDe;
	}
	
	public void setEsDe(basededatos.BDPublicos value)  {
		this.esDe = value;
	}
	
}
