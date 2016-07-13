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

import java.io.Serializable;
public class UsuarioRegistrado implements Serializable {
	public UsuarioRegistrado() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof UsuarioRegistrado))
			return false;
		UsuarioRegistrado usuarioregistrado = (UsuarioRegistrado)aObj;
		if ((getIdDNI() != null && !getIdDNI().equals(usuarioregistrado.getIdDNI())) || (getIdDNI() == null && usuarioregistrado.getIdDNI() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getIdDNI() == null ? 0 : getIdDNI().hashCode());
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatos.ORMConstants.KEY_USUARIOREGISTRADO_ESCRIBE) {
			return ORM_escribe;
		}
		else if (key == basededatos.ORMConstants.KEY_USUARIOREGISTRADO_FECHAS) {
			return ORM_fechas;
		}
		else if (key == basededatos.ORMConstants.KEY_USUARIOREGISTRADO_REPORTA) {
			return ORM_reporta;
		}
		else if (key == basededatos.ORMConstants.KEY_USUARIOREGISTRADO_FAVORITO) {
			return ORM_favorito;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private String idDNI;
	
	private String nombreUsuario;
	
	private String contrasena;
	
	private String preguntaSecreta;
	
	private String respuestaSecreta;
	
	private String email;
	
	private String numCuenta;
	
	private long ganancias;
	
	private String foto;
	
	private java.util.Set ORM_escribe = new java.util.HashSet();
	
	private java.util.Set ORM_fechas = new java.util.HashSet();
	
	private java.util.Set ORM_reporta = new java.util.HashSet();
	
	private java.util.Set ORM_favorito = new java.util.HashSet();
	
	public void setNombreUsuario(String value) {
		this.nombreUsuario = value;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public void setContrasena(String value) {
		this.contrasena = value;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	
	public void setPreguntaSecreta(String value) {
		this.preguntaSecreta = value;
	}
	
	public String getPreguntaSecreta() {
		return preguntaSecreta;
	}
	
	public void setRespuestaSecreta(String value) {
		this.respuestaSecreta = value;
	}
	
	public String getRespuestaSecreta() {
		return respuestaSecreta;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setIdDNI(String value) {
		this.idDNI = value;
	}
	
	public String getIdDNI() {
		return idDNI;
	}
	
	public String getORMID() {
		return getIdDNI();
	}
	
	public void setNumCuenta(String value) {
		this.numCuenta = value;
	}
	
	public String getNumCuenta() {
		return numCuenta;
	}
	
	public void setGanancias(long value) {
		this.ganancias = value;
	}
	
	public long getGanancias() {
		return ganancias;
	}
	
	public void setFoto(String value) {
		this.foto = value;
	}
	
	public String getFoto() {
		return foto;
	}
	
	private void setORM_Escribe(java.util.Set value) {
		this.ORM_escribe = value;
	}
	
	private java.util.Set getORM_Escribe() {
		return ORM_escribe;
	}
	
	public final basededatos.ChatSetCollection escribe = new basededatos.ChatSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_USUARIOREGISTRADO_ESCRIBE, basededatos.ORMConstants.KEY_CHAT_ESUSADOPOR, basededatos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public basededatos.Juego[] getJuegos() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = fechas.getIterator();lIter.hasNext();) {
			lValues.add(((basededatos.Fecha)lIter.next()).getJuego());
		}
		return (basededatos.Juego[])lValues.toArray(new basededatos.Juego[lValues.size()]);
	}
	
	public void removeJuego(basededatos.Juego aJuego) {
		basededatos.Fecha[] lFechas = fechas.toArray();
		for(int i = 0; i < lFechas.length; i++) {
			if(lFechas[i].getJuego().equals(aJuego)) {
				fechas.remove(lFechas[i]);
			}
		}
	}
	
	public void addJuego(basededatos.Fecha aFecha, basededatos.Juego aJuego) {
		aFecha.setJuego(aJuego);
		fechas.add(aFecha);
	}
	
	public basededatos.Fecha getFechaByJuego(basededatos.Juego aJuego) {
		basededatos.Fecha[] lFechas = fechas.toArray();
		for(int i = 0; i < lFechas.length; i++) {
			if(lFechas[i].getJuego().equals(aJuego)) {
				return lFechas[i];
			}
		}
		return null;
	}
	
	private void setORM_Fechas(java.util.Set value) {
		this.ORM_fechas = value;
	}
	
	private java.util.Set getORM_Fechas() {
		return ORM_fechas;
	}
	
	public final basededatos.FechaSetCollection fechas = new basededatos.FechaSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_USUARIOREGISTRADO_FECHAS, basededatos.ORMConstants.KEY_FECHA_USUARIOREGISTRADO, basededatos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Reporta(java.util.Set value) {
		this.ORM_reporta = value;
	}
	
	private java.util.Set getORM_Reporta() {
		return ORM_reporta;
	}
	
	public final basededatos.QuejaUsuarioSetCollection reporta = new basededatos.QuejaUsuarioSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_USUARIOREGISTRADO_REPORTA, basededatos.ORMConstants.KEY_QUEJAUSUARIO_SONREPORTADAS, basededatos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Favorito(java.util.Set value) {
		this.ORM_favorito = value;
	}
	
	private java.util.Set getORM_Favorito() {
		return ORM_favorito;
	}
	
	public final basededatos.JuegoSetCollection favorito = new basededatos.JuegoSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_USUARIOREGISTRADO_FAVORITO, basededatos.ORMConstants.KEY_JUEGO_FAVORITODE, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdDNI());
	}
	
}
