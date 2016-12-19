package ObjectIOStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class EscritorPersona
{
	public void escribir (List<Persona> personas, String path)
	{
		ObjectOutputStream oos=null;
		try
		{
			FileOutputStream fos = new FileOutputStream(path);
			oos=new ObjectOutputStream(fos);
			for(Persona persona : personas)
			{oos.writeObject(persona);}
			
		}
		catch (Exception e)
		{}
		finally
		{
			try
			{
				oos.close();
			}
			catch (IOException e)
			{}
		}
	}
}
