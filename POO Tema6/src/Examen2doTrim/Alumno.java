package Examen2doTrim;

public class Alumno extends Persona implements Evaluable, Comparable<Alumno> {
	protected int nia;

	public Alumno(String nif, int nia) {
		super(nif);
		this.nia = nia;
	}

	public int getNia() {
		return nia;
	}

	public void setNia(int nia) {
		this.nia = nia;
	}
	
	public String getNif2() {
		return super.getNif();
	}

	@Override
	public String toString() {
		return "Alumno con NIF: "+ super.getNif()+" y con NIA: "+nia;
	}

	@Override
	public double evaluar() {
		return 6.75;
	}


	public int compareTo(Alumno o) {
		if (this.getNif2() != o.getNif2());
		return this.getNif2().compareTo(o.getNif2());
	}



}
