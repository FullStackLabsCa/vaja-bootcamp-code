package com.company.schoolpackage;

import com.company.conditionsandenums.SchoolType;
import com.company.conditionsandenums.UseColor;

public class PrintStudentInformation {

    // Created separate class for printing results.

    private HighSchool highSchool;
    private MiddleSchool middleSchool;
    private PreSchool preSchool;
    private Elementary elementary;
    private static final String DOTS = "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::";
    private static final String EMPTY = ">>>>>>>>>>>>>>>>>>>>>>>>>>>>E  M  P  T  Y<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<";

    public PrintStudentInformation(HighSchool highSchool, MiddleSchool middleSchool, PreSchool preSchool,
                                   Elementary elementary) {
        this.highSchool = highSchool;
        this.middleSchool = middleSchool;
        this.preSchool = preSchool;
        this.elementary = elementary;
    }

    private PrintStudentInformation() {
    }

    //Prints student based on condition

    public void printingStudent(SchoolType schoolType) {
        if (schoolType == highSchool.schoolType) {
            System.out.println();
            System.out.println(UseColor.ANSI_YELLOW + "******************LIST OF STUDENTS ADDED IN HIGH SCHOOL*******" +
                    "*****************");
            System.out.println(UseColor.ANSI_YELLOW + DOTS);
            design(schoolType);
            highSchool.printStudent();
        } else if (schoolType == middleSchool.schoolType) {
            System.out.println();
            System.out.println(UseColor.ANSI_YELLOW + "******************LIST OF STUDENTS ADDED IN MIDDLE SCHOOL***" +
                    "*********************");
            design(schoolType);
            middleSchool.printStudent();
        } else if (schoolType == elementary.schoolType) {
            System.out.println();
            System.out.println(UseColor.ANSI_YELLOW + "******************LIST OF STUDENTS ADDED IN ELEMENTARY SCHOOL**" +
                    "**********************");
            design(schoolType);
            elementary.printStudent();
        } else {
            System.out.println();
            System.out.println(UseColor.ANSI_YELLOW + "******************LIST OF STUDENTS ADDED IN PRE-SCHOOL ****" +
                    "********************");
            design(schoolType);
            preSchool.printStudent();

        }

    }

    //printing all the Students in all schools

    public void printALL() {
        System.out.println(UseColor.ANSI_YELLOW + "******************LIST OF STUDENTS ADDED IN HIGH SCHOOL******" +
                "*******************");
        System.out.println(DOTS);
        design(SchoolType.HIGH_SCHOOL);
        highSchool.printStudent();
        System.out.println();
        System.out.println(UseColor.ANSI_YELLOW + "******************LIST OF STUDENTS ADDED IN MIDDLE SCHOOL*******" +
                "****************");
        System.out.println(DOTS);
        design(SchoolType.MIDDLE_SCHOOL);
        middleSchool.printStudent();
        System.out.println();
        System.out.println(UseColor.ANSI_YELLOW + "******************LIST OF STUDENTS ADDED IN ELEMENTARY SCHOOL**" +
                "*****************");
        System.out.println(DOTS);
        design(SchoolType.ELEMENTARY);
        elementary.printStudent();
        System.out.println();
        System.out.println(UseColor.ANSI_YELLOW + "******************LIST OF STUDENTS ADDED IN PRE-SCHOOL *******" +
                "*******************");
        System.out.println(DOTS);
        design(SchoolType.PRE_SCHOOL);
        preSchool.printStudent();
    }

    // If any school is empty it will print empty line

    private void design(SchoolType schoolType) {
        if (schoolType == highSchool.schoolType) {
            if (highSchool.noOfStudent == 0) {
                System.out.println(UseColor.ANSI_WHITE + EMPTY);
            }
        } else if (schoolType == middleSchool.schoolType) {
            if (middleSchool.noOfStudent == 0) {
                System.out.println(UseColor.ANSI_WHITE + EMPTY);
            }
        } else if (schoolType == elementary.schoolType) {
            if (elementary.noOfStudent == 0) {
                System.out.println(UseColor.ANSI_WHITE + EMPTY);
            }
        } else if (schoolType == preSchool.schoolType && preSchool.noOfStudent == 0) {

            System.out.println(UseColor.ANSI_WHITE + EMPTY);

        }
    }
}
