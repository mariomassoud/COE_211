package lab6;
import java.util.Scanner;
public class Calculator {
	  private int num1;
	    private int num2;
	    private String operator;

	    // Constructor to initialize the calculator
	    public Calculator() {
	        // Get user input
	        Scanner scanCalc = new Scanner(System.in);
	        int n1,n2;
	        System.out.print("Input the first number: ");
	         n1 = scanCalc.nextInt();
	        System.out.print("Input the second number: ");
	         n2 = scanCalc.nextInt();
	        scanCalc.close();
	        num1=n1;
	        num2=n2;
	    
	        
	        
	        
	        /**
	         * Continue code here to ask for the first number, the operator, and the second number, IN THAT ORDER
	         */

	        // Decide on the operation to perform 
	        /**
	         * Insert code to decide on which function to call, based on the operator the user chose
	         * Hint: Switch statement
	         */
	    }

	    public String add(int a, int b) {
	    	num1=a;
	    	num2=b;
	    	operator="+";
	    	return num1+operator+num2+ "="+(a+b);
	    }

	    public String subtract(int a, int b) {
	    	num1=a;
	    	num2=b;
	    	operator= "-";
	    	return num1+operator+num2+"="+(a-b);
	    }

	    public String multiply(int a, int b) {
	    	num1=a;
	    	num2=b;
	    	operator="*";
	    	return num1+operator+num2+"="+(a*b);
	    }

	    public String divide(int a, int b) {
	    	num1=a;
	    	num2=b;
	    	operator="/";
	    	return num1+operator+num2+"="+(a/b);
	    }
	

}
