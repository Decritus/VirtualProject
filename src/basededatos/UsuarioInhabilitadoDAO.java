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

public class UsuarioInhabilitadoDAO {
	public static UsuarioInhabilitado loadUsuarioInhabilitadoByORMID(String idDNI) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadUsuarioInhabilitadoByORMID(session, idDNI);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioInhabilitado getUsuarioInhabilitadoByORMID(String idDNI) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return getUsuarioInhabilitadoByORMID(session, idDNI);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioInhabilitado loadUsuarioInhabilitadoByORMID(String idDNI, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadUsuarioInhabilitadoByORMID(session, idDNI, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioInhabilitado getUsuarioInhabilitadoByORMID(String idDNI, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return getUsuarioInhabilitadoByORMID(session, idDNI, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioInhabilitado loadUsuarioInhabilitadoByORMID(PersistentSession session, String idDNI) throws PersistentException {
		try {
			return (UsuarioInhabilitado) session.load(basededatos.UsuarioInhabilitado.class, idDNI);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioInhabilitado getUsuarioInhabilitadoByORMID(PersistentSession session, String idDNI) throws PersistentException {
		try {
			return (UsuarioInhabilitado) session.get(basededatos.UsuarioInhabilitado.class, idDNI);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioInhabilitado loadUsuarioInhabilitadoByORMID(PersistentSession session, String idDNI, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UsuarioInhabilitado) session.load(basededatos.UsuarioInhabilitado.class, idDNI, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioInhabilitado getUsuarioInhabilitadoByORMID(PersistentSession session, String idDNI, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UsuarioInhabilitado) session.get(basededatos.UsuarioInhabilitado.class, idDNI, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioInhabilitado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return queryUsuarioInhabilitado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioInhabilitado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return queryUsuarioInhabilitado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioInhabilitado[] listUsuarioInhabilitadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return listUsuarioInhabilitadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioInhabilitado[] listUsuarioInhabilitadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return listUsuarioInhabilitadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioInhabilitado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioInhabilitado as UsuarioInhabilitado");
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
	
	public static List queryUsuarioInhabilitado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioInhabilitado as UsuarioInhabilitado");
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
	
	public static UsuarioInhabilitado[] listUsuarioInhabilitadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuarioInhabilitado(session, condition, orderBy);
			return (UsuarioInhabilitado[]) list.toArray(new UsuarioInhabilitado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioInhabilitado[] listUsuarioInhabilitadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuarioInhabilitado(session, condition, orderBy, lockMode);
			return (UsuarioInhabilitado[]) list.toArray(new UsuarioInhabilitado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioInhabilitado loadUsuarioInhabilitadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadUsuarioInhabilitadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioInhabilitado loadUsuarioInhabilitadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadUsuarioInhabilitadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioInhabilitado loadUsuarioInhabilitadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		UsuarioInhabilitado[] usuarioInhabilitados = listUsuarioInhabilitadoByQuery(session, condition, orderBy);
		if (usuarioInhabilitados != null && usuarioInhabilitados.length > 0)
			return usuarioInhabilitados[0];
		else
			return null;
	}
	
	public static UsuarioInhabilitado loadUsuarioInhabilitadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		UsuarioInhabilitado[] usuarioInhabilitados = listUsuarioInhabilitadoByQuery(session, condition, orderBy, lockMode);
		if (usuarioInhabilitados != null && usuarioInhabilitados.length > 0)
			return usuarioInhabilitados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuarioInhabilitadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return iterateUsuarioInhabilitadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioInhabilitadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return iterateUsuarioInhabilitadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioInhabilitadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioInhabilitado as UsuarioInhabilitado");
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
	
	public static java.util.Iterator iterateUsuarioInhabilitadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioInhabilitado as UsuarioInhabilitado");
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
	
	public static UsuarioInhabilitado createUsuarioInhabilitado() {
		return new basededatos.UsuarioInhabilitado();
	}
	
	public static boolean save(basededatos.UsuarioInhabilitado usuarioInhabilitado) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().saveObject(usuarioInhabilitado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.UsuarioInhabilitado usuarioInhabilitado) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().deleteObject(usuarioInhabilitado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.UsuarioInhabilitado usuarioInhabilitado)throws PersistentException {
		try {
			basededatos.Chat[] lEscribes = usuarioInhabilitado.escribe.toArray();
			for(int i = 0; i < lEscribes.length; i++) {
				lEscribes[i].setEsUsadoPor(null);
			}
			basededatos.Fecha[] lFechass = usuarioInhabilitado.fechas.toArray();
			for(int i = 0; i < lFechass.length; i++) {
				lFechass[i].setUsuarioRegistrado(null);
			}
			basededatos.QuejaUsuario[] lReportas = usuarioInhabilitado.reporta.toArray();
			for(int i = 0; i < lReportas.length; i++) {
				lReportas[i].setSonReportadas(null);
			}
			basededatos.Juego[] lFavoritos = usuarioInhabilitado.favorito.toArray();
			for(int i = 0; i < lFavoritos.length; i++) {
				lFavoritos[i].favoritoDe.remove(usuarioInhabilitado);
			}
			return delete(usuarioInhabilitado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.UsuarioInhabilitado usuarioInhabilitado, org.orm.PersistentSession session)throws PersistentException {
		try {
			basededatos.Chat[] lEscribes = usuarioInhabilitado.escribe.toArray();
			for(int i = 0; i < lEscribes.length; i++) {
				lEscribes[i].setEsUsadoPor(null);
			}
			basededatos.Fecha[] lFechass = usuarioInhabilitado.fechas.toArray();
			for(int i = 0; i < lFechass.length; i++) {
				lFechass[i].setUsuarioRegistrado(null);
			}
			basededatos.QuejaUsuario[] lReportas = usuarioInhabilitado.reporta.toArray();
			for(int i = 0; i < lReportas.length; i++) {
				lReportas[i].setSonReportadas(null);
			}
			basededatos.Juego[] lFavoritos = usuarioInhabilitado.favorito.toArray();
			for(int i = 0; i < lFavoritos.length; i++) {
				lFavoritos[i].favoritoDe.remove(usuarioInhabilitado);
			}
			try {
				session.delete(usuarioInhabilitado);
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
	
	public static boolean refresh(basededatos.UsuarioInhabilitado usuarioInhabilitado) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().refresh(usuarioInhabilitado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.UsuarioInhabilitado usuarioInhabilitado) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().evict(usuarioInhabilitado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioInhabilitado loadUsuarioInhabilitadoByCriteria(UsuarioInhabilitadoCriteria usuarioInhabilitadoCriteria) {
		UsuarioInhabilitado[] usuarioInhabilitados = listUsuarioInhabilitadoByCriteria(usuarioInhabilitadoCriteria);
		if(usuarioInhabilitados == null || usuarioInhabilitados.length == 0) {
			return null;
		}
		return usuarioInhabilitados[0];
	}
	
	public static UsuarioInhabilitado[] listUsuarioInhabilitadoByCriteria(UsuarioInhabilitadoCriteria usuarioInhabilitadoCriteria) {
		return usuarioInhabilitadoCriteria.listUsuarioInhabilitado();
	}
}
