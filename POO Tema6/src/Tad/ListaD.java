package Tad;

public class ListaD implements ListaObjetos {
	protected NodoObj inicio;
	protected NodoObj fin;
	protected int tamano;
	
	public ListaD() {
		inicio = fin = null;
		tamano = 0;
	}

	@Override
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
	}

	@Override
	public boolean add(int index, Object obj) {
		if (index<0 || index>=size()) return false;
		NodoObj nuevo = new NodoObj(obj,null);
		if (index==0) {
			nuevo.siguiente = inicio;
			inicio = nuevo;
			tamano++;
			return true;
		}
		
		NodoObj aux = inicio;
		for (int i=0; i<index-1; i++) {
			aux = aux.siguiente;
		}
		nuevo.siguiente = aux.siguiente;
		aux.siguiente = nuevo;
		tamano++;
		return true;
	}

	@Override
	public Object get(int index) {
		if (isEmpty()) return null;
		NodoObj aux = inicio;
		//while (index-- > 0) equivalencia con el for
		for (int i=0; i<index; i++) {
			if (aux.siguiente == null) return null;
			aux = aux.siguiente;			
		}
		return aux.elemento;
	}

	@Override
	public boolean set(int index, Object o) {
		if (isEmpty()) return false;
		NodoObj aux = inicio;
		for (int i=0; i<index; i++) {
			if (aux.siguiente == null) return false;
			aux = aux.siguiente;			
		}
		aux.elemento = o;
		return true;
	}

	@Override
	public boolean remove(int index) {
		if (index<0 || index>=tamano) {
			//se comprueba que la pos es válida.
			return false;		
		}
		//caso de borra 1er elemento.
		if(index == 0) {
			inicio = inicio.siguiente;
			if(inicio == null) {
				fin = inicio;
			}
			tamano--;
			return true;
		}
		//caso de borrar cualquier elemento.
		NodoObj aux = inicio;
		for (int i=0; i<index-1; i++) {
			aux = aux.siguiente;
		}
		aux.siguiente = aux.siguiente.siguiente;
		if(aux.siguiente == null){
			fin = aux;
		}
		tamano--;
		return false;
	}

	@Override
	public boolean isEmpty() {
		return inicio == null;
		/*if (inicio == null) return true;
		 * return false*/
	}

	@Override
	public int size() {
		return tamano;
	}

	@Override
	public int indexOf(Object obj) {
		return 0;
	}
	
	@Override
	public String toString() {
		String res = "[ ";
		NodoObj cursor = inicio;
		while (cursor != null) {
			res += cursor.elemento;
			if (cursor.siguiente != null) {
				res += "-";
			}
			cursor = cursor.siguiente;			
		}
		return res += " ]";
	}

}
