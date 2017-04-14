package dominio;

import com.google.gson.annotations.SerializedName;

import repositorios.ClienteDeNotas;

public class InformacionPersonal 
{
	@SerializedName ("code") 
	private int legajo;
	@SerializedName ("first_name") 
	private String nombre;
	@SerializedName ("last_name") 
	private String apellido;
	@SerializedName ("github_user") 
	private String usuarioGitHub;

	public int getLegajo()
	{
		return legajo;
	}

	public void setLegajo(int legajo)
	{
		this.legajo = legajo;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getApellido()
	{
		return apellido;
	}

	public void setApellido(String apellido)
	{
		this.apellido = apellido;
	}

	public String getUsuarioGitHub()
	{
		return usuarioGitHub;
	}

	public void setUsuarioGitHub(String usuarioGitHub)
	{
		this.usuarioGitHub = usuarioGitHub;
	}

	public void modificarInformacionPersonalEnServidor() 
	{
		ClienteDeNotas.setInformacionPersonalEstudiante(this);
	}
}