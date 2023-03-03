package Examen2doTrim;

import java.util.Arrays;

public class PruebaPersona {

	public static void main(String[] args) {
		//creo array de tipo Persona que puede incluir 
		//objetos de tipo Persona y de tipo Alumno
		Persona [] grupo = new Persona [3];
		Evaluable[] alumsEvaluables = new Evaluable [4];
		Alumno[] claseDaw1 = new Alumno [4];
		
		grupo[0] = new Persona("222A");
		grupo[1] = new Alumno("111B",1234);
		grupo[2] = new Persona("555C");
		
		System.out.println("** Grupo de Personas y Alumnos: **");
		for (int i=0; i<grupo.length; i++) {
			System.out.println(grupo[i]);
		}
		System.out.println();
		
		alumsEvaluables[0] = new Alumno("555C",7894);
		alumsEvaluables[1] = new Alumno("333R",4561);
		alumsEvaluables[2] = new Alumno("111B",1234);
		alumsEvaluables[3] = new Alumno("202N",9876);
		
		System.out.println("** Grupo de Alumnos evaluables: **");
		for (int i=0; i<alumsEvaluables.length; i++) {
			System.out.println(alumsEvaluables[i]+". Con nota: "+alumsEvaluables[i].evaluar());
		}		
		System.out.println();
	
		claseDaw1[0] = new Alumno("555C",7894);
		claseDaw1[1] = new Alumno("333R",4561);
		claseDaw1[2] = new Alumno("111B",1234);
		claseDaw1[3] = new Alumno("202N",9876);
		
		Arrays.sort(claseDaw1);
		System.out.println("** Grupo de Alumnos: **");
		for (int i=0; i<claseDaw1.length; i++) {
			System.out.println(claseDaw1[i]+". Con nota: "+claseDaw1[i].evaluar());
		}

	}

}
