package class24_Exception;

public class Calculator {
	
	
	public int addition(int num1, int num2 ) {
		
		return num1+num2;
	}
	
	public int division(int num1, int num2) {
		
		return num1/num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator obj = new Calculator();
		int result = 0;
		char operation = '/';
		
		if(operation == '+') {
			result = obj.addition(100, 200);
			System.out.println("addition of num1 & num2 is "+result );
		}
		
		if(operation == '/') {
			result = obj.division(1000, 200);
			System.out.println("division of num1 & num2 is "+result);
		}
		

	}

}
