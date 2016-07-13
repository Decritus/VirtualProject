/**
 * Licensee: Daniel Landa
 * License Type: Purchased
 */
package ormsamples;

import java.sql.Date;

import org.orm.*;

import basededatos.Juego;
import basededatos.UsuarioRegistrado;
public class CreateCasinoVirtualMDS2Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = basededatos.CasinoVirtualMDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.DatosConfiguracion baseDeDatosDatosConfiguracion = basededatos.DatosConfiguracionDAO.createDatosConfiguracion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : partidasSimultaneas
			baseDeDatosDatosConfiguracion.setPartidasSimultaneas(50);
			basededatos.DatosConfiguracionDAO.save(baseDeDatosDatosConfiguracion);
			basededatos.DatosConfiguracion baseDeDatosDatosConfiguracion2 = basededatos.DatosConfiguracionDAO.createDatosConfiguracion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : partidasSimultaneas
			baseDeDatosDatosConfiguracion2.setPartidasSimultaneas(60);
			basededatos.DatosConfiguracionDAO.save(baseDeDatosDatosConfiguracion2);
			
			
			/*basededatos.Fecha baseDeDatosFecha = basededatos.FechaDAO.createFecha();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuarioRegistrado, juego
			UsuarioRegistrado user = new UsuarioRegistrado();
			user.setContrasena("Hola");
			user.setEmail("lala");
			user.setFoto("quegoto");
			user.setGanancias(12);
			user.setIdDNI("asdasd");
			user.setNombreUsuario("Prueba");
			user.setNumCuenta("1234");
			user.setPreguntaSecreta("Cualquier");
			user.setRespuestaSecreta("Ninguna");
			baseDeDatosFecha.setUsuarioRegistrado(user);
			Juego juego = new Juego();
			juego.setDesactivado(false);
			juego.setFechaAlta(new Date(2014,05,26));
			juego.setImagen("asjdkas");
			juego.setImporte(19);
			juego.setNombre("Hola que ase");
			juego.setUbicacion("Ninguna");
			baseDeDatosFecha.setJuego(juego);
			basededatos.FechaDAO.save(baseDeDatosFecha);
			basededatos.Juego baseDeDatosJuego = basededatos.JuegoDAO.createJuego();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : favoritoDe, fechas, desactivado, importe
			basededatos.JuegoDAO.save(baseDeDatosJuego);
			basededatos.Publico baseDeDatosPublico = basededatos.PublicoDAO.createPublico();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : esJugadoPorNoRegistrado
			basededatos.PublicoDAO.save(baseDeDatosPublico);
			basededatos.Chat baseDeDatosChat = basededatos.ChatDAO.createChat();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : esUsadoPor, sonRedactados, es_utilizado_por
			basededatos.ChatDAO.save(baseDeDatosChat);
			basededatos.PersonalAplicacion baseDeDatosPersonalAplicacion = basededatos.PersonalAplicacionDAO.createPersonalAplicacion();
			// Initialize the properties of the persistent object here
			basededatos.PersonalAplicacionDAO.save(baseDeDatosPersonalAplicacion);
			basededatos.UsuariosNoRegistrados baseDeDatosUsuariosNoRegistrados = basededatos.UsuariosNoRegistradosDAO.createUsuariosNoRegistrados();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : juegaAPublicos, horasJugadas, idIp
			basededatos.UsuariosNoRegistradosDAO.save(baseDeDatosUsuariosNoRegistrados);
			basededatos.Administrador baseDeDatosAdministrador = basededatos.AdministradorDAO.createAdministrador();
			// Initialize the properties of the persistent object here
			basededatos.AdministradorDAO.save(baseDeDatosAdministrador);
			basededatos.PersonaDeAtencionAlUsuario baseDeDatosPersonaDeAtencionAlUsuario = basededatos.PersonaDeAtencionAlUsuarioDAO.createPersonaDeAtencionAlUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : escribe_, redacta
			basededatos.PersonaDeAtencionAlUsuarioDAO.save(baseDeDatosPersonaDeAtencionAlUsuario);
			basededatos.UsuarioRegistrado baseDeDatosUsuarioRegistrado = basededatos.UsuarioRegistradoDAO.createUsuarioRegistrado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : favorito, reporta, fechas, escribe, ganancias, idDNI
			basededatos.UsuarioRegistradoDAO.save(baseDeDatosUsuarioRegistrado);
			basededatos.QuejaUsuario baseDeDatosQuejaUsuario = basededatos.QuejaUsuarioDAO.createQuejaUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : sonReportadas
			basededatos.QuejaUsuarioDAO.save(baseDeDatosQuejaUsuario);
			basededatos.UsuarioInhabilitado baseDeDatosUsuarioInhabilitado = basededatos.UsuarioInhabilitadoDAO.createUsuarioInhabilitado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tiempoInhabilitacion
			basededatos.UsuarioInhabilitadoDAO.save(baseDeDatosUsuarioInhabilitado);
			basededatos.UsuarioActivado baseDeDatosUsuarioActivado = basededatos.UsuarioActivadoDAO.createUsuarioActivado();
			// Initialize the properties of the persistent object here
			basededatos.UsuarioActivadoDAO.save(baseDeDatosUsuarioActivado);
			basededatos.UsuarioExpulsado baseDeDatosUsuarioExpulsado = basededatos.UsuarioExpulsadoDAO.createUsuarioExpulsado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : numExpulsiones, tiempoExpulsion
			basededatos.UsuarioExpulsadoDAO.save(baseDeDatosUsuarioExpulsado);
			basededatos.UsuarioInactivo baseDeDatosUsuarioInactivo = basededatos.UsuarioInactivoDAO.createUsuarioInactivo();
			// Initialize the properties of the persistent object here
			basededatos.UsuarioInactivoDAO.save(baseDeDatosUsuarioInactivo);
			*/t.commit();
		
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateCasinoVirtualMDS2Data createCasinoVirtualMDS2Data = new CreateCasinoVirtualMDS2Data();
			try {
				createCasinoVirtualMDS2Data.createTestData();
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
