import org.hibernate.cfg.Configuration;
import tables.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        EntityManager em = emFactory.createEntityManager();

        User user1 = new User(null,"Nikolay");
        User user2 = new User(null,"Nikolay2");


        em.getTransaction().begin();
        em.persist(user1);
        em.persist(user2);
        em.getTransaction().commit();

        em.close();


    }
}
