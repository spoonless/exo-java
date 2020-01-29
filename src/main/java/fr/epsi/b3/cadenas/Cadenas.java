package fr.epsi.b3.cadenas;

public class Cadenas {
	
	private int codeSecret[] = new int[4];
	
	public void setCodeSecret(int i0, int i1, int i2, int i3) {
		codeSecret[0] = i0;
		codeSecret[1] = i1;
		codeSecret[2] = i2;
		codeSecret[3] = i3;
	}
	
	public boolean ouvrir (int i0, int i1, int i2, int i3) {
		return codeSecret[0] == i0 
			&& codeSecret[1] == i1 
			&& codeSecret[2] == i2 
			&& codeSecret[3] == i3;
	}

}
