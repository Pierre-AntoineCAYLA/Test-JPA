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

	public Client(int id, String nom, String prenom, LocalDateTime dateNaissance, Adresse adress, Set<Compte> compte,
			Banque banque) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adress = adress;
		this.compte = compte;
		this.banque = banque;
	}

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public LocalDateTime getDateNaissance() {
		return dateNaissance;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setDateNaissanc(LocalDateTime dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

}
