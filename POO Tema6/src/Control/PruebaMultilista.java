package Control;

import EntregaTema6.Multilista;
import Tad.ColaObjetos;

public class PruebaMultilista {

	public static void main(String[] args) {
			ColaObjetos cola = new Multilista(10);
			//ColaObjetosE(10);
	
		System.out.println("meto 19 elementos, solo se puede 10 "); 
		for (int i=1; i<=19; i++) {
			cola.add(i); 
		}//for
		System.out.println(cola);
		
		System.out.println("\nsaco 5 elementos");
		for (int i=1; i<=5; i++) {
			System.out.println("Saco el "+cola.remove());;
		}//for
		System.out.println(cola);
		
		System.out.println("\nañado 9 elementos, solo puede 5");
		for (int i=11; i<=19; i++) {
			cola.add(i);
		}//for
		System.out.println(cola);
		
		while (!cola.isEmpty()) {
			System.out.println("saco el " + cola.remove());
			System.out.println(cola);
		}//while
		}

	

}
