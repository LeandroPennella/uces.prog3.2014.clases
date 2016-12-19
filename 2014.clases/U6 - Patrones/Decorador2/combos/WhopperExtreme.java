package combos;

public class WhopperExtreme extends Combo {

	private String nombre;
	private double precio;
	
	public WhopperExtreme()
	{
		this.nombre = "Whopper Extreme";
		this.precio = 65;
	}
	
	@Override
	public double damePrecio()
	{
		return this.precio;
	}
}
