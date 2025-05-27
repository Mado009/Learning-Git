package org.madprod.productapi.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double price;
    private String category;
    private int stockQuantity;
}


//Task 
//Create full API CRUD 
//Create a ProductRepository interface extending JpaRepository
//Create a ProductService class with methods for CRUD operations
//Create a ProductController class with endpoints for CRUD operations
//Test the API using Postman or any other tool
