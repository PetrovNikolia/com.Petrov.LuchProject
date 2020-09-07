import org.hibernate.cfg.Configuration;
import tables.Order;
import tables.Product;
import tables.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

//        //Добавление таблицы Пользователей и Продуктов
//        EntityManager em = emFactory.createEntityManager();
//
//        Product product1 = new Product(null,"Cola",100);
//        Product product2 = new Product(null,"Marmelad",250);
//        Product product3 = new Product(null,"Snake",150);
//
//        User user1 = new User(null,"Nikolay");
//        User user2 = new User(null,"Nikolay2");
//
//        em.getTransaction().begin();
//        em.persist(user1);
//        em.persist(user2);
//        em.persist(product1);
//        em.persist(product2);
//        em.persist(product3);
//        em.getTransaction().commit();
//
//        em.close();

        //Удаление
        EntityManager em = emFactory.createEntityManager();

        User user = em.find(User.class, 4);
        em.getTransaction().begin();
        em.remove(user);
        em.flush();
        em.clear();
        em.getTransaction().commit();

    }


}
