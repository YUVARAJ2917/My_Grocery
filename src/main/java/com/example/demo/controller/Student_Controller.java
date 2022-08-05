package com.example.demo.controller;
import com.example.demo.entity.StudentInfo;
import com.example.demo.repositort.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Student_Controller {

    @Autowired
    public IStudentRepository iStudentRepository;

    @PostMapping(path = "/addStudentInfo")
    public String addStudentInfo() {
        StudentInfo student = new StudentInfo();
        student.setId(35256l);
        student.setName("naveen");
        student.setStd("HSC");
        student.setSubject("com science");
        student.setResults("fail");
        return iStudentRepository.save(student).toString();

    }
    @GetMapping(path = "/getStudent")
    public String getStudentInfo() {
        return iStudentRepository.findAll().toString();
    }


    @DeleteMapping(path = "/deleteStudent")
    public String deleteStudentInfo() {
        StudentInfo studentinfo = iStudentRepository.findAll().iterator().next();
        iStudentRepository.delete(studentinfo);
        return null;
    }
     @PutMapping(path = "/putStudent")
     public String putStudentInfo() {
         StudentInfo student = new StudentInfo();

         student.setId(3526l);
         student.setName("yuva");
         student.setStd("HSC");


         student.setSubject("maths");
         student.setResults("pass");
         return iStudentRepository.save(student).toString();


     }
}

