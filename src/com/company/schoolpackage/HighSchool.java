package com.company.schoolpackage;

import com.company.conditionsandenums.SchoolType;
import com.company.conditionsandenums.UseColor;
import com.company.main.Student;

public class HighSchool extends School {

    SchoolType schoolType = SchoolType.HIGH_SCHOOL;
    @Override
    public double calculateFees(Student student) {
       double fees=100*(2.00);
        if(student.getGrade()== Grade.GRADE9){
            return fees;
        }else if(student.getGrade()==Grade.GRADE10){
            fees = fees + fees * 45/100;
        }
        return fees;
    }
    public double calculate(int side){
        return side*side;
    }

    @Override
    public Student admitStudent(Student student) {
        System.out.println(UseColor.ANSI_CYAN+"Feees for student going to be «««««« $" + calculateFees(student));
        return super.admitStudent(student);
    }
}
