package dominio;

import java.util.List;

import org.uqbar.commons.utils.Observable;

import repositorios.ClienteDeNotas;

@Observable
public class Estudiante
{
	private InformacionPersonal informacionPersonal = new InformacionPersonal();
	private List<Asignacion> asignaciones;
	private Asignacion asignacionSeleccionada;

	public Estudiante()
	{
		this.setInformacionPersonal(ClienteDeNotas.getInformacionPersonalEstudiante());
		this.setAsignaciones(ClienteDeNotas.getAsignaciones());
	}
	public int getLegajo()
	{
		return informacionPersonal.getLegajo();
	}

	public void setLegajo(int legajo)
	{
		this.informacionPersonal.setLegajo(legajo);
	}

	public String getNombre()
	{
		return informacionPersonal.getNombre();
	}

	public void setNombre(String nombre)
	{
		this.informacionPersonal.setNombre(nombre);
	}

	public String getApellido()
	{
		return informacionPersonal.getApellido();
	}

	public void setApellido(String apellido)
	{
		this.informacionPersonal.setApellido(apellido);
	}

	public String getUsuarioGitHub()
	{
		return informacionPersonal.getUsuarioGitHub();
	}

	public void setUsuarioGitHub(String usuarioGitHub)
	{
		this.informacionPersonal.setUsuarioGitHub(usuarioGitHub);
	}
	
	public InformacionPersonal getInformacionPersonal() 
	{
		return informacionPersonal;
	}

	public void setInformacionPersonal(InformacionPersonal datos)
	{
		this.informacionPersonal = datos;
	}
	public List<Asignacion> getAsignaciones()
	{
		return asignaciones;
	}
	
	public void setAsignaciones(List<Asignacion> asignaciones)
	{
		this.asignaciones = asignaciones;
	}

	public Asignacion getAsignacionSeleccionada() {
		return asignacionSeleccionada;
	}

	public void setAsignacionSeleccionada(Asignacion asignacionSeleccionada) {
		this.asignacionSeleccionada = asignacionSeleccionada;
	}
}
