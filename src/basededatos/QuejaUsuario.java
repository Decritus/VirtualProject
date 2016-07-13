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
public class QuejaUsuario implements Serializable {
	public QuejaUsuario() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == basededatos.ORMConstants.KEY_QUEJAUSUARIO_SONREPORTADAS) {
			this.sonReportadas = (basededatos.UsuarioRegistrado) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int idQueja;
	
	private basededatos.UsuarioRegistrado sonReportadas;
	
	private String usuario;
	
	private String asunto;
	
	private String texto;
	
	public void setUsuario(String value) {
		this.usuario = value;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setAsunto(String value) {
		this.asunto = value;
	}
	
	public String getAsunto() {
		return asunto;
	}
	
	public void setTexto(String value) {
		this.texto = value;
	}
	
	public String getTexto() {
		return texto;
	}
	
	private void setIdQueja(int value) {
		this.idQueja = value;
	}
	
	public int getIdQueja() {
		return idQueja;
	}
	
	public int getORMID() {
		return getIdQueja();
	}
	
	public void setSonReportadas(basededatos.UsuarioRegistrado value) {
		if (sonReportadas != null) {
			sonReportadas.reporta.remove(this);
		}
		if (value != null) {
			value.reporta.add(this);
		}
	}
	
	public basededatos.UsuarioRegistrado getSonReportadas() {
		return sonReportadas;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_SonReportadas(basededatos.UsuarioRegistrado value) {
		this.sonReportadas = value;
	}
	
	private basededatos.UsuarioRegistrado getORM_SonReportadas() {
		return sonReportadas;
	}
	
	public String toString() {
		return String.valueOf(getIdQueja());
	}
	
	private basededatos.BDQuejasUsuarios esDe;
	
	public basededatos.BDQuejasUsuarios getEsDe()  {
		return this.esDe;
	}
	
	public void setEsDe(basededatos.BDQuejasUsuarios value)  {
		this.esDe = value;
	}
	
}
