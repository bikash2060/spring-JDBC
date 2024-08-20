package org.springJDBC.dao;

import org.springJDBC.model.Student;

import java.util.List;

public interface StudentDao {

    public int addStudent(Student student);

    public int updateStudent(Student student);

    public int deleteStudent(int id);

    public Student getStudent(int id);

    public List<Student> getAllStudents();
}
