package Instituto;

import java.util.Objects;
import java.util.Scanner;

public class Alumno {
	private String nombre;
	private String apellido;
	private int edad;
	private int NIA;
	private Género genero;
	private static Scanner entrada=new Scanner(System.in);
	
	public static Alumno deTeclado() {
		String nombre;
		String apellido;
		int edad;
		int NIA;
		Género genero;
		System.out.print("Dame el NIA: ");
		NIA= entrada.nextInt();
		entrada.nextLine();
		if (NIA==0) {
			return null;
		}//if
		System.out.print("Dime tu nombre: ");
			nombre=entrada.nextLine();
		System.out.print("Dime tu apellido: ");
			apellido=entrada.nextLine();
		System.out.print("Dime tu edad: ");
			edad=entrada.nextInt();
			entrada.nextLine();
		System.out.print("Dime tu género (Masculino, Femenino o X):  ");
			String letra=entrada.nextLine().toUpperCase().charAt(0) + "";
		genero = Género.valueOf(letra);
		
		return new Alumno(nombre, apellido, edad, NIA, genero);
	}
	
	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alumno(String nombre, String apellido, int edad, int NIA, Género genero) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.NIA = NIA;
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", NIA=" + NIA + ", genero="
				+ genero + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(NIA);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return NIA == other.NIA;
	}
	
	public boolean mayorQue (Alumno alumno) {
		if (this.edad > alumno.edad) {
			return true;
		}
		return false;
	}
	


		

	

}
