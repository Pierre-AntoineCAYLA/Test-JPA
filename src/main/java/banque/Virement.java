package banque;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("V")
public class Virement extends AbstractOperation {

	@Column(name = "BENEFICIAIRE")
	String beneficiaire;

	public Virement(LocalDate localDate, double montant, String motif, String beneficiaire) {
		super(localDate, montant, motif);
		this.beneficiaire = beneficiaire;
	}

	public String getBeneficiare() {
		return beneficiaire;
	}

	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}
}
