package banque;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "virement")
public class Virement extends Operation {
	@Id
	private int id;
	@Column(name = "BENEFICIAIRE")
	String beneficiaire;

	public Virement() {

	}

}
