package com.company.schoolpackage;

import com.company.conditionsandenums.SchoolType;
import com.company.main.Student;
import com.company.conditionsandenums.UseColor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class School implements SchoolMain {

    Map<Grade, List<Student>> gradeToStudentsMap = new HashMap<>();
    public int noOfStudent=0;

    @Override
    public int noOfStudents() {
        return noOfStudent;
    }

    @Override
    public Student admitStudent(Student student) {
        if (gradeToStudentsMap.get(student.getGrade()) == null) {
            List<Student> studentList = new ArrayList<>();
            studentList.add(student);
            gradeToStudentsMap.put(student.getGrade(), studentList);
            System.out.println(UseColor.ANSI_CYAN+"Student added =" + student);
            noOfStudent++;

        } else {
            List<Student> studentList = gradeToStudentsMap.get(student.getGrade());
            if (studentList.size() >= 3) {
                System.out.println(UseColor.ANSI_RED+"Class is full Admission DENIED");
            } else {
                studentList.add(student);
                noOfStudent++;
                System.out.println(UseColor.ANSI_CYAN+"Student added =" + student);
            }
        }
        return student;
    }

    public void printStudent() {
        for (Map.Entry<Grade, List<Student>> student : gradeToStudentsMap.entrySet()) {
            for (int i = 0; i < gradeToStudentsMap.get(student.getKey()).size(); i++) {
                System.out.println(UseColor.ANSI_CYAN + gradeToStudentsMap.get(student.getKey()).get(i));
                System.out.println("NUMBER OF STUDENTS ADMITTED IN SCHOOL IS  : " +noOfStudent);
            }

        }

    }

}
