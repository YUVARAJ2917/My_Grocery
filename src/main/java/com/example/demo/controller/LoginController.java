package com.example.demo.controller;

import com.example.demo.entity.Customer;
import com.example.demo.service.ICustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author rmuruganantham 2018-05-07
 */
@RestController
@Api(value = "Login and Registration")
public class LoginController {

    @Autowired
    private ICustomerService iCustomerService;

    @RequestMapping(path = "/login",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    Customer login(
            @ApiParam(name = "username", required = true)
            @RequestParam("username") String userName,

            @ApiParam(name = "password", required = true)
            @RequestParam("password") String password) {

        List<Customer> customer = iCustomerService.getCustomer(userName, password);

        return customer.get(0);
    }

    @RequestMapping(path = "/register", method = RequestMethod.POST)
    Customer register(
            @ApiParam(name = "Customer Details", required = true)
            @RequestBody Customer customer) {

        return iCustomerService.addCustomer(customer);
    }

    @RequestMapping(path = "/UpdateCustomer", method = RequestMethod.POST)
    Customer updateCustomer(
            @ApiParam(name = "Customer Details", required = true)
            @RequestBody Customer customer) {

        return iCustomerService.updateCustomer(customer);
    }
}