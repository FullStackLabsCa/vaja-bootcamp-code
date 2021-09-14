package com.company.schoolpackage;

import com.company.conditionsandenums.SchoolType;
import com.company.conditionsandenums.UseColor;
import com.company.main.Student;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class HighSchool extends School {

    SchoolType schoolType = SchoolType.HIGH_SCHOOL;
    @Override
    public double calculateFees(Student student) {
        double fees = 100 * (2.00);

        switch (student.getGrade()) {
            case GRADE9:
                return fees;
            case GRADE10:
                return fees + fees * 45 / 100;
            case GRADE11:
                return fees + fees * 90 / 100;
            case GRADE12:
                return fees + fees * 90 / 100 + fees * 45 / 100;
            default:
                System.out.println("no fees avaiable");
                return 0;
        }
    }

    @Override
    public Student admitStudent(Student student) {
        System.out.println(UseColor.ANSI_CYAN+"Feees for student going to be «««««« $" + calculateFees(student));
        return super.admitStudent(student);
    }
}
