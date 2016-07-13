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

public class QuejaUsuarioCriteria extends AbstractORMCriteria {
	public final IntegerExpression idQueja;
	public final StringExpression usuario;
	public final StringExpression asunto;
	public final StringExpression texto;
	
	public QuejaUsuarioCriteria(Criteria criteria) {
		super(criteria);
		idQueja = new IntegerExpression("idQueja", this);
		usuario = new StringExpression("usuario", this);
		asunto = new StringExpression("asunto", this);
		texto = new StringExpression("texto", this);
	}
	
	public QuejaUsuarioCriteria(PersistentSession session) {
		this(session.createCriteria(QuejaUsuario.class));
	}
	
	public QuejaUsuarioCriteria() throws PersistentException {
		this(basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession());
	}
	
	public UsuarioRegistradoCriteria createSonReportadasCriteria() {
		return new UsuarioRegistradoCriteria(createCriteria("sonReportadas"));
	}
	
	public QuejaUsuario uniqueQuejaUsuario() {
		return (QuejaUsuario) super.uniqueResult();
	}
	
	public QuejaUsuario[] listQuejaUsuario() {
		java.util.List list = super.list();
		return (QuejaUsuario[]) list.toArray(new QuejaUsuario[list.size()]);
	}
}

