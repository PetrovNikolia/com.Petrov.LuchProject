package com.petrov.persistance;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private List<Product> products;

    public ProductRepository(List<Product> products) {
        this.products = products;
    }

    public List<Product> getAllProduct() {
        return new ArrayList<>(products);
    }

    public Product findById(long id) {

        for (Product p : products) {
            if (p.getId() == id) {
                return new Product(p.getId(), p.getTitle(), p.getCost());
            }
        }
        return new Product(-1, "", 0);
    }

    public void insert(Product product) {
        products.add(product);
    }

    public Product update(Product product){
        return null;
    }


}
