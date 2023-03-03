
package EntregaTema6;

import Tad.ListaE;

public class Agenda {

	protected static final int TAMANO_POR_DEFECTO = 100;

	protected ListaE contactos; // A sustituir por una lista
	//protected int numElementos;

	public Agenda(int tamano) {
		contactos = new ListaE(TAMANO_POR_DEFECTO);
		//numElementos = 0;
	}

	public Agenda() { this(TAMANO_POR_DEFECTO); }
	
	public int numContactos() {
		return contactos.size();
	}
	
	public boolean vacia() {
		return contactos.isEmpty();
	}
	
	public String listaContactos() {
		StringBuilder res = new StringBuilder();
		for (int i=0; i<contactos.size(); i++) {
			// Muestra posiciones de 1 a numelementos
			res.append(i+1);
			res.append(": ");
			res.append(contactos.get(i));
			res.append("\n");
		}
		return res.toString();
		//return contactos.toString();
	}

	public boolean anadeContacto(Contacto c) {
		return contactos.add(c);
	}

	public boolean borraContacto(int posicion) {
		return contactos.remove(posicion);
	}

	public boolean reemplazaContacto(int posicion, Contacto c) {
		return contactos.set(posicion, c);
	}

	public Contacto getContacto(int posicion) {
		return (Contacto)contactos.get(posicion);
	}

	public int buscaContacto (Contacto c) {
		return contactos.indexOf(c);
	}

}
