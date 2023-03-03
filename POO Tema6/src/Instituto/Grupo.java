package Instituto;

import java.util.Arrays;

public class Grupo {
	private String nombre;
	private Alumno[] grupo;
	
	public Grupo (String nombre, int tamaño) {
		this.nombre = nombre;
		this.grupo = new Alumno [tamaño];
	}
	
	public boolean añadeAlumno (Alumno a1) {
		for (int i=0; i<grupo.length; i++) {
			if (grupo[i]== null) {
				grupo[i]=a1;
				return true;
			}//if		
		}//for
		return false;
	}// añadeAlumno
	
	public String toString() {
		return nombre + "" + Arrays.toString(grupo);
	}
	
	public boolean hayRepes() {
		for (int i=0; i<grupo.length; i++) {
			if (grupo[i]==null) continue;
			for (int j=1+1; j<grupo.length;j++) {
				if (grupo[j]==null) continue;
				if (grupo[j].equals(grupo[i])) {
					return true;
				}//if
			}//if
		}//for
		return false;
	}
		
	

}
