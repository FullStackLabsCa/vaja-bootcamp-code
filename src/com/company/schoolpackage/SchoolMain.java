package com.company.schoolpackage;

import com.company.main.Student;

public interface SchoolMain {

    int noOfStudents();
    Student admitStudent(Student student);
    double calculateFees(Student student);
    void printStudent();

}
