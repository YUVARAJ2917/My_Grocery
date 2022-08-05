package com.example.demo.repositort;

import com.example.demo.entity.StudentInfo;
import org.springframework.data.repository.CrudRepository;

public interface IStudentRepository extends CrudRepository<StudentInfo, Long> {
}
