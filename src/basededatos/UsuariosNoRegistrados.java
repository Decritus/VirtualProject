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
public class UsuariosNoRegistrados implements Serializable {
	public UsuariosNoRegistrados() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof UsuariosNoRegistrados))
			return false;
		UsuariosNoRegistrados usuariosnoregistrados = (UsuariosNoRegistrados)aObj;
		if ((getIdIp() != null && !getIdIp().equals(usuariosnoregistrados.getIdIp())) || (getIdIp() == null && usuariosnoregistrados.getIdIp() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getIdIp() == null ? 0 : getIdIp().hashCode());
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatos.ORMConstants.KEY_USUARIOSNOREGISTRADOS_JUEGAAPUBLICOS) {
			return ORM_juegaAPublicos;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private String idIp;
	
	private long horasJugadas;
	
	private java.util.Date fechaHoraEntrada;
	
	private java.util.Date fechaHoraSalida;
	
	private java.util.Set ORM_juegaAPublicos = new java.util.HashSet();
	
	public void setIdIp(String value) {
		this.idIp = value;
	}
	
	public String getIdIp() {
		return idIp;
	}
	
	public String getORMID() {
		return getIdIp();
	}
	
	public void setHorasJugadas(long value) {
		this.horasJugadas = value;
	}
	
	public long getHorasJugadas() {
		return horasJugadas;
	}
	
	public void setFechaHoraEntrada(java.util.Date value) {
		this.fechaHoraEntrada = value;
	}
	
	public java.util.Date getFechaHoraEntrada() {
		return fechaHoraEntrada;
	}
	
	public void setFechaHoraSalida(java.util.Date value) {
		this.fechaHoraSalida = value;
	}
	
	public java.util.Date getFechaHoraSalida() {
		return fechaHoraSalida;
	}

	
	private void setORM_JuegaAPublicos(java.util.Set value) {
		this.ORM_juegaAPublicos = value;
	}
	
	private java.util.Set getORM_JuegaAPublicos() {
		return ORM_juegaAPublicos;
	}
	
	public final basededatos.PublicoSetCollection juegaAPublicos = new basededatos.PublicoSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_USUARIOSNOREGISTRADOS_JUEGAAPUBLICOS, basededatos.ORMConstants.KEY_PUBLICO_ESJUGADOPORNOREGISTRADO, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdIp());
	}
	
	private basededatos.BDUsuariosNoRegistrados esDe;
	
	public basededatos.BDUsuariosNoRegistrados getEsDe()  {
		return this.esDe;
	}
	
	public void setEsDe(basededatos.BDUsuariosNoRegistrados value)  {
		this.esDe = value;
	}
	
}
