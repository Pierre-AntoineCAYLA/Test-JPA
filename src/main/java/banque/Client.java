package banque;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client {
	@Id
	private int id;
	@Column(name = "NOM")
	String nom;
	@Column(name = "PRENOM")
	String prenom;
	@Column(name = "DATE_NAISSANCE")
	LocalDateTime dateNaissance;

	@Embedded
	private Adresse adress;

	@OneToMany
	private Set<Compte> compte;

	@ManyToOne
	@JoinColumn(name = "ID")
	private Banque banque;

	public Client() {

	}

}
