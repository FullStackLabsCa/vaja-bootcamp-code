package com.company.schoolpackage;


import com.company.conditionsandenums.SchoolType;
import com.company.conditionsandenums.UseColor;
import com.company.main.Student;

public class PreSchool extends School {

    SchoolType schoolType = SchoolType.PRE_SCHOOL;
    @Override
    public double fees(Student student) {
        double fees=100*(1.1);
        if(student.getGrade()== Grade.JK){
            return fees;
        }else if(student.getGrade()==Grade.SK){
            double gskFees = fees + fees * 25/100;
            fees=gskFees;
        }
        return fees;
    }

    @Override
    public Student admitStudent(Student student) {
        System.out.println(UseColor.ANSI_CYAN+"Feees for student going to be >>>>>>>.. $" + fees(student));
        return super.admitStudent(student);
    }
}
