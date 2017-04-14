package run;


import org.uqbar.arena.Application;
import org.uqbar.arena.windows.Window;

import extras.Fixture;
import repositorios.ClienteDeNotas;
import vistas.MenuWindow;

public class LectorDeNotasApplication extends Application {

	public static void main(String[] args) throws Exception 
	{		
		Fixture.initializar();
		ClienteDeNotas.crearCliente();

		new LectorDeNotasApplication().start();
	}

	@Override
	protected Window<?> createMainWindow() 
	{
		return new MenuWindow(this);
	}
}