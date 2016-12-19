package Composite;

class Archivo extends ElementoFileSystem
{
	private int tamano;
	
	public Archivo(String Nombre, int Tamano){super(Nombre);this.tamano=Tamano;}
	public int getTamano(){return this.tamano;}
	public String listar(){return this.getNombre();}
}
