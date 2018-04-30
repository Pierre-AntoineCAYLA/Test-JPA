import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Emprunt {

	@Id
	private int id;
	@Column(name = "DATE_DEBUT")
	private String dateDebut;
	@Column(name = "DELAI")
	private int delai;
	@Column(name = "DATE_FIN")
	private String dateFin;
	@Column(name = "ID_CLIENT")
	private int idClient;

	@ManyToMany
	@JoinTable(name = "COMPO", joinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName = "ID"))
	private Set<Livre> livre;

	@ManyToOne
	@JoinColumn(name = "ID")
	private Client client;

	public Emprunt() {

	}

	public int getId() {
		return id;
	}

	public String toString() {
		return ("L'id est de l'emprunt est " + id + " l'id du client est " + idClient + " l'emprunt va du " + dateDebut
				+ " à " + dateFin + " soit " + delai + " jours");
	}

	public int getIdClient() {
		return idClient;
	}

	public Set<Livre> getLivre() {

		return livre;
	}

}
