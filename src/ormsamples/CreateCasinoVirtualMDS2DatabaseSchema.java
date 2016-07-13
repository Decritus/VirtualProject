/**
 * Licensee: Daniel Landa
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreateCasinoVirtualMDS2DatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(basededatos.CasinoVirtualMDS2PersistentManager.instance());
			basededatos.CasinoVirtualMDS2PersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
