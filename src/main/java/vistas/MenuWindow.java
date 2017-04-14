package vistas;

import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import vm.MenuViewModel;

@SuppressWarnings("serial")
public class MenuWindow extends SimpleWindow<MenuViewModel>
{
	public MenuWindow(WindowOwner parent) 
	{
		super(parent, new MenuViewModel());
	}

	@Override
	protected void addActions(Panel botonera) 
	{
		new Button(botonera).setCaption("Ver Notas").onClick(this::verNotas);

		new Button(botonera).setCaption("Editar Informacion Personal").onClick(this::editarInformacionPersonal);
	}

	@Override
	protected void createFormPanel(Panel panelPrincipal) 
	{
		this.setTitle("Lector de notas");
		
		panelPrincipal.setLayout(new VerticalLayout());
		
		Panel form1 = new Panel(panelPrincipal);
		
		form1.setLayout(new HorizontalLayout());
		
		new Label(form1).setText("Usuario:     ");
		
		new TextBox(form1).setWidth(150).bindValueToProperty("nombreUsuarioBuscado");
	}
	
	public void verNotas()
	{	
		this.getModelObject().asignarTokenSiEsUsuarioValido();
		
		Dialog<?> dialog = new AsignacionesWindow(this);
		dialog.open();
	}
	
	public void editarInformacionPersonal() 
	{
		this.getModelObject().asignarTokenSiEsUsuarioValido();
		
		Dialog<?> dialog = new InformacionPersonalWindow(this);
		dialog.open();
	}
}
