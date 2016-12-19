package Composite;

abstract class ElementoFileSystem
{
	private String nombre;
	public ElementoFileSystem(String Nombre){this.nombre=Nombre;}
	abstract public int getTamano();
	public String getNombre(){return this.nombre;}
	public String listar()
	{
		return "";
	}
}