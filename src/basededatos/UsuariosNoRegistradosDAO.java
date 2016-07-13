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

public class UsuariosNoRegistradosDAO {
	public static UsuariosNoRegistrados loadUsuariosNoRegistradosByORMID(String idIp) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadUsuariosNoRegistradosByORMID(session, idIp);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuariosNoRegistrados getUsuariosNoRegistradosByORMID(String idIp) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return getUsuariosNoRegistradosByORMID(session, idIp);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuariosNoRegistrados loadUsuariosNoRegistradosByORMID(String idIp, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadUsuariosNoRegistradosByORMID(session, idIp, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuariosNoRegistrados getUsuariosNoRegistradosByORMID(String idIp, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return getUsuariosNoRegistradosByORMID(session, idIp, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuariosNoRegistrados loadUsuariosNoRegistradosByORMID(PersistentSession session, String idIp) throws PersistentException {
		try {
			return (UsuariosNoRegistrados) session.load(basededatos.UsuariosNoRegistrados.class, idIp);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuariosNoRegistrados getUsuariosNoRegistradosByORMID(PersistentSession session, String idIp) throws PersistentException {
		try {
			return (UsuariosNoRegistrados) session.get(basededatos.UsuariosNoRegistrados.class, idIp);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuariosNoRegistrados loadUsuariosNoRegistradosByORMID(PersistentSession session, String idIp, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UsuariosNoRegistrados) session.load(basededatos.UsuariosNoRegistrados.class, idIp, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuariosNoRegistrados getUsuariosNoRegistradosByORMID(PersistentSession session, String idIp, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UsuariosNoRegistrados) session.get(basededatos.UsuariosNoRegistrados.class, idIp, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuariosNoRegistrados(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return queryUsuariosNoRegistrados(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuariosNoRegistrados(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return queryUsuariosNoRegistrados(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuariosNoRegistrados[] listUsuariosNoRegistradosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return listUsuariosNoRegistradosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuariosNoRegistrados[] listUsuariosNoRegistradosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return listUsuariosNoRegistradosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuariosNoRegistrados(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuariosNoRegistrados as UsuariosNoRegistrados");
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
	
	public static List queryUsuariosNoRegistrados(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuariosNoRegistrados as UsuariosNoRegistrados");
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
	
	public static UsuariosNoRegistrados[] listUsuariosNoRegistradosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuariosNoRegistrados(session, condition, orderBy);
			return (UsuariosNoRegistrados[]) list.toArray(new UsuariosNoRegistrados[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuariosNoRegistrados[] listUsuariosNoRegistradosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuariosNoRegistrados(session, condition, orderBy, lockMode);
			return (UsuariosNoRegistrados[]) list.toArray(new UsuariosNoRegistrados[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuariosNoRegistrados loadUsuariosNoRegistradosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadUsuariosNoRegistradosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuariosNoRegistrados loadUsuariosNoRegistradosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadUsuariosNoRegistradosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuariosNoRegistrados loadUsuariosNoRegistradosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		UsuariosNoRegistrados[] usuariosNoRegistradoses = listUsuariosNoRegistradosByQuery(session, condition, orderBy);
		if (usuariosNoRegistradoses != null && usuariosNoRegistradoses.length > 0)
			return usuariosNoRegistradoses[0];
		else
			return null;
	}
	
	public static UsuariosNoRegistrados loadUsuariosNoRegistradosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		UsuariosNoRegistrados[] usuariosNoRegistradoses = listUsuariosNoRegistradosByQuery(session, condition, orderBy, lockMode);
		if (usuariosNoRegistradoses != null && usuariosNoRegistradoses.length > 0)
			return usuariosNoRegistradoses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuariosNoRegistradosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return iterateUsuariosNoRegistradosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuariosNoRegistradosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return iterateUsuariosNoRegistradosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuariosNoRegistradosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuariosNoRegistrados as UsuariosNoRegistrados");
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
	
	public static java.util.Iterator iterateUsuariosNoRegistradosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuariosNoRegistrados as UsuariosNoRegistrados");
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
	
	public static UsuariosNoRegistrados createUsuariosNoRegistrados() {
		return new basededatos.UsuariosNoRegistrados();
	}
	
	public static boolean save(basededatos.UsuariosNoRegistrados usuariosNoRegistrados) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().saveObject(usuariosNoRegistrados);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.UsuariosNoRegistrados usuariosNoRegistrados) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().deleteObject(usuariosNoRegistrados);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.UsuariosNoRegistrados usuariosNoRegistrados)throws PersistentException {
		try {
			basededatos.Publico[] lJuegaAPublicoss = usuariosNoRegistrados.juegaAPublicos.toArray();
			for(int i = 0; i < lJuegaAPublicoss.length; i++) {
				lJuegaAPublicoss[i].esJugadoPorNoRegistrado.remove(usuariosNoRegistrados);
			}
			return delete(usuariosNoRegistrados);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.UsuariosNoRegistrados usuariosNoRegistrados, org.orm.PersistentSession session)throws PersistentException {
		try {
			basededatos.Publico[] lJuegaAPublicoss = usuariosNoRegistrados.juegaAPublicos.toArray();
			for(int i = 0; i < lJuegaAPublicoss.length; i++) {
				lJuegaAPublicoss[i].esJugadoPorNoRegistrado.remove(usuariosNoRegistrados);
			}
			try {
				session.delete(usuariosNoRegistrados);
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
	
	public static boolean refresh(basededatos.UsuariosNoRegistrados usuariosNoRegistrados) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().refresh(usuariosNoRegistrados);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.UsuariosNoRegistrados usuariosNoRegistrados) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().evict(usuariosNoRegistrados);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuariosNoRegistrados loadUsuariosNoRegistradosByCriteria(UsuariosNoRegistradosCriteria usuariosNoRegistradosCriteria) {
		UsuariosNoRegistrados[] usuariosNoRegistradoses = listUsuariosNoRegistradosByCriteria(usuariosNoRegistradosCriteria);
		if(usuariosNoRegistradoses == null || usuariosNoRegistradoses.length == 0) {
			return null;
		}
		return usuariosNoRegistradoses[0];
	}
	
	public static UsuariosNoRegistrados[] listUsuariosNoRegistradosByCriteria(UsuariosNoRegistradosCriteria usuariosNoRegistradosCriteria) {
		return usuariosNoRegistradosCriteria.listUsuariosNoRegistrados();
	}
}
