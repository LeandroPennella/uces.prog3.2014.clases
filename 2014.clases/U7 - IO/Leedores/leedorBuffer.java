package Leedores;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class leedorBuffer {

	public static double leer(String nombreArchivo)
	{
		BufferedReader r=null;
		double inicio=0, tiempo=0;
		try 
		{
			inicio=System.currentTimeMillis();
			r=new BufferedReader(new FileReader(nombreArchivo),1000);
			//r=new BufferedReader(new FileReader(nombreArchivo));
		    String line;
		    while ((line = r.readLine()) != null) {
		        System.out.println(line);
		    }
			
		} 
		catch (IOException e) 
		{
			// TODO Bloque catch generado automáticamente
			//e.printStackTrace();
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
