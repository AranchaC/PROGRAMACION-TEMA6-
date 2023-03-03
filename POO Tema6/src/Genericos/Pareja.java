package Genericos;

public class Pareja<T> {
	public T a;
	public T b;
	
	public Pareja (T a, T b) {
		this.a = a;
		this.b = b;
	}
	
	public Pareja() {
		
	}

	@Override
	public String toString() {
		return "Pareja [a= " + a + ", b= " + b + "]";
	}
	

}
