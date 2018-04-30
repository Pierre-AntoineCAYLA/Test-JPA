import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Client {

	@Id
	private int id;
	@Column(name = "NOM")
	private String nom;
	@Column(name = "PRENOM")
	private String prenom;

	@OneToMany(mappedBy = "client")
	private Set<Emprunt> emprunt;

	public Client() {

	}

	public Set<Emprunt> getEmprunt() {

		return this.emprunt;
	}

}
