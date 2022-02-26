import java.util.*;
public class EntryPoint {
	public static void main(String[]args) {
		String first,last;
		int age;
		double salary;
		Scanner scan= new Scanner(System.in);
		System.out.println("Please input the employee's first name: ");
		first=scan.nextLine();
		System.out.println("Please input the employee's last name: ");
		last=scan.nextLine();
		System.out.println("Please input the employee's age: ");
		age=scan.nextInt();
		System.out.println("Please input the employee's salary");
		salary=scan.nextDouble();
		Employee emp=new Employee(first,last,age,salary);
		System.out.println(emp);
		scan.close();
		
		
	}

}
