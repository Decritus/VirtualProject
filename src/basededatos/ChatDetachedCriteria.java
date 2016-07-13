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

public class ChatDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idMensaje;
	public final StringExpression mensaje;
	public final DateExpression fecha;
	
	public ChatDetachedCriteria() {
		super(basededatos.Chat.class, basededatos.ChatCriteria.class);
		idMensaje = new IntegerExpression("idMensaje", this.getDetachedCriteria());
		mensaje = new StringExpression("mensaje", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
	}
	
	public ChatDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.ChatCriteria.class);
		idMensaje = new IntegerExpression("idMensaje", this.getDetachedCriteria());
		mensaje = new StringExpression("mensaje", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
	}
	
	public PersonaDeAtencionAlUsuarioDetachedCriteria createEs_utilizado_porCriteria() {
		return new PersonaDeAtencionAlUsuarioDetachedCriteria(createCriteria("es_utilizado_por"));
	}
	
	public PersonaDeAtencionAlUsuarioDetachedCriteria createSonRedactadosCriteria() {
		return new PersonaDeAtencionAlUsuarioDetachedCriteria(createCriteria("sonRedactados"));
	}
	
	public UsuarioRegistradoDetachedCriteria createEsUsadoPorCriteria() {
		return new UsuarioRegistradoDetachedCriteria(createCriteria("esUsadoPor"));
	}
	
	public Chat uniqueChat(PersistentSession session) {
		return (Chat) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Chat[] listChat(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Chat[]) list.toArray(new Chat[list.size()]);
	}
}

