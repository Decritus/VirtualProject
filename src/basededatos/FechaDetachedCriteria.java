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

public class FechaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idFecha;
	
	public FechaDetachedCriteria() {
		super(basededatos.Fecha.class, basededatos.FechaCriteria.class);
		idFecha = new IntegerExpression("idFecha", this.getDetachedCriteria());
	}
	
	public FechaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.FechaCriteria.class);
		idFecha = new IntegerExpression("idFecha", this.getDetachedCriteria());
	}
	
	public JuegoDetachedCriteria createJuegoCriteria() {
		return new JuegoDetachedCriteria(createCriteria("juego"));
	}
	
	public UsuarioRegistradoDetachedCriteria createUsuarioRegistradoCriteria() {
		return new UsuarioRegistradoDetachedCriteria(createCriteria("usuarioRegistrado"));
	}
	
	public Fecha uniqueFecha(PersistentSession session) {
		return (Fecha) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Fecha[] listFecha(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Fecha[]) list.toArray(new Fecha[list.size()]);
	}
}

