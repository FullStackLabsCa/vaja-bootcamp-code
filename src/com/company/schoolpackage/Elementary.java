package com.company.schoolpackage;

import com.company.conditionsandenums.SchoolType;
import com.company.conditionsandenums.UseColor;
import com.company.main.Student;

public class Elementary extends School {

    SchoolType schoolType = SchoolType.ELEMENTARY;

    @Override
    public double calculateFees(Student student) {
        double fees=100*(1.5);
        if(student.getGrade()== Grade.GRADE1){
            return  Math.round(fees);
        }else if(student.getGrade()==Grade.GRADE2){
            double G2fees = fees + fees * 30/100;
            fees=G2fees;
        }else if(student.getGrade()==Grade.GRADE3){
            double G3fees = fees + fees * 60/100 ;
            fees =G3fees;
        }else if (student.getGrade()==Grade.GRADE4){
            double G4fees= fees + fees * 90/100;
            fees = G4fees;
        }else if (student.getGrade()==Grade.GRADE5){
            double G5fees = fees + fees * 90/100;
            fees = G5fees +G5fees*30/100;
        }
        return Math.round(fees);
    }

    @Override
    public Student admitStudent(Student student) {
        System.out.println(UseColor.ANSI_CYAN+"Feees for student going to be «««««« $" + calculateFees(student));
        return super.admitStudent(student);
    }

}
