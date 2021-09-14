package com.company.main;

import com.company.conditionsandenums.SchoolType;
import com.company.conditionsandenums.UseColor;
import com.company.conditionsandenums.UtilityClass;
import com.company.exceptions.AgeNotCorrectException;
import com.company.exceptions.NameDeclarationWrong;
import com.company.exceptions.NameEnteredNotValid;
import com.company.schoolpackage.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public final class GettingInformation {


    private String name = null;
    private static int jK, sK, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10 = 0;
    SchoolMain highSchool = new HighSchool();
    SchoolMain middleSchool = new MiddleSchool();
    SchoolMain preSchool = new PreSchool();
    SchoolMain elementary = new Elementary();

    public GettingInformation() {
    }
     //created separate method  which is getting input from USER
    // Validating Student name and age

    public void getStudentInformation() throws NameEnteredNotValid, NameDeclarationWrong {
        Scanner scanner = new Scanner(System.in);
        System.out.println(UseColor.ANSI_YELLOW + "Enter Student name");
        boolean flag = true;
        while (flag) {
            if (scanner.hasNextInt()) {
                System.out.println(UseColor.ANSI_RED + "Enter only String");
                scanner.next();
            }else {
                name = scanner.next();
                if(name.toUpperCase().matches("[A-Z]+")){
                    char[] c = name.toCharArray();
                    if (c.length >= 50 || c.length <= 3) {
                        throw new NameEnteredNotValid();
                    }
                }
                else{
                    throw new NameDeclarationWrong();
                }
                flag = false;
            }
        }
        flag = true;
        System.out.println(UseColor.ANSI_YELLOW+"Enter DOB in format mm/dd/yyyy");
        while (flag) {
            String dob = scanner.next();
            if (checkDate(dob)) {
                String[] array;
                array = dob.split("/");
                int month = Integer.parseInt(array[0]);
                int days = Integer.parseInt(array[1]);
                int year = Integer.parseInt(array[2]);
                LocalDate today = LocalDate.now();
                LocalDate birthday = LocalDate.of(year, month, days);
                Period p = Period.between(birthday, today);
                int age = p.getYears();
                //checkDate(dob);
                System.out.println(UseColor.ANSI_CYAN + "You are " + age + " years old");
                Grade g = null;
                try {
                    g = UtilityClass.determineGradeOnAge(age);
                    System.out.println(g);
                } catch (AgeNotCorrectException e) {
                    if (age > 17) {
                        System.out.println(UseColor.ANSI_RED + "YOU ARE TOO OLD TO GET ADMISSION.WE TAKE STUDENTS WHO ARE BETWEEN 5 TO 16");
                    } else if (age < 5) {
                        System.out.println(UseColor.ANSI_RED + "YOU ARE TOO YOUNG TO GET ADMISSION. WE TAKE STUDENTS WHO ARE BETWEEN 5 TO 16");
                    }
                }
                SchoolType school = UtilityClass.determineSchoolBasedOnGrade(g);
                Student s = creatingIdAndAddingStudent(name, age, g, school);
                addStudentFinally(school, s);
                flag = false;
            } else {

                System.out.println("\n" + UseColor.ANSI_RED + " YOUR DATE OF BIRTH FORMAT IS WRONG : PLEASE CORRECT IT AND RE-ENTER IN MM/DD/YYYY FORMAT"
                        + "\n" + UseColor.ANSI_GREEN + "----------------------------------------------------------------------------------------");
            }
        }
    }

    // adding student to their perspective school based on GRADE

    private void addStudentFinally(SchoolType schoolType, Student student) {
        if (schoolType == SchoolType.HIGH_SCHOOL) {
            highSchool.admitStudent(student);
        } else if (schoolType == SchoolType.MIDDLE_SCHOOL) {
            middleSchool.admitStudent(student);
        } else if (schoolType == SchoolType.ELEMENTARY) {
            elementary.admitStudent(student);
        } else if (schoolType == SchoolType.PRE_SCHOOL) {
            preSchool.admitStudent(student);
        }
    }

    // Creating studentID based on their grade and returning Student.

    private Student creatingIdAndAddingStudent(String name, int age, Grade g, SchoolType s) {
        String gJk = "GJK-", gSk = "GSK-", s1 = "G1-", s2 = "G2-", s3 = "G3-", s4 = "G4-",
                s5 = "G5-", s6 = "G6-", s7 = "G7-", s8 = "G8-", s9 = "G9-", s10 = "G10-";
        Student student = null;
        if (g == Grade.JK) {
            int i9 = jK++;
            gJk = gJk + i9;
            student = new Student(gJk, name, age, g, s);
        } else if (g == Grade.SK) {
            int i9 = sK++;
            gSk = gSk + i9;
            student = new Student(gSk, name, age, g, s);
        } else if (g == Grade.GRADE1) {
            int i9 = g1++;
            s1 = s1 + i9;
            student = new Student(s1, name, age, g, s);
        } else if (g == Grade.GRADE2) {
            int i9 = g2++;
            s2 = s2 + i9;
            student = new Student(s2, name, age, g, s);
        } else if (g == Grade.GRADE3) {
            int i9 = g3++;
            s3 = s3 + i9;
            student = new Student(s3, name, age, g, s);
        } else if (g == Grade.GRADE4) {
            int i9 = g4++;
            s4 = s4 + i9;
            student = new Student(s4, name, age, g, s);
        } else if (g == Grade.GRADE5) {
            int i9 = g5++;
            s5 = s5 + i9;
            student = new Student(s5, name, age, g, s);
        } else if (g == Grade.GRADE6) {
            int i9 = g6++;
            s6 = s6 + i9;
            student = new Student(s6, name, age, g, s);
        } else if (g == Grade.GRADE7) {
            int i9 = g7++;
            s7 = s7 + i9;
            student = new Student(s7, name, age, g, s);
        } else if (g == Grade.GRADE8) {
            int i9 = g8++;
            s8 = s8 + i9;
            student = new Student(s8, name, age, g, s);
        } else if (g == Grade.GRADE9) {
            int i9 = g9++;
            s9 = s9 + i9;
            student = new Student(s9, name, age, g, s);
        } else if (g == Grade.GRADE10) {
            int i9 = g10++;
            s10 = s10 + i9;
            student = new Student(s10, name, age, g, s);
        }
        return student;
    }
    // Created method to check for Date if it is valid or not

    private boolean checkDate(String str) {
//        if (str.trim().equals("")) {
//            return true;
//        } else {
            SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy");
            sd.setLenient(false);
            try {
                Date javaD = sd.parse(str);
            } catch (ParseException e) {
                System.out.println("wrong input");
                return false;
            }
            return true;
    }
}
