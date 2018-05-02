package banque;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "virement")
public class Virement extends Operation {

	@Column(name = "BENEFICIAIRE")
	String beneficiaire;

	public Virement(int id, LocalDate localDate, double montant, String motif, String beneficiaire) {
		super(id, localDate, montant, motif);
		this.beneficiaire = beneficiaire;
	}

	public String getBeneficiare() {
		return beneficiaire;
	}

	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}
}
