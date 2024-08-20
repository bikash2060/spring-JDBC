package org.springJDBC;

import org.springJDBC.configuration.SpringJDBCConfig;
import org.springJDBC.dao.StudentDao;
import org.springJDBC.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringJDBCConfig.class);

        StudentDao studentDao = (StudentDao) context.getBean("stdDao");

        /* Inserting New Student
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter student email address: ");
        String email = scanner.nextLine();
        System.out.println("Enter student phone number: ");
        String phone = scanner.nextLine();
        System.out.println("Enter student gender: ");
        String gender = scanner.nextLine();
        System.out.println("Enter student age: ");
        int age = scanner.nextInt();

        Student newStudent = new Student(name, email, phone, gender, age);
        int result = studentDao.addStudent(newStudent);
        System.out.println("New student added: " + result);
        */

        /* Updating Existing Student
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter student email address: ");
        String email = scanner.nextLine();
        System.out.println("Enter student phone number: ");
        String phone = scanner.nextLine();
        System.out.println("Enter student gender: ");
        String gender = scanner.nextLine();
        System.out.println("Enter student age: ");
        int age = scanner.nextInt();

        int stdID = 100;
        Student newStudent = new Student();
        newStudent.setStdName(name);
        newStudent.setStdEmail(email);
        newStudent.setStdPhone(phone);
        newStudent.setGender(gender);
        newStudent.setAge(age);
        newStudent.setStdID(stdID);

        int result = studentDao.updateStudent(newStudent);
        System.out.println("Student details updated: " + result);
        */

        /* Deleting Existing Student
        int stdID = 100;
        int result = studentDao.deleteStudent(stdID);
        System.out.println("Student deleted successfully: " + result);
        */

        /* Fetching Student by ID
        int stdID = 100;
		Student student = studentDao.getStudent(stdID);
		System.out.println("Student Full Name: "+student.getStdName());
        System.out.println("Student Email Address: "+student.getStdEmail());
        System.out.println("Student Phone Number: "+student.getStdPhone());
        System.out.println("Student Gender: "+student.getGender());
        System.out.println("Student Age : "+student.getAge());
        */

        /* Fetching All Students

        List<Student> studentList = studentDao.getAllStudents();
        for (Student student : studentList) {
            System.out.println("Student Full Name: "+student.getStdName());
            System.out.println("Student Email Address: "+student.getStdEmail());
            System.out.println("Student Phone Number: "+student.getStdPhone());
            System.out.println("Student Gender: "+student.getGender());
            System.out.println("Student Age : "+student.getAge());
            System.out.println();
        }*/
        scanner.close();
    }

}
