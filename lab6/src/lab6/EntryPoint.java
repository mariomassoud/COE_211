package lab6;
import java.util.Scanner;
public class EntryPoint {

	public static void main(String[] args) {
		String another;
		Scanner scan= new Scanner(System.in);
		
		BasicWeek w=new BasicWeek();
		AdvancedWeek W= new AdvancedWeek();
		
		
	
		
		
		do {
			System.out.println("Which service would you like to use?"+"\n"
		+"[1]: Basic week visualizer\r\n"
		+ "[2]: Advanced week visualizer\r\n"
		+ "[3]: Basic calculator\r\n"
		+ "[4]: Employee repertoire\r\n");
			int x=scan.nextInt();
			
			switch(x) {
			case 1 : w.setprintDays();
			break;
			case 2 :W.setprintDays();
			break;
			case 3: Calculator c1=new Calculator();
	
			break;
			case 4:
				Employee e= new Employee();
				e.printInfo(); 
			break;
			default:System.out.println("Make sure to pick a number between 1 and 4");
			}
			 System.out.println("Would you like to perform another operation? (y/n)");
	          scan.nextLine();
	           another = scan.nextLine();

			
		}while(another.equals("y"));
		
	scan.close();}
}
