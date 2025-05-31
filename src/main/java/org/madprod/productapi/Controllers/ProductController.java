package org.madprod.productapi.Controllers;

import org.madprod.productapi.Models.Product;
import org.madprod.productapi.Service.IProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final IProductService productService;
    public ProductController(IProductService productService) {
        this.productService = productService;
    }
    
    
    @GetMapping
    public String getAllProducts() {
        return productService.getAllProducts().toString();
    }
    
    @PostMapping
    public String createProduct(@RequestBody Product product) {
        productService.createProduct(product);
        return "Product created successfully!";
    }
    
    //Update and Delete methods can be added similarly
    @PostMapping("/update/{id}")
    public String updateProduct(@PathVariable Long id, @RequestBody Product product) {
        productService.updateProduct(id, product);
        return "Product updated successfully!";
    }
    @PostMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return "Product deleted successfully!";
    }
    
    
    //testing
}
//make changes to push
//test