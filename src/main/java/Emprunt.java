import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Emprunt {

	@Id
	private int id;
	@Column(name = "DATE_DEBUT", length = 30, nullable = false)
	private String dateDebut;
	@Column(name = "DELAI", length = 30, nullable = false)
	private int delai;
	@Column(name = "DATE_FIN", length = 30, nullable = false)
	private String dateFin;
	@Column(name = "ID_CLIENT", length = 30, nullable = false)
	private int idClient;

	public Emprunt() {

	}

}
