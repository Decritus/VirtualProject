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

public class PersonalAplicacionDAO {
	public static PersonalAplicacion loadPersonalAplicacionByORMID(int idPersonal) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadPersonalAplicacionByORMID(session, idPersonal);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalAplicacion getPersonalAplicacionByORMID(int idPersonal) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return getPersonalAplicacionByORMID(session, idPersonal);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalAplicacion loadPersonalAplicacionByORMID(int idPersonal, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadPersonalAplicacionByORMID(session, idPersonal, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalAplicacion getPersonalAplicacionByORMID(int idPersonal, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return getPersonalAplicacionByORMID(session, idPersonal, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalAplicacion loadPersonalAplicacionByORMID(PersistentSession session, int idPersonal) throws PersistentException {
		try {
			return (PersonalAplicacion) session.load(basededatos.PersonalAplicacion.class, new Integer(idPersonal));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalAplicacion getPersonalAplicacionByORMID(PersistentSession session, int idPersonal) throws PersistentException {
		try {
			return (PersonalAplicacion) session.get(basededatos.PersonalAplicacion.class, new Integer(idPersonal));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalAplicacion loadPersonalAplicacionByORMID(PersistentSession session, int idPersonal, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (PersonalAplicacion) session.load(basededatos.PersonalAplicacion.class, new Integer(idPersonal), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalAplicacion getPersonalAplicacionByORMID(PersistentSession session, int idPersonal, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (PersonalAplicacion) session.get(basededatos.PersonalAplicacion.class, new Integer(idPersonal), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersonalAplicacion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return queryPersonalAplicacion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersonalAplicacion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return queryPersonalAplicacion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalAplicacion[] listPersonalAplicacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return listPersonalAplicacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalAplicacion[] listPersonalAplicacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return listPersonalAplicacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersonalAplicacion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.PersonalAplicacion as PersonalAplicacion");
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
	
	public static List queryPersonalAplicacion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.PersonalAplicacion as PersonalAplicacion");
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
	
	public static PersonalAplicacion[] listPersonalAplicacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPersonalAplicacion(session, condition, orderBy);
			return (PersonalAplicacion[]) list.toArray(new PersonalAplicacion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalAplicacion[] listPersonalAplicacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPersonalAplicacion(session, condition, orderBy, lockMode);
			return (PersonalAplicacion[]) list.toArray(new PersonalAplicacion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalAplicacion loadPersonalAplicacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadPersonalAplicacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalAplicacion loadPersonalAplicacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadPersonalAplicacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalAplicacion loadPersonalAplicacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		PersonalAplicacion[] personalAplicacions = listPersonalAplicacionByQuery(session, condition, orderBy);
		if (personalAplicacions != null && personalAplicacions.length > 0)
			return personalAplicacions[0];
		else
			return null;
	}
	
	public static PersonalAplicacion loadPersonalAplicacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		PersonalAplicacion[] personalAplicacions = listPersonalAplicacionByQuery(session, condition, orderBy, lockMode);
		if (personalAplicacions != null && personalAplicacions.length > 0)
			return personalAplicacions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePersonalAplicacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return iteratePersonalAplicacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePersonalAplicacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return iteratePersonalAplicacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePersonalAplicacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.PersonalAplicacion as PersonalAplicacion");
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
	
	public static java.util.Iterator iteratePersonalAplicacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.PersonalAplicacion as PersonalAplicacion");
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
	
	public static PersonalAplicacion createPersonalAplicacion() {
		return new basededatos.PersonalAplicacion();
	}
	
	public static boolean save(basededatos.PersonalAplicacion personalAplicacion) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().saveObject(personalAplicacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.PersonalAplicacion personalAplicacion) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().deleteObject(personalAplicacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(basededatos.PersonalAplicacion personalAplicacion) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().refresh(personalAplicacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.PersonalAplicacion personalAplicacion) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().evict(personalAplicacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalAplicacion loadPersonalAplicacionByCriteria(PersonalAplicacionCriteria personalAplicacionCriteria) {
		PersonalAplicacion[] personalAplicacions = listPersonalAplicacionByCriteria(personalAplicacionCriteria);
		if(personalAplicacions == null || personalAplicacions.length == 0) {
			return null;
		}
		return personalAplicacions[0];
	}
	
	public static PersonalAplicacion[] listPersonalAplicacionByCriteria(PersonalAplicacionCriteria personalAplicacionCriteria) {
		return personalAplicacionCriteria.listPersonalAplicacion();
	}
}
