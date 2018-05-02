package banque;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "livretA")
public class LivretA extends Compte {
	@Id
	private int id;
	@Column(name = "TAUX")
	double taux;

	public LivretA() {

	}

}
