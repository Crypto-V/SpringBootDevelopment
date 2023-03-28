package com.yes2code.cruddemo.dao;

import com.yes2code.cruddemo.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);
}
