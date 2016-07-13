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

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

/**
 * ORM-Component Class
 */
public class BDDatosConfiguracion {
	public BDDatosConfiguracion(){
		

	}
	/*public basededatos.BDDatosConfiguracion cargarNumeroPermitidas() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}*/
	public basededatos.DatosConfiguracion cargarNumeroPermitidas() {
		basededatos.DatosConfiguracion[] baseDeDatosDatosConfiguracions = null;
		try {
			baseDeDatosDatosConfiguracions = basededatos.DatosConfiguracionDAO.listDatosConfiguracionByQuery(null, null);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				basededatos.CasinoVirtualMDS2PersistentManager.instance().disposePersistentManager();
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return baseDeDatosDatosConfiguracions [0];
		
	}

	public basededatos.BDDatosConfiguracion cambiarNumeroPartidasSimultaneas(int partidasSimultaneas) throws PersistentException {
		PersistentTransaction t = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().beginTransaction();//TODO: Implement Method
		basededatos.DatosConfiguracion[] baseDeDatosDatosConfiguracions = basededatos.DatosConfiguracionDAO.listDatosConfiguracionByQuery(null, null);
		baseDeDatosDatosConfiguracions[0].setPartidasSimultaneas(partidasSimultaneas);
		basededatos.DatosConfiguracionDAO.save(baseDeDatosDatosConfiguracions[0]);
		t.commit();
		return null;
	}
	
	private basededatos.BDPrincipal esDe;
	public basededatos.BDPrincipal getEsDe()  {
		return this.esDe;
	}
	
	public void setEsDe(basededatos.BDPrincipal value)  {
		this.esDe = value;
	}
}
