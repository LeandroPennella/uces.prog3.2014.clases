package objetos;

public class Saludador {
	
	//Atributos
	private String saludar;
	
	//Metodos
	public void setSaludar(String value)
	{
		this.saludar = value;
	}
	
	public String getSaludar()
	{
		return this.saludar;
	}
	
	public void saludar ()
	{
		System.out.println("Buenos dias " + this.saludar);
	}
	//Constructor 
	public Saludador (){
		this("NN");
	}
	public Saludador (String x){
		super();
		this.saludar=x;
	}
	
}
