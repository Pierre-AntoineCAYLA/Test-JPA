package banque;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
	int nuemero;
	String rue;
	int codePostal;
	String ville;

}
