package com.example.demo.controller;

import com.example.demo.dto.ProductDTO;
import com.example.demo.entity.Product;
import com.example.demo.service.IProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author rmuruganantham 2018-05-08
 */
@RestController
@Api(value = "Product CRUD operations")
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @RequestMapping(
            path = "/createProduct",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    Product createProduct(
            @ApiParam(value = "product details")
            @RequestBody Product product){

        return iProductService.addProduct(product);
    }

    @RequestMapping(
            path = "/getAllProducts",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    List<Product> getAllProducts(){
        return iProductService.getAllProducts();
    }

    Product getProduct(){
        return null;
    }

    Product updateProduct(){
        return null;
    }

    boolean deleteProduct(){
        return true;
    }
}
