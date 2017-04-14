package vm;

import org.uqbar.commons.model.UserException;
import org.uqbar.commons.utils.Observable;

import repositorios.ClienteDeNotas;
import repositorios.RepositorioUsuarios;

@Observable
public class MenuViewModel 
{
	private String nombreUsuarioBuscado;

	public String getNombreUsuarioBuscado() {
		return nombreUsuarioBuscado;
	}
	
	public void setNombreUsuarioBuscado(String nombreUsuarioBuscado) {
		this.nombreUsuarioBuscado = nombreUsuarioBuscado;
	}
	
	public void asignarTokenSiEsUsuarioValido()
	{
		if (RepositorioUsuarios.existeUsuarioDeNombre(nombreUsuarioBuscado))
		{
			ClienteDeNotas.TOKEN = RepositorioUsuarios.getUsuarioDeNombre(nombreUsuarioBuscado).getToken();
		}
		else
		{
			throw new UserException("Usuario Invalido");
		}
	}
}
