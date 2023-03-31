package com.crud.demo.rest;

import com.crud.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    //define a field and populate once
    private List<Student> theStudents;

    //define @PostConstruct to load the student data ONLY ONCE, when the bean is created.
    @PostConstruct
    public void loadData() {
        theStudents = new ArrayList<>();

        theStudents.add(new Student("Poornima", "Patel"));
        theStudents.add(new Student("Vasile", "Verejan"));
        theStudents.add(new Student("Benjamin", "Franklin"));

    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return theStudents;
    }

    //define end point to retrieve only one student

    @GetMapping("/student/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        //just index into the list  ... keep it simple for now.

        return theStudents.get(studentId);
    }
}
