package com.yes2code.cruddemo.dao;

import com.yes2code.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {

    //define field for entity manager
    EntityManager entityManager;

    //inject entity manager using constructor
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //implement save method, this will save student to the database.
    //Transactional- if a part of code will fail the whole transaction will roll back,
    //it is used to execute a comand as an whole unit.
    //For example, if an application needs to update several tables in a database as part
    // of a single operation, using a transactional annotation can ensure that either all
    // the updates are committed, or none of them are committed.
    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);

    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {

        //create query
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student", Student.class);

        //return query result
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {

        //create query
        TypedQuery<Student> theQuery = entityManager.createQuery("from Student where lastName = :theData", Student.class);

        //set query params
        theQuery.setParameter("theData", lastName);

        //return results
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student theStudent) {

        //Perform the update on the student
        entityManager.merge(theStudent);

    }

    //Transactional used when modifying only not retrieving
    @Override
    @Transactional
    public void delete(Integer id) {

        //retrieve student
        Student theStudent = entityManager.find(Student.class, id);

        //delete student
        entityManager.remove(theStudent);

    }

    @Override
    @Transactional
    public int deleteAll() {

        int numRowsDeleted = entityManager.createQuery("delete from Student").executeUpdate();
        return numRowsDeleted;
    }


}
