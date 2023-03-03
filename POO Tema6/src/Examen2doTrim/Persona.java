package Examen2doTrim;

public class Persona {
	private String nif;

	public Persona(String nif) {
		this.nif = nif;
	}

	public String getNif() {
		//get: método para conseguir el nif.
		return nif;
	}

	public void setNif(String nif) {
		//set: método para dar valor a nif.
		this.nif = nif;
	}

	@Override
	public String toString() {
		return "Persona con NIF:" + nif;
	}
	
	



}
