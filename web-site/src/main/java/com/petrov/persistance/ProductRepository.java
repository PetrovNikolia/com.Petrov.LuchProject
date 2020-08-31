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
        return null;
    }

    public void insert(Product product) {
        products.add(new Product(product.getId(),product.getTitle(),product.getCost()));
    }

    public void update(Long id,String title, int cost){
        Product product =findById(id);
        product.setTitle(title);
        product.setCost(cost);
        products.set((int) product.getId(),new Product(product.getId(),product.getTitle(),product.getCost()));
    }

    public void remove(Long id){
        Product product = findById(id);
        products.remove(product.getId());
    }


}
