/**
 * Licensee: Daniel Landa
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class ListCasinoVirtualMDS2Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing DatosConfiguracion...");
		basededatos.DatosConfiguracion[] baseDeDatosDatosConfiguracions = basededatos.DatosConfiguracionDAO.listDatosConfiguracionByQuery(null, null);
		int length = Math.min(baseDeDatosDatosConfiguracions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosDatosConfiguracions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Fecha...");
		basededatos.Fecha[] baseDeDatosFechas = basededatos.FechaDAO.listFechaByQuery(null, null);
		length = Math.min(baseDeDatosFechas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosFechas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Juego...");
		basededatos.Juego[] baseDeDatosJuegos = basededatos.JuegoDAO.listJuegoByQuery(null, null);
		length = Math.min(baseDeDatosJuegos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosJuegos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Publico...");
		basededatos.Publico[] baseDeDatosPublicos = basededatos.PublicoDAO.listPublicoByQuery(null, null);
		length = Math.min(baseDeDatosPublicos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosPublicos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Chat...");
		basededatos.Chat[] baseDeDatosChats = basededatos.ChatDAO.listChatByQuery(null, null);
		length = Math.min(baseDeDatosChats.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosChats[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PersonalAplicacion...");
		basededatos.PersonalAplicacion[] baseDeDatosPersonalAplicacions = basededatos.PersonalAplicacionDAO.listPersonalAplicacionByQuery(null, null);
		length = Math.min(baseDeDatosPersonalAplicacions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosPersonalAplicacions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing UsuariosNoRegistrados...");
		basededatos.UsuariosNoRegistrados[] baseDeDatosUsuariosNoRegistradoses = basededatos.UsuariosNoRegistradosDAO.listUsuariosNoRegistradosByQuery(null, null);
		length = Math.min(baseDeDatosUsuariosNoRegistradoses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosUsuariosNoRegistradoses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		basededatos.Administrador[] baseDeDatosAdministradors = basededatos.AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(baseDeDatosAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PersonaDeAtencionAlUsuario...");
		basededatos.PersonaDeAtencionAlUsuario[] baseDeDatosPersonaDeAtencionAlUsuarios = basededatos.PersonaDeAtencionAlUsuarioDAO.listPersonaDeAtencionAlUsuarioByQuery(null, null);
		length = Math.min(baseDeDatosPersonaDeAtencionAlUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosPersonaDeAtencionAlUsuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing UsuarioRegistrado...");
		basededatos.UsuarioRegistrado[] baseDeDatosUsuarioRegistrados = basededatos.UsuarioRegistradoDAO.listUsuarioRegistradoByQuery(null, null);
		length = Math.min(baseDeDatosUsuarioRegistrados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosUsuarioRegistrados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing QuejaUsuario...");
		basededatos.QuejaUsuario[] baseDeDatosQuejaUsuarios = basededatos.QuejaUsuarioDAO.listQuejaUsuarioByQuery(null, null);
		length = Math.min(baseDeDatosQuejaUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosQuejaUsuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing UsuarioInhabilitado...");
		basededatos.UsuarioInhabilitado[] baseDeDatosUsuarioInhabilitados = basededatos.UsuarioInhabilitadoDAO.listUsuarioInhabilitadoByQuery(null, null);
		length = Math.min(baseDeDatosUsuarioInhabilitados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosUsuarioInhabilitados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing UsuarioActivado...");
		basededatos.UsuarioActivado[] baseDeDatosUsuarioActivados = basededatos.UsuarioActivadoDAO.listUsuarioActivadoByQuery(null, null);
		length = Math.min(baseDeDatosUsuarioActivados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosUsuarioActivados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing UsuarioExpulsado...");
		basededatos.UsuarioExpulsado[] baseDeDatosUsuarioExpulsados = basededatos.UsuarioExpulsadoDAO.listUsuarioExpulsadoByQuery(null, null);
		length = Math.min(baseDeDatosUsuarioExpulsados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosUsuarioExpulsados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing UsuarioInactivo...");
		basededatos.UsuarioInactivo[] baseDeDatosUsuarioInactivos = basededatos.UsuarioInactivoDAO.listUsuarioInactivoByQuery(null, null);
		length = Math.min(baseDeDatosUsuarioInactivos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosUsuarioInactivos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException  {
		System.out.println("Listing DatosConfiguracion by Criteria...");
		basededatos.DatosConfiguracionCriteria baseDeDatosDatosConfiguracionCriteria = new basededatos.DatosConfiguracionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosDatosConfiguracionCriteria.idDatosConfiguracion.eq();
		baseDeDatosDatosConfiguracionCriteria.setMaxResults(ROW_COUNT);
		basededatos.DatosConfiguracion[] baseDeDatosDatosConfiguracions = baseDeDatosDatosConfiguracionCriteria.listDatosConfiguracion();
		int length =baseDeDatosDatosConfiguracions== null ? 0 : Math.min(baseDeDatosDatosConfiguracions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosDatosConfiguracions[i]);
		}
		System.out.println(length + " DatosConfiguracion record(s) retrieved."); 
		
		System.out.println("Listing Fecha by Criteria...");
		basededatos.FechaCriteria baseDeDatosFechaCriteria = new basededatos.FechaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosFechaCriteria.idFecha.eq();
		baseDeDatosFechaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Fecha[] baseDeDatosFechas = baseDeDatosFechaCriteria.listFecha();
		length =baseDeDatosFechas== null ? 0 : Math.min(baseDeDatosFechas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosFechas[i]);
		}
		System.out.println(length + " Fecha record(s) retrieved."); 
		
		System.out.println("Listing Juego by Criteria...");
		basededatos.JuegoCriteria baseDeDatosJuegoCriteria = new basededatos.JuegoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosJuegoCriteria.idJuego.eq();
		baseDeDatosJuegoCriteria.setMaxResults(ROW_COUNT);
		basededatos.Juego[] baseDeDatosJuegos = baseDeDatosJuegoCriteria.listJuego();
		length =baseDeDatosJuegos== null ? 0 : Math.min(baseDeDatosJuegos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosJuegos[i]);
		}
		System.out.println(length + " Juego record(s) retrieved."); 
		
		System.out.println("Listing Publico by Criteria...");
		basededatos.PublicoCriteria baseDeDatosPublicoCriteria = new basededatos.PublicoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosPublicoCriteria.idJuego.eq();
		baseDeDatosPublicoCriteria.setMaxResults(ROW_COUNT);
		basededatos.Publico[] baseDeDatosPublicos = baseDeDatosPublicoCriteria.listPublico();
		length =baseDeDatosPublicos== null ? 0 : Math.min(baseDeDatosPublicos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosPublicos[i]);
		}
		System.out.println(length + " Publico record(s) retrieved."); 
		
		System.out.println("Listing Chat by Criteria...");
		basededatos.ChatCriteria baseDeDatosChatCriteria = new basededatos.ChatCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosChatCriteria.idMensaje.eq();
		baseDeDatosChatCriteria.setMaxResults(ROW_COUNT);
		basededatos.Chat[] baseDeDatosChats = baseDeDatosChatCriteria.listChat();
		length =baseDeDatosChats== null ? 0 : Math.min(baseDeDatosChats.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosChats[i]);
		}
		System.out.println(length + " Chat record(s) retrieved."); 
		
		System.out.println("Listing PersonalAplicacion by Criteria...");
		basededatos.PersonalAplicacionCriteria baseDeDatosPersonalAplicacionCriteria = new basededatos.PersonalAplicacionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosPersonalAplicacionCriteria.idPersonal.eq();
		baseDeDatosPersonalAplicacionCriteria.setMaxResults(ROW_COUNT);
		basededatos.PersonalAplicacion[] baseDeDatosPersonalAplicacions = baseDeDatosPersonalAplicacionCriteria.listPersonalAplicacion();
		length =baseDeDatosPersonalAplicacions== null ? 0 : Math.min(baseDeDatosPersonalAplicacions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosPersonalAplicacions[i]);
		}
		System.out.println(length + " PersonalAplicacion record(s) retrieved."); 
		
		System.out.println("Listing UsuariosNoRegistrados by Criteria...");
		basededatos.UsuariosNoRegistradosCriteria baseDeDatosUsuariosNoRegistradosCriteria = new basededatos.UsuariosNoRegistradosCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosUsuariosNoRegistradosCriteria.idIp.eq();
		baseDeDatosUsuariosNoRegistradosCriteria.setMaxResults(ROW_COUNT);
		basededatos.UsuariosNoRegistrados[] baseDeDatosUsuariosNoRegistradoses = baseDeDatosUsuariosNoRegistradosCriteria.listUsuariosNoRegistrados();
		length =baseDeDatosUsuariosNoRegistradoses== null ? 0 : Math.min(baseDeDatosUsuariosNoRegistradoses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosUsuariosNoRegistradoses[i]);
		}
		System.out.println(length + " UsuariosNoRegistrados record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		basededatos.AdministradorCriteria baseDeDatosAdministradorCriteria = new basededatos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosAdministradorCriteria.idPersonal.eq();
		baseDeDatosAdministradorCriteria.setMaxResults(ROW_COUNT);
		basededatos.Administrador[] baseDeDatosAdministradors = baseDeDatosAdministradorCriteria.listAdministrador();
		length =baseDeDatosAdministradors== null ? 0 : Math.min(baseDeDatosAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
		System.out.println("Listing PersonaDeAtencionAlUsuario by Criteria...");
		basededatos.PersonaDeAtencionAlUsuarioCriteria baseDeDatosPersonaDeAtencionAlUsuarioCriteria = new basededatos.PersonaDeAtencionAlUsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosPersonaDeAtencionAlUsuarioCriteria.idPersonal.eq();
		baseDeDatosPersonaDeAtencionAlUsuarioCriteria.setMaxResults(ROW_COUNT);
		basededatos.PersonaDeAtencionAlUsuario[] baseDeDatosPersonaDeAtencionAlUsuarios = baseDeDatosPersonaDeAtencionAlUsuarioCriteria.listPersonaDeAtencionAlUsuario();
		length =baseDeDatosPersonaDeAtencionAlUsuarios== null ? 0 : Math.min(baseDeDatosPersonaDeAtencionAlUsuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosPersonaDeAtencionAlUsuarios[i]);
		}
		System.out.println(length + " PersonaDeAtencionAlUsuario record(s) retrieved."); 
		
		System.out.println("Listing UsuarioRegistrado by Criteria...");
		basededatos.UsuarioRegistradoCriteria baseDeDatosUsuarioRegistradoCriteria = new basededatos.UsuarioRegistradoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosUsuarioRegistradoCriteria.idDNI.eq();
		baseDeDatosUsuarioRegistradoCriteria.setMaxResults(ROW_COUNT);
		basededatos.UsuarioRegistrado[] baseDeDatosUsuarioRegistrados = baseDeDatosUsuarioRegistradoCriteria.listUsuarioRegistrado();
		length =baseDeDatosUsuarioRegistrados== null ? 0 : Math.min(baseDeDatosUsuarioRegistrados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosUsuarioRegistrados[i]);
		}
		System.out.println(length + " UsuarioRegistrado record(s) retrieved."); 
		
		System.out.println("Listing QuejaUsuario by Criteria...");
		basededatos.QuejaUsuarioCriteria baseDeDatosQuejaUsuarioCriteria = new basededatos.QuejaUsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosQuejaUsuarioCriteria.idQueja.eq();
		baseDeDatosQuejaUsuarioCriteria.setMaxResults(ROW_COUNT);
		basededatos.QuejaUsuario[] baseDeDatosQuejaUsuarios = baseDeDatosQuejaUsuarioCriteria.listQuejaUsuario();
		length =baseDeDatosQuejaUsuarios== null ? 0 : Math.min(baseDeDatosQuejaUsuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosQuejaUsuarios[i]);
		}
		System.out.println(length + " QuejaUsuario record(s) retrieved."); 
		
		System.out.println("Listing UsuarioInhabilitado by Criteria...");
		basededatos.UsuarioInhabilitadoCriteria baseDeDatosUsuarioInhabilitadoCriteria = new basededatos.UsuarioInhabilitadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosUsuarioInhabilitadoCriteria.idDNI.eq();
		baseDeDatosUsuarioInhabilitadoCriteria.setMaxResults(ROW_COUNT);
		basededatos.UsuarioInhabilitado[] baseDeDatosUsuarioInhabilitados = baseDeDatosUsuarioInhabilitadoCriteria.listUsuarioInhabilitado();
		length =baseDeDatosUsuarioInhabilitados== null ? 0 : Math.min(baseDeDatosUsuarioInhabilitados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosUsuarioInhabilitados[i]);
		}
		System.out.println(length + " UsuarioInhabilitado record(s) retrieved."); 
		
		System.out.println("Listing UsuarioActivado by Criteria...");
		basededatos.UsuarioActivadoCriteria baseDeDatosUsuarioActivadoCriteria = new basededatos.UsuarioActivadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosUsuarioActivadoCriteria.idDNI.eq();
		baseDeDatosUsuarioActivadoCriteria.setMaxResults(ROW_COUNT);
		basededatos.UsuarioActivado[] baseDeDatosUsuarioActivados = baseDeDatosUsuarioActivadoCriteria.listUsuarioActivado();
		length =baseDeDatosUsuarioActivados== null ? 0 : Math.min(baseDeDatosUsuarioActivados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosUsuarioActivados[i]);
		}
		System.out.println(length + " UsuarioActivado record(s) retrieved."); 
		
		System.out.println("Listing UsuarioExpulsado by Criteria...");
		basededatos.UsuarioExpulsadoCriteria baseDeDatosUsuarioExpulsadoCriteria = new basededatos.UsuarioExpulsadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosUsuarioExpulsadoCriteria.idDNI.eq();
		baseDeDatosUsuarioExpulsadoCriteria.setMaxResults(ROW_COUNT);
		basededatos.UsuarioExpulsado[] baseDeDatosUsuarioExpulsados = baseDeDatosUsuarioExpulsadoCriteria.listUsuarioExpulsado();
		length =baseDeDatosUsuarioExpulsados== null ? 0 : Math.min(baseDeDatosUsuarioExpulsados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosUsuarioExpulsados[i]);
		}
		System.out.println(length + " UsuarioExpulsado record(s) retrieved."); 
		
		System.out.println("Listing UsuarioInactivo by Criteria...");
		basededatos.UsuarioInactivoCriteria baseDeDatosUsuarioInactivoCriteria = new basededatos.UsuarioInactivoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosUsuarioInactivoCriteria.idDNI.eq();
		baseDeDatosUsuarioInactivoCriteria.setMaxResults(ROW_COUNT);
		basededatos.UsuarioInactivo[] baseDeDatosUsuarioInactivos = baseDeDatosUsuarioInactivoCriteria.listUsuarioInactivo();
		length =baseDeDatosUsuarioInactivos== null ? 0 : Math.min(baseDeDatosUsuarioInactivos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosUsuarioInactivos[i]);
		}
		System.out.println(length + " UsuarioInactivo record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListCasinoVirtualMDS2Data listCasinoVirtualMDS2Data = new ListCasinoVirtualMDS2Data();
			try {
				listCasinoVirtualMDS2Data.listTestData();
				//listCasinoVirtualMDS2Data.listByCriteria();
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
