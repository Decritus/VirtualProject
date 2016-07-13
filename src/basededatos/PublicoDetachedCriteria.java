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

public class PublicoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idJuego;
	public final StringExpression nombre;
	public final StringExpression ubicacion;
	public final StringExpression imagen;
	public final IntegerExpression importe;
	public final DateExpression fechaAlta;
	public final BooleanExpression desactivado;
	public final DateExpression fecha;
	
	public PublicoDetachedCriteria() {
		super(basededatos.Publico.class, basededatos.PublicoCriteria.class);
		idJuego = new IntegerExpression("idJuego", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		ubicacion = new StringExpression("ubicacion", this.getDetachedCriteria());
		imagen = new StringExpression("imagen", this.getDetachedCriteria());
		importe = new IntegerExpression("importe", this.getDetachedCriteria());
		fechaAlta = new DateExpression("fechaAlta", this.getDetachedCriteria());
		desactivado = new BooleanExpression("desactivado", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
	}
	
	public PublicoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.PublicoCriteria.class);
		idJuego = new IntegerExpression("idJuego", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		ubicacion = new StringExpression("ubicacion", this.getDetachedCriteria());
		imagen = new StringExpression("imagen", this.getDetachedCriteria());
		importe = new IntegerExpression("importe", this.getDetachedCriteria());
		fechaAlta = new DateExpression("fechaAlta", this.getDetachedCriteria());
		desactivado = new BooleanExpression("desactivado", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
	}
	
	public basededatos.UsuariosNoRegistradosDetachedCriteria createEsJugadoPorNoRegistradoCriteria() {
		return new basededatos.UsuariosNoRegistradosDetachedCriteria(createCriteria("ORM_EsJugadoPorNoRegistrado"));
	}
	
	public basededatos.FechaDetachedCriteria createFechasCriteria() {
		return new basededatos.FechaDetachedCriteria(createCriteria("ORM_Fechas"));
	}
	
	public basededatos.UsuarioRegistradoDetachedCriteria createFavoritoDeCriteria() {
		return new basededatos.UsuarioRegistradoDetachedCriteria(createCriteria("ORM_FavoritoDe"));
	}
	
	public Publico uniquePublico(PersistentSession session) {
		return (Publico) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Publico[] listPublico(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Publico[]) list.toArray(new Publico[list.size()]);
	}
}

