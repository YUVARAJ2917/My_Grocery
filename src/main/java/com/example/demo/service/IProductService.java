package com.example.demo.service;

import com.example.demo.entity.Product;

import java.util.List;

/**
 * @author rmuruganantham 2018-05-01
 */
public interface IProductService {

    List<Product> getAllProducts();

    Product getProduct(long productId);

    Product addProduct(Product product);

    void updateProduct(Product product);

    void deleteProduct(Product productId);
}
