package com.petrov;

import com.petrov.persistance.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import com.petrov.persistance.ProductRepository;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:application.properties")
public class PersistConfig {

    @Bean
    public ProductRepository userRepository()  {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"Book",1000));
        products.add(new Product(2,"Book1",3000));
        products.add(new Product(3,"Book2",2000));
        return new ProductRepository(products);
    }

}
