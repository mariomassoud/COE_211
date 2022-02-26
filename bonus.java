import java.util.*;
public class EntryPoint {
	private static final Object[] Employee = null;

	public static void main(String[]args) {
		String first,last;
		int age;
		double salary;
		Scanner scan= new Scanner(System.in);
		
	
		Random r=new Random();
		int y=r.nextInt(10)+1;
		Employee[]X=new Employee[y];
		
		for (int i=1;i<=y;i++) {
			System.out.println("Please input the employee's first name: ");
			first=scan.nextLine();
			System.out.println("Please input the employee's last name: ");
			last=scan.nextLine();
			System.out.println("Please input the employee's age: ");
			age=scan.nextInt();
			System.out.println("Please input the employee's salary");
			salary=scan.nextDouble();
			Employee emp=new Employee(first,last,age,salary);
			}
		for(int j=0;j<y;j++) {
		
		
		System.out.println(X[j].getFirstname());
		System.out.println(X[j].getLastname());
		System.out.println(X[j].getAge());
		System.out.println(X[j].getSalary());
		
		}
			
				
			
		
		
		
	}

}