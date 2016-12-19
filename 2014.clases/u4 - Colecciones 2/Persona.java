package Colecciones;



public class Persona implements Comparable<Persona>
{
	private String nombre;
	private String raza;
	private int edad;
	
	public Persona(String Nombre, int Edad)
	{
		this.nombre=Nombre;
		//this.raza=Raza;
		this.edad=Edad;
	}
	
	public String getNombre()
	{return this.nombre;}
	
	public int getEdad()
	{
		return this.edad;
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
		if (!(obj instanceof Persona)) {
			return false;
		}
		Persona other = (Persona) obj;
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
	public int compareTo(Persona otroPerro)
	{
		if(this.nombre.compareTo(otroPerro.nombre)!=0)
		{
			return this.nombre.compareTo(otroPerro.nombre);
		}
		else
		{
			return this.edad-otroPerro.edad;
		}
		
	}
}