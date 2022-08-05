package com.example.demo.repositort;

import com.example.demo.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface IEmployeeRepository extends CrudRepository<Employee, Long> {
}
