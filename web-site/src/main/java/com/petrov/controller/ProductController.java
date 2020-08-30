package com.petrov.controller;

import com.petrov.persistance.Product;
import com.petrov.persistance.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;


    @GetMapping
    public String allProduct(Model model) {
        List<Product> allProduct = productRepository.getAllProduct();
        model.addAttribute("products", allProduct);
        return "products";
    }

    @GetMapping("/{id}")
    public String editProduct(@PathVariable("id") Long id, Model model) {
        Product product = productRepository.findById(id);
        model.addAttribute("product", product);
        return "product";
    }

    @PostMapping("/update")
    public String updateProduct(Product product) {
        // TODO написать метод userRepository.update();
        return "redirect:/product";


    }

}
