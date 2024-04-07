package employees;
import folder.Employee;
public class Manager extends Employee {
    public String getNumberOfSubordinates( String numberOfSubordinates) {
        return  numberOfSubordinates;
    }
    public String toString(String getFullName, String getSalary, String numberOfSubordinates)  {
        return "Manager:"  +getFullName+ "Salary:" + getSalary+ "Subordinates:" + numberOfSubordinates ;
    }
    
}
