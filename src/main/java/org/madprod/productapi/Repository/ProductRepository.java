package org.madprod.productapi.Repository;

import org.madprod.productapi.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // This interface will automatically provide CRUD operations for Product entities
    // No additional code is needed here as JpaRepository provides all necessary methods




    // Test
    List<Product> findByNameContainingIgnoreCase(String name);
}
