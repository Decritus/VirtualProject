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

public class PublicoCriteria extends AbstractORMCriteria {
	public final IntegerExpression idJuego;
	public final StringExpression nombre;
	public final StringExpression ubicacion;
	public final StringExpression imagen;
	public final IntegerExpression importe;
	public final DateExpression fechaAlta;
	public final BooleanExpression desactivado;
	public final DateExpression fecha;
	
	public PublicoCriteria(Criteria criteria) {
		super(criteria);
		idJuego = new IntegerExpression("idJuego", this);
		nombre = new StringExpression("nombre", this);
		ubicacion = new StringExpression("ubicacion", this);
		imagen = new StringExpression("imagen", this);
		importe = new IntegerExpression("importe", this);
		fechaAlta = new DateExpression("fechaAlta", this);
		desactivado = new BooleanExpression("desactivado", this);
		fecha = new DateExpression("fecha", this);
	}
	
	public PublicoCriteria(PersistentSession session) {
		this(session.createCriteria(Publico.class));
	}
	
	public PublicoCriteria() throws PersistentException {
		this(basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession());
	}
	
	public basededatos.UsuariosNoRegistradosCriteria createEsJugadoPorNoRegistradoCriteria() {
		return new basededatos.UsuariosNoRegistradosCriteria(createCriteria("ORM_EsJugadoPorNoRegistrado"));
	}
	
	public basededatos.FechaCriteria createFechasCriteria() {
		return new basededatos.FechaCriteria(createCriteria("ORM_Fechas"));
	}
	
	public basededatos.UsuarioRegistradoCriteria createFavoritoDeCriteria() {
		return new basededatos.UsuarioRegistradoCriteria(createCriteria("ORM_FavoritoDe"));
	}
	
	public Publico uniquePublico() {
		return (Publico) super.uniqueResult();
	}
	
	public Publico[] listPublico() {
		java.util.List list = super.list();
		return (Publico[]) list.toArray(new Publico[list.size()]);
	}
}

