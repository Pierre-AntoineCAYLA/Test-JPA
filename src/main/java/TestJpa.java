import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestJpa {
	private static final Logger LOG = LoggerFactory.getLogger(TestJpa.class);

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = entityManagerFactory.createEntityManager();
		em.getTransaction().begin();
		Livre livre = em.find(Livre.class, 4);
		if (livre != null)
			LOG.info("le livre est " + livre.getTitre());

		Query query = em.createQuery("select liv from Livre liv where liv.titre='Germinal'");
		Livre liv = (Livre) query.getResultList().get(0);
		if (liv != null)
			LOG.info(liv.toString());
		em.close();
		entityManagerFactory.close();

	}

}
