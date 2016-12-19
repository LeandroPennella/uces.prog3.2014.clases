package Colecciones.Comparar;
import java.lang.Comparable;
public class Main {

	public static void main(String[] args) throws java.lang.Exception
	{
		// your code goes here
		Perro a=new Perro("josa","bulldog",3);
		Perro b=new Perro("josb","bulldog",3);
		//if (a.equals(b)){System.out.print("son iguales");}else{System.out.print("no son iguales");}
		System.out.print(a.compareTo(b));
	}
 

}


class Perro implements Comparable 
{
	private String nombre;
	private String raza;
	private int edad;
 
	public Perro(String Nombre, String Raza, int Edad)
	{
		this.nombre=Nombre;
		this.raza=Raza;
		this.edad=Edad;
	}
 
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