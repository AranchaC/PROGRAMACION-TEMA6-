package Genericos;

public class PruebaPilaE {

	public static <T> void main(String[] args) {
		Pila<Integer> pila = new PilaE<Integer>();
		 for ( int i=0; i<=10; i++) {
			 System.out.println(pila.push(i));
			 //pila.push(i);
			 //pila.push((char)('A'+i));			 
		 }
		 System.out.println();
		 
		 for ( int i=0; i<=5; i++) {
			 System.out.println("Saco "+ pila.pop());
		 }
		 System.out.println();
		 
		 for ( int i=0; i<=20; i++) {
			 System.out.println(pila.push(i));
		 }
		 System.out.println();
		 		 
		 while (! pila.isEmpty()) {
			 Integer o = pila.pop();
			 System.out.println(o);
		 }

	}

}
