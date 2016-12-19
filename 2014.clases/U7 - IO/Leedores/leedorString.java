package Leedores;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

class leedorString
{
	public static double leer(String nombreArchivo)
	{
		Reader r=null;
		double tiempo=0.00,inicio=0; 
		int cantidad=10,tamanoBuffer=10;
		
		try
		{
 
			char[] cadena=new char[tamanoBuffer];
			inicio=System.currentTimeMillis();
			r = new FileReader(nombreArchivo);
 
			while(cantidad==tamanoBuffer)
			{
				cantidad=r.read(cadena);
				System.out.print(cadena);
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