package banque;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("L")
public class LivretA extends AbstractCompte {
	@Column(name = "TAUX")
	double taux;

	public LivretA(String numero, double solde, Client client, double taux) {
		super(numero, solde, client);
		this.taux = taux;
	}

	public double gettaux() {
		return taux;
	}

}
