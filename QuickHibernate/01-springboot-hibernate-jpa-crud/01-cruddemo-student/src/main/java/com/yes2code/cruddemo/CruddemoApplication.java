package com.yes2code.cruddemo;

import com.yes2code.cruddemo.dao.StudentDAO;
import com.yes2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);

    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
//            createStudent(studentDAO);
//            createMultipleStudents(studentDAO);
//            readStudent(studentDAO);
        };
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
