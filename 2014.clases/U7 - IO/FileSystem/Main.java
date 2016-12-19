package FileSystem;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Archivo a1 =new Archivo("A1",2);
		Archivo a2 =new Archivo("A2",3);
		Carpeta c1=new Carpeta("C1");
		c1.agregar(a1);
		c1.agregar(a2);
		System.out.println(c1.getTamano());
	}

}

