package Examen2doTrim;

public class ListaD {
	protected NodoObj inicio;
	protected NodoObj fin;
	protected int tamano;
	
	public ListaD() {
		inicio = fin = null;
		tamano = 0;
	}

	public boolean add(Object obj) {//añadir a última posición
		NodoObj nuevo = new NodoObj(obj, null);
		if (isEmpty()) {
			inicio = fin = nuevo;
		}
		else {
			fin.siguiente = nuevo;	
			fin=nuevo;
		}
		tamano++;
		return true;
	}//add

	public boolean isEmpty() {
		return inicio == null;
	}//isEmpty

	public String toStringOdds() {
		String res = "";
		NodoObj cursor = inicio;
		for (int i=0; i<tamano; i++) {
			if (i%2 == 0) {
				res += cursor.elemento+",";
			}
			cursor = cursor.siguiente;			
		}
		return res;
	}
}
