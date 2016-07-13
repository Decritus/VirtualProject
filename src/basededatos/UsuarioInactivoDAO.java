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

public class UsuarioInactivoDAO {
	public static UsuarioInactivo loadUsuarioInactivoByORMID(String idDNI) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadUsuarioInactivoByORMID(session, idDNI);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioInactivo getUsuarioInactivoByORMID(String idDNI) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return getUsuarioInactivoByORMID(session, idDNI);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioInactivo loadUsuarioInactivoByORMID(String idDNI, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadUsuarioInactivoByORMID(session, idDNI, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioInactivo getUsuarioInactivoByORMID(String idDNI, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return getUsuarioInactivoByORMID(session, idDNI, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioInactivo loadUsuarioInactivoByORMID(PersistentSession session, String idDNI) throws PersistentException {
		try {
			return (UsuarioInactivo) session.load(basededatos.UsuarioInactivo.class, idDNI);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioInactivo getUsuarioInactivoByORMID(PersistentSession session, String idDNI) throws PersistentException {
		try {
			return (UsuarioInactivo) session.get(basededatos.UsuarioInactivo.class, idDNI);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioInactivo loadUsuarioInactivoByORMID(PersistentSession session, String idDNI, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UsuarioInactivo) session.load(basededatos.UsuarioInactivo.class, idDNI, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioInactivo getUsuarioInactivoByORMID(PersistentSession session, String idDNI, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UsuarioInactivo) session.get(basededatos.UsuarioInactivo.class, idDNI, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioInactivo(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return queryUsuarioInactivo(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioInactivo(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return queryUsuarioInactivo(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioInactivo[] listUsuarioInactivoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return listUsuarioInactivoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioInactivo[] listUsuarioInactivoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return listUsuarioInactivoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioInactivo(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioInactivo as UsuarioInactivo");
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
	
	public static List queryUsuarioInactivo(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioInactivo as UsuarioInactivo");
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
	
	public static UsuarioInactivo[] listUsuarioInactivoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuarioInactivo(session, condition, orderBy);
			return (UsuarioInactivo[]) list.toArray(new UsuarioInactivo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioInactivo[] listUsuarioInactivoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuarioInactivo(session, condition, orderBy, lockMode);
			return (UsuarioInactivo[]) list.toArray(new UsuarioInactivo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioInactivo loadUsuarioInactivoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadUsuarioInactivoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioInactivo loadUsuarioInactivoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadUsuarioInactivoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioInactivo loadUsuarioInactivoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		UsuarioInactivo[] usuarioInactivos = listUsuarioInactivoByQuery(session, condition, orderBy);
		if (usuarioInactivos != null && usuarioInactivos.length > 0)
			return usuarioInactivos[0];
		else
			return null;
	}
	
	public static UsuarioInactivo loadUsuarioInactivoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		UsuarioInactivo[] usuarioInactivos = listUsuarioInactivoByQuery(session, condition, orderBy, lockMode);
		if (usuarioInactivos != null && usuarioInactivos.length > 0)
			return usuarioInactivos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuarioInactivoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return iterateUsuarioInactivoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioInactivoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return iterateUsuarioInactivoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioInactivoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioInactivo as UsuarioInactivo");
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
	
	public static java.util.Iterator iterateUsuarioInactivoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioInactivo as UsuarioInactivo");
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
	
	public static UsuarioInactivo createUsuarioInactivo() {
		return new basededatos.UsuarioInactivo();
	}
	
	public static boolean save(basededatos.UsuarioInactivo usuarioInactivo) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().saveObject(usuarioInactivo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.UsuarioInactivo usuarioInactivo) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().deleteObject(usuarioInactivo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.UsuarioInactivo usuarioInactivo)throws PersistentException {
		try {
			basededatos.Chat[] lEscribes = usuarioInactivo.escribe.toArray();
			for(int i = 0; i < lEscribes.length; i++) {
				lEscribes[i].setEsUsadoPor(null);
			}
			basededatos.Fecha[] lFechass = usuarioInactivo.fechas.toArray();
			for(int i = 0; i < lFechass.length; i++) {
				lFechass[i].setUsuarioRegistrado(null);
			}
			basededatos.QuejaUsuario[] lReportas = usuarioInactivo.reporta.toArray();
			for(int i = 0; i < lReportas.length; i++) {
				lReportas[i].setSonReportadas(null);
			}
			basededatos.Juego[] lFavoritos = usuarioInactivo.favorito.toArray();
			for(int i = 0; i < lFavoritos.length; i++) {
				lFavoritos[i].favoritoDe.remove(usuarioInactivo);
			}
			return delete(usuarioInactivo);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.UsuarioInactivo usuarioInactivo, org.orm.PersistentSession session)throws PersistentException {
		try {
			basededatos.Chat[] lEscribes = usuarioInactivo.escribe.toArray();
			for(int i = 0; i < lEscribes.length; i++) {
				lEscribes[i].setEsUsadoPor(null);
			}
			basededatos.Fecha[] lFechass = usuarioInactivo.fechas.toArray();
			for(int i = 0; i < lFechass.length; i++) {
				lFechass[i].setUsuarioRegistrado(null);
			}
			basededatos.QuejaUsuario[] lReportas = usuarioInactivo.reporta.toArray();
			for(int i = 0; i < lReportas.length; i++) {
				lReportas[i].setSonReportadas(null);
			}
			basededatos.Juego[] lFavoritos = usuarioInactivo.favorito.toArray();
			for(int i = 0; i < lFavoritos.length; i++) {
				lFavoritos[i].favoritoDe.remove(usuarioInactivo);
			}
			try {
				session.delete(usuarioInactivo);
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
	
	public static boolean refresh(basededatos.UsuarioInactivo usuarioInactivo) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().refresh(usuarioInactivo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.UsuarioInactivo usuarioInactivo) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().evict(usuarioInactivo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioInactivo loadUsuarioInactivoByCriteria(UsuarioInactivoCriteria usuarioInactivoCriteria) {
		UsuarioInactivo[] usuarioInactivos = listUsuarioInactivoByCriteria(usuarioInactivoCriteria);
		if(usuarioInactivos == null || usuarioInactivos.length == 0) {
			return null;
		}
		return usuarioInactivos[0];
	}
	
	public static UsuarioInactivo[] listUsuarioInactivoByCriteria(UsuarioInactivoCriteria usuarioInactivoCriteria) {
		return usuarioInactivoCriteria.listUsuarioInactivo();
	}
}
