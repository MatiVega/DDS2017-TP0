package repositorios;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

import dominio.Asignacion;
import dominio.InformacionPersonal;

public class ClienteDeNotas
{
	private static Client cliente = new Client();
	private final static String URL_SERVIDOR = "http://notitas.herokuapp.com";
	private final static String RECURSO_DATOS_PERSONALES = "student";
	private final static String RECURSO_ASIGNACIONES = "student/assignments";
	public static String TOKEN;

	public static void crearCliente()
	{
		cliente = Client.create();
	}

	public static InformacionPersonal getInformacionPersonalEstudiante()
	{
		String json = cliente.resource(URL_SERVIDOR).path(RECURSO_DATOS_PERSONALES).header("Authorization", TOKEN)
				.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class).getEntity(String.class);
		
		return new Gson().fromJson(json, InformacionPersonal.class);
	}

	public static void setInformacionPersonalEstudiante(InformacionPersonal informacionPersonal)
	{	
		cliente.resource(URL_SERVIDOR).path(RECURSO_DATOS_PERSONALES).header("Authorization", TOKEN)
				.accept(MediaType.APPLICATION_JSON).put(ClientResponse.class, new Gson().toJson(informacionPersonal));
	}
	
	public static List<Asignacion> getAsignaciones()
	{
		String json =  cliente.resource(URL_SERVIDOR).path(RECURSO_ASIGNACIONES).header("Authorization", TOKEN)
				.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class).getEntity(String.class);

		return Arrays.asList(new Gson().fromJson(json.substring(15, json.length()-1), Asignacion[].class));
	}			
}