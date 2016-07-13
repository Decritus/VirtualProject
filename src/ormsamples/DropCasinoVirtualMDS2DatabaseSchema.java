/**
 * Licensee: Daniel Landa
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class DropCasinoVirtualMDS2DatabaseSchema {
	public static void main(String[] args) {
		try {
			System.out.println("Are you sure to drop table(s)? (Y/N)");
			java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
			if (reader.readLine().trim().toUpperCase().equals("Y")) {
				ORMDatabaseInitiator.dropSchema(basededatos.CasinoVirtualMDS2PersistentManager.instance());
				basededatos.CasinoVirtualMDS2PersistentManager.instance().disposePersistentManager();
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
