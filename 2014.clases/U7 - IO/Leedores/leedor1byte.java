package Leedores;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

class leedor1byte
{
	public static double  leer(String nombreArchivo)
	{
		Reader r=null;
		double inicio=0, tiempo=0;
		try
		{
			inicio=System.currentTimeMillis();
			r = new FileReader(nombreArchivo);
			for (int letra=r.read();letra>=0;letra = r.read())
			{
				System.out.print((char)letra);
			}
			r.close();
		}
		catch (IOException e)
		{
			System.out.println("error al abrir");
		}
		finally
		{
			if (r!=null)
			{
				try
				{
					r.close();
					tiempo=System.currentTimeMillis()-inicio;
					System.out.println("\ntiempo transcurrido :"+tiempo);
 
				}
				catch (IOException e)
				{
					System.out.println("error al cerrar "+e.getMessage());
				}
			}
		}
		return tiempo;
	}	
}