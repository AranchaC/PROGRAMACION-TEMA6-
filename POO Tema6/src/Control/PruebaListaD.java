package Control;

import Tad.ListaD;
import Tad.ListaObjetos;

public class PruebaListaD {

	public static void main(String[] args) {
		ListaObjetos lista1 = new ListaD();	
		for (int i=1; i<=5; i++) {
			lista1.add(i);
		}
		System.out.println("TAMAÑO DE LA LISTA: "+lista1.size());
		System.out.println(lista1);

		lista1.remove(0);
		System.out.println(lista1);
		lista1.remove(lista1.size()-1);
		System.out.println(lista1);
		lista1.remove(1);
		System.out.println(lista1);
		lista1.remove(lista1.size()-1);
		System.out.println(lista1);
		lista1.remove(lista1.size()-1);
		System.out.println(lista1);
		
		System.out.println();	
		
		//creo lista y añado elementos en la mitad.
		ListaObjetos lista = new ListaD();	
		lista.add(10);	
		for (int i=1; i<10; i++) {
			lista.add(lista.size()/2,i);
			System.out.println(lista);
		}
				
		System.out.println("TAMAÑO DE LA LISTA: "+lista.size());
		System.out.println();		
		System.out.println(lista);
		//llama al toString
		
		
		/*for (int pos=0; pos<lista.size(); pos++) {
			System.out.println(lista.get(pos));
		}*/

		

		

	}

}
