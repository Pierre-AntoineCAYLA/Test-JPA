package banque;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "livretA")
public class LivretA extends Compte {
	@Column(name = "TAUX")
	double taux;

	public LivretA(int id, String numero, double solde, Client client, Set<Operation> opertion, double taux) {
		super(id, numero, solde, client, opertion);
		this.taux = taux;
	}

	public double gettaux() {
		return taux;
	}

}
