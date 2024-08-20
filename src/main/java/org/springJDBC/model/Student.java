package org.springJDBC.model;

import java.util.Date;

public class Student {

    private int stdID;
    private String stdName;
    private String stdEmail;
    private String stdPhone;
    private String gender;
    private int age;

    public Student() {}

    public Student(String stdName, String stdEmail, String stdPhone, String gender, int age) {
        this.stdName = stdName;
        this.stdEmail = stdEmail;
        this.stdPhone = stdPhone;
        this.gender = gender;
        this.age = age;
    }

    public int getStdID() {
        return stdID;
    }

    public void setStdID(int stdID) {
        this.stdID = stdID;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdEmail() {
        return stdEmail;
    }

    public void setStdEmail(String stdEmail) {
        this.stdEmail = stdEmail;
    }

    public String getStdPhone() {
        return stdPhone;
    }

    public void setStdPhone(String stdPhone) {
        this.stdPhone = stdPhone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
