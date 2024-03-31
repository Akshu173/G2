import java.text.ParseException;

public class EmployeeDetails extends Person {
    private int empId;
    private double salary;

    public EmployeeDetails(String name, String dob, int empId, double salary) throws ParseException {
        super(name, dob);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: $" + salary);
    }
}
