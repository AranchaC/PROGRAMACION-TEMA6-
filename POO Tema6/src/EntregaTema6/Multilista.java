package EntregaTema6;

import java.util.Arrays;
import java.util.Objects;

import Tad.ColaObjetos;
import Tad.PilaDeObjetos;

public class Multilista implements ListaObjetos, PilaDeObjetos, ColaObjetos {
	protected int numElementos;
	protected Object[] lista;
	
	
	public Multilista(int tamano) {
		lista = new Object[tamano];
		numElementos = 0;
	}
	
	@Override
	public int size() {
		return numElementos;
	}

	@Override
	public boolean add(Object obj) { //añadir ultima posicion		
		if (IsFull()) {
			return false;
		}
			lista[numElementos] = obj;
			numElementos++;
			return true;		
	}

	@Override
	public boolean add(int index, Object obj) {
		if (IsFull()) {
			return false;
		}
		if (!(index >= 0 && index < numElementos)) {
			return false;			
			//mover todos los elementos desde Index hacia arriba
			//bucle que emepiece en numElementos y termine en index+1			
		}
		for  ( int cursor=numElementos; cursor>index; cursor--) {
			lista[cursor] = lista[cursor-1];
		}
		lista[index] = obj;
		numElementos++;
		return true;
	}

	@Override
	public Object get(int index) {		
		if (index >= 0 && index < numElementos) {			
			return lista [index]; //Index es la posicion 
		}
		return false;			
	}

	@Override
	public boolean remove(int index) {	
		if (index<0 || index>=numElementos) {
			return false;
			// desplaza todos los elementos desde index+1 hacía abajo
			//me desplazo hacia arriba moviendo cada elemento al anterior
		}
		for (int cursor=index+1; cursor<numElementos; cursor++) {
			lista[cursor-1] = lista[cursor];
		}
		numElementos--;
		lista[numElementos]=null;
		return false;
	}

	@Override
	public boolean isEmpty() {		
		if (numElementos==0) {
			return true;
		}		
		return false;
	}
		
	public boolean IsFull() {		
		if (numElementos==lista.length) {
			return true;
		}		
		return false;
	}
	
	public int indexOf(Object obj) {
		for (int i=0; i<numElementos; i++) {
			if (obj.equals(lista[i])) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean set(int index, Object o) {		
		if (index >= 0 && index < numElementos) {			
		 lista [index] = 0; //Index es la posicion 
		 return true;
		}		
		return false;
	}
	
	@Override
	public String toString() {
		 return Arrays.toString(lista).replace("[", "INICIO <<< ").replace("]", " >>> FIN");		
	}
	
	//para usar esto como cola, supongo la pos 0 el inicio
	//y el final de la lista, el de la cola
	@Override
	public Object remove() {
		if (isEmpty()) return null;
		Object res = get(0);
		remove(0);
		return res;
	}
	
	//para usar esto cmo pila, supongo el último elemento
	//de la lista como la cima
	@Override
	public Object pop() {
		if (isEmpty()) return null;
		Object res = get(size()-1);
		remove(size()-1);
		return res;
	}

	@Override
	public boolean push(Object o) {
		return add(o);
	}


}
