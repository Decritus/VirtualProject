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

public class ChatCriteria extends AbstractORMCriteria {
	public final IntegerExpression idMensaje;
	public final StringExpression mensaje;
	public final DateExpression fecha;
	
	public ChatCriteria(Criteria criteria) {
		super(criteria);
		idMensaje = new IntegerExpression("idMensaje", this);
		mensaje = new StringExpression("mensaje", this);
		fecha = new DateExpression("fecha", this);
	}
	
	public ChatCriteria(PersistentSession session) {
		this(session.createCriteria(Chat.class));
	}
	
	public ChatCriteria() throws PersistentException {
		this(basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession());
	}
	
	public PersonaDeAtencionAlUsuarioCriteria createEs_utilizado_porCriteria() {
		return new PersonaDeAtencionAlUsuarioCriteria(createCriteria("es_utilizado_por"));
	}
	
	public PersonaDeAtencionAlUsuarioCriteria createSonRedactadosCriteria() {
		return new PersonaDeAtencionAlUsuarioCriteria(createCriteria("sonRedactados"));
	}
	
	public UsuarioRegistradoCriteria createEsUsadoPorCriteria() {
		return new UsuarioRegistradoCriteria(createCriteria("esUsadoPor"));
	}
	
	public Chat uniqueChat() {
		return (Chat) super.uniqueResult();
	}
	
	public Chat[] listChat() {
		java.util.List list = super.list();
		return (Chat[]) list.toArray(new Chat[list.size()]);
	}
}

