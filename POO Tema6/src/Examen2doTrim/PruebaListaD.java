package Examen2doTrim;

public class PruebaListaD {

	public static void main(String[] args) {
		ListaD listaExamen = new ListaD();	
		for (int i=1; i<=10; i++) {
			listaExamen.add(i);
		}
		
		System.out.println("TAMAÑO DE LA LISTA: "+listaExamen.tamano);
		System.out.println(listaExamen.toStringOdds());
	}
}
 