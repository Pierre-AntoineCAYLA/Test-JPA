import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "livre")
public class Livre {

	@Id
	private int id;
	@Column(name = "TITRE")
	private String titre;
	@Column(name = "AUTEUR")
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
