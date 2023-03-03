package Control;

import Tad.PilaD;
import Tad.PilaDeObjetos;
import Tad.PilaEstática;

public class PruebaPila {

	public static void main(String[] args) {
		PilaDeObjetos pila = new PilaD();
		//PilaEstática();
		
		 for ( int i=1; i<=10; i++) {
			// System.out.println(pila.push(i));
			 pila.push(i);
			 //pila.push((char)('A'+i));			 
		 }
		 System.out.println();
		 System.out.println(pila);
		 
		 for ( int i=1; i<=5; i++) {
			 System.out.println("Saco "+ pila.pop());
		 }
		 System.out.println();
		 System.out.println(pila);
		 for ( int i=11; i<=20; i++) {
			 //System.out.println(pila.push(i));
			 pila.push(i);
		 }
		 System.out.println();
		 
		 
		 while (! pila.isEmpty()) {
			 Object o = pila.pop();
			 System.out.println("Saco "+o);
		 }
		 System.out.println(pila);

	}

}
