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
public class Juego implements Serializable {
	public Juego() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatos.ORMConstants.KEY_JUEGO_FECHAS) {
			return ORM_fechas;
		}
		else if (key == basededatos.ORMConstants.KEY_JUEGO_FAVORITODE) {
			return ORM_favoritoDe;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idJuego;
	
	private String nombre;
	
	private String ubicacion;
	
	private String imagen;
	
	private int importe;
	
	private java.util.Date fechaAlta;
	
	private boolean desactivado;
	
	private java.util.Set ORM_fechas = new java.util.HashSet();
	
	private java.util.Set ORM_favoritoDe = new java.util.HashSet();
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setUbicacion(String value) {
		this.ubicacion = value;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	public void setImagen(String value) {
		this.imagen = value;
	}
	
	public String getImagen() {
		return imagen;
	}
	
	private void setIdJuego(int value) {
		this.idJuego = value;
	}
	
	public int getIdJuego() {
		return idJuego;
	}
	
	public int getORMID() {
		return getIdJuego();
	}
	
	public void setImporte(int value) {
		this.importe = value;
	}
	
	public int getImporte() {
		return importe;
	}
	
	public void setFechaAlta(java.util.Date value) {
		this.fechaAlta = value;
	}
	
	public java.util.Date getFechaAlta() {
		return fechaAlta;
	}
	
	public void setDesactivado(boolean value) {
		this.desactivado = value;
	}
	
	public boolean getDesactivado() {
		return desactivado;
	}
	
	public basededatos.UsuarioRegistrado[] getUsuarioRegistrados() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = fechas.getIterator();lIter.hasNext();) {
			lValues.add(((basededatos.Fecha)lIter.next()).getUsuarioRegistrado());
		}
		return (basededatos.UsuarioRegistrado[])lValues.toArray(new basededatos.UsuarioRegistrado[lValues.size()]);
	}
	
	public void removeUsuarioRegistrado(basededatos.UsuarioRegistrado aUsuarioRegistrado) {
		basededatos.Fecha[] lFechas = fechas.toArray();
		for(int i = 0; i < lFechas.length; i++) {
			if(lFechas[i].getUsuarioRegistrado().equals(aUsuarioRegistrado)) {
				fechas.remove(lFechas[i]);
			}
		}
	}
	
	public void addUsuarioRegistrado(basededatos.Fecha aFecha, basededatos.UsuarioRegistrado aUsuarioRegistrado) {
		aFecha.setUsuarioRegistrado(aUsuarioRegistrado);
		fechas.add(aFecha);
	}
	
	public basededatos.Fecha getFechaByUsuarioRegistrado(basededatos.UsuarioRegistrado aUsuarioRegistrado) {
		basededatos.Fecha[] lFechas = fechas.toArray();
		for(int i = 0; i < lFechas.length; i++) {
			if(lFechas[i].getUsuarioRegistrado().equals(aUsuarioRegistrado)) {
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
	
	public final basededatos.FechaSetCollection fechas = new basededatos.FechaSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_JUEGO_FECHAS, basededatos.ORMConstants.KEY_FECHA_JUEGO, basededatos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_FavoritoDe(java.util.Set value) {
		this.ORM_favoritoDe = value;
	}
	
	private java.util.Set getORM_FavoritoDe() {
		return ORM_favoritoDe;
	}
	
	public final basededatos.UsuarioRegistradoSetCollection favoritoDe = new basededatos.UsuarioRegistradoSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_JUEGO_FAVORITODE, basededatos.ORMConstants.KEY_USUARIOREGISTRADO_FAVORITO, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdJuego());
	}
	
	private basededatos.BDJuegos esDeJuego;
	
	public basededatos.BDJuegos getEsDeJuego()  {
		return this.esDeJuego;
	}
	
	public void setEsDeJuego(basededatos.BDJuegos value)  {
		this.esDeJuego = value;
	}
	
}
