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
		int pos = (int) (Math.random()*tamaño);
		//entre 0 y ultimo elemento.
		Object res = new Object();
		res = objetos[pos];
		objetos[pos] = null;
		return res;
	}
	
	public boolean put(Object obj) {
		if (!(isFull())) {
			for (int i=0; i<objetos.length; i++) {
				if (objetos[i] == null) {
					objetos[i] = obj;
					tamaño++;
				}//if
			}//for				
		}//if	
		return true;
	}//put
	
	

}








