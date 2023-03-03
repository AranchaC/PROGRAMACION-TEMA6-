package Genericos;

public class PruebaGenéricos {

	public static void main(String[] args) {
		Pareja<Integer> par1 = new Pareja<Integer>(3, 5);
		Pareja<String> par2 = new Pareja<String>("Hola", "Adiós");
		
		/*
		par1.a = 3;
		par1.b = 5;
		par2.a = "UNO";
		par2.b = "DOS";
		*/
		
		System.out.println(par1);
		System.out.println(par2);

	}

}
