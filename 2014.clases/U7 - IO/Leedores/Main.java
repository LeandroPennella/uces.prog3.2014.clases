package Leedores;

 
public class Main {
	public static void main(String[] args)  
	{
		double l1=leedor1byte.leer("e:\\eula.1033.txt");
		double ls=leedorString.leer("e:\\eula.1033.txt");
		double lb=leedorBuffer.leer("e:\\eula.1033.txt");

		System.out.println("l1 :"+l1);
		System.out.println("ls :"+ls);
		System.out.println("lb :"+lb);
		
		
	}
}