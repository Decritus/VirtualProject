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

public class UsuarioActivadoDAO {
	public static UsuarioActivado loadUsuarioActivadoByORMID(String idDNI) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadUsuarioActivadoByORMID(session, idDNI);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioActivado getUsuarioActivadoByORMID(String idDNI) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return getUsuarioActivadoByORMID(session, idDNI);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioActivado loadUsuarioActivadoByORMID(String idDNI, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadUsuarioActivadoByORMID(session, idDNI, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioActivado getUsuarioActivadoByORMID(String idDNI, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return getUsuarioActivadoByORMID(session, idDNI, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioActivado loadUsuarioActivadoByORMID(PersistentSession session, String idDNI) throws PersistentException {
		try {
			return (UsuarioActivado) session.load(basededatos.UsuarioActivado.class, idDNI);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioActivado getUsuarioActivadoByORMID(PersistentSession session, String idDNI) throws PersistentException {
		try {
			return (UsuarioActivado) session.get(basededatos.UsuarioActivado.class, idDNI);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioActivado loadUsuarioActivadoByORMID(PersistentSession session, String idDNI, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UsuarioActivado) session.load(basededatos.UsuarioActivado.class, idDNI, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioActivado getUsuarioActivadoByORMID(PersistentSession session, String idDNI, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UsuarioActivado) session.get(basededatos.UsuarioActivado.class, idDNI, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioActivado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return queryUsuarioActivado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioActivado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return queryUsuarioActivado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioActivado[] listUsuarioActivadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return listUsuarioActivadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioActivado[] listUsuarioActivadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return listUsuarioActivadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioActivado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioActivado as UsuarioActivado");
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
	
	public static List queryUsuarioActivado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioActivado as UsuarioActivado");
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
	
	public static UsuarioActivado[] listUsuarioActivadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuarioActivado(session, condition, orderBy);
			return (UsuarioActivado[]) list.toArray(new UsuarioActivado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioActivado[] listUsuarioActivadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuarioActivado(session, condition, orderBy, lockMode);
			return (UsuarioActivado[]) list.toArray(new UsuarioActivado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioActivado loadUsuarioActivadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadUsuarioActivadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioActivado loadUsuarioActivadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadUsuarioActivadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioActivado loadUsuarioActivadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		UsuarioActivado[] usuarioActivados = listUsuarioActivadoByQuery(session, condition, orderBy);
		if (usuarioActivados != null && usuarioActivados.length > 0)
			return usuarioActivados[0];
		else
			return null;
	}
	
	public static UsuarioActivado loadUsuarioActivadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		UsuarioActivado[] usuarioActivados = listUsuarioActivadoByQuery(session, condition, orderBy, lockMode);
		if (usuarioActivados != null && usuarioActivados.length > 0)
			return usuarioActivados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuarioActivadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return iterateUsuarioActivadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioActivadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return iterateUsuarioActivadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioActivadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioActivado as UsuarioActivado");
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
	
	public static java.util.Iterator iterateUsuarioActivadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioActivado as UsuarioActivado");
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
	
	public static UsuarioActivado createUsuarioActivado() {
		return new basededatos.UsuarioActivado();
	}
	
	public static boolean save(basededatos.UsuarioActivado usuarioActivado) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().saveObject(usuarioActivado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.UsuarioActivado usuarioActivado) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().deleteObject(usuarioActivado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.UsuarioActivado usuarioActivado)throws PersistentException {
		try {
			basededatos.Chat[] lEscribes = usuarioActivado.escribe.toArray();
			for(int i = 0; i < lEscribes.length; i++) {
				lEscribes[i].setEsUsadoPor(null);
			}
			basededatos.Fecha[] lFechass = usuarioActivado.fechas.toArray();
			for(int i = 0; i < lFechass.length; i++) {
				lFechass[i].setUsuarioRegistrado(null);
			}
			basededatos.QuejaUsuario[] lReportas = usuarioActivado.reporta.toArray();
			for(int i = 0; i < lReportas.length; i++) {
				lReportas[i].setSonReportadas(null);
			}
			basededatos.Juego[] lFavoritos = usuarioActivado.favorito.toArray();
			for(int i = 0; i < lFavoritos.length; i++) {
				lFavoritos[i].favoritoDe.remove(usuarioActivado);
			}
			return delete(usuarioActivado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.UsuarioActivado usuarioActivado, org.orm.PersistentSession session)throws PersistentException {
		try {
			basededatos.Chat[] lEscribes = usuarioActivado.escribe.toArray();
			for(int i = 0; i < lEscribes.length; i++) {
				lEscribes[i].setEsUsadoPor(null);
			}
			basededatos.Fecha[] lFechass = usuarioActivado.fechas.toArray();
			for(int i = 0; i < lFechass.length; i++) {
				lFechass[i].setUsuarioRegistrado(null);
			}
			basededatos.QuejaUsuario[] lReportas = usuarioActivado.reporta.toArray();
			for(int i = 0; i < lReportas.length; i++) {
				lReportas[i].setSonReportadas(null);
			}
			basededatos.Juego[] lFavoritos = usuarioActivado.favorito.toArray();
			for(int i = 0; i < lFavoritos.length; i++) {
				lFavoritos[i].favoritoDe.remove(usuarioActivado);
			}
			try {
				session.delete(usuarioActivado);
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
	
	public static boolean refresh(basededatos.UsuarioActivado usuarioActivado) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().refresh(usuarioActivado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.UsuarioActivado usuarioActivado) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().evict(usuarioActivado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioActivado loadUsuarioActivadoByCriteria(UsuarioActivadoCriteria usuarioActivadoCriteria) {
		UsuarioActivado[] usuarioActivados = listUsuarioActivadoByCriteria(usuarioActivadoCriteria);
		if(usuarioActivados == null || usuarioActivados.length == 0) {
			return null;
		}
		return usuarioActivados[0];
	}
	
	public static UsuarioActivado[] listUsuarioActivadoByCriteria(UsuarioActivadoCriteria usuarioActivadoCriteria) {
		return usuarioActivadoCriteria.listUsuarioActivado();
	}
}
