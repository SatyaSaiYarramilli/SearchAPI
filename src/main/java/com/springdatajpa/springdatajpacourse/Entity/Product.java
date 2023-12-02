package com.springdatajpa.springdatajpacourse.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.ValueGenerationType;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="products")
        //schema="ecommerce",
        //uniqueConstraints= {
                //@UniqueConstraint(
                  //      name = "sku_unique",
                    //    columnNames = "stock_keeping_unit"
                //)//

      //  }//
//)//
public class Product {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    //@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="product_generator")
    //@SequenceGenerator(name="product_generator",sequenceName="product_sequence_name",allocationSize = 1)
    private Long id;

    private String sku;
    @Column(nullable=false)
        private String name;
    private String description;
       private boolean active;
    private String imageUrl;
    @CreationTimestamp
    private LocalDateTime dateCreated;
    @UpdateTimestamp
    private LocalDateTime lastUpdated;

}
