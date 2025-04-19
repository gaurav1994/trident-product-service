package com.trident.trident_project.service;

import java.util.List;

import com.trident.trident_project.entity.Product;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(int id);
    void addProduct(Product product);
}
