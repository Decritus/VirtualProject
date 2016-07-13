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

public class PublicoDAO {
	public static Publico loadPublicoByORMID(int idJuego) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadPublicoByORMID(session, idJuego);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publico getPublicoByORMID(int idJuego) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return getPublicoByORMID(session, idJuego);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publico loadPublicoByORMID(int idJuego, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadPublicoByORMID(session, idJuego, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publico getPublicoByORMID(int idJuego, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return getPublicoByORMID(session, idJuego, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publico loadPublicoByORMID(PersistentSession session, int idJuego) throws PersistentException {
		try {
			return (Publico) session.load(basededatos.Publico.class, new Integer(idJuego));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publico getPublicoByORMID(PersistentSession session, int idJuego) throws PersistentException {
		try {
			return (Publico) session.get(basededatos.Publico.class, new Integer(idJuego));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publico loadPublicoByORMID(PersistentSession session, int idJuego, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Publico) session.load(basededatos.Publico.class, new Integer(idJuego), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publico getPublicoByORMID(PersistentSession session, int idJuego, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Publico) session.get(basededatos.Publico.class, new Integer(idJuego), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPublico(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return queryPublico(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPublico(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return queryPublico(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publico[] listPublicoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return listPublicoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publico[] listPublicoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return listPublicoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPublico(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Publico as Publico");
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
	
	public static List queryPublico(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Publico as Publico");
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
	
	public static Publico[] listPublicoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPublico(session, condition, orderBy);
			return (Publico[]) list.toArray(new Publico[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publico[] listPublicoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPublico(session, condition, orderBy, lockMode);
			return (Publico[]) list.toArray(new Publico[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publico loadPublicoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadPublicoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publico loadPublicoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return loadPublicoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publico loadPublicoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Publico[] publicos = listPublicoByQuery(session, condition, orderBy);
		if (publicos != null && publicos.length > 0)
			return publicos[0];
		else
			return null;
	}
	
	public static Publico loadPublicoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Publico[] publicos = listPublicoByQuery(session, condition, orderBy, lockMode);
		if (publicos != null && publicos.length > 0)
			return publicos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePublicoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return iteratePublicoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePublicoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession();
			return iteratePublicoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePublicoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Publico as Publico");
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
	
	public static java.util.Iterator iteratePublicoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Publico as Publico");
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
	
	public static Publico createPublico() {
		return new basededatos.Publico();
	}
	
	public static boolean save(basededatos.Publico publico) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().saveObject(publico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Publico publico) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().deleteObject(publico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Publico publico)throws PersistentException {
		try {
			basededatos.UsuariosNoRegistrados[] lEsJugadoPorNoRegistrados = publico.esJugadoPorNoRegistrado.toArray();
			for(int i = 0; i < lEsJugadoPorNoRegistrados.length; i++) {
				lEsJugadoPorNoRegistrados[i].juegaAPublicos.remove(publico);
			}
			basededatos.Fecha[] lFechass = publico.fechas.toArray();
			for(int i = 0; i < lFechass.length; i++) {
				lFechass[i].setJuego(null);
			}
			basededatos.UsuarioRegistrado[] lFavoritoDes = publico.favoritoDe.toArray();
			for(int i = 0; i < lFavoritoDes.length; i++) {
				lFavoritoDes[i].favorito.remove(publico);
			}
			return delete(publico);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Publico publico, org.orm.PersistentSession session)throws PersistentException {
		try {
			basededatos.UsuariosNoRegistrados[] lEsJugadoPorNoRegistrados = publico.esJugadoPorNoRegistrado.toArray();
			for(int i = 0; i < lEsJugadoPorNoRegistrados.length; i++) {
				lEsJugadoPorNoRegistrados[i].juegaAPublicos.remove(publico);
			}
			basededatos.Fecha[] lFechass = publico.fechas.toArray();
			for(int i = 0; i < lFechass.length; i++) {
				lFechass[i].setJuego(null);
			}
			basededatos.UsuarioRegistrado[] lFavoritoDes = publico.favoritoDe.toArray();
			for(int i = 0; i < lFavoritoDes.length; i++) {
				lFavoritoDes[i].favorito.remove(publico);
			}
			try {
				session.delete(publico);
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
	
	public static boolean refresh(basededatos.Publico publico) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().refresh(publico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Publico publico) throws PersistentException {
		try {
			basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().evict(publico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publico loadPublicoByCriteria(PublicoCriteria publicoCriteria) {
		Publico[] publicos = listPublicoByCriteria(publicoCriteria);
		if(publicos == null || publicos.length == 0) {
			return null;
		}
		return publicos[0];
	}
	
	public static Publico[] listPublicoByCriteria(PublicoCriteria publicoCriteria) {
		return publicoCriteria.listPublico();
	}
}
