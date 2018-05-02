package banque;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
	int numero;
	String rue;
	int codePostal;
	String ville;

	public Adresse() {

	}

	public Adresse(int numero, String rue, int codePostal, String ville) {
		this.numero = numero;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public int getNumero() {
		return numero;
	}

	public String getRue() {
		return rue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}
