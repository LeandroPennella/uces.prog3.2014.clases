package FileSystem;
import java.util.HashSet;
import java.util.Set;

abstract class ElementoFileSystem
{
	@SuppressWarnings("unused")
	private String nombre;
	public ElementoFileSystem(String Nombre){this.nombre=Nombre;}
	abstract public int getTamano();
}
 
class Carpeta extends ElementoFileSystem
{
	private Set<ElementoFileSystem> elementos=new HashSet<ElementoFileSystem>();
	public Carpeta (String Nombre){super(Nombre);}
	public int getTamano()
	{
		int tamano=0;
		for (ElementoFileSystem e:elementos)
		{
			tamano+=e.getTamano();
		}
		return tamano;
	}
 
	public void agregar(ElementoFileSystem elemento)
	{
		elementos.add(elemento);
	}
}
 
class Archivo extends ElementoFileSystem
{
	private int tamano;
	public Archivo(String Nombre, int Tamano){super(Nombre);this.tamano=Tamano;}
	public int getTamano(){return this.tamano;}
}