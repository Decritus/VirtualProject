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

import org.orm.*;
import org.hibernate.Query;
import java.util.List;

public class PersonaDeAtencionAlUsuarioDAO {
	public static PersonaDeAtencionAlUsuario loadPersonaDeAtencionAlUsuarioByORMID(int idPersonal) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadPersonaDeAtencionAlUsuarioByORMID(session, idPersonal);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonaDeAtencionAlUsuario getPersonaDeAtencionAlUsuarioByORMID(int idPersonal) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return getPersonaDeAtencionAlUsuarioByORMID(session, idPersonal);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonaDeAtencionAlUsuario loadPersonaDeAtencionAlUsuarioByORMID(int idPersonal, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadPersonaDeAtencionAlUsuarioByORMID(session, idPersonal, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonaDeAtencionAlUsuario getPersonaDeAtencionAlUsuarioByORMID(int idPersonal, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return getPersonaDeAtencionAlUsuarioByORMID(session, idPersonal, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonaDeAtencionAlUsuario loadPersonaDeAtencionAlUsuarioByORMID(PersistentSession session, int idPersonal) throws PersistentException {
		try {
			return (PersonaDeAtencionAlUsuario) session.load(basededatos.PersonaDeAtencionAlUsuario.class, new Integer(idPersonal));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonaDeAtencionAlUsuario getPersonaDeAtencionAlUsuarioByORMID(PersistentSession session, int idPersonal) throws PersistentException {
		try {
			return (PersonaDeAtencionAlUsuario) session.get(basededatos.PersonaDeAtencionAlUsuario.class, new Integer(idPersonal));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonaDeAtencionAlUsuario loadPersonaDeAtencionAlUsuarioByORMID(PersistentSession session, int idPersonal, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (PersonaDeAtencionAlUsuario) session.load(basededatos.PersonaDeAtencionAlUsuario.class, new Integer(idPersonal), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonaDeAtencionAlUsuario getPersonaDeAtencionAlUsuarioByORMID(PersistentSession session, int idPersonal, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (PersonaDeAtencionAlUsuario) session.get(basededatos.PersonaDeAtencionAlUsuario.class, new Integer(idPersonal), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersonaDeAtencionAlUsuario(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return queryPersonaDeAtencionAlUsuario(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersonaDeAtencionAlUsuario(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return queryPersonaDeAtencionAlUsuario(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonaDeAtencionAlUsuario[] listPersonaDeAtencionAlUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return listPersonaDeAtencionAlUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonaDeAtencionAlUsuario[] listPersonaDeAtencionAlUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return listPersonaDeAtencionAlUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersonaDeAtencionAlUsuario(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.PersonaDeAtencionAlUsuario as PersonaDeAtencionAlUsuario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersonaDeAtencionAlUsuario(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.PersonaDeAtencionAlUsuario as PersonaDeAtencionAlUsuario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonaDeAtencionAlUsuario[] listPersonaDeAtencionAlUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPersonaDeAtencionAlUsuario(session, condition, orderBy);
			return (PersonaDeAtencionAlUsuario[]) list.toArray(new PersonaDeAtencionAlUsuario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonaDeAtencionAlUsuario[] listPersonaDeAtencionAlUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPersonaDeAtencionAlUsuario(session, condition, orderBy, lockMode);
			return (PersonaDeAtencionAlUsuario[]) list.toArray(new PersonaDeAtencionAlUsuario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonaDeAtencionAlUsuario loadPersonaDeAtencionAlUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadPersonaDeAtencionAlUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonaDeAtencionAlUsuario loadPersonaDeAtencionAlUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadPersonaDeAtencionAlUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonaDeAtencionAlUsuario loadPersonaDeAtencionAlUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		PersonaDeAtencionAlUsuario[] personaDeAtencionAlUsuarios = listPersonaDeAtencionAlUsuarioByQuery(session, condition, orderBy);
		if (personaDeAtencionAlUsuarios != null && personaDeAtencionAlUsuarios.length > 0)
			return personaDeAtencionAlUsuarios[0];
		else
			return null;
	}
	
	public static PersonaDeAtencionAlUsuario loadPersonaDeAtencionAlUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		PersonaDeAtencionAlUsuario[] personaDeAtencionAlUsuarios = listPersonaDeAtencionAlUsuarioByQuery(session, condition, orderBy, lockMode);
		if (personaDeAtencionAlUsuarios != null && personaDeAtencionAlUsuarios.length > 0)
			return personaDeAtencionAlUsuarios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePersonaDeAtencionAlUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return iteratePersonaDeAtencionAlUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePersonaDeAtencionAlUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return iteratePersonaDeAtencionAlUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePersonaDeAtencionAlUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.PersonaDeAtencionAlUsuario as PersonaDeAtencionAlUsuario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePersonaDeAtencionAlUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.PersonaDeAtencionAlUsuario as PersonaDeAtencionAlUsuario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonaDeAtencionAlUsuario createPersonaDeAtencionAlUsuario() {
		return new basededatos.PersonaDeAtencionAlUsuario();
	}
	
	public static boolean save(basededatos.PersonaDeAtencionAlUsuario personaDeAtencionAlUsuario) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().saveObject(personaDeAtencionAlUsuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.PersonaDeAtencionAlUsuario personaDeAtencionAlUsuario) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().deleteObject(personaDeAtencionAlUsuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.PersonaDeAtencionAlUsuario personaDeAtencionAlUsuario)throws PersistentException {
		try {
			basededatos.Chat[] lRedactas = personaDeAtencionAlUsuario.redacta.toArray();
			for(int i = 0; i < lRedactas.length; i++) {
				lRedactas[i].setSonRedactados(null);
			}
			if(personaDeAtencionAlUsuario.getEscribe_() != null) {
				personaDeAtencionAlUsuario.getEscribe_().setEs_utilizado_por(null);
			}
			
			return delete(personaDeAtencionAlUsuario);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.PersonaDeAtencionAlUsuario personaDeAtencionAlUsuario, org.orm.PersistentSession session)throws PersistentException {
		try {
			basededatos.Chat[] lRedactas = personaDeAtencionAlUsuario.redacta.toArray();
			for(int i = 0; i < lRedactas.length; i++) {
				lRedactas[i].setSonRedactados(null);
			}
			if(personaDeAtencionAlUsuario.getEscribe_() != null) {
				personaDeAtencionAlUsuario.getEscribe_().setEs_utilizado_por(null);
			}
			
			try {
				session.delete(personaDeAtencionAlUsuario);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(basededatos.PersonaDeAtencionAlUsuario personaDeAtencionAlUsuario) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().refresh(personaDeAtencionAlUsuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.PersonaDeAtencionAlUsuario personaDeAtencionAlUsuario) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().evict(personaDeAtencionAlUsuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonaDeAtencionAlUsuario loadPersonaDeAtencionAlUsuarioByCriteria(PersonaDeAtencionAlUsuarioCriteria personaDeAtencionAlUsuarioCriteria) {
		PersonaDeAtencionAlUsuario[] personaDeAtencionAlUsuarios = listPersonaDeAtencionAlUsuarioByCriteria(personaDeAtencionAlUsuarioCriteria);
		if(personaDeAtencionAlUsuarios == null || personaDeAtencionAlUsuarios.length == 0) {
			return null;
		}
		return personaDeAtencionAlUsuarios[0];
	}
	
	public static PersonaDeAtencionAlUsuario[] listPersonaDeAtencionAlUsuarioByCriteria(PersonaDeAtencionAlUsuarioCriteria personaDeAtencionAlUsuarioCriteria) {
		return personaDeAtencionAlUsuarioCriteria.listPersonaDeAtencionAlUsuario();
	}
}
