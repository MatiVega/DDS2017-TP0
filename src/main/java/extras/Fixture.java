package extras;

import dominio.Usuario;
import repositorios.RepositorioUsuarios;

public class Fixture 
{
	public static void initializar() 
	{
		Usuario u1 = new Usuario("Administrador", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho");

		RepositorioUsuarios.agregar(u1);
	}
}