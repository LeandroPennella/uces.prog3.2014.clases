package combos;

public class Stacker extends Combo {

	private String nombre;
	private double precio;
	
	public Stacker()
	{
		this.nombre = "Stacker";
		this.precio = 70;
	}
	
	@Override
	public double damePrecio()
	{
		return this.precio;
	}
}
