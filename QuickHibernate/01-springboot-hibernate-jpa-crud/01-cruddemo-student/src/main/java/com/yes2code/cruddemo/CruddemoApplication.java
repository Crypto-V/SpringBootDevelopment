package com.yes2code.cruddemo;

import com.yes2code.cruddemo.dao.StudentDAO;
import com.yes2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class CruddemoApplication {


    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);

    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
//            createStudent(studentDAO);
            createMultipleStudents(studentDAO);
//            readStudent(studentDAO);
//            queryForStudents(studentDAO);
//            queryForStudentsByLastName(studentDAO);
//            updateStudent(studentDAO);
//            deleteStudent(studentDAO);
//            deleteAllStudents(studentDAO);


        };
    }

    private void deleteAllStudents(StudentDAO studentDAO) {
        System.out.println("Deleting all students");
        int nrRowsDeleted = studentDAO.deleteAll();
        System.out.println("Number of rows deleted:> " + nrRowsDeleted);
    }

    private void deleteStudent(StudentDAO studentDAO) {
        int studentId = 1;
        System.out.println("Deleting the student with the id:> "+studentId);
        //delete the student
        Student targetStudent = studentDAO.findById(studentId);
        studentDAO.delete(studentId);
        System.out.println("Deleted!" + targetStudent);
    }

    private void updateStudent(StudentDAO studentDAO) {

        //retrieve student based on the id : primary key
        int studentId = 1;
        System.out.println("Getting the student with the id: "+studentId);
        Student myStudent = studentDAO.findById(studentId);

        //change first name to "Andrei"
        System.out.println("Updating the Student firstName");
        myStudent.setFirstName("Andrei");

        //update the Student
        studentDAO.update(myStudent);

        // display the Updated student
        System.out.println("Updated Student:> "+ myStudent);


    }

    private void queryForStudentsByLastName(StudentDAO studentDAO) {

        //get the list of the students
        List<Student> theStudents = studentDAO.findByLastName("Dog");

        //display list of students
        for (Student tempStudent : theStudents) System.out.println(tempStudent);
    }

    private void queryForStudents(StudentDAO studentDAO) {
        //get a list of students
        List<Student> theStudents = studentDAO.findAll();

        //display the list
        for (Student tempStudent : theStudents) {
            System.out.println(tempStudent);
        }
    }

    private void readStudent(StudentDAO studentDAO) {

        //This is the method to find and get the student
        //create student object
        System.out.println("Creating  new student objects...");
        Student tempStudent = new Student("Guffy", "Dog", "ilovesousage@gmail.com");

        //save the student
        System.out.println("Saving student");
        studentDAO.save(tempStudent);

        //Display the id of the student
        int theId = tempStudent.getId();
        System.out.println("Here is the id of the saved student: >" + theId);

        //retrieve student based on the id: priamry key.
        System.out.println("Looking for the student with the id of: >" + theId);
        Student student = studentDAO.findById(theId);


        //dsiplay student
        System.out.println("Here is your student: > " + student);
    }

    private void createMultipleStudents(StudentDAO studentDAO) {

        //create multiple students
        System.out.println("Creating  new student objects...");
        Student tempStudent = new Student("Andrei", "Malina", "am@gmail.com");
        Student tempStudent1 = new Student("Linkin ", "Park", "lp@gmail.com");
        Student tempStudent2 = new Student("Chester", "Benington", "cb@gmail.com");

        //save the students objects
        System.out.println("saving the objects");
        studentDAO.save(tempStudent);
        studentDAO.save(tempStudent1);
        studentDAO.save(tempStudent2);
        System.out.println("Student: " + tempStudent.getId() + " " + tempStudent.getFirstName() + " successfully saved in DBMS");
        System.out.println("Student: " + tempStudent1.getId() + " " + tempStudent1.getFirstName() + " successfully saved in DBMS");
        System.out.println("Student: " + tempStudent2.getId() + " " + tempStudent2.getFirstName() + " successfully saved in DBMS");

    }

    private void createStudent(StudentDAO studentDAO) {

        //create the student object
        System.out.println("Creating a new student object...");
        Student tempStudent = new Student("Vasile", "Verejan", "vv@gmail.com");

        //save the student object
        System.out.println("Saving the student");
        studentDAO.save(tempStudent);

        //display id of the saved student
        System.out.println("Saved Student! : Generated id-> " + tempStudent.getId());
    }


}
