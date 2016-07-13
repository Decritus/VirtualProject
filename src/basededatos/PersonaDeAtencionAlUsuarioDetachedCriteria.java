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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PersonaDeAtencionAlUsuarioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idPersonal;
	public final StringExpression usuario;
	public final StringExpression contrasena;
	
	public PersonaDeAtencionAlUsuarioDetachedCriteria() {
		super(basededatos.PersonaDeAtencionAlUsuario.class, basededatos.PersonaDeAtencionAlUsuarioCriteria.class);
		idPersonal = new IntegerExpression("idPersonal", this.getDetachedCriteria());
		usuario = new StringExpression("usuario", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
	}
	
	public PersonaDeAtencionAlUsuarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.PersonaDeAtencionAlUsuarioCriteria.class);
		idPersonal = new IntegerExpression("idPersonal", this.getDetachedCriteria());
		usuario = new StringExpression("usuario", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
	}
	
	public basededatos.ChatDetachedCriteria createRedactaCriteria() {
		return new basededatos.ChatDetachedCriteria(createCriteria("ORM_Redacta"));
	}
	
	public ChatDetachedCriteria createEscribe_Criteria() {
		return new ChatDetachedCriteria(createCriteria("escribe_"));
	}
	
	public PersonaDeAtencionAlUsuario uniquePersonaDeAtencionAlUsuario(PersistentSession session) {
		return (PersonaDeAtencionAlUsuario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public PersonaDeAtencionAlUsuario[] listPersonaDeAtencionAlUsuario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (PersonaDeAtencionAlUsuario[]) list.toArray(new PersonaDeAtencionAlUsuario[list.size()]);
	}
}

