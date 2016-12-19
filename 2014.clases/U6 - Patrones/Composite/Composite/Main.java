package Composite;

public class Main {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Carpeta c1=new Carpeta("C1");
		c1.agregar(new Archivo("A1",2));
		c1.agregar(new Archivo("A2",3));
		Carpeta c2=new Carpeta("C2");
		c2.agregar(new Archivo("A3",4));
		c1.agregar(new Carpeta("C2"));
		System.out.println("Tama�o  :"+c1.getTamano());
		System.out.println("Listado :\n"+c1.listar());
	}
}


 


