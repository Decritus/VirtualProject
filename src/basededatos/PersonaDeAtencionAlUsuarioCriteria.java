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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PersonaDeAtencionAlUsuarioCriteria extends AbstractORMCriteria {
	public final IntegerExpression idPersonal;
	public final StringExpression usuario;
	public final StringExpression contrasena;
	
	public PersonaDeAtencionAlUsuarioCriteria(Criteria criteria) {
		super(criteria);
		idPersonal = new IntegerExpression("idPersonal", this);
		usuario = new StringExpression("usuario", this);
		contrasena = new StringExpression("contrasena", this);
	}
	
	public PersonaDeAtencionAlUsuarioCriteria(PersistentSession session) {
		this(session.createCriteria(PersonaDeAtencionAlUsuario.class));
	}
	
	public PersonaDeAtencionAlUsuarioCriteria() throws PersistentException {
		this(basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession());
	}
	
	public basededatos.ChatCriteria createRedactaCriteria() {
		return new basededatos.ChatCriteria(createCriteria("ORM_Redacta"));
	}
	
	public ChatCriteria createEscribe_Criteria() {
		return new ChatCriteria(createCriteria("escribe_"));
	}
	
	public PersonaDeAtencionAlUsuario uniquePersonaDeAtencionAlUsuario() {
		return (PersonaDeAtencionAlUsuario) super.uniqueResult();
	}
	
	public PersonaDeAtencionAlUsuario[] listPersonaDeAtencionAlUsuario() {
		java.util.List list = super.list();
		return (PersonaDeAtencionAlUsuario[]) list.toArray(new PersonaDeAtencionAlUsuario[list.size()]);
	}
}

