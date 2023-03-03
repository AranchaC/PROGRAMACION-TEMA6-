package Tad;

import java.util.Arrays;

public class ColaObjetosE implements ColaObjetos {
	
	protected Object cola[];
	protected int numEle;
	
	public ColaObjetosE(int size) {
		cola = new Object[size];
		numEle = 0;
	}

	@Override
	public boolean add(Object obj) {
		if (numEle == cola.length) return false;
		cola[numEle] = obj;
		numEle ++;
		return true;
	}

	@Override
	public Object remove() {
		if (isEmpty()) return null;
		Object res = cola[0];
		for (int i=1; i<numEle; i++) {
			cola[i-1] = cola[i];
		}//for
		cola[numEle-1] = null;
		numEle--;		
		return res;
	}

	@Override
	public boolean isEmpty() {
		
		return (numEle == 0);
	}
	
	@Override
	public String toString() {
		return Arrays.toString(cola);
	}

}
