package class11;

import java.util.Scanner;

public class calculator {
	
	public int additionoperation(int i,int j) {
		
		return i+j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter two numbers to do an opration");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("The given numbers are a is " +a  + " and b is "   +b);
		
		calculator obj = new calculator();
		int answer= obj.additionoperation(a, b);
		System.out.println("RESULT IS " +answer);
		
	}

}
