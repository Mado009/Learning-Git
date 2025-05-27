package org.madprod.productapi.Service;

import org.madprod.productapi.Models.Product;
import org.madprod.productapi.Repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
     private final ProductRepository productRepository;

     public ProductService(ProductRepository productRepository) {
         this.productRepository = productRepository;
     }

    @Override
    public void createProduct(Product product) {
         productRepository.save(product);
         
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public void updateProduct(Long id, Product product) {
         Product existingProduct = productRepository.findById(id).orElse(null);
         if (productRepository.existsById(id)) {
             existingProduct.setName(product.getName());
             existingProduct.setDescription(product.getDescription());
             existingProduct.setPrice(product.getPrice());
             existingProduct.setCategory(product.getCategory());
             productRepository.save(product);
             
         }
         
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
