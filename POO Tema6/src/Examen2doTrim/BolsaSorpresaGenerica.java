package Examen2doTrim;

public class BolsaSorpresaGenerica<T> {
	protected T[] objetos;
	protected int tamaño;
	
	@SuppressWarnings("unchecked")
	public BolsaSorpresaGenerica(int maxSize) {
		objetos = (T[]) new Object [maxSize];
		tamaño = 0;
	}
	
	public boolean isEmpty() {
		return (tamaño == 0);
	}
	
	public boolean isFull() {
		return (tamaño == objetos.length);
	}
	
	public T getRandom() {
		int pos = (int) (Math.random()*tamaño);
		//entre 0 y ultimo elemento.
		@SuppressWarnings("unchecked")
		T res = (T) new Object();
		res = objetos[pos];
		objetos[pos] = null;
		tamaño--;
		return res;
	}
	
	public boolean put(T obj) {
		if (!(isFull())) {
			for (int i=0; i<objetos.length; i++) {
				if (objetos[i] == null) {
					objetos[i] = obj;
					tamaño++;
					break;
				}//if
			}//for	
			return false;
		}//if	
		return false;
	}//put
	
	

}








