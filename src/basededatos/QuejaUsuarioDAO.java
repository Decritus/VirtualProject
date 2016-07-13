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

public class QuejaUsuarioDAO {
	public static QuejaUsuario loadQuejaUsuarioByORMID(int idQueja) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadQuejaUsuarioByORMID(session, idQueja);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static QuejaUsuario getQuejaUsuarioByORMID(int idQueja) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return getQuejaUsuarioByORMID(session, idQueja);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static QuejaUsuario loadQuejaUsuarioByORMID(int idQueja, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadQuejaUsuarioByORMID(session, idQueja, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static QuejaUsuario getQuejaUsuarioByORMID(int idQueja, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return getQuejaUsuarioByORMID(session, idQueja, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static QuejaUsuario loadQuejaUsuarioByORMID(PersistentSession session, int idQueja) throws PersistentException {
		try {
			return (QuejaUsuario) session.load(basededatos.QuejaUsuario.class, new Integer(idQueja));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static QuejaUsuario getQuejaUsuarioByORMID(PersistentSession session, int idQueja) throws PersistentException {
		try {
			return (QuejaUsuario) session.get(basededatos.QuejaUsuario.class, new Integer(idQueja));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static QuejaUsuario loadQuejaUsuarioByORMID(PersistentSession session, int idQueja, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (QuejaUsuario) session.load(basededatos.QuejaUsuario.class, new Integer(idQueja), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static QuejaUsuario getQuejaUsuarioByORMID(PersistentSession session, int idQueja, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (QuejaUsuario) session.get(basededatos.QuejaUsuario.class, new Integer(idQueja), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryQuejaUsuario(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return queryQuejaUsuario(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryQuejaUsuario(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return queryQuejaUsuario(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static QuejaUsuario[] listQuejaUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return listQuejaUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static QuejaUsuario[] listQuejaUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return listQuejaUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryQuejaUsuario(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.QuejaUsuario as QuejaUsuario");
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
	
	public static List queryQuejaUsuario(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.QuejaUsuario as QuejaUsuario");
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
	
	public static QuejaUsuario[] listQuejaUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryQuejaUsuario(session, condition, orderBy);
			return (QuejaUsuario[]) list.toArray(new QuejaUsuario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static QuejaUsuario[] listQuejaUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryQuejaUsuario(session, condition, orderBy, lockMode);
			return (QuejaUsuario[]) list.toArray(new QuejaUsuario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static QuejaUsuario loadQuejaUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadQuejaUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static QuejaUsuario loadQuejaUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadQuejaUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static QuejaUsuario loadQuejaUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		QuejaUsuario[] quejaUsuarios = listQuejaUsuarioByQuery(session, condition, orderBy);
		if (quejaUsuarios != null && quejaUsuarios.length > 0)
			return quejaUsuarios[0];
		else
			return null;
	}
	
	public static QuejaUsuario loadQuejaUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		QuejaUsuario[] quejaUsuarios = listQuejaUsuarioByQuery(session, condition, orderBy, lockMode);
		if (quejaUsuarios != null && quejaUsuarios.length > 0)
			return quejaUsuarios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateQuejaUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return iterateQuejaUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateQuejaUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return iterateQuejaUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateQuejaUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.QuejaUsuario as QuejaUsuario");
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
	
	public static java.util.Iterator iterateQuejaUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.QuejaUsuario as QuejaUsuario");
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
	
	public static QuejaUsuario createQuejaUsuario() {
		return new basededatos.QuejaUsuario();
	}
	
	public static boolean save(basededatos.QuejaUsuario quejaUsuario) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().saveObject(quejaUsuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.QuejaUsuario quejaUsuario) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().deleteObject(quejaUsuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.QuejaUsuario quejaUsuario)throws PersistentException {
		try {
			if(quejaUsuario.getSonReportadas() != null) {
				quejaUsuario.getSonReportadas().reporta.remove(quejaUsuario);
			}
			
			return delete(quejaUsuario);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.QuejaUsuario quejaUsuario, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(quejaUsuario.getSonReportadas() != null) {
				quejaUsuario.getSonReportadas().reporta.remove(quejaUsuario);
			}
			
			try {
				session.delete(quejaUsuario);
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
	
	public static boolean refresh(basededatos.QuejaUsuario quejaUsuario) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().refresh(quejaUsuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.QuejaUsuario quejaUsuario) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().evict(quejaUsuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static QuejaUsuario loadQuejaUsuarioByCriteria(QuejaUsuarioCriteria quejaUsuarioCriteria) {
		QuejaUsuario[] quejaUsuarios = listQuejaUsuarioByCriteria(quejaUsuarioCriteria);
		if(quejaUsuarios == null || quejaUsuarios.length == 0) {
			return null;
		}
		return quejaUsuarios[0];
	}
	
	public static QuejaUsuario[] listQuejaUsuarioByCriteria(QuejaUsuarioCriteria quejaUsuarioCriteria) {
		return quejaUsuarioCriteria.listQuejaUsuario();
	}
}
