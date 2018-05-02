package banque;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "virement")
public class Virement extends Operation {

	@Column(name = "BENEFICIAIRE")
	String beneficiaire;

	public Virement(int id, LocalDateTime date, double montant, String motif, Set<Operation> opertion,
			String beneficiaire) {
		super(id, date, montant, motif, opertion);
		this.beneficiaire = beneficiaire;
	}

	public String getBeneficiare() {
		return beneficiaire;
	}

	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}
}
