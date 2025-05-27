package org.madprod.productapi.Service;

import org.madprod.productapi.Models.Product;

import java.util.List;

public interface IProductService {
    
    void createProduct(Product product);    
    Product getProductById(Long id);    
    void updateProduct(Long id, Product product);
    void deleteProduct(Long id);
    List<Product> getAllProducts();
    
    
    
    
}
