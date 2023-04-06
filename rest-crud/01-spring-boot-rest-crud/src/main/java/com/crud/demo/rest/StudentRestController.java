package com.crud.demo.rest;

import com.crud.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

     @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        //check the studentID against the list size
        if (studentId >= theStudents.size() || studentId < 0)
            throw new StudentNotFoundException("Student id not found: " + studentId);

        return theStudents.get(studentId);
    }
}
