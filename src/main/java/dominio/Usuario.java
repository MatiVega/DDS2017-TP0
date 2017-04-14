package dominio;

public class Usuario
{
	private String nombreUsuario;
	private String token;

	public Usuario(String nombreUsuario, String token) 
	{
		this.setNombreUsuario(nombreUsuario);
		this.setToken(token);
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
