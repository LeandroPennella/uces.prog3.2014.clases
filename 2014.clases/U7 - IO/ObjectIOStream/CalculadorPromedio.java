package ObjectIOStream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class CalculadorPromedio
{
	
	public List<Persona> leer(String path)
	{
		ObjectInputStream ois=null;
		List<Persona>personas=null;
		try
		
		{
			FileInputStream fis = new FileInputStream(path);
			ois=new ObjectInputStream (fis);
			personas=new ArrayList<Persona>();
			boolean eof = false;
			
			while (!eof) 
			{
				try 
				{
					Persona persona= (Persona) ois.readObject();

					personas.add(persona);
				} 
				catch (EOFException e) 
				{
					eof = true;
				}
				
			}
			
		}
		catch (Exception e)
		{}
		finally
		{
			try
			{ois.close();}
			catch(Exception e)
			{}
			
			
		}
		return personas;
	}
	
	public double promediar(List<Persona> personas)
	{
		double total=0;
		int cantidad=0;
		for (Persona persona:personas)
		{
			total+=persona.getEdad();
			cantidad++;
		}
		return total/cantidad;
	}
}