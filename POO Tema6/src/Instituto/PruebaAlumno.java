package Instituto;

public class PruebaAlumno {

	public static void main(String[] args) {
		/*
		Alumno a1 = new Alumno("Cristopher", "Nolan", 33, 123456, Género.M);
		Alumno a2 = new Alumno("Cristopher", "Robin", 23, 123456, Género.M);
		Alumno a3= Alumno.deTeclado();
		
		System.out.println(a3);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1.equals(a2));
		
		System.out.println(a1.mayorQue(a2));
		
		Grupo daw2 = new Grupo("DAW2", 33);
		daw2.añadeAlumno(a1);
		daw2.añadeAlumno(a2);
		daw2.añadeAlumno(a3);
		*/
		
		Grupo daw2 = new Grupo("daw2", 3);
		Alumno a;
		while ((a = Alumno.deTeclado()) != null) {
			daw2.añadeAlumno(a);
		}//while
		System.out.println("¿Hay repes? "+ daw2.hayRepes());

	}

}
