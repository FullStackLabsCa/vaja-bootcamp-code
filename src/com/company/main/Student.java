package com.company.main;

import com.company.conditionsandenums.SchoolType;
import com.company.schoolpackage.Grade;

public class Student {
    private int age;
    private String studentName;
    private Grade grade;
    private SchoolType school;
    private String studentID =null;
    public Student(String id,String studentName, int age, Grade grade,SchoolType schoolType) {
        this.studentID =id;
        this.studentName = studentName;
        this.age = age;
        this.grade = grade;
        this.school=schoolType;
    }

    public String getStudentId() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public Grade getGrade() {
        return grade;
    }

    public SchoolType getSchool() {
        return school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", school=" + school +
                '}';
    }
}
