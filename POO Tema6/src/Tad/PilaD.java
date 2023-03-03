package Tad;

public class PilaD implements PilaDeObjetos {
	protected NodoObj cima;

	@Override
	public Object pop() {
		if (isEmpty()) return null;
		Object res = cima.elemento;
		cima = cima.siguiente;
		return res;
	}//pop

	@Override
	public boolean push(Object obj) {
		NodoObj nuevo = new NodoObj(obj, null);
		nuevo.siguiente = cima;
		cima = nuevo;
		return true;
	}//push

	@Override
	public boolean isEmpty() {
		return (cima == null);
	}//isEmpty

	@Override
	public String toString() {
		//return cima.toString();
		String res = "";
		NodoObj cursor = cima;
		while (cursor != null) {
			res += "|" + cursor.elemento + "|\n";
			cursor = cursor.siguiente;			
		}
		res += "---";
		return res;
	}
	
	

}
