package com.trident.trident_project.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.trident.trident_project.entity.Product;
import com.trident.trident_project.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    private static List<Product> products = new ArrayList<>();

    public ProductServiceImpl () {
        products.add(Product.builder().id(1).name("product1").price(22d).quantity(5).build());
        products.add(Product.builder().id(2).name("product2").price(33d).quantity(10).build());
        products.add(Product.builder().id(3).name("product3").price(50d).quantity(20).build());
        products.add(Product.builder().id(4).name("product4").price(50d).quantity(3).build());
        products.add(Product.builder().id(5).name("product5").price(70d).quantity(14).build());
    }


    @Override
    public List<Product> getAllProducts() {
        return products;
    }

    @Override
    public Product getProductById(int id) {
        return products.stream().filter(item -> item.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

}
