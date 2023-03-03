package Control;

import Tad.ColaCircular;
import Tad.ColaObjetos;
import Tad.ColaObjetosE;

public class PruebaColaObjetos {

	public static void main(String[] args) {
		ColaObjetos cola = new ColaCircular(10);
				//ColaObjectosE(10);
		
		System.out.println("meto 19 elementos, solo se puede 10 "); 
		for (int i=1; i<=19; i++) {
			cola.add(i); 
		}//for
		System.out.println(cola);
		
		System.out.println("\nsaco 5 elementos");
		for (int i=1; i<=5; i++) {
			System.out.println("Saco "+cola.remove());;
		}//for
		System.out.println(cola);
		
		System.out.println("\nañado 9 elementos, solo puede 5");
		for (int i=11; i<=19; i++) {
			cola.add(i);
		}//for
		System.out.println(cola);
		
		while (!cola.isEmpty()) {
			System.out.println("saco " + cola.remove());
			System.out.println(cola);
		}//while
	}
//commit prueba
}
