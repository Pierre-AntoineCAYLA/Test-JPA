package banque;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "banque")
public class Banque {
	@Id
	private int id;

	@Column(name = "NOM")
	String nom;

	@OneToMany
	private Set<Client> client;

	public Banque(int id, String nom, Set<Client> client) {
		super();
		this.id = id;
		this.nom = nom;
		this.client = client;
	}

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
