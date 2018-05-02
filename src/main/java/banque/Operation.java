package banque;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "operation")
public abstract class Operation {
	@Id
	private int id;
	@Column(name = "DATE")
	LocalDateTime date;
	@Column(name = "MONTANT")
	double montant;
	@Column(name = "MOTIF")
	String Motif;

	@ManyToMany
	@JoinTable(name = "CO_OP", joinColumns = @JoinColumn(name = "NUMERO", referencedColumnName = "NUMERO"), inverseJoinColumns = @JoinColumn(name = "ID", referencedColumnName = "ID"))
	private Set<Operation> opertion;

	public Operation() {

	}

}
