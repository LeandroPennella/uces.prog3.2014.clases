package Decorator;

public class Main {

	public static void main(String[] args) {

		Combo whooper =new ComboReal(3);
		System.out.println(whooper.getPrecio());
 
 
		Combo whooperAgrandado=new Agrandar(whooper);
		System.out.println(whooperAgrandado.getPrecio());
 
	}

}


abstract class Combo
{
	public abstract  double getPrecio();
}
 
class ComboReal extends Combo
{
	//private String nombre;
	private double precio;
	public ComboReal(double Precio){this.precio=Precio;}
	public double getPrecio()
	{
		return this.precio;
	}
}
 
class Decorador extends Combo
{
	protected Combo decorado;
	public Decorador (Combo comboADecorar){this.decorado=comboADecorar;}
	public double getPrecio(){return 0.00;}//me obliga a overridear
}
 
class Agrandar extends Decorador
{
	private double precioAgrandar=2.00; //constante
	public double getPrecio()
	{
		return this.decorado.getPrecio()+precioAgrandar;
	}
	public Agrandar(Combo comboAAgrandar){super(comboAAgrandar);}
 
}
 
class ConAros extends Decorador
{
	public double getPrecio()
	{
		return 0.00;	
	}
	public ConAros (Combo comboAAgrandar)
	{
		super(comboAAgrandar);
	}
}