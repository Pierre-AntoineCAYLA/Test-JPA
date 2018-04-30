import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Compo {

	@Id
	private int id;
	@Column(name = "ID_LIV", length = 30, nullable = false)
	private int idLivre;
	@Column(name = "ID_EMP", length = 30, nullable = false)
	private String idEmprunt;

}
