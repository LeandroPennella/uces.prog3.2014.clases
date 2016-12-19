package Colecciones;
import java.util.Comparator;


public class ComparadorDePersonas implements Comparator<Persona> 
{

	@Override
	public int compare(Persona fulano, Persona mengano)
	{

		if(fulano.getEdad()-mengano.getEdad()==0)
		{
			
			return mengano.getNombre().compareTo(fulano.getNombre());
		}
		else
		{
			return fulano.getEdad()-mengano.getEdad();
		}
	}
}
