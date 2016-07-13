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

public class UsuariosNoRegistradosCriteria extends AbstractORMCriteria {
	public final StringExpression idIp;
	public final LongExpression horasJugadas;
	public final DateExpression fechaHoraEntrada;
	public final DateExpression fechaHoraSalida;
	
	public UsuariosNoRegistradosCriteria(Criteria criteria) {
		super(criteria);
		idIp = new StringExpression("idIp", this);
		horasJugadas = new LongExpression("horasJugadas", this);
		fechaHoraEntrada = new DateExpression("fechaHoraEntrada", this);
		fechaHoraSalida = new DateExpression("fechaHoraSalida", this);
	}
	
	public UsuariosNoRegistradosCriteria(PersistentSession session) {
		this(session.createCriteria(UsuariosNoRegistrados.class));
	}
	
	public UsuariosNoRegistradosCriteria() throws PersistentException {
		this(basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession());
	}
	
	public basededatos.PublicoCriteria createJuegaAPublicosCriteria() {
		return new basededatos.PublicoCriteria(createCriteria("ORM_JuegaAPublicos"));
	}
	
	public UsuariosNoRegistrados uniqueUsuariosNoRegistrados() {
		return (UsuariosNoRegistrados) super.uniqueResult();
	}
	
	public UsuariosNoRegistrados[] listUsuariosNoRegistrados() {
		java.util.List list = super.list();
		return (UsuariosNoRegistrados[]) list.toArray(new UsuariosNoRegistrados[list.size()]);
	}
}

