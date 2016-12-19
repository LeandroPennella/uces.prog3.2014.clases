package decoradores;
import combos.*;

public abstract class DecoradorCombo extends Combo {

	protected Combo decorado;
	
	public DecoradorCombo(Combo c)
	{
		this.decorado = c;
	}
}
