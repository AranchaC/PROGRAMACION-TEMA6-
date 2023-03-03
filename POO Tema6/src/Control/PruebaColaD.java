package Control;

import Tad.ColaObjetos;
import Tad.ColaObjetosD;

public class PruebaColaD {

	public static void main(String[] args) {
		ColaObjetos cola = new ColaObjetosD();
		
		for (int i=1; i<=10; i++) {
			cola.add(i);
		}
		System.out.println("Añado del 1 al 10:\n"+cola);
		//imprimo cola después de añadir elementos
		
		while (! cola.isEmpty()) {
			System.out.println("Saco el "+cola.remove());
			System.out.println(cola);
		}
		
		System.out.println();//salto linea
		System.out.println(cola);
		//imprimo cola después de sacar elementos, cola vacía
		System.out.println();//salto linea
		
		for (int i=100; i<=110; i++) {
			cola.add(i);
		}
		System.out.println("Añado del 100 al 110:\n"+cola);
		//imprimo nueva cola después de añadir nuevos elementos
		
		while (! cola.isEmpty()) {
			System.out.println("Saco el "+cola.remove());
		}

	}

}
