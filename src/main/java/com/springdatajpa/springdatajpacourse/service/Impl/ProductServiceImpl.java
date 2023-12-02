package com.springdatajpa.springdatajpacourse.service.Impl;

import com.springdatajpa.springdatajpacourse.Entity.Product;
import com.springdatajpa.springdatajpacourse.repository.ProductRepository;
import com.springdatajpa.springdatajpacourse.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProducts(String query) {
        List<Product> products=productRepository.searchProducts(query);
        return products;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
