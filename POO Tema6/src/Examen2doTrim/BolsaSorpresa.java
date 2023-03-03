package Examen2doTrim;

import Tad.NodoObj;

public class BolsaSorpresa {
	protected Object[] objetos;
	protected int tamaño;
	
	public BolsaSorpresa(int maxSize) {
		objetos = new Object [maxSize];
		tamaño = 0;
	}
	
	public boolean isEmpty() {
		return (tamaño == 0);
	}
	
	public boolean isFull() {
		return (tamaño == objetos.length);
	}
	
	public Object getRandom() {
		return null;
	}
	
	public boolean put(Object obj) {
		if (!(isFull())) {
			
		}
		
		return true;
	}

}








