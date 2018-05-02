package banque;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "compte")
public abstract class Compte {

	@Column(name = "NUMERO", unique = true)
	String numero;
	@Column(name = "SOLDE")
	double Solde;

	@ManyToOne
	@JoinColumn(name = "ID")
	private Client client;

	@ManyToMany
	@JoinTable(name = "CO_OP", joinColumns = @JoinColumn(name = "ID", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "NUMERO", referencedColumnName = "NUMERO"))
	private Set<Operation> opertion;

	public Compte() {

	}

}
