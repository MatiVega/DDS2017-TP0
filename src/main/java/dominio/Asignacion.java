package dominio;

import java.util.List;

import org.uqbar.commons.utils.Observable;

import com.google.gson.annotations.SerializedName;

@Observable
public class Asignacion
{
	private int id;
	@SerializedName ("title") 
	private String titulo;
	@SerializedName ("description") 
	private String descripcion;
	@SerializedName ("grades") 
	private List<Nota> notas;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getTitulo()
	{
		return titulo;
	}
	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}
	public String getDescripcion()
	{
		return descripcion;
	}
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
	}
	public List<Nota> getNotas()
	{
		return notas;
	}
	public void setNotas(List<Nota> notas)
	{
		this.notas = notas;
	}	
	public boolean isAprobada() 
	{
		return notas.stream().anyMatch(n -> n.esNotaAprobatoria());
	}
}