package folder;

public class Employee {
    
    private String fullName;
    private double salary;

    public String getName() {
        return fullName;
    }
    public double setSalary(double salary) {
        return  salary;
    }
    public String toString(String fullName, String salary )  {
        return "Employee: " + fullName + ", Salary: " + salary;
    }
    
}
