package com.company.schoolpackage;

import com.company.conditionsandenums.SchoolType;
import com.company.conditionsandenums.UseColor;
import com.company.main.Student;

public class MiddleSchool extends School {

    SchoolType schoolType = SchoolType.MIDDLE_SCHOOL;
    @Override
    public double fees(Student student) {
        double fees=100*(1.75);
        if(student.getGrade()== Grade.GRADE6){
          return fees;
        }else if(student.getGrade()==Grade.GRADE7){
            double G7fees = fees + fees * 35/100;
            fees=G7fees;
        }else if(student.getGrade()==Grade.GRADE8){
            double G8fees = fees + fees * 35/100 ;
                    fees =G8fees +  G8fees * 35/100;
        }
        return fees;
    }

    @Override
    public Student admitStudent(Student student) {
        System.out.println(UseColor.ANSI_CYAN+"Fees for student going to be >>>>>>>>... $" + fees(student));
        return super.admitStudent(student);
    }
}
