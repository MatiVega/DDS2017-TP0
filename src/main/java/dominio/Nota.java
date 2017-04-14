package dominio;

import org.uqbar.commons.utils.Observable;

import com.google.gson.annotations.SerializedName;
@Observable
public class Nota
{
	private int id;
	@SerializedName ("value") 
	private String valor;
	@SerializedName ("created_at") 
	private String fechaCreada;
	@SerializedName ("updated_at") 
	private String fechaModificada;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getValor()
	{
		return valor;
	}
	public void setValor(String valor)
	{
		this.valor = valor;
	}
	public String getFechaCreada()
	{
		return fechaCreada;
	}
	public void setFechaCreada(String fechaCreada)
	{
		this.fechaCreada = fechaCreada;
	}
	public String getFechaModificada()
	{
		return fechaModificada;
	}
	public void setFechaModificada(String fechaModificada)
	{
		this.fechaModificada = fechaModificada;
	}
	
	public boolean esNotaAprobatoria()
	{
		return valor.contains("R") || valor.contains("B") || Integer.parseInt(valor) >= 6;
	}
}
