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

public class UsuarioInactivoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression idDNI;
	public final StringExpression nombreUsuario;
	public final StringExpression contrasena;
	public final StringExpression preguntaSecreta;
	public final StringExpression respuestaSecreta;
	public final StringExpression email;
	public final StringExpression numCuenta;
	public final LongExpression ganancias;
	public final StringExpression foto;
	public final DateExpression fechaInicioBaja;
	public final DateExpression fechaFinBaja;
	
	public UsuarioInactivoDetachedCriteria() {
		super(basededatos.UsuarioInactivo.class, basededatos.UsuarioInactivoCriteria.class);
		idDNI = new StringExpression("idDNI", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
		preguntaSecreta = new StringExpression("preguntaSecreta", this.getDetachedCriteria());
		respuestaSecreta = new StringExpression("respuestaSecreta", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		numCuenta = new StringExpression("numCuenta", this.getDetachedCriteria());
		ganancias = new LongExpression("ganancias", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		fechaInicioBaja = new DateExpression("fechaInicioBaja", this.getDetachedCriteria());
		fechaFinBaja = new DateExpression("fechaFinBaja", this.getDetachedCriteria());
	}
	
	public UsuarioInactivoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.UsuarioInactivoCriteria.class);
		idDNI = new StringExpression("idDNI", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
		preguntaSecreta = new StringExpression("preguntaSecreta", this.getDetachedCriteria());
		respuestaSecreta = new StringExpression("respuestaSecreta", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		numCuenta = new StringExpression("numCuenta", this.getDetachedCriteria());
		ganancias = new LongExpression("ganancias", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		fechaInicioBaja = new DateExpression("fechaInicioBaja", this.getDetachedCriteria());
		fechaFinBaja = new DateExpression("fechaFinBaja", this.getDetachedCriteria());
	}
	
	public basededatos.ChatDetachedCriteria createEscribeCriteria() {
		return new basededatos.ChatDetachedCriteria(createCriteria("ORM_Escribe"));
	}
	
	public basededatos.FechaDetachedCriteria createFechasCriteria() {
		return new basededatos.FechaDetachedCriteria(createCriteria("ORM_Fechas"));
	}
	
	public basededatos.QuejaUsuarioDetachedCriteria createReportaCriteria() {
		return new basededatos.QuejaUsuarioDetachedCriteria(createCriteria("ORM_Reporta"));
	}
	
	public basededatos.JuegoDetachedCriteria createFavoritoCriteria() {
		return new basededatos.JuegoDetachedCriteria(createCriteria("ORM_Favorito"));
	}
	
	public UsuarioInactivo uniqueUsuarioInactivo(PersistentSession session) {
		return (UsuarioInactivo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public UsuarioInactivo[] listUsuarioInactivo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (UsuarioInactivo[]) list.toArray(new UsuarioInactivo[list.size()]);
	}
}

