package vistas;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.GroupPanel;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import dominio.Asignacion;
import dominio.Estudiante;
import dominio.Nota;

@SuppressWarnings("serial")
public class AsignacionesWindow extends Dialog<Estudiante> 
{
	public AsignacionesWindow(WindowOwner owner) 
	{
		super(owner, new Estudiante());
	}

	@Override
	public void createFormPanel(Panel panelPrincipal) {
		this.setTitle("Notas del estudiante");

		panelPrincipal.setLayout(new VerticalLayout());

		GroupPanel formAsignacion = new GroupPanel(panelPrincipal);
		formAsignacion.setTitle("Asignacion");
		formAsignacion.setLayout(new ColumnLayout(2));

		new Label(formAsignacion).setText("Seleccione una asignacion:");
		Selector<Asignacion> comboAsignacion = new Selector<Asignacion>(formAsignacion);
		
		comboAsignacion.bindItemsToProperty("asignaciones");
		comboAsignacion.bindValueToProperty("asignacionSeleccionada");

		new Label(formAsignacion).setText("Id:");
		new Label(formAsignacion).bindValueToProperty("asignacionSeleccionada.id");
		new Label(formAsignacion).setText("Titulo:");
		new Label(formAsignacion).bindValueToProperty("asignacionSeleccionada.titulo");
		new Label(formAsignacion).setText("Descripcion:");
		new Label(formAsignacion).bindValueToProperty("asignacionSeleccionada.descripcion");
		new Label(formAsignacion).setText("Esta probada?:");
		new Label(formAsignacion).bindValueToProperty("asignacionSeleccionada.aprobada");

		GroupPanel formNotas = new GroupPanel(panelPrincipal);
		formNotas.setTitle("Notas de la asignacion");

		Table<Nota> tablaNotas = new Table<Nota>(formNotas, Nota.class);
		
		tablaNotas.setNumberVisibleRows(5);
		tablaNotas.bindItemsToProperty("asignacionSeleccionada.notas");
		new Column<Nota>(tablaNotas).setTitle("Id").setFixedSize(50).bindContentsToProperty("id");
		new Column<Nota>(tablaNotas).setTitle("Valor").setFixedSize(80).bindContentsToProperty("valor");
		new Column<Nota>(tablaNotas).setTitle("Fecha creada").setFixedSize(130).bindContentsToProperty("fechaCreada");
		new Column<Nota>(tablaNotas).setTitle("Fecha modificada").setFixedSize(130).bindContentsToProperty("fechaModificada");
	}
}
