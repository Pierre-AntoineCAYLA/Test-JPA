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

	public Banque() {

	}
}
