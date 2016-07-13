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

public class DatosConfiguracionDAO {
	public static DatosConfiguracion loadDatosConfiguracionByORMID(int idDatosConfiguracion) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadDatosConfiguracionByORMID(session, idDatosConfiguracion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DatosConfiguracion getDatosConfiguracionByORMID(int idDatosConfiguracion) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return getDatosConfiguracionByORMID(session, idDatosConfiguracion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DatosConfiguracion loadDatosConfiguracionByORMID(int idDatosConfiguracion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadDatosConfiguracionByORMID(session, idDatosConfiguracion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DatosConfiguracion getDatosConfiguracionByORMID(int idDatosConfiguracion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return getDatosConfiguracionByORMID(session, idDatosConfiguracion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DatosConfiguracion loadDatosConfiguracionByORMID(PersistentSession session, int idDatosConfiguracion) throws PersistentException {
		try {
			return (DatosConfiguracion) session.load(basededatos.DatosConfiguracion.class, new Integer(idDatosConfiguracion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DatosConfiguracion getDatosConfiguracionByORMID(PersistentSession session, int idDatosConfiguracion) throws PersistentException {
		try {
			return (DatosConfiguracion) session.get(basededatos.DatosConfiguracion.class, new Integer(idDatosConfiguracion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DatosConfiguracion loadDatosConfiguracionByORMID(PersistentSession session, int idDatosConfiguracion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (DatosConfiguracion) session.load(basededatos.DatosConfiguracion.class, new Integer(idDatosConfiguracion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DatosConfiguracion getDatosConfiguracionByORMID(PersistentSession session, int idDatosConfiguracion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (DatosConfiguracion) session.get(basededatos.DatosConfiguracion.class, new Integer(idDatosConfiguracion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDatosConfiguracion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return queryDatosConfiguracion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDatosConfiguracion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return queryDatosConfiguracion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DatosConfiguracion[] listDatosConfiguracionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return listDatosConfiguracionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DatosConfiguracion[] listDatosConfiguracionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return listDatosConfiguracionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDatosConfiguracion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.DatosConfiguracion as DatosConfiguracion");
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
	
	public static List queryDatosConfiguracion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.DatosConfiguracion as DatosConfiguracion");
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
	
	public static DatosConfiguracion[] listDatosConfiguracionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDatosConfiguracion(session, condition, orderBy);
			return (DatosConfiguracion[]) list.toArray(new DatosConfiguracion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DatosConfiguracion[] listDatosConfiguracionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDatosConfiguracion(session, condition, orderBy, lockMode);
			return (DatosConfiguracion[]) list.toArray(new DatosConfiguracion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DatosConfiguracion loadDatosConfiguracionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadDatosConfiguracionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DatosConfiguracion loadDatosConfiguracionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadDatosConfiguracionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DatosConfiguracion loadDatosConfiguracionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		DatosConfiguracion[] datosConfiguracions = listDatosConfiguracionByQuery(session, condition, orderBy);
		if (datosConfiguracions != null && datosConfiguracions.length > 0)
			return datosConfiguracions[0];
		else
			return null;
	}
	
	public static DatosConfiguracion loadDatosConfiguracionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		DatosConfiguracion[] datosConfiguracions = listDatosConfiguracionByQuery(session, condition, orderBy, lockMode);
		if (datosConfiguracions != null && datosConfiguracions.length > 0)
			return datosConfiguracions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDatosConfiguracionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return iterateDatosConfiguracionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDatosConfiguracionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return iterateDatosConfiguracionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDatosConfiguracionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.DatosConfiguracion as DatosConfiguracion");
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
	
	public static java.util.Iterator iterateDatosConfiguracionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.DatosConfiguracion as DatosConfiguracion");
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
	
	public static DatosConfiguracion createDatosConfiguracion() {
		return new basededatos.DatosConfiguracion();
	}
	
	public static boolean save(basededatos.DatosConfiguracion datosConfiguracion) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().saveObject(datosConfiguracion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.DatosConfiguracion datosConfiguracion) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().deleteObject(datosConfiguracion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(basededatos.DatosConfiguracion datosConfiguracion) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().refresh(datosConfiguracion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.DatosConfiguracion datosConfiguracion) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().evict(datosConfiguracion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DatosConfiguracion loadDatosConfiguracionByCriteria(DatosConfiguracionCriteria datosConfiguracionCriteria) {
		DatosConfiguracion[] datosConfiguracions = listDatosConfiguracionByCriteria(datosConfiguracionCriteria);
		if(datosConfiguracions == null || datosConfiguracions.length == 0) {
			return null;
		}
		return datosConfiguracions[0];
	}
	
	public static DatosConfiguracion[] listDatosConfiguracionByCriteria(DatosConfiguracionCriteria datosConfiguracionCriteria) {
		return datosConfiguracionCriteria.listDatosConfiguracion();
	}
}
