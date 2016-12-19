package Singleton2;
//import tableros.*;

public class Main {

	public static void main(String[] args) {
		//Singleton. Hacer un TaTeTi
		Tablero tab = Tablero.getInstancia();
		Tablero tab2 = Tablero.getInstancia();
		System.out.println(tab == tab2? "soy la misma instancia":"no soy la misma instancia");//es como un if
		

	}

}
