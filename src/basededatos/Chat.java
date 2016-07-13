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
public class Chat implements Serializable {
	public Chat() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == basededatos.ORMConstants.KEY_CHAT_SONREDACTADOS) {
			this.sonRedactados = (basededatos.PersonaDeAtencionAlUsuario) owner;
		}
		
		else if (key == basededatos.ORMConstants.KEY_CHAT_ES_UTILIZADO_POR) {
			this.es_utilizado_por = (basededatos.PersonaDeAtencionAlUsuario) owner;
		}
		
		else if (key == basededatos.ORMConstants.KEY_CHAT_ESUSADOPOR) {
			this.esUsadoPor = (basededatos.UsuarioRegistrado) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int idMensaje;
	
	private basededatos.PersonaDeAtencionAlUsuario es_utilizado_por;
	
	private basededatos.PersonaDeAtencionAlUsuario sonRedactados;
	
	private basededatos.UsuarioRegistrado esUsadoPor;
	
	private String mensaje;
	
	private java.util.Date fecha;
	
	private void setIdMensaje(int value) {
		this.idMensaje = value;
	}
	
	public int getIdMensaje() {
		return idMensaje;
	}
	
	public int getORMID() {
		return getIdMensaje();
	}
	
	public void setMensaje(String value) {
		this.mensaje = value;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	
	public void setFecha(java.util.Date value) {
		this.fecha = value;
	}
	
	public java.util.Date getFecha() {
		return fecha;
	}
	
	public void setSonRedactados(basededatos.PersonaDeAtencionAlUsuario value) {
		if (sonRedactados != null) {
			sonRedactados.redacta.remove(this);
		}
		if (value != null) {
			value.redacta.add(this);
		}
	}
	
	public basededatos.PersonaDeAtencionAlUsuario getSonRedactados() {
		return sonRedactados;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_SonRedactados(basededatos.PersonaDeAtencionAlUsuario value) {
		this.sonRedactados = value;
	}
	
	private basededatos.PersonaDeAtencionAlUsuario getORM_SonRedactados() {
		return sonRedactados;
	}
	
	public void setEs_utilizado_por(basededatos.PersonaDeAtencionAlUsuario value) {
		if (this.es_utilizado_por != value) {
			basededatos.PersonaDeAtencionAlUsuario les_utilizado_por = this.es_utilizado_por;
			this.es_utilizado_por = value;
			if (value != null) {
				es_utilizado_por.setEscribe_(this);
			}
			else {
				les_utilizado_por.setEscribe_(null);
			}
		}
	}
	
	public basededatos.PersonaDeAtencionAlUsuario getEs_utilizado_por() {
		return es_utilizado_por;
	}
	
	public void setEsUsadoPor(basededatos.UsuarioRegistrado value) {
		if (esUsadoPor != null) {
			esUsadoPor.escribe.remove(this);
		}
		if (value != null) {
			value.escribe.add(this);
		}
	}
	
	public basededatos.UsuarioRegistrado getEsUsadoPor() {
		return esUsadoPor;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_EsUsadoPor(basededatos.UsuarioRegistrado value) {
		this.esUsadoPor = value;
	}
	
	private basededatos.UsuarioRegistrado getORM_EsUsadoPor() {
		return esUsadoPor;
	}
	
	public String toString() {
		return String.valueOf(getIdMensaje());
	}
	
	private basededatos.BDChats esDe;
	
	public basededatos.BDChats getEsDe()  {
		return this.esDe;
	}
	
	public void setEsDe(basededatos.BDChats value)  {
		this.esDe = value;
	}
	
}
