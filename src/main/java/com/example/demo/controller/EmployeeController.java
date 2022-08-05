package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.repositort.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    public IEmployeeRepository iEmployeeRepository;

    @PostMapping(path = "/addEmployee")
    public String addEmployee() {
        Employee employee = new Employee();
        employee.setEmpId(1342L);
        employee.setAge(25);
        employee.setDesignation("Software engineer");
        employee.setName("gnana soundarya");
        employee.setLocation("Chennai");
        return iEmployeeRepository.save(employee).toString();
    }

    @GetMapping(path = "/get")
    public String getEmployee() {
        return iEmployeeRepository.findAll().toString();
    }

    @DeleteMapping(path = "/delete")
    public String deleteEmployee() {
        Employee employee = iEmployeeRepository.findAll().iterator().next();
        iEmployeeRepository.delete(employee);
        return null;
    }


}