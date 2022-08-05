package com.example.demo.service;

import com.example.demo.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author rmuruganantham 2018-05-04
 */
public interface ICustomerService {
    List<Customer> getCustomer(String userName, String password);

    Customer addCustomer(Customer customer);

    Customer updateCustomer(Customer customer);
}
