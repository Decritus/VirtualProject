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

public class DatosConfiguracionCriteria extends AbstractORMCriteria {
	public final IntegerExpression idDatosConfiguracion;
	public final IntegerExpression partidasSimultaneas;
	
	public DatosConfiguracionCriteria(Criteria criteria) {
		super(criteria);
		idDatosConfiguracion = new IntegerExpression("idDatosConfiguracion", this);
		partidasSimultaneas = new IntegerExpression("partidasSimultaneas", this);
	}
	
	public DatosConfiguracionCriteria(PersistentSession session) {
		this(session.createCriteria(DatosConfiguracion.class));
	}
	
	public DatosConfiguracionCriteria() throws PersistentException {
		this(basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession());
	}
	
	public DatosConfiguracion uniqueDatosConfiguracion() {
		return (DatosConfiguracion) super.uniqueResult();
	}
	
	public DatosConfiguracion[] listDatosConfiguracion() {
		java.util.List list = super.list();
		return (DatosConfiguracion[]) list.toArray(new DatosConfiguracion[list.size()]);
	}
}

