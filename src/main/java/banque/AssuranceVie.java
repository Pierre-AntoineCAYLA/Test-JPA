package banque;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "assuranceVie")
public abstract class AssuranceVie extends Compte {

	@Id
	@GeneratedValue
	private Integer id;
	@Column(name = "DATE_FIN")
	LocalDate dateFin;
	@Column(name = "TAUX")
	double taux;

	public AssuranceVie() {

	}
}
