package decoradores;
import combos.*;

public class DecoAgrandar extends DecoradorCombo {

	public DecoAgrandar(Combo c)
	{
		super(c);
	}
	
	@Override
	public double damePrecio()
	{
		return this.decorado.damePrecio() + 2.50;
	}
}
