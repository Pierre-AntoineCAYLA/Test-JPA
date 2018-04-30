import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "livre")
public class Livre {

	@Id
	private int id;
	@Column(name = "TITRE")
	private String titre;
	@Column(name = "AUTEUR")

	@ManyToMany
	@JoinTable(name = "COMPO", joinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName = "ID"))
	private Set<Emprunt> empr;

	private String auteur;

	public Livre() {

	}

	public int getId() {
		return id;
	}

	public String getTitre() {
		return titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public String toString() {
		return ("l'id est " + this.id + " le titre est " + this.titre + " l'auteur est " + this.auteur);
	}

}
