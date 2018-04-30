import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Client {

	@Id
	private int id;
	@Column(name = "NOM", length = 30, nullable = false)
	private String nom;
	@Column(name = "PRENOM", length = 30, nullable = false, unique = true)
	private String prenom;

	public Client() {

	}

}
