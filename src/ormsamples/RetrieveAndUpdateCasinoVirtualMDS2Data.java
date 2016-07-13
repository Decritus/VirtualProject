/**
 * Licensee: Daniel Landa
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateCasinoVirtualMDS2Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.DatosConfiguracion baseDeDatosDatosConfiguracion = basededatos.DatosConfiguracionDAO.loadDatosConfiguracionByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.DatosConfiguracionDAO.save(baseDeDatosDatosConfiguracion);
			basededatos.Fecha baseDeDatosFecha = basededatos.FechaDAO.loadFechaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.FechaDAO.save(baseDeDatosFecha);
			basededatos.Juego baseDeDatosJuego = basededatos.JuegoDAO.loadJuegoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.JuegoDAO.save(baseDeDatosJuego);
			basededatos.Publico baseDeDatosPublico = basededatos.PublicoDAO.loadPublicoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.PublicoDAO.save(baseDeDatosPublico);
			basededatos.Chat baseDeDatosChat = basededatos.ChatDAO.loadChatByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.ChatDAO.save(baseDeDatosChat);
			basededatos.PersonalAplicacion baseDeDatosPersonalAplicacion = basededatos.PersonalAplicacionDAO.loadPersonalAplicacionByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.PersonalAplicacionDAO.save(baseDeDatosPersonalAplicacion);
			basededatos.UsuariosNoRegistrados baseDeDatosUsuariosNoRegistrados = basededatos.UsuariosNoRegistradosDAO.loadUsuariosNoRegistradosByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.UsuariosNoRegistradosDAO.save(baseDeDatosUsuariosNoRegistrados);
			basededatos.Administrador baseDeDatosAdministrador = basededatos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.AdministradorDAO.save(baseDeDatosAdministrador);
			basededatos.PersonaDeAtencionAlUsuario baseDeDatosPersonaDeAtencionAlUsuario = basededatos.PersonaDeAtencionAlUsuarioDAO.loadPersonaDeAtencionAlUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.PersonaDeAtencionAlUsuarioDAO.save(baseDeDatosPersonaDeAtencionAlUsuario);
			basededatos.UsuarioRegistrado baseDeDatosUsuarioRegistrado = basededatos.UsuarioRegistradoDAO.loadUsuarioRegistradoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.UsuarioRegistradoDAO.save(baseDeDatosUsuarioRegistrado);
			basededatos.QuejaUsuario baseDeDatosQuejaUsuario = basededatos.QuejaUsuarioDAO.loadQuejaUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.QuejaUsuarioDAO.save(baseDeDatosQuejaUsuario);
			basededatos.UsuarioInhabilitado baseDeDatosUsuarioInhabilitado = basededatos.UsuarioInhabilitadoDAO.loadUsuarioInhabilitadoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.UsuarioInhabilitadoDAO.save(baseDeDatosUsuarioInhabilitado);
			basededatos.UsuarioActivado baseDeDatosUsuarioActivado = basededatos.UsuarioActivadoDAO.loadUsuarioActivadoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.UsuarioActivadoDAO.save(baseDeDatosUsuarioActivado);
			basededatos.UsuarioExpulsado baseDeDatosUsuarioExpulsado = basededatos.UsuarioExpulsadoDAO.loadUsuarioExpulsadoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.UsuarioExpulsadoDAO.save(baseDeDatosUsuarioExpulsado);
			basededatos.UsuarioInactivo baseDeDatosUsuarioInactivo = basededatos.UsuarioInactivoDAO.loadUsuarioInactivoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.UsuarioInactivoDAO.save(baseDeDatosUsuarioInactivo);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving DatosConfiguracion by DatosConfiguracionCriteria");
		basededatos.DatosConfiguracionCriteria baseDeDatosDatosConfiguracionCriteria = new basededatos.DatosConfiguracionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosDatosConfiguracionCriteria.idDatosConfiguracion.eq();
		System.out.println(baseDeDatosDatosConfiguracionCriteria.uniqueDatosConfiguracion());
		
		System.out.println("Retrieving Fecha by FechaCriteria");
		basededatos.FechaCriteria baseDeDatosFechaCriteria = new basededatos.FechaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosFechaCriteria.idFecha.eq();
		System.out.println(baseDeDatosFechaCriteria.uniqueFecha());
		
		System.out.println("Retrieving Juego by JuegoCriteria");
		basededatos.JuegoCriteria baseDeDatosJuegoCriteria = new basededatos.JuegoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosJuegoCriteria.idJuego.eq();
		System.out.println(baseDeDatosJuegoCriteria.uniqueJuego());
		
		System.out.println("Retrieving Publico by PublicoCriteria");
		basededatos.PublicoCriteria baseDeDatosPublicoCriteria = new basededatos.PublicoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosPublicoCriteria.idJuego.eq();
		System.out.println(baseDeDatosPublicoCriteria.uniquePublico());
		
		System.out.println("Retrieving Chat by ChatCriteria");
		basededatos.ChatCriteria baseDeDatosChatCriteria = new basededatos.ChatCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosChatCriteria.idMensaje.eq();
		System.out.println(baseDeDatosChatCriteria.uniqueChat());
		
		System.out.println("Retrieving PersonalAplicacion by PersonalAplicacionCriteria");
		basededatos.PersonalAplicacionCriteria baseDeDatosPersonalAplicacionCriteria = new basededatos.PersonalAplicacionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosPersonalAplicacionCriteria.idPersonal.eq();
		System.out.println(baseDeDatosPersonalAplicacionCriteria.uniquePersonalAplicacion());
		
		System.out.println("Retrieving UsuariosNoRegistrados by UsuariosNoRegistradosCriteria");
		basededatos.UsuariosNoRegistradosCriteria baseDeDatosUsuariosNoRegistradosCriteria = new basededatos.UsuariosNoRegistradosCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosUsuariosNoRegistradosCriteria.idIp.eq();
		System.out.println(baseDeDatosUsuariosNoRegistradosCriteria.uniqueUsuariosNoRegistrados());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		basededatos.AdministradorCriteria baseDeDatosAdministradorCriteria = new basededatos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosAdministradorCriteria.idPersonal.eq();
		System.out.println(baseDeDatosAdministradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving PersonaDeAtencionAlUsuario by PersonaDeAtencionAlUsuarioCriteria");
		basededatos.PersonaDeAtencionAlUsuarioCriteria baseDeDatosPersonaDeAtencionAlUsuarioCriteria = new basededatos.PersonaDeAtencionAlUsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosPersonaDeAtencionAlUsuarioCriteria.idPersonal.eq();
		System.out.println(baseDeDatosPersonaDeAtencionAlUsuarioCriteria.uniquePersonaDeAtencionAlUsuario());
		
		System.out.println("Retrieving UsuarioRegistrado by UsuarioRegistradoCriteria");
		basededatos.UsuarioRegistradoCriteria baseDeDatosUsuarioRegistradoCriteria = new basededatos.UsuarioRegistradoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosUsuarioRegistradoCriteria.idDNI.eq();
		System.out.println(baseDeDatosUsuarioRegistradoCriteria.uniqueUsuarioRegistrado());
		
		System.out.println("Retrieving QuejaUsuario by QuejaUsuarioCriteria");
		basededatos.QuejaUsuarioCriteria baseDeDatosQuejaUsuarioCriteria = new basededatos.QuejaUsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosQuejaUsuarioCriteria.idQueja.eq();
		System.out.println(baseDeDatosQuejaUsuarioCriteria.uniqueQuejaUsuario());
		
		System.out.println("Retrieving UsuarioInhabilitado by UsuarioInhabilitadoCriteria");
		basededatos.UsuarioInhabilitadoCriteria baseDeDatosUsuarioInhabilitadoCriteria = new basededatos.UsuarioInhabilitadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosUsuarioInhabilitadoCriteria.idDNI.eq();
		System.out.println(baseDeDatosUsuarioInhabilitadoCriteria.uniqueUsuarioInhabilitado());
		
		System.out.println("Retrieving UsuarioActivado by UsuarioActivadoCriteria");
		basededatos.UsuarioActivadoCriteria baseDeDatosUsuarioActivadoCriteria = new basededatos.UsuarioActivadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosUsuarioActivadoCriteria.idDNI.eq();
		System.out.println(baseDeDatosUsuarioActivadoCriteria.uniqueUsuarioActivado());
		
		System.out.println("Retrieving UsuarioExpulsado by UsuarioExpulsadoCriteria");
		basededatos.UsuarioExpulsadoCriteria baseDeDatosUsuarioExpulsadoCriteria = new basededatos.UsuarioExpulsadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosUsuarioExpulsadoCriteria.idDNI.eq();
		System.out.println(baseDeDatosUsuarioExpulsadoCriteria.uniqueUsuarioExpulsado());
		
		System.out.println("Retrieving UsuarioInactivo by UsuarioInactivoCriteria");
		basededatos.UsuarioInactivoCriteria baseDeDatosUsuarioInactivoCriteria = new basededatos.UsuarioInactivoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosUsuarioInactivoCriteria.idDNI.eq();
		System.out.println(baseDeDatosUsuarioInactivoCriteria.uniqueUsuarioInactivo());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateCasinoVirtualMDS2Data retrieveAndUpdateCasinoVirtualMDS2Data = new RetrieveAndUpdateCasinoVirtualMDS2Data();
			try {
				retrieveAndUpdateCasinoVirtualMDS2Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateCasinoVirtualMDS2Data.retrieveByCriteria();
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
