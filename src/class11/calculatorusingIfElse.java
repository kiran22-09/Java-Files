package class11;
import java.util.Scanner;

public class calculatorusingIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Choose any one option");
		System.out.println("TYPE 1 for addition");
		System.out.println("TYPE 2 for substraction");
		System.out.println("TYPE 3 for multiplication");
		System.out.println("TYPE 4 for division");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		
		if(option == 1) {
			float result = num1 + num2;
			System.out.println("Addition is" +result );
		}
		else if(option == 2) {
			float result = num1 - num2;
			System.out.println("Substraction is " +result);
		}
		else if(option ==3) {
			float result = num1 * num2;
			System.out.println("Multiplication is " +result);
		}
		else if(option ==4) {
				if(num2>0) { 
			float result = num1 / num2;
			System.out.println("Division is " +result);
				}else {
					System.out.println("Number has to be greater than 0. TRY AGAIN");
				}
		}
		else {
			System.out.println("Invalid option");
		}
		sc.close();	
	}

}
