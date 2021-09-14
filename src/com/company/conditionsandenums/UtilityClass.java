package com.company.conditionsandenums;

import com.company.exceptions.AgeNotCorrectException;
import com.company.exceptions.GradeNotCorrectException;
import com.company.schoolpackage.Grade;

public class UtilityClass {

    private UtilityClass() {
    }
    // Determining Grade based on age

    public static Grade determineGradeOnAge(int age) throws AgeNotCorrectException {

        switch (age) {
            case 4:
                return Grade.JK;
            case 5:
                return Grade.SK;
            case 6:
                return Grade.GRADE1;
            case 7:
                return Grade.GRADE2;
            case 8:
                return Grade.GRADE3;
            case 9:
                return Grade.GRADE4;
            case 10:
                return Grade.GRADE5;
            case 11:
                return Grade.GRADE6;
            case 12:
                return Grade.GRADE7;
            case 13:
                return Grade.GRADE8;
            case 14:
                return Grade.GRADE9;
            case 15:
                return Grade.GRADE10;
            case 16:
                return Grade.GRADE11;
            case 17:
                return Grade.GRADE12;
            default:
                throw new AgeNotCorrectException("Enter must be between 5 and 16");
        }
    }

    // Determining Grade Based on age

    public static SchoolType determineSchoolBasedOnGrade(Grade grade) throws GradeNotCorrectException {


        switch (grade) {
            case JK:
            case SK:
                return SchoolType.PRE_SCHOOL;
            case GRADE1:
            case GRADE2:
            case GRADE3:
            case GRADE4:
            case GRADE5:
                return SchoolType.ELEMENTARY;
            case GRADE6:
            case GRADE7:
            case GRADE8:
                return SchoolType.MIDDLE_SCHOOL;
            case GRADE9:
            case GRADE10:
            case GRADE11:
            case GRADE12:
                return SchoolType.HIGH_SCHOOL;

            default:
            throw new GradeNotCorrectException();
        }
    }

}
