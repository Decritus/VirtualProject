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

public class DatosConfiguracionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idDatosConfiguracion;
	public final IntegerExpression partidasSimultaneas;
	
	public DatosConfiguracionDetachedCriteria() {
		super(basededatos.DatosConfiguracion.class, basededatos.DatosConfiguracionCriteria.class);
		idDatosConfiguracion = new IntegerExpression("idDatosConfiguracion", this.getDetachedCriteria());
		partidasSimultaneas = new IntegerExpression("partidasSimultaneas", this.getDetachedCriteria());
	}
	
	public DatosConfiguracionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.DatosConfiguracionCriteria.class);
		idDatosConfiguracion = new IntegerExpression("idDatosConfiguracion", this.getDetachedCriteria());
		partidasSimultaneas = new IntegerExpression("partidasSimultaneas", this.getDetachedCriteria());
	}
	
	public DatosConfiguracion uniqueDatosConfiguracion(PersistentSession session) {
		return (DatosConfiguracion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public DatosConfiguracion[] listDatosConfiguracion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (DatosConfiguracion[]) list.toArray(new DatosConfiguracion[list.size()]);
	}
}

