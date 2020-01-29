package fr.epsi.b3.geometrie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GeometrieLoader {
	
	public Geometrie chargerGeometrie(String fichier) throws IOException, GeometrieException {
		return chargerGeometrie(new BufferedReader(new FileReader(fichier)));
	}

	public Geometrie chargerGeometrie(BufferedReader reader) throws IOException, GeometrieException {
		Geometrie geometrie = new Geometrie();
		try {
			String ligne = null;
			while((ligne = reader.readLine()) != null) {
				String[] colonnes = ligne.split(";");
				ajouter(geometrie, colonnes);
			}
		} finally {
			reader.close();
		}
		return geometrie;
	}

	private void ajouter(Geometrie geometrie, String[] colonnes) throws GeometrieException {
		if ("RECTANGLE".equals(colonnes[0])) {
			Rectangle rectangle = new Rectangle(Double.valueOf(colonnes[1]), Double.valueOf(colonnes[2]));
			geometrie.ajouter(rectangle);
		} else if ("DISQUE".equals(colonnes[0])) {
			Disque disque = new Disque(Double.valueOf(colonnes[1]));
			geometrie.ajouter(disque);
		}
	}

}
