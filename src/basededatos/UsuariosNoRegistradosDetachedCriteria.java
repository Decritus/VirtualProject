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

public class UsuariosNoRegistradosDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression idIp;
	public final LongExpression horasJugadas;
	public final DateExpression fechaHoraEntrada;
	public final DateExpression fechaHoraSalida;
	
	public UsuariosNoRegistradosDetachedCriteria() {
		super(basededatos.UsuariosNoRegistrados.class, basededatos.UsuariosNoRegistradosCriteria.class);
		idIp = new StringExpression("idIp", this.getDetachedCriteria());
		horasJugadas = new LongExpression("horasJugadas", this.getDetachedCriteria());
		fechaHoraEntrada = new DateExpression("fechaHoraEntrada", this.getDetachedCriteria());
		fechaHoraSalida = new DateExpression("fechaHoraSalida", this.getDetachedCriteria());
		
	}
	
	public UsuariosNoRegistradosDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.UsuariosNoRegistradosCriteria.class);
		idIp = new StringExpression("idIp", this.getDetachedCriteria());
		horasJugadas = new LongExpression("horasJugadas", this.getDetachedCriteria());
		fechaHoraEntrada = new DateExpression("fechaHoraEntrada", this.getDetachedCriteria());
		fechaHoraSalida = new DateExpression("fechaHoraSalida", this.getDetachedCriteria());
		
	}
	
	public basededatos.PublicoDetachedCriteria createJuegaAPublicosCriteria() {
		return new basededatos.PublicoDetachedCriteria(createCriteria("ORM_JuegaAPublicos"));
	}
	
	public UsuariosNoRegistrados uniqueUsuariosNoRegistrados(PersistentSession session) {
		return (UsuariosNoRegistrados) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public UsuariosNoRegistrados[] listUsuariosNoRegistrados(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (UsuariosNoRegistrados[]) list.toArray(new UsuariosNoRegistrados[list.size()]);
	}
}

