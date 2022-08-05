package com.example.demo.repositort;

import com.example.demo.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author rmuruganantham 2018-05-01
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

    Product findByProductId(long productId);

    List<Product> getAllProducts();

    List<Product> findByProductName(String category);

}
