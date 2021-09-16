package com.company.main;

import com.company.conditionsandenums.SchoolType;
import com.company.conditionsandenums.UseColor;
import com.company.exceptions.AgeNotCorrectException;
import com.company.exceptions.GradeNotCorrectException;
import com.company.exceptions.NameDeclarationWrong;
import com.company.exceptions.NameEnteredNotValid;
import com.company.schoolpackage.PrintStudentInformation;

import java.util.Locale;
import java.util.Scanner;

public class MyLauncher {
    public static char i;
    public static final String ERROR = "PLEASE ENTER SINGLE CHARACTER FROM MENU";
    public static final String DOTS = "***********************************************************************";

    public static void main(String[] args) {
        // write your code here
        System.out.println(UseColor.ANSI_RED + DOTS);
        System.out.println(UseColor.ANSI_CYAN + "WELCOME TO THE SCHOOL ADMISSION APP !!!!!     PRESS X TO EXIT");
        System.out.println(UseColor.ANSI_RED + DOTS);
        // printing menu at starting
        printMenu();

        // Taking value from menu
        i = takeValue();

        System.out.println("******************************************************************************");
        GettingInformation gettingInformation = new GettingInformation();
        PrintStudentInformation p =   new PrintStudentInformation(gettingInformation.highSchool,
                gettingInformation.middleSchool, gettingInformation.preSchool, gettingInformation.elementary);
        boolean flag = true;
        while (flag) {
            switch (i) {
                case 'A':
                    try {
                        gettingInformation.getStudentInformation();
                    } catch (NameEnteredNotValid e) {
                        System.out.println(UseColor.ANSI_RED + "Name entered not valid");
                    } catch (NameDeclarationWrong nameDeclarationWrong) {
                        System.out.println(UseColor.ANSI_RED+"NameDeclarationWrong Exception thrown");
                        System.out.println("PLEASE CHECK YOUR NAME FOR NEXT TIME");
                    } catch (GradeNotCorrectException e) {
                        e.printStackTrace();
                    } catch (AgeNotCorrectException e) {
                        e.printStackTrace();
                    }
                    continueLoop();
                    break;
                case 'B':
                    p.printALL();
                    continueLoop();
                    break;
                case 'C':
                    p.printingStudent(SchoolType.HIGH_SCHOOL);
                    continueLoop();
                    break;
                case 'D':
                    p.printingStudent(SchoolType.PRE_SCHOOL);
                    continueLoop();
                    break;
                case 'E':
                    p.printingStudent(SchoolType.ELEMENTARY);
                    continueLoop();
                    break;
                case 'F':
                    p.printingStudent(SchoolType.MIDDLE_SCHOOL);
                    continueLoop();
                    break;
                case 'X':
                    System.out.println(UseColor.ANSI_PURPLE+"EXITING PROGRAM --->>>.....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("We don't have information about this");
                    printMenu();
                    System.out.println(UseColor.ANSI_RED + ERROR);
                    i = takeValue();
                    break;

            }
        }
    }

    // Created method to print menu
    public static void printMenu() {
        System.out.println(UseColor.ANSI_BLUE + "Press X to exit" + "\n" +
                UseColor.ANSI_GREEN + "Press A to add new student" + "\n" +
                "Press B to Print ALL students" + "\n" +
                "Press C to Print Students for HIGH SCHOOL" + "\n" +
                "Press D to Print Students for PRE SCHOOL" + "\n" +
                "Press E to Print Students for ELEMENTARY SCHOOL" +
                "\n" + "Print F to Print Students for MIDDLE SCHOOL");
    }

    //Created Method to take value
    public static char takeValue() {
        System.out.println(UseColor.ANSI_YELLOW + "Enter your input >>>>>>>..");
        Scanner s = new Scanner(System.in);
        boolean flag = true;
        char value = 0;
        while (flag) {
            if (s.hasNextDouble() || s.hasNextInt()) {
                printMenu();
                System.out.println(UseColor.ANSI_RED + ERROR);
                s.next();
            } else {
                String s1 = s.next();
                if (s1.length() == 1) {
                    value = s1.toUpperCase(Locale.ROOT).charAt(0);
                    flag = false;
                }
            }
        }
        return value;
    }

    //Created method to stay in program
    //It gives you condition whether you want to stay in program
    public static void continueLoop() {
        System.out.println(UseColor.ANSI_YELLOW + "«««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««" +
                "«««««««««««««««««" + "\n" + "Do you want to Continue" + "\n" + "Press Y for continue and X for exit");
        Scanner continueL = new Scanner(System.in);
        char ch = continueL.next().toUpperCase(Locale.ROOT).charAt(0);
        boolean mark = true;
        do {
            switch (ch) {
                case 'Y':
                    System.out.println("**************************************************" + "\n" +
                            "TAKING YOU BACK TO THE SYSTEM >>>> ......");
                    printMenu();
                    i = takeValue();
                    mark = false;
                    break;
                case 'X':
                    System.exit(0);
                    break;
                default:
                    System.out.println(UseColor.ANSI_RED + "Choose from Y or X");
                    ch = continueL.next().toUpperCase(Locale.ROOT).charAt(0);
            }
        } while (mark);
    }
}

