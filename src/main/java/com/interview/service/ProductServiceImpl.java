package com.interview.service;

import com.interview.entity.Product;
import com.interview.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getProductById(Long id) {
          return productRepository.findById(id);
    }

    @Override
    public Product updateProductById(Product newProduct, Long id) {

        Optional<Product> productById = productRepository.findById(id);
        if(productById.isPresent()){
            Product product = productById.get();
            product.setName(newProduct.getName());
            product.setPrice(newProduct.getPrice());
            product.setQuantity(newProduct.getQuantity());
            product.setDescription(newProduct.getDescription());
            productRepository.save(product);
        }
        return newProduct;
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }
}
