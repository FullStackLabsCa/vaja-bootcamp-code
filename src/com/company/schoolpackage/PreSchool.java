package com.company.schoolpackage;


import com.company.conditionsandenums.SchoolType;
import com.company.conditionsandenums.UseColor;
import com.company.main.Student;

public class PreSchool extends School {

    SchoolType schoolType = SchoolType.PRE_SCHOOL;
    @Override
    public double calculateFees(Student student) {

        double fees=100*(1.1);
        if(student.getGrade()== Grade.JK){
            return Math.round(fees);
        }else if(student.getGrade()==Grade.SK){
            double gskFees = fees + fees * 25/100;
            fees=gskFees;
        }
        System.out.println(Math.round(fees));
        return Math.round(fees);
    }

    @Override
    public Student admitStudent(Student student) {
        System.out.println(UseColor.ANSI_CYAN+"Feees for student going to be >>>>>>>.. $" + calculateFees(student));
        return super.admitStudent(student);
    }
}
