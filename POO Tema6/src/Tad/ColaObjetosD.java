package Tad;

public class ColaObjetosD implements ColaObjetos{
	protected NodoObj inicio;
	protected NodoObj fin;
	
	public ColaObjetosD() {
		inicio = fin = null;
	}

	@Override
	public boolean add(Object obj) {
		NodoObj nuevo = new NodoObj(obj, null);
		if (isEmpty()) {
			inicio = fin = nuevo;
		}
		else {
			//el último nodo pasa a apuntar al nuevo
			//y el nuevo nodo es el nuevo final de cola
			fin.siguiente = nuevo;
			fin = nuevo;
		}
		return false;
	}

	@Override
	public Object remove() {
		if (isEmpty()) return null;
		Object res = inicio.elemento;
		inicio = inicio.siguiente;
		if (inicio == null) fin = null;
		
		return res;
	}

	@Override
	public boolean isEmpty() {
		return (inicio == null);
	}
	
	@Override
	public String toString() {
		String res = "INICIO <<< ";
		NodoObj cursor = inicio;
		while (cursor != null) {
			res += cursor.elemento + " - ";
			cursor = cursor.siguiente;			
		}
		res += " >>> FIN";
		return res;
	}

}
