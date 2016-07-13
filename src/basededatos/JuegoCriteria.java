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

public class JuegoCriteria extends AbstractORMCriteria {
	public final IntegerExpression idJuego;
	public final StringExpression nombre;
	public final StringExpression ubicacion;
	public final StringExpression imagen;
	public final IntegerExpression importe;
	public final DateExpression fechaAlta;
	public final BooleanExpression desactivado;
	
	public JuegoCriteria(Criteria criteria) {
		super(criteria);
		idJuego = new IntegerExpression("idJuego", this);
		nombre = new StringExpression("nombre", this);
		ubicacion = new StringExpression("ubicacion", this);
		imagen = new StringExpression("imagen", this);
		importe = new IntegerExpression("importe", this);
		fechaAlta = new DateExpression("fechaAlta", this);
		desactivado = new BooleanExpression("desactivado", this);
	}
	
	public JuegoCriteria(PersistentSession session) {
		this(session.createCriteria(Juego.class));
	}
	
	public JuegoCriteria() throws PersistentException {
		this(basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession());
	}
	
	public basededatos.FechaCriteria createFechasCriteria() {
		return new basededatos.FechaCriteria(createCriteria("ORM_Fechas"));
	}
	
	public basededatos.UsuarioRegistradoCriteria createFavoritoDeCriteria() {
		return new basededatos.UsuarioRegistradoCriteria(createCriteria("ORM_FavoritoDe"));
	}
	
	public Juego uniqueJuego() {
		return (Juego) super.uniqueResult();
	}
	
	public Juego[] listJuego() {
		java.util.List list = super.list();
		return (Juego[]) list.toArray(new Juego[list.size()]);
	}
}

