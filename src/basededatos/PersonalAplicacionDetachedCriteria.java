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

public class PersonalAplicacionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idPersonal;
	public final StringExpression usuario;
	public final StringExpression contrasena;
	
	public PersonalAplicacionDetachedCriteria() {
		super(basededatos.PersonalAplicacion.class, basededatos.PersonalAplicacionCriteria.class);
		idPersonal = new IntegerExpression("idPersonal", this.getDetachedCriteria());
		usuario = new StringExpression("usuario", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
	}
	
	public PersonalAplicacionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.PersonalAplicacionCriteria.class);
		idPersonal = new IntegerExpression("idPersonal", this.getDetachedCriteria());
		usuario = new StringExpression("usuario", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
	}
	
	public PersonalAplicacion uniquePersonalAplicacion(PersistentSession session) {
		return (PersonalAplicacion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public PersonalAplicacion[] listPersonalAplicacion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (PersonalAplicacion[]) list.toArray(new PersonalAplicacion[list.size()]);
	}
}

