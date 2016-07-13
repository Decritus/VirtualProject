/**
 * Licensee: Daniel Landa
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class DeleteCasinoVirtualMDS2Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.DatosConfiguracion baseDeDatosDatosConfiguracion = basededatos.DatosConfiguracionDAO.loadDatosConfiguracionByQuery(null, null);
			// Delete the persistent object
			basededatos.DatosConfiguracionDAO.delete(baseDeDatosDatosConfiguracion);
			basededatos.Fecha baseDeDatosFecha = basededatos.FechaDAO.loadFechaByQuery(null, null);
			// Delete the persistent object
			basededatos.FechaDAO.delete(baseDeDatosFecha);
			basededatos.Juego baseDeDatosJuego = basededatos.JuegoDAO.loadJuegoByQuery(null, null);
			// Delete the persistent object
			basededatos.JuegoDAO.delete(baseDeDatosJuego);
			basededatos.Publico baseDeDatosPublico = basededatos.PublicoDAO.loadPublicoByQuery(null, null);
			// Delete the persistent object
			basededatos.PublicoDAO.delete(baseDeDatosPublico);
			basededatos.Chat baseDeDatosChat = basededatos.ChatDAO.loadChatByQuery(null, null);
			// Delete the persistent object
			basededatos.ChatDAO.delete(baseDeDatosChat);
			basededatos.PersonalAplicacion baseDeDatosPersonalAplicacion = basededatos.PersonalAplicacionDAO.loadPersonalAplicacionByQuery(null, null);
			// Delete the persistent object
			basededatos.PersonalAplicacionDAO.delete(baseDeDatosPersonalAplicacion);
			basededatos.UsuariosNoRegistrados baseDeDatosUsuariosNoRegistrados = basededatos.UsuariosNoRegistradosDAO.loadUsuariosNoRegistradosByQuery(null, null);
			// Delete the persistent object
			basededatos.UsuariosNoRegistradosDAO.delete(baseDeDatosUsuariosNoRegistrados);
			basededatos.Administrador baseDeDatosAdministrador = basededatos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			basededatos.AdministradorDAO.delete(baseDeDatosAdministrador);
			basededatos.PersonaDeAtencionAlUsuario baseDeDatosPersonaDeAtencionAlUsuario = basededatos.PersonaDeAtencionAlUsuarioDAO.loadPersonaDeAtencionAlUsuarioByQuery(null, null);
			// Delete the persistent object
			basededatos.PersonaDeAtencionAlUsuarioDAO.delete(baseDeDatosPersonaDeAtencionAlUsuario);
			basededatos.UsuarioRegistrado baseDeDatosUsuarioRegistrado = basededatos.UsuarioRegistradoDAO.loadUsuarioRegistradoByQuery(null, null);
			// Delete the persistent object
			basededatos.UsuarioRegistradoDAO.delete(baseDeDatosUsuarioRegistrado);
			basededatos.QuejaUsuario baseDeDatosQuejaUsuario = basededatos.QuejaUsuarioDAO.loadQuejaUsuarioByQuery(null, null);
			// Delete the persistent object
			basededatos.QuejaUsuarioDAO.delete(baseDeDatosQuejaUsuario);
			basededatos.UsuarioInhabilitado baseDeDatosUsuarioInhabilitado = basededatos.UsuarioInhabilitadoDAO.loadUsuarioInhabilitadoByQuery(null, null);
			// Delete the persistent object
			basededatos.UsuarioInhabilitadoDAO.delete(baseDeDatosUsuarioInhabilitado);
			basededatos.UsuarioActivado baseDeDatosUsuarioActivado = basededatos.UsuarioActivadoDAO.loadUsuarioActivadoByQuery(null, null);
			// Delete the persistent object
			basededatos.UsuarioActivadoDAO.delete(baseDeDatosUsuarioActivado);
			basededatos.UsuarioExpulsado baseDeDatosUsuarioExpulsado = basededatos.UsuarioExpulsadoDAO.loadUsuarioExpulsadoByQuery(null, null);
			// Delete the persistent object
			basededatos.UsuarioExpulsadoDAO.delete(baseDeDatosUsuarioExpulsado);
			basededatos.UsuarioInactivo baseDeDatosUsuarioInactivo = basededatos.UsuarioInactivoDAO.loadUsuarioInactivoByQuery(null, null);
			// Delete the persistent object
			basededatos.UsuarioInactivoDAO.delete(baseDeDatosUsuarioInactivo);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteCasinoVirtualMDS2Data deleteCasinoVirtualMDS2Data = new DeleteCasinoVirtualMDS2Data();
			try {
				deleteCasinoVirtualMDS2Data.deleteTestData();
			}
			finally {
				basededatos.CasinoVirtualMDS2PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
