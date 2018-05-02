package banque;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "livretA")
public class LivretA extends Compte {
	@Column(name = "TAUX")
	double taux;

	public LivretA(int id, String numero, double solde, Client client, double taux) {
		super(id, numero, solde, client);
		this.taux = taux;
	}

	public double gettaux() {
		return taux;
	}

}
