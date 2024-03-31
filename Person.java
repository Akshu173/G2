import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    protected String name;
    private Date dateOfBirth;

    public Person(String name, String dob) throws ParseException {
        this.name = name;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); // Assuming date format is DD-MM-YYYY
        this.dateOfBirth = sdf.parse(dob);
    }

    public void displayName() {
        System.out.println("Person Name: " + name);
    }

    public void displayAge() {
        System.out.println("Age: " + calculateAge() + " years");
    }

    private int calculateAge() {
        Date currentDate = new Date();
        long diff = currentDate.getTime() - dateOfBirth.getTime();
        return (int) (diff / (1000L * 60 * 60 * 24 * 365));
    }
    public static void main(String[] args) throws ParseException {
        
            Person person = new Person("Akshay", "01-11-2004");
       
            person.displayName();
            person.displayAge();

            
            System.out.println();
            EmployeeDetails employee = new EmployeeDetails("Amith", "2004-6-2", 1001, 60000.0);
         
            employee.displayName();
            employee.displayAge();
            employee.displayEmployeeDetails();
}
}