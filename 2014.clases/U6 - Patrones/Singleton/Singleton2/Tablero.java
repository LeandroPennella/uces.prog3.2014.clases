package Singleton2;
//import jugadores.*;

public final class Tablero {
	//Utilizacion de Singleton
	
	private static Tablero instancia;
	private Jugador1 jugador1;
	private Jugador2 jugador2;
	
	private Tablero(){}
	
	private synchronized static void crearTablero()
	{
		if(instancia == null)
		{
			instancia = new Tablero();
		}
	}
	
	public static Tablero getInstancia()
	{
		if(instancia == null)
		{
			crearTablero();
		}
		return instancia;
	}
	
	public void hacerMovimiento(Jugador j, int fila, int columna) {}
	
}
