package Colecciones.Comparar2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Collection c=new ArrayList();
		c.add(new Perro("Diego",22));
		c.add(new Perro("Pepe",32));
		c.add(new Perro("Luis",30));
 
		System.out.println("listo todo");
		Iterator i=c.iterator();
		while(i.hasNext())
		{
			Perro p=(Perro)i.next();
			System.out.println(p.getNombre());
		}
		System.out.println("borro uno");
		c.remove(new Perro("Diego",22));
 
		i=c.iterator();
		while(i.hasNext())
		{
			Perro p=(Perro)i.next();
			System.out.println(p.getNombre());
		}
	}

}


class Perro implements Comparable 
{
	private String nombre;
	private String raza;
	private int edad;
 
	public Perro(String Nombre, int Edad)
	{
		this.nombre=Nombre;
		//this.raza=Raza;
		this.edad=Edad;
	}
	public String getNombre()
	{return this.nombre;}
 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((raza == null) ? 0 : raza.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Perro)) {
			return false;
		}
		Perro other = (Perro) obj;
		if (edad != other.edad) {
			return false;
		}
		if (nombre == null) {
			if (other.nombre != null) {
				return false;
			}
		} else if (!nombre.equals(other.nombre)) {
			return false;
		}
		if (raza == null) {
			if (other.raza != null) {
				return false;
			}
		} else if (!raza.equals(other.raza)) {
			return false;
		}
		return true;
	}
	@Override
	public int compareTo(Object obj)
	{
		Perro p=(Perro)obj;
 
 
 
 
 
		int difnom=((Perro)obj).nombre.compareTo(this.nombre);
		int difed=this.edad-((Perro)obj).edad;
		//return difed;
		//return difnom;
		return (difnom==0)?difed:difnom*((difed==0)?difnom:difnom*difed);
	}
}