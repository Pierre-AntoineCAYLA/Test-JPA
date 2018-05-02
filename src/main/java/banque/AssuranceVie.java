package banque;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "assuranceVie")
public class AssuranceVie extends Compte {

	@Column(name = "DATE_FIN")
	LocalDate dateFin;
	@Column(name = "TAUX")
	double taux;

	public AssuranceVie(int id, String numero, double solde, Client client, LocalDate dateFin, double taux) {
		super(id, numero, solde, client);
		this.dateFin = dateFin;
		this.taux = taux;
	}

	public LocalDate getDateFin() {
		return dateFin;
	}

	public double getTaux() {
		return taux;
	}

	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
}
