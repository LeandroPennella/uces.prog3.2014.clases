package objetos;

public abstract class Persona {
	
	//Atributos
	protected int edad;
	
	//Metodos
	public void decirEdad(){
		System.out.print("Esta es la edad del objeto:");
		System.out.println(this.edad);
	}
	//Constructores
	public Persona(){
		
	}
	public Persona(int x){
		this.edad=x;
	}

}
