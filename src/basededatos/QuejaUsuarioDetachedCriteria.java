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

public class QuejaUsuarioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idQueja;
	public final StringExpression usuario;
	public final StringExpression asunto;
	public final StringExpression texto;
	
	public QuejaUsuarioDetachedCriteria() {
		super(basededatos.QuejaUsuario.class, basededatos.QuejaUsuarioCriteria.class);
		idQueja = new IntegerExpression("idQueja", this.getDetachedCriteria());
		usuario = new StringExpression("usuario", this.getDetachedCriteria());
		asunto = new StringExpression("asunto", this.getDetachedCriteria());
		texto = new StringExpression("texto", this.getDetachedCriteria());
	}
	
	public QuejaUsuarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.QuejaUsuarioCriteria.class);
		idQueja = new IntegerExpression("idQueja", this.getDetachedCriteria());
		usuario = new StringExpression("usuario", this.getDetachedCriteria());
		asunto = new StringExpression("asunto", this.getDetachedCriteria());
		texto = new StringExpression("texto", this.getDetachedCriteria());
	}
	
	public UsuarioRegistradoDetachedCriteria createSonReportadasCriteria() {
		return new UsuarioRegistradoDetachedCriteria(createCriteria("sonReportadas"));
	}
	
	public QuejaUsuario uniqueQuejaUsuario(PersistentSession session) {
		return (QuejaUsuario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public QuejaUsuario[] listQuejaUsuario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (QuejaUsuario[]) list.toArray(new QuejaUsuario[list.size()]);
	}
}

