package lab6;
import java.util.*;
public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Employee() {
        // Get user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String FN=scan.nextLine();
        System.out.println("Enter the last name:");
        String LN=scan.nextLine();
        System.out.println("Enter age: ");
        int Age=scan.nextInt();
        System.out.println("Enter salary: ");
        double Salary=scan.nextDouble();
        scan.close();
        /**
         * 
         * Continue code here to ask for the first name, last name, age, and salary, IN THAT ORDER
         */
        firstName=FN;
        lastName=LN;
        age=Age;
        salary=Salary;

    }

    public String toString() {
        // insert logic for toString method
    	return firstName+" "+lastName+" "+age+" "+salary;
    }
}
