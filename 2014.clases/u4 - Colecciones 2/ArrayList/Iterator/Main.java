package Colecciones.ArrayList.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Collection<Persona> c=new ArrayList(); //Collection ¿<Persona>?
		c.add(new Persona("Diego",22));
		c.add(new Persona("Pepe",32));
 
		Iterator i=c.iterator();
		while(i.hasNext())
		{
			Persona p=(Persona)i.next();
			System.out.println(p.getNombre());
		}
 
		c.remove(new Persona("Diego",22));
 
		i=c.iterator();
		while(i.hasNext())
		{
			Persona p=(Persona)i.next();
			System.out.println(p.getNombre());
		}
	
	}

}

class Persona
{
	private String nombre;
	private int edad;
	public Persona(String Nombre, int Edad)
	{
		this.nombre=Nombre;
		this.edad=Edad;
	}
	public String getNombre()
	{return this.nombre;}
}