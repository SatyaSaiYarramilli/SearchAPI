package com.springdatajpa.springdatajpacourse.repository;

import com.springdatajpa.springdatajpacourse.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long>
        {

           @Query("SELECT p FROM Product p WHERE " +
           "p.name LIKE CONCAT('%',:query,'%')" +
                   "or p.description LIKE CONCAT('%',:query,'%')"
           )
            List<Product> searchProducts(String query);

            @Query(value="SELECT * FROM products p WHERE " +
                    "p.name LIKE CONCAT('%',:query,'%')" +
                    "or p.description LIKE CONCAT('%',:query,'%')", nativeQuery = true)

            List<Product> searchProductsSql(String query);


        }
