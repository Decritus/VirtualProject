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
public class PersonaDeAtencionAlUsuario extends basededatos.PersonalAplicacion implements Serializable {
	public PersonaDeAtencionAlUsuario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatos.ORMConstants.KEY_PERSONADEATENCIONALUSUARIO_REDACTA) {
			return ORM_redacta;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private java.util.Set ORM_redacta = new java.util.HashSet();
	
	private basededatos.Chat escribe_;
	
	private void setORM_Redacta(java.util.Set value) {
		this.ORM_redacta = value;
	}
	
	private java.util.Set getORM_Redacta() {
		return ORM_redacta;
	}
	
	public final basededatos.ChatSetCollection redacta = new basededatos.ChatSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_PERSONADEATENCIONALUSUARIO_REDACTA, basededatos.ORMConstants.KEY_CHAT_SONREDACTADOS, basededatos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setEscribe_(basededatos.Chat value) {
		if (this.escribe_ != value) {
			basededatos.Chat lescribe_ = this.escribe_;
			this.escribe_ = value;
			if (value != null) {
				escribe_.setEs_utilizado_por(this);
			}
			else {
				lescribe_.setEs_utilizado_por(null);
			}
		}
	}
	
	public basededatos.Chat getEscribe_() {
		return escribe_;
	}
	
	public String toString() {
		return super.toString();
	}
	
	private basededatos.BDPersonalDeAtencionAlUsuario esDe;
	
	public basededatos.BDPersonalDeAtencionAlUsuario getEsDe()  {
		return this.esDe;
	}
	
	public void setEsDe(basededatos.BDPersonalDeAtencionAlUsuario value)  {
		this.esDe = value;
	}
	
}
