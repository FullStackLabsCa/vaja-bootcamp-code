package com.company.conditionsandenums;

import com.company.exceptions.AgeNotCorrectException;
import com.company.schoolpackage.Grade;

public class UtilityClass {

    private UtilityClass(){

    }

    // Determining Grade based on age

    public static Grade determineGradeOnAge(int age) throws AgeNotCorrectException {
          Grade grade;

        switch (age){
           case 5:
               grade=Grade.JK;
               break;
           case 6:
               grade=Grade.SK;
               break;
           case 7:
               grade=Grade.GRADE1;
               break;
           case 8:
               grade=Grade.GRADE2;
               break;
           case 9:
               grade=Grade.GRADE3;
               break;
           case 10:
               grade=Grade.GRADE4;
               break;
           case 11:
               grade=Grade.GRADE5;
               break;
           case 12:
               grade=Grade.GRADE6;
               break;
           case 13:
               grade=Grade.GRADE7;
               break;
           case 14:
               grade=Grade.GRADE8;
               break;
           case 15:
               grade=Grade.GRADE9;
               break;
           case 16:
               grade=Grade.GRADE10;
               break;
            default:
                throw new AgeNotCorrectException("Enter must be between 5 and 16");
       }
       return grade;
    }

    // Determining Grade Based on age

    public static SchoolType determineSchoolBasedOnGrade(Grade grade){
        SchoolType schoolType =null;
        if(grade==Grade.JK || grade==Grade.SK){
            schoolType = SchoolType.PRE_SCHOOL;
        }else if(grade==Grade.GRADE1 || grade==Grade.GRADE2 || grade ==Grade.GRADE3
        || grade ==Grade.GRADE4 || grade ==Grade.GRADE5){
            schoolType =SchoolType.ELEMENTARY;
        }else if(grade==Grade.GRADE6||grade==Grade.GRADE7||grade==Grade.GRADE8){
            schoolType =SchoolType.MIDDLE_SCHOOL;
        }else if(grade==Grade.GRADE9||grade==Grade.GRADE10){
            schoolType =SchoolType.HIGH_SCHOOL;
        }
        return schoolType;
    }

}
