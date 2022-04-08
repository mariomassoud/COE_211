import java.util.Scanner;
import java.io.*;
public class Expensestracker {

	public static void main(String []args) throws IOException{
		String name,purchases,answer;
		double money;
		Scanner scan= new Scanner(System.in);
		
		File file1=new File("expenses.txt");
		PrintWriter output= new PrintWriter(file1);
				
		System.out.println("Input your name: ");
		name=scan.nextLine();
		
		do {
		
			System.out.println("What did you purchase: ");
			purchases=scan.nextLine();
			System.out.println("How much did you pay?");
			money=scan.nextDouble();
			scan.nextLine();
			
			output.println(name+" purchased "+purchases+" for "+money+"$");
					
		System.out.println("Do you like to log another purchases?");
		answer=scan.nextLine();
		}while(answer.equalsIgnoreCase("y"));
		output.close();
		
		if(answer.equalsIgnoreCase("n")) {
		
			System.out.println("Would you like to read a summary of your purchases? ");
			answer=scan.nextLine();
			 Scanner fileScan = new Scanner(new File("expenses.txt"));

	            if (answer.equals("y")) {
	                while(fileScan.hasNext()) {
	                    System.out.println(fileScan.nextLine());}
	            }
				System.out.println("Get off of ZoodMall!");
	            
		
			
		}
		
		//String sanswer="no";
	
		
		
		
		
		
	}
}
	

