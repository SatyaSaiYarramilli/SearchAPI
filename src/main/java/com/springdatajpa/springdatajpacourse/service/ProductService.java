package com.springdatajpa.springdatajpacourse.service;

import com.springdatajpa.springdatajpacourse.Entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> searchProducts(String query);
    Product createProduct(Product product);
}
