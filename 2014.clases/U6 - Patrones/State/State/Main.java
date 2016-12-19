 	package State;

public class Main {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Semaforo s=new Semaforo();
		 
		System.out.println(s.cambiar());
		System.out.println(s.cambiar());
		System.out.println(s.cambiar());
		System.out.println(s.cambiar());
		System.out.println(s.cambiar());
		System.out.println(s.cambiar());
		System.out.println(s.cambiar());
 
	}

}


class Semaforo
{
	private EstadoSemaforo estado;
 
	public Semaforo(){estado=new EstadoSemaforoVerde();}
	public String cambiar()
	{
		this.estado=estado.cambiar();
		return estado.getColor();
	}
 
	public String getColor()
	{
		return estado.getColor();
	}
 
}
 
abstract class EstadoSemaforo
{
	//private color;
	//public EstadoSemaforo(String Color){this.color=Color;}
	abstract public EstadoSemaforo cambiar();
	abstract public String getColor();
}
 
class EstadoSemaforoVerde extends EstadoSemaforo
{
	//public EstadoSemaforoVerde (){super("Verde");}
	public EstadoSemaforo cambiar()
	{
		return new EstadoSemaforoVerdeAmarillo();
	}
	public String getColor()
	{
		return "Verde";
	}
}
 
class EstadoSemaforoVerdeAmarillo extends EstadoSemaforo
{
	//public EstadoSemaforoVerde (){super("Verde");}
	public EstadoSemaforo cambiar()
	{
		return new EstadoSemaforoRojo();
	}
	public String getColor()
	{
		return "Amarillo";
	}
}
 
class EstadoSemaforoRojo extends EstadoSemaforo
{
	//public EstadoSemaforoVerde (){super("Verde");}
	public EstadoSemaforo cambiar()
	{
		return new EstadoSemaforoRojoAmarillo();
 
	}
	public String getColor()
	{
		return "Rojo";
	}
}
 
class EstadoSemaforoRojoAmarillo extends EstadoSemaforo
{
	//public EstadoSemaforoVerde (){super("Verde");}
	public EstadoSemaforo cambiar()
	{
		return new EstadoSemaforoVerde();
 
	}
	public String getColor()
	{
		return "Amarillo";
	}
}