package Tad;

import java.util.Arrays;

public class ListaEgener<E> implements ListaGener<E> {
	protected int numElementos;
	protected E[] lista;
	
	
	@SuppressWarnings("unchecked")
	public ListaEgener(int tamano) {
		lista = (E[])new Object[tamano];
		numElementos = 0;
	}
	
	@Override
	public int size() {
		return numElementos;
	}

	@Override
	public boolean add(E obj) { //añadir ultima posicion		
		if (isFull()) {
			return false;
		}
			lista[numElementos] = obj;
			numElementos++;
			return true;		
	}

	@Override
	public boolean add(int index, E obj) {
		if (isFull()) {
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
	public E get(int index) {		
		if (index >= 0 && index < numElementos) {			
			return lista [index]; //Index es la posicion 
		}
		return null;			
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
		
	public boolean isFull() {		
		if (numElementos==lista.length) {
			return true;
		}		
		return false;
	}
	
	@Override
	public int indexOf(Object obj) {
		for (int i=0; i<numElementos; i++) {
			if (obj.equals(lista[i])) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean set(int index, E o) {		
		if (index >= 0 && index < numElementos) {			
		 lista [index] = o; //Index es la posicion 
		 return true;
		}		
		return false;
	}
	
	@Override
	public String toString() {
		 return Arrays.toString(lista).replace("[", "INICIO <<< ").replace("]", " >>> FIN");
		
	}


}
