package Tad;

public class PilaEstática implements PilaDeObjetos {
	protected Object[] pila;
	protected int numElementos;
	protected static final int TAMAÑO_POR_DEFECTO=10;
	
	public PilaEstática(int tamaño) {
		pila = new Object[tamaño];
		numElementos = 0;
		System.out.println("COnstructor con argumento tamaño: " + tamaño);
	}
	
	public PilaEstática() {
		this(TAMAÑO_POR_DEFECTO);
		//llama al constructor de la mimsa clase y le pasa valor por parámetro.
		System.out.println("Termino el constructor vacío");
	}

	@Override
	public Object pop() {
		if (isEmpty()) {
			return null;
		}//if
		numElementos--;
		Object res = pila[numElementos];
		pila[numElementos] = null;
		return res;
	}//pop
	
	@Override
	public boolean push(Object o) {
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
