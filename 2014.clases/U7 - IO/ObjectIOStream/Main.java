package ObjectIOStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Persona> personas=new ArrayList<Persona>();
		personas.add(new Persona("pepe","argento",22));
		personas.add(new Persona("pepa","argenta",23));
		personas.add(new Persona("pepu","argente",24));
		EscritorPersona ep=new EscritorPersona();
		String path="c:/personas.bin";
		ep.escribir(personas, path);
		CalculadorPromedio c=new CalculadorPromedio();
		//System.out.println(c.promediar(path));
	}

	
}



