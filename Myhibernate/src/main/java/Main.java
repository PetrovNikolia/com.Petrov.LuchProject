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

        //Добавление таблицы Пользователей и Продуктов
        EntityManager em = emFactory.createEntityManager();

        //INSERT
//        Product product1 = new Product(null,"Cola",100);
//        Product product2 = new Product(null,"Marmelad",250);
//        Product product3 = new Product(null,"Snake",150);
//
//
//
//        User user1 = new User(null,"Nikolay");
//        User user2 = new User(null,"Nikolay2");
//
//        product1.setUser(user1);
//        user1.addProduct(product1);
//        product2.setUser(user1);
//        user1.addProduct(product2);
//
//        product3.setUser(user2);
//        user2.addProduct(product3);
//
//        em.getTransaction().begin();
//        em.persist(user1);
//        em.persist(user2);
//        em.persist(product1);
//        em.persist(product2);
//        em.persist(product3);
//        em.getTransaction().commit();


        //Какие товары у пользователя
        User user = em.find(User.class, 1);
        System.out.println(user.getProducts());

        //Кто купил определенный товар
        Product product = em.find(Product.class, 1);
        System.out.println(product.getUser());
        //DELETE
//        em.getTransaction().begin();
//        User user = em.find(User.class, 1);
//        em.remove(user);
//        em.flush();
//        em.clear();
//        em.getTransaction().commit();
//        em.close();


    }


}
