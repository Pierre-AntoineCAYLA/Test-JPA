package banque;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE")
@Table(name = "operations")
public class AbstractOperation {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	@Column(name = "DATE")
	LocalDate date;
	@Column(name = "MONTANT")
	double montant;
	@Column(name = "MOTIF")
	String motif;

	@ManyToMany
	@JoinTable(name = "CO_OP", joinColumns = @JoinColumn(name = "ID_COMPTE", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ID_OPERATION", referencedColumnName = "ID"))
	private Set<AbstractOperation> opertion;

	public AbstractOperation(LocalDate localDate, double montant, String motif) {
		super();
		this.date = localDate;
		this.montant = montant;
		this.motif = motif;
	}

	public int getId() {
		return id;
	}

	public LocalDate getDate() {
		return date;
	}

	public double getMontant() {
		return montant;
	}

	public String getMotif() {
		return motif;
	}

}
