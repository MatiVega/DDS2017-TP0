package repositorios;

import java.util.ArrayList;
import java.util.List;

import dominio.Usuario;

public class RepositorioUsuarios 
{
	private static List<Usuario> usuarios = new ArrayList<>();

	public static void agregar(Usuario usuario) 
	{
		usuarios.add(usuario);
	}

	public static List<Usuario> getUsuarios() 
	{
		return usuarios;
	}

	public static void setUsuarios(List<Usuario> usuarios) 
	{
		RepositorioUsuarios.usuarios = usuarios;
	}
	
	public static Usuario getUsuarioDeNombre(String nombre)
	{
		return usuarios.stream().filter(u -> u.getNombreUsuario().equals(nombre)).findFirst().orElse(null);
	}

	public static boolean existeUsuarioDeNombre(String nombre) 
	{
		return usuarios.stream().anyMatch(u -> u.getNombreUsuario().equals(nombre));
	}
}
