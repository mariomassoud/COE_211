package lab6;
import java.util.Scanner;
public class Calculator {
    private int num1;
    private int num2;
    private String operator,str;

   
    public Calculator() {
        // Get user input
        Scanner scanCalc = new Scanner(System.in);
        System.out.println("Input the first number:");
        num1 = scanCalc.nextInt();
        
        scanCalc.nextLine();
        System.out.println("Input the operator:");
        operator = scanCalc.nextLine();
        
        System.out.println("Input the second number:");
        num2= scanCalc.nextInt();
        
        switch(operator){
            case "+":
            	add(num1,num2);
            	System.out.println(str);
                break;
            case "-": 
            	subtract(num1,num2);
            	System.out.println(str);
            	break;
                
            case "x":
            	multiply(num1,num2);
            	System.out.println(str);
            	break;
            case "/":
            	divide(num1,num2);
            	System.out.println(str);
                break;
              default: System.out.println("Operator not valid");
        
        }
    }

    public String add(int a, int b) {
    	  operator = "+";
      	num1 = a;
      	num2 = b;
      	int result = num1+num2;
      	
          str = num1 + operator + num2 + "=" + result;
      	return str;
    }

    public String subtract(int a, int b) {
    	  operator = "-";
        	num1 = a;
        	num2 = b;
        	int result = num1-num2;
        	
            str = num1 + operator + num2 + "=" + result;
        	return str;
    }

    public String multiply(int a, int b) {
    	  operator = "x";
        	num1 = a;
        	num2 = b;
        	int result = num1*num2;
        	
            str = num1 + operator + num2 + "=" + result;
        	return str;
    }

    public String divide(int a, int b) {
    	  operator = "/";
        	num1 = a;
        	num2 = b;
        	int result = num1/num2;
        	
            str = num1 + operator + num2 + "=" + result;
        	return str;
    	
}
    }

