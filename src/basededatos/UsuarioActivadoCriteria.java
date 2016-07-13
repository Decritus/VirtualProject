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

public class UsuarioActivadoCriteria extends AbstractORMCriteria {
	public final StringExpression idDNI;
	public final StringExpression nombreUsuario;
	public final StringExpression contrasena;
	public final StringExpression preguntaSecreta;
	public final StringExpression respuestaSecreta;
	public final StringExpression email;
	public final StringExpression numCuenta;
	public final LongExpression ganancias;
	public final StringExpression foto;
	public final DateExpression fechaAlta;
	
	public UsuarioActivadoCriteria(Criteria criteria) {
		super(criteria);
		idDNI = new StringExpression("idDNI", this);
		nombreUsuario = new StringExpression("nombreUsuario", this);
		contrasena = new StringExpression("contrasena", this);
		preguntaSecreta = new StringExpression("preguntaSecreta", this);
		respuestaSecreta = new StringExpression("respuestaSecreta", this);
		email = new StringExpression("email", this);
		numCuenta = new StringExpression("numCuenta", this);
		ganancias = new LongExpression("ganancias", this);
		foto = new StringExpression("foto", this);
		fechaAlta = new DateExpression("fechaAlta", this);
	}
	
	public UsuarioActivadoCriteria(PersistentSession session) {
		this(session.createCriteria(UsuarioActivado.class));
	}
	
	public UsuarioActivadoCriteria() throws PersistentException {
		this(basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession());
	}
	
	public basededatos.ChatCriteria createEscribeCriteria() {
		return new basededatos.ChatCriteria(createCriteria("ORM_Escribe"));
	}
	
	public basededatos.FechaCriteria createFechasCriteria() {
		return new basededatos.FechaCriteria(createCriteria("ORM_Fechas"));
	}
	
	public basededatos.QuejaUsuarioCriteria createReportaCriteria() {
		return new basededatos.QuejaUsuarioCriteria(createCriteria("ORM_Reporta"));
	}
	
	public basededatos.JuegoCriteria createFavoritoCriteria() {
		return new basededatos.JuegoCriteria(createCriteria("ORM_Favorito"));
	}
	
	public UsuarioActivado uniqueUsuarioActivado() {
		return (UsuarioActivado) super.uniqueResult();
	}
	
	public UsuarioActivado[] listUsuarioActivado() {
		java.util.List list = super.list();
		return (UsuarioActivado[]) list.toArray(new UsuarioActivado[list.size()]);
	}
}

