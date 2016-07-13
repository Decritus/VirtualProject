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

public class UsuarioRegistradoDAO {
	public static UsuarioRegistrado loadUsuarioRegistradoByORMID(String idDNI) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadUsuarioRegistradoByORMID(session, idDNI);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado getUsuarioRegistradoByORMID(String idDNI) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return getUsuarioRegistradoByORMID(session, idDNI);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByORMID(String idDNI, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadUsuarioRegistradoByORMID(session, idDNI, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado getUsuarioRegistradoByORMID(String idDNI, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return getUsuarioRegistradoByORMID(session, idDNI, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByORMID(PersistentSession session, String idDNI) throws PersistentException {
		try {
			return (UsuarioRegistrado) session.load(basededatos.UsuarioRegistrado.class, idDNI);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado getUsuarioRegistradoByORMID(PersistentSession session, String idDNI) throws PersistentException {
		try {
			return (UsuarioRegistrado) session.get(basededatos.UsuarioRegistrado.class, idDNI);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByORMID(PersistentSession session, String idDNI, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UsuarioRegistrado) session.load(basededatos.UsuarioRegistrado.class, idDNI, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado getUsuarioRegistradoByORMID(PersistentSession session, String idDNI, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UsuarioRegistrado) session.get(basededatos.UsuarioRegistrado.class, idDNI, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioRegistrado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return queryUsuarioRegistrado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioRegistrado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return queryUsuarioRegistrado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado[] listUsuarioRegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return listUsuarioRegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado[] listUsuarioRegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return listUsuarioRegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioRegistrado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioRegistrado as UsuarioRegistrado");
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
	
	public static List queryUsuarioRegistrado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioRegistrado as UsuarioRegistrado");
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
	
	public static UsuarioRegistrado[] listUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuarioRegistrado(session, condition, orderBy);
			return (UsuarioRegistrado[]) list.toArray(new UsuarioRegistrado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado[] listUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuarioRegistrado(session, condition, orderBy, lockMode);
			return (UsuarioRegistrado[]) list.toArray(new UsuarioRegistrado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadUsuarioRegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadUsuarioRegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		UsuarioRegistrado[] usuarioRegistrados = listUsuarioRegistradoByQuery(session, condition, orderBy);
		if (usuarioRegistrados != null && usuarioRegistrados.length > 0)
			return usuarioRegistrados[0];
		else
			return null;
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		UsuarioRegistrado[] usuarioRegistrados = listUsuarioRegistradoByQuery(session, condition, orderBy, lockMode);
		if (usuarioRegistrados != null && usuarioRegistrados.length > 0)
			return usuarioRegistrados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuarioRegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return iterateUsuarioRegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioRegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return iterateUsuarioRegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioRegistrado as UsuarioRegistrado");
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
	
	public static java.util.Iterator iterateUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioRegistrado as UsuarioRegistrado");
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
	
	public static UsuarioRegistrado createUsuarioRegistrado() {
		return new basededatos.UsuarioRegistrado();
	}
	
	public static boolean save(basededatos.UsuarioRegistrado usuarioRegistrado) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().saveObject(usuarioRegistrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.UsuarioRegistrado usuarioRegistrado) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().deleteObject(usuarioRegistrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.UsuarioRegistrado usuarioRegistrado)throws PersistentException {
		try {
			basededatos.Chat[] lEscribes = usuarioRegistrado.escribe.toArray();
			for(int i = 0; i < lEscribes.length; i++) {
				lEscribes[i].setEsUsadoPor(null);
			}
			basededatos.Fecha[] lFechass = usuarioRegistrado.fechas.toArray();
			for(int i = 0; i < lFechass.length; i++) {
				lFechass[i].setUsuarioRegistrado(null);
			}
			basededatos.QuejaUsuario[] lReportas = usuarioRegistrado.reporta.toArray();
			for(int i = 0; i < lReportas.length; i++) {
				lReportas[i].setSonReportadas(null);
			}
			basededatos.Juego[] lFavoritos = usuarioRegistrado.favorito.toArray();
			for(int i = 0; i < lFavoritos.length; i++) {
				lFavoritos[i].favoritoDe.remove(usuarioRegistrado);
			}
			return delete(usuarioRegistrado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.UsuarioRegistrado usuarioRegistrado, org.orm.PersistentSession session)throws PersistentException {
		try {
			basededatos.Chat[] lEscribes = usuarioRegistrado.escribe.toArray();
			for(int i = 0; i < lEscribes.length; i++) {
				lEscribes[i].setEsUsadoPor(null);
			}
			basededatos.Fecha[] lFechass = usuarioRegistrado.fechas.toArray();
			for(int i = 0; i < lFechass.length; i++) {
				lFechass[i].setUsuarioRegistrado(null);
			}
			basededatos.QuejaUsuario[] lReportas = usuarioRegistrado.reporta.toArray();
			for(int i = 0; i < lReportas.length; i++) {
				lReportas[i].setSonReportadas(null);
			}
			basededatos.Juego[] lFavoritos = usuarioRegistrado.favorito.toArray();
			for(int i = 0; i < lFavoritos.length; i++) {
				lFavoritos[i].favoritoDe.remove(usuarioRegistrado);
			}
			try {
				session.delete(usuarioRegistrado);
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
	
	public static boolean refresh(basededatos.UsuarioRegistrado usuarioRegistrado) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().refresh(usuarioRegistrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.UsuarioRegistrado usuarioRegistrado) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().evict(usuarioRegistrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByCriteria(UsuarioRegistradoCriteria usuarioRegistradoCriteria) {
		UsuarioRegistrado[] usuarioRegistrados = listUsuarioRegistradoByCriteria(usuarioRegistradoCriteria);
		if(usuarioRegistrados == null || usuarioRegistrados.length == 0) {
			return null;
		}
		return usuarioRegistrados[0];
	}
	
	public static UsuarioRegistrado[] listUsuarioRegistradoByCriteria(UsuarioRegistradoCriteria usuarioRegistradoCriteria) {
		return usuarioRegistradoCriteria.listUsuarioRegistrado();
	}
}
