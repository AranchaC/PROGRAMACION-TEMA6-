package Control;

import Tad.ListaE;
import Tad.ListaObjetos;

public class PruebaListaE {

	public static void main(String[] args) {
		ListaObjetos l = new ListaE(10);
		
		l.add("Uno");
		System.out.println(l);
		System.out.println("Número elementos: "+l.size());
		l.add(0,"Dos");
		System.out.println(l);
		System.out.println("Número elementos: "+l.size());
		l.add(1,"Tres");
		System.out.println(l);
		System.out.println("Número elementos: "+l.size());		
		l.add(0,"Cuatro");
		System.out.println(l);
		System.out.println("Número elementos: "+l.size());
		l.add(2,"Cinco");
		System.out.println(l);
		System.out.println("Número elementos: "+l.size());
		l.add(1,"Seis");
		System.out.println(l);
		System.out.println("Número elementos: "+l.size());
		l.add(4,"Siete");
		System.out.println(l);
		System.out.println("Número elementos: "+l.size());
		l.add(6,"Ocho");
		System.out.println(l);
		System.out.println("Número elementos: "+l.size());
		l.add(5,"Nueve");
		System.out.println(l);
		System.out.println("Número elementos: "+l.size());
		l.add(7,"Diez");
		System.out.println(l);
		System.out.println("Número elementos: "+l.size());
		
		/*for (int i=1; i<12; i++) {
			l.add(i);
		}
		
		for (int i=0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		while (! l.isEmpty()) {
			System.out.println(l.size()+": "+l);
			//l.remove(l.size() /2);
			//l.remove(0);
			l.remove(l.size()-1);
		}*/
		
		System.out.println(l.size()+": "+l);
	}

}
