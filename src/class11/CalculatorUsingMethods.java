package class11;

import java.util.Scanner;

public class CalculatorUsingMethods {

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
		int i = sc.nextInt();
		System.out.println("Enter the second number");
		int j = sc.nextInt();
		
		switch (option) {
		
		case 1:
		Addition addobj = new Addition();
		int add = addobj.addition(i, j);
		break;
		
		case 2:
		Substraction subobj = new Substraction();
		int sub = subobj.substraction(i, j);
		break;
		
		case 3:
		Multiplication mulobj = new Multiplication();
		int mul = mulobj.multiplication(i, j);
		break;
		
		case 4:
		Division divobj = new Division();
		int div = divobj.division(i, j);
		break;
		
		}
			
	}

}
