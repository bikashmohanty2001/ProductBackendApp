package com.interview.controller;

import com.interview.entity.Product;
import com.interview.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
@CrossOrigin("http://localhost:3000/")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @GetMapping("/fetch_all")
    public List<Product> getAllProduct(){
        return productService.getAllProducts();
    }

    @GetMapping("/fetch/{id}")
    public Optional<Product> getProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }

    @PutMapping("/update/{id}")
    public Product updateProductById(@RequestBody Product product, @PathVariable Long id){
        return productService.updateProductById(product, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProductById(@PathVariable Long id){
        productService.deleteProductById(id);
    }



}
