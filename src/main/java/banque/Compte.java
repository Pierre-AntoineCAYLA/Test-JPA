package banque;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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

	@Id
	private int id;
	@Column(name = "NUMERO", unique = true)
	private String numero;
	@Column(name = "SOLDE")
	private double solde;

	@ManyToOne
	@JoinColumn(name = "ID_CLIENT")
	private Client client;

	@ManyToMany
	@JoinTable(name = "CO_OP", joinColumns = @JoinColumn(name = "ID_OPERATION", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ID_COMPTE", referencedColumnName = "ID"))
	private Set<Operation> opertion;

	public String getNumero() {
		return numero;
	}

	public Compte(int id, String numero, double solde, Client client) {
		super();
		this.id = id;
		this.numero = numero;
		this.solde = solde;
		this.client = client;
	}

	public int getId() {
		return id;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
}
