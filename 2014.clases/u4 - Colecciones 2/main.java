package Colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;


public class main {

	public static void main(String[] args) {
		Map<String, Persona> mapa=new HashMap<String, Persona>();
		Persona persona;
		mapa.put("Diego", new Persona("Diego",22));
		persona=mapa.put("Diego", new Persona("Diego",23));//me devuelve diego 22 y lo pisa con diego 23
		mapa.put("Pepe", new Persona("Pepe",22));
		mapa.put("Pepa", new Persona("Pepa",22));
		persona=mapa.get("Diego");
		mapa.remove("Pepe");
		
		Iterator<String> i=mapa.keySet().iterator();
		while(i.hasNext())
		{
			String clave=i.next();
			Persona p=mapa.get(clave);
			System.out.println(p.getNombre()+" - "+p.getEdad());
			
		}
		
		
	}
	
	public void arreglo1()
	{
		Collection<Persona> personas=new TreeSet<Persona>();
		Collection<Persona> personasA=new ArrayList<Persona>();
		Collection<Persona> personasH=new HashSet<Persona>();
		
		personas.add(new Persona("Marta",5));
		personas.add(new Persona("Marta",10));
		personas.add(new Persona("Juan",5));
		personas.add(new Persona("Juan",10));		
		
		Iterator<Persona> i=personas.iterator();
		while(i.hasNext())
		{
			Persona p=i.next();
			System.out.println(p.getNombre()+" - "+p.getEdad());
		}
	}

	public void arreglo2()
	{
		Collection<Persona> personasComparador=new TreeSet<Persona>(new ComparadorDePersonas());

		personasComparador.add(new Persona("Marta",5));
		personasComparador.add(new Persona("Marta",10));
		personasComparador.add(new Persona("Juan",5));
		personasComparador.add(new Persona("Juan",10));
		
		Iterator<Persona> i=personasComparador.iterator();
		while(i.hasNext())
		{
			Persona p=i.next();
			System.out.println(p.getNombre()+" - "+p.getEdad());
		}
	}
}



