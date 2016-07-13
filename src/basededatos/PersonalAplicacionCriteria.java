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

public class PersonalAplicacionCriteria extends AbstractORMCriteria {
	public final IntegerExpression idPersonal;
	public final StringExpression usuario;
	public final StringExpression contrasena;
	
	public PersonalAplicacionCriteria(Criteria criteria) {
		super(criteria);
		idPersonal = new IntegerExpression("idPersonal", this);
		usuario = new StringExpression("usuario", this);
		contrasena = new StringExpression("contrasena", this);
	}
	
	public PersonalAplicacionCriteria(PersistentSession session) {
		this(session.createCriteria(PersonalAplicacion.class));
	}
	
	public PersonalAplicacionCriteria() throws PersistentException {
		this(basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession());
	}
	
	public PersonalAplicacion uniquePersonalAplicacion() {
		return (PersonalAplicacion) super.uniqueResult();
	}
	
	public PersonalAplicacion[] listPersonalAplicacion() {
		java.util.List list = super.list();
		return (PersonalAplicacion[]) list.toArray(new PersonalAplicacion[list.size()]);
	}
}

