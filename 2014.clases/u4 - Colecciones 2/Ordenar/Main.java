package Colecciones.Ordenar;

public class Main {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Persona[] personas = new Persona[3];
		personas[0] = new Persona(25);
		personas[1] = new Persona(36);
		personas[2] = new Persona(12);
		Ordenador ord = new Ordenador();
 
		//comprobacion		
		System.out.println("Personas Cargadas:");
		for(int i = 0; i <= personas.length - 1; i++ )
		{
			System.out.println( personas[i].getEdad());
		}
		ord.ordenar(personas);
		System.out.println("Personas Ordenadass:");
		for(int i = 0; i <= personas.length - 1; i++ )
		{
			System.out.println( personas[i].getEdad());
		}
 
 
		Manzana[] manzanas = new Manzana[3];
		manzanas[0] = new Manzana(2);
		manzanas[1] = new Manzana(3);
		manzanas[2] = new Manzana(1);
 
 
		//comprobacion
		System.out.println("Manzanas cargadas:");
		for(int i = 0; i <= manzanas.length - 1; i++ )
		{
			System.out.println( manzanas[i].getPeso());
		}
		ord.ordenar(manzanas);
		System.out.println("Manzanas Ordenadass:");
		for(int i = 0; i <= manzanas.length - 1; i++ )
		{
			System.out.println( manzanas[i].getPeso());
		}
	}
}

class Ordenador {
 
	public void ordenar(Ordenable[] cosas){
 
		for(int i = 0; i < cosas.length - 1; i++ )
		{
			for(int j = i + 1; j < cosas.length; j++)
			{
				if(cosas[i].esMenor(cosas[j]))
				{
					Ordenable aux = cosas[i];
					cosas[i] = cosas[j];
					cosas[j] = aux;
				}
			}
		}
 
	}
 
}
interface Ordenable {
 
	public boolean esMenor(Ordenable otroOrdenable);
 
}
 
class Persona implements Ordenable {
 
	private int edad;
 
	public Persona(int edad)
	{
		this.edad = edad;
	}
 
	public int getEdad()
	{
		return edad;
	}
 
	@Override
	public boolean esMenor(Ordenable otroOrdenable) {
 
		if ( ((Persona)otroOrdenable).edad < this.edad )
		{
			return true;
		}
		return false;
	}
 
}
 
class Manzana implements Ordenable {
	private int peso;
	public Manzana(int Peso)
	{this.peso=Peso;}
 
	public int getPeso()
	{return this.peso;}
 
	@Override
	public boolean esMenor(Ordenable otroOrdenable)
	{
		if ( ((Manzana)otroOrdenable).peso < this.peso )
		{
			return true;
		}
		return false;
	}
}
 


