package objetos;

public class Main {

	public static void main(String[] args) {
			/*
			Saludador pepito=new Saludador();
			pepito.setSaludar("Jose");
			pepito.saludar();
			
			Saludador pedro = new Saludador();
			pedro.setSaludar(pepito.getSaludar()+pepito.getSaludar());
			pedro.saludar();
			pedro.setSaludar(pepito.toString());
			Saludador pepe = new Saludador();
			pepe.saludar();
			*/
			
			Mujer josefa = new Mujer(5);
			josefa.decirEdad();
			Hombre pepe = new Hombre(48);
			pepe.decirEdad();
	}
}
