package com.interview.service;

import com.interview.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public Product addProduct(Product product);

    public List<Product> getAllProducts();

    public Optional<Product> getProductById(Long id);

    public Product updateProductById(Product product, Long id);

    public void deleteProductById(Long id);
}
