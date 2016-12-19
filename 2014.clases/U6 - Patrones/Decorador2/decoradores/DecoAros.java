package decoradores;
import combos.*;

public class DecoAros extends DecoradorCombo {

	public DecoAros(Combo c)
	{
		super(c);
	}
	
	public double damePrecio()
	{
		return this.decorado.damePrecio() + 1;
	}
}
