package Composite;

import java.util.HashSet;
import java.util.Set;



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
 
	public String listar()
	{
		String ss="";	
 
		for (ElementoFileSystem e:elementos) 
		{
			ss+=" - "+e.listar()+"\n";
		}
		return ss;
	}
}