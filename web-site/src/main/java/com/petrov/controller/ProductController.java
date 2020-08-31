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

    @GetMapping("/{id}/edit")
    public String editProduct(@PathVariable("id") Long id, Model model) {
        Product product = productRepository.findById(id);
        model.addAttribute("product", product);
        return "editProduct";
    }

    @GetMapping("/add")
    public String addProduct(Model model) {
        return "product";
    }

    @PostMapping("product/add")
    public String addNewProduct(@RequestParam Long id, @RequestParam String title, @RequestParam int cost, Model model) {
        Product product = new Product(id,title,cost);
        productRepository.insert(product);
        return "redirect:/product";
    }

    @PostMapping("{id}/edit")
    public String updateProduct(@RequestParam Long id, @RequestParam String title, @RequestParam int cost, Model model) {
        productRepository.update(id,title,cost);
        return "redirect:/product";
    }

    @PostMapping("{id}/remove")
    public String removeProduct(@RequestParam Long id, Model model) {
        productRepository.remove(id);
        return "redirect:/product";
    }
}
