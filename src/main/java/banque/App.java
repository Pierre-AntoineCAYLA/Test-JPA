package banque;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banque");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Adresse adresse = new Adresse(29, "charles", 85000, "Nantes");
		Banque banque = new Banque(0, "Credit Agricole");
		Virement virement = new Virement(0, LocalDate.of(1994, 11, 28), 15000, "cadeau", "jean");
		Client cli = new Client(0, "CAYLA", "PA", LocalDate.of(1994, 01, 29), adresse, banque);
		LivretA livretA = new LivretA(0, "jgjhg54", 15000, cli, 0);
		AssuranceVie assurance = new AssuranceVie(0, "jgjg454", 15000, cli, LocalDate.of(1994, 01, 29), 150);
		em.persist(banque);
		em.persist(cli);
		et.commit();
		em.close();
		entityManagerFactory.close();
	}

}
