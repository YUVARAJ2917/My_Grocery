package com.example.demo.repositort;

import com.example.demo.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author rmuruganantham 2018-05-04
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByUserNameAndPassword(String userName, String password);

    List<Customer> findByUserNameAndEmail(String userName, String email);
}
