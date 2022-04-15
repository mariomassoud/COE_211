import java.util.Scanner;

public class gradesAggregator {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		// Initialize array of integers
		int[] l = new int[5];

		// for loop to get user input & store in array
		for(int i=0; i<l.length; i++) {
		System.out.println("Input the grade for assignment "+(i+1));int element = s.nextInt();
		l[i]=element;
		}
		
		System.out.println("Input the number of attended labs");
		double attendance = s.nextInt();
		
		attendance = (attendance*100)*0.05;
		System.out.println("Input the midterm grade:"); 
		double midterm = s.nextInt()*0.3;

		// for loop to iterate over the array & perform calculations
		double assignments = 0;
		
		for(int j=0; j<l.length; j++) assignments += l[j];
		assignments = (assignments/5)*0.3;
		// display output to user
		System.out.println( "Assignments (30%): "+assignments);
		System.out.printf("Attendance (5): %.2f ",attendance);
		System.out.println("\nMidterm (30%): "+midterm);
		s.close();
		}} 



