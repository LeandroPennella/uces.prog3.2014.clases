package Singleton;


public class Main {

	public static void main(String[] args) {

		Tablero t1=Tablero.getInstance();
		Tablero t2=Tablero.getInstance();
		System.out.println(t1==t2);
	}

}

class Tablero
{
	private String nombre;
	private Tablero(){}
	private static Tablero INSTANCE = null;
 
    // creador sincronizado para protegerse de posibles problemas  multi-hilo
    // otra prueba para evitar instanciación múltiple 
    private synchronized static void createInstance() {
        if (INSTANCE == null) { 
            INSTANCE = new Tablero();
        }
    }
 
    public static Tablero getInstance() {
        createInstance();
        return INSTANCE;
    }
    public String getNombre()
    {
    	return this.nombre;
    }
 
    public void setNombre(String Nombre)
    {
    	this.nombre=Nombre;
    }
}
 
 