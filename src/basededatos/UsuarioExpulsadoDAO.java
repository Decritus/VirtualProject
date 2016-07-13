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

public class UsuarioExpulsadoDAO {
	public static UsuarioExpulsado loadUsuarioExpulsadoByORMID(String idDNI) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadUsuarioExpulsadoByORMID(session, idDNI);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioExpulsado getUsuarioExpulsadoByORMID(String idDNI) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return getUsuarioExpulsadoByORMID(session, idDNI);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioExpulsado loadUsuarioExpulsadoByORMID(String idDNI, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadUsuarioExpulsadoByORMID(session, idDNI, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioExpulsado getUsuarioExpulsadoByORMID(String idDNI, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return getUsuarioExpulsadoByORMID(session, idDNI, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioExpulsado loadUsuarioExpulsadoByORMID(PersistentSession session, String idDNI) throws PersistentException {
		try {
			return (UsuarioExpulsado) session.load(basededatos.UsuarioExpulsado.class, idDNI);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioExpulsado getUsuarioExpulsadoByORMID(PersistentSession session, String idDNI) throws PersistentException {
		try {
			return (UsuarioExpulsado) session.get(basededatos.UsuarioExpulsado.class, idDNI);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioExpulsado loadUsuarioExpulsadoByORMID(PersistentSession session, String idDNI, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UsuarioExpulsado) session.load(basededatos.UsuarioExpulsado.class, idDNI, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioExpulsado getUsuarioExpulsadoByORMID(PersistentSession session, String idDNI, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UsuarioExpulsado) session.get(basededatos.UsuarioExpulsado.class, idDNI, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioExpulsado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return queryUsuarioExpulsado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioExpulsado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return queryUsuarioExpulsado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioExpulsado[] listUsuarioExpulsadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return listUsuarioExpulsadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioExpulsado[] listUsuarioExpulsadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return listUsuarioExpulsadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioExpulsado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioExpulsado as UsuarioExpulsado");
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
	
	public static List queryUsuarioExpulsado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioExpulsado as UsuarioExpulsado");
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
	
	public static UsuarioExpulsado[] listUsuarioExpulsadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuarioExpulsado(session, condition, orderBy);
			return (UsuarioExpulsado[]) list.toArray(new UsuarioExpulsado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioExpulsado[] listUsuarioExpulsadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuarioExpulsado(session, condition, orderBy, lockMode);
			return (UsuarioExpulsado[]) list.toArray(new UsuarioExpulsado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioExpulsado loadUsuarioExpulsadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadUsuarioExpulsadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioExpulsado loadUsuarioExpulsadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadUsuarioExpulsadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioExpulsado loadUsuarioExpulsadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		UsuarioExpulsado[] usuarioExpulsados = listUsuarioExpulsadoByQuery(session, condition, orderBy);
		if (usuarioExpulsados != null && usuarioExpulsados.length > 0)
			return usuarioExpulsados[0];
		else
			return null;
	}
	
	public static UsuarioExpulsado loadUsuarioExpulsadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		UsuarioExpulsado[] usuarioExpulsados = listUsuarioExpulsadoByQuery(session, condition, orderBy, lockMode);
		if (usuarioExpulsados != null && usuarioExpulsados.length > 0)
			return usuarioExpulsados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuarioExpulsadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return iterateUsuarioExpulsadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioExpulsadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return iterateUsuarioExpulsadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioExpulsadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioExpulsado as UsuarioExpulsado");
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
	
	public static java.util.Iterator iterateUsuarioExpulsadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioExpulsado as UsuarioExpulsado");
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
	
	public static UsuarioExpulsado createUsuarioExpulsado() {
		return new basededatos.UsuarioExpulsado();
	}
	
	public static boolean save(basededatos.UsuarioExpulsado usuarioExpulsado) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().saveObject(usuarioExpulsado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.UsuarioExpulsado usuarioExpulsado) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().deleteObject(usuarioExpulsado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.UsuarioExpulsado usuarioExpulsado)throws PersistentException {
		try {
			basededatos.Chat[] lEscribes = usuarioExpulsado.escribe.toArray();
			for(int i = 0; i < lEscribes.length; i++) {
				lEscribes[i].setEsUsadoPor(null);
			}
			basededatos.Fecha[] lFechass = usuarioExpulsado.fechas.toArray();
			for(int i = 0; i < lFechass.length; i++) {
				lFechass[i].setUsuarioRegistrado(null);
			}
			basededatos.QuejaUsuario[] lReportas = usuarioExpulsado.reporta.toArray();
			for(int i = 0; i < lReportas.length; i++) {
				lReportas[i].setSonReportadas(null);
			}
			basededatos.Juego[] lFavoritos = usuarioExpulsado.favorito.toArray();
			for(int i = 0; i < lFavoritos.length; i++) {
				lFavoritos[i].favoritoDe.remove(usuarioExpulsado);
			}
			return delete(usuarioExpulsado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.UsuarioExpulsado usuarioExpulsado, org.orm.PersistentSession session)throws PersistentException {
		try {
			basededatos.Chat[] lEscribes = usuarioExpulsado.escribe.toArray();
			for(int i = 0; i < lEscribes.length; i++) {
				lEscribes[i].setEsUsadoPor(null);
			}
			basededatos.Fecha[] lFechass = usuarioExpulsado.fechas.toArray();
			for(int i = 0; i < lFechass.length; i++) {
				lFechass[i].setUsuarioRegistrado(null);
			}
			basededatos.QuejaUsuario[] lReportas = usuarioExpulsado.reporta.toArray();
			for(int i = 0; i < lReportas.length; i++) {
				lReportas[i].setSonReportadas(null);
			}
			basededatos.Juego[] lFavoritos = usuarioExpulsado.favorito.toArray();
			for(int i = 0; i < lFavoritos.length; i++) {
				lFavoritos[i].favoritoDe.remove(usuarioExpulsado);
			}
			try {
				session.delete(usuarioExpulsado);
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
	
	public static boolean refresh(basededatos.UsuarioExpulsado usuarioExpulsado) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().refresh(usuarioExpulsado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.UsuarioExpulsado usuarioExpulsado) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().evict(usuarioExpulsado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioExpulsado loadUsuarioExpulsadoByCriteria(UsuarioExpulsadoCriteria usuarioExpulsadoCriteria) {
		UsuarioExpulsado[] usuarioExpulsados = listUsuarioExpulsadoByCriteria(usuarioExpulsadoCriteria);
		if(usuarioExpulsados == null || usuarioExpulsados.length == 0) {
			return null;
		}
		return usuarioExpulsados[0];
	}
	
	public static UsuarioExpulsado[] listUsuarioExpulsadoByCriteria(UsuarioExpulsadoCriteria usuarioExpulsadoCriteria) {
		return usuarioExpulsadoCriteria.listUsuarioExpulsado();
	}
}
