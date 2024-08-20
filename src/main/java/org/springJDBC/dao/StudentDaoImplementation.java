package org.springJDBC.dao;

import org.springJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component("stdDao") // Marks this class as a Spring component with the specified name ("stdDao").
public class StudentDaoImplementation implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate; // Injects the JdbcTemplate bean from the Spring context.

    @Override
    public int addStudent(Student student) {
        // SQL query to insert a new student record into the database.
        String sql = "INSERT INTO Student (Name, EmailAddress, PhoneNumber, Gender, Age) VALUES (?,?,?,?,?)";
        // Executes the update query using the JdbcTemplate, passing the student properties as parameters.
        return jdbcTemplate.update(sql, student.getStdName(), student.getStdEmail(), student.getStdPhone(), student.getGender(), student.getAge());
    }

    @Override
    public int updateStudent(Student student) {
        // SQL query to update an existing student record in the database.
        String sql = "UPDATE Student SET Name = ?, EmailAddress = ?, PhoneNumber = ?, Gender = ?, Age = ? WHERE StdID = ?";
        // Executes the update query using the JdbcTemplate, passing the student properties and ID as parameters.
        return jdbcTemplate.update(sql, student.getStdName(), student.getStdEmail(), student.getStdPhone(), student.getGender(), student.getAge(), student.getStdID());
    }

    @Override
    public int deleteStudent(int id) {
        // SQL query to delete a student record from the database by ID.
        String sql = "DELETE FROM Student WHERE StdID = ?";
        // Executes the delete query using the JdbcTemplate, passing the student ID as a parameter.
        return jdbcTemplate.update(sql, id);
    }

    @Override
    public Student getStudent(int id) {
        // Defines a RowMapper to map each row of the ResultSet to a Student object.
        RowMapper<Student> rowMapper = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student = new Student();
                // Maps each column of the ResultSet to the corresponding property of the Student object.
                student.setStdName(rs.getString("Name")); // Use column names for clarity.
                student.setStdEmail(rs.getString("EmailAddress"));
                student.setStdPhone(rs.getString("PhoneNumber"));
                student.setGender(rs.getString("Gender"));
                student.setAge(rs.getInt("Age"));
                return student;
            }
        };

        // SQL query to select a student record by ID.
        String sql = "SELECT * FROM Student WHERE StdID = ?";
        // Executes the query and maps the result to a Student object using the RowMapper.
        return jdbcTemplate.queryForObject(sql, rowMapper, id);
    }

    @Override
    public List<Student> getAllStudents() {
        // Defines a RowMapper to map each row of the ResultSet to a Student object.
        RowMapper<Student> rowMapper = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student = new Student();
                // Maps each column of the ResultSet to the corresponding property of the Student object.
                student.setStdName(rs.getString("Name")); // Use column names for clarity.
                student.setStdEmail(rs.getString("EmailAddress"));
                student.setStdPhone(rs.getString("PhoneNumber"));
                student.setGender(rs.getString("Gender"));
                student.setAge(rs.getInt("Age"));
                return student;
            }
        };

        // SQL query to select all student records from the database.
        String sql = "SELECT * FROM Student";
        // Executes the query and maps each row of the ResultSet to a list of Student objects using the RowMapper.
        return jdbcTemplate.query(sql, rowMapper);
    }
}
