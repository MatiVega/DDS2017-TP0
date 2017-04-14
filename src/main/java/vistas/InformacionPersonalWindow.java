package vistas;

import org.uqbar.arena.aop.windows.TransactionalDialog;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.GroupPanel;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.WindowOwner;

import dominio.Estudiante;

@SuppressWarnings("serial")
public class InformacionPersonalWindow extends TransactionalDialog<Estudiante>
{
	public InformacionPersonalWindow(WindowOwner owner)
	{
		super(owner, new Estudiante());
	}
	
	@Override
	public void createFormPanel(Panel panelPrincipal)
	{
		this.setTitle("Datos del estudiante");
		
		panelPrincipal.setLayout(new VerticalLayout());
		
		GroupPanel form1 = new GroupPanel(panelPrincipal);

		form1.setTitle("Modificar Datos Personales");
		
		form1.setLayout(new ColumnLayout(2));
		
		new Label(form1).setText("Legajo: ");

		new Label(form1).setWidth(150).bindValueToProperty("legajo");
		
		new Label(form1).setText("Nombre: ");
		
		new TextBox(form1).setWidth(150).bindValueToProperty("nombre");
		
		new Label(form1).setText("Apellido: ");
		
		new TextBox(form1).setWidth(150).bindValueToProperty("apellido");
		
		new Label(form1).setText("Usuario GitHub: ");
		
		new TextBox(form1).setWidth(150).bindValueToProperty("usuarioGitHub");		
	}
	
	@Override
	protected void addActions(Panel actions) 
	{
		new Button(actions).setCaption("Guardar Cambios").onClick(this::accept).setAsDefault();
		new Button(actions).setCaption("Cancelar").onClick(this::cancel);
	}
	
	@Override
	protected void executeTask()
	{
		getModelObject().getInformacionPersonal().modificarInformacionPersonalEnServidor();
		
		super.executeTask();
	}
}
	