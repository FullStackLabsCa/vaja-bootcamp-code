package school.pkg;
import com.company.conditionsandenums.SchoolType;
import com.company.main.Student;
import com.company.schoolpackage.*;
import org.junit.Assert;
import org.junit.Test;
public class Testing {

    @Test
    public void testFeeCalculationForHigh(){
    HighSchool highSchool = new HighSchool();
    Student s = new Student("G9","rohan",5, Grade.GRADE9, SchoolType.HIGH_SCHOOL);
    double fees = highSchool.calculateFees(s);
    Assert.assertTrue(fees==200.0);
    }
    @Test
    public void testFeeCalculationForPreschool(){
        PreSchool preSchool = new PreSchool();
        Student s = new Student("G9","rohan",5, Grade.JK, SchoolType.PRE_SCHOOL);
        double fees = preSchool.calculateFees(s);
        Assert.assertTrue(fees==110);
    }
    @Test
    public void testFeeCalculationForElementaryschool(){
        Elementary elementary = new Elementary();
        Student s = new Student("G9","rohan",5, Grade.GRADE5, SchoolType.ELEMENTARY);
        double fees = elementary.calculateFees(s);
        Assert.assertTrue(fees==371);
    }
    @Test
    public void testFeeCalculationForMiddleschool(){
        MiddleSchool middleSchool = new MiddleSchool();
        Student s = new Student("G9","rohan",5, Grade.GRADE6, SchoolType.MIDDLE_SCHOOL);
        double fees = middleSchool.calculateFees(s);
        Assert.assertTrue(fees==175);
    }

}
