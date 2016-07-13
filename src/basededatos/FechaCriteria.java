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

public class FechaCriteria extends AbstractORMCriteria {
	public final IntegerExpression idFecha;
	
	public FechaCriteria(Criteria criteria) {
		super(criteria);
		idFecha = new IntegerExpression("idFecha", this);
	}
	
	public FechaCriteria(PersistentSession session) {
		this(session.createCriteria(Fecha.class));
	}
	
	public FechaCriteria() throws PersistentException {
		this(basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession());
	}
	
	public JuegoCriteria createJuegoCriteria() {
		return new JuegoCriteria(createCriteria("ORM_Juego"));
	}
	
	public UsuarioRegistradoCriteria createUsuarioRegistradoCriteria() {
		return new UsuarioRegistradoCriteria(createCriteria("ORM_UsuarioRegistrado"));
	}
	
	public Fecha uniqueFecha() {
		return (Fecha) super.uniqueResult();
	}
	
	public Fecha[] listFecha() {
		java.util.List list = super.list();
		return (Fecha[]) list.toArray(new Fecha[list.size()]);
	}
}

