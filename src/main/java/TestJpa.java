import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

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

		TypedQuery<Emprunt> query2 = em.createQuery("Select empr FROM Emprunt empr WHERE empr.id=:idEmprunt",
				Emprunt.class);
		query2.setParameter("idEmprunt", 3);
		Emprunt emp = (Emprunt) query2.getSingleResult();
		LOG.info("les livres de cet emprunt sont : " + emp.getLivre().toString());

		Query query3 = em.createQuery("Select cli FROM Client cli WHERE cli.id=:id_client", Client.class);
		query3.setParameter("id_client", 1);
		Client cli = (Client) query3.getSingleResult();
		if (cli != null)
			System.out.println(cli.getEmprunt().toString());
		// LOG.info(cli.getEmprunt().toString());

		em.close();
		entityManagerFactory.close();

	}

}
