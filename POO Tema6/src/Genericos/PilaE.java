package Genericos;

public class PilaE<T> implements Pila<T> {
	protected T[] pila;
	protected int numElementos;
	protected static final int TAMAÑO_POR_DEFECTO=10;
	
	public PilaE(int tamaño) {
		pila = (T[]) new Object[tamaño];
		numElementos = 0;
		System.out.println("Constructor con argumento tamaño: " + tamaño);
	}
	
	public PilaE() {
		this(TAMAÑO_POR_DEFECTO);//llama al constructor de la mimsa clase y le pasa valor por parámetro.
		System.out.println("Termino el constructor vacío");
	}

	@Override
	public T pop() {
		if (isEmpty()) {
			return null;
		}//if
		numElementos--;
		T res = pila[numElementos];
		pila[numElementos] = null;
		return res;
	}//pop
	
	@Override
	public boolean push(T o) {
		if (numElementos == pila.length) {
			return false;
		}//if
		pila[numElementos] = o;
		numElementos++;
		return true;		
	}//push
	
	@Override
	public boolean isEmpty() {
		return (numElementos == 0);
	}
	
}
