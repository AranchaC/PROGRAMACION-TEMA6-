package Tad;

import java.util.Arrays;

public class ColaCircular implements ColaObjetos {	
	protected Object[] cola;
	protected int inicio, fin, numElementos;
	
	public ColaCircular(int tamaño) {
		this.cola = new Object[tamaño];
		this.numElementos = 0;
		this.inicio = 0;
		this.fin = 0;
	}

	@Override
	public boolean add(Object obj) {
		if (isFull()) return false;
		cola[fin] = obj;
		numElementos++;
		fin++;
		if (fin == cola.length) fin = 0;
		//fin = (fin+1)%cola.length; otra opción en lugar de las 2 líneas anteriores.
		return "Añado " + obj != null;
	}

	@Override
	public Object remove() {
		if (isEmpty()) {
			return null;
		}
		Object res = cola[inicio];
		cola[inicio] = null;
		inicio++;
		numElementos--;
		if (inicio == cola.length) inicio = 0;
		return res;
	}

	@Override
	public boolean isEmpty() {
		return (numElementos == 0);
	}
	
	public boolean isFull() {
		return (numElementos == cola.length);
	}

	@Override
	public String toString() {
		return Arrays.toString(cola);
	}
	
	

}
