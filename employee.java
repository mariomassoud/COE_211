
public class Employee {
	private String firstname;
	private String lastname;
	private int age;
	private double salary;
	
	public Employee(String fn,String ln,int newage,double newsalary) {
		firstname=fn;
		lastname=ln;
		age=newage;
		salary=newsalary;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	public String toString() {
		String s = "Employee Information: "+firstname+", "+lastname+", "+age+", "+salary;
		return s;
		
	}
	
}
