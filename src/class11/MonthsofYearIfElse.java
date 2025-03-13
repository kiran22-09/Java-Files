package class11;
import java.util.Scanner;

public class MonthsofYearIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the number of a particular month (1-12)");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		if(n == 1) {
			System.out.println("month is january");	
		}
		
		else if(n == 2) {
			System.out.println("month is february");	
		}
		
		else if(n == 3) {
			System.out.println("month is march");	
		}
		
		else if(n == 4) {
			System.out.println("month is april");	
		}
		
		else if(n == 5) {
			System.out.println("month is may");	
		}
		
		else if(n == 6) {
			System.out.println("month is june");	
		}
		
		else if(n == 7) {
			System.out.println("month is july");	
		}
		
		else if(n == 8) {
			System.out.println("month is august");	
		}
		
		else if(n == 9) {
			System.out.println("month is september");	
		}
		
		else if(n == 10) {
			System.out.println("month is october");	
		}
		
		else if(n == 11) {
			System.out.println("month is november");	
		}
		
		else if(n == 12) {
			System.out.println("month is december");	
		}
		
		else {
		System.out.println("Invalid number enter the number (1-12)");
		}
	}

}
