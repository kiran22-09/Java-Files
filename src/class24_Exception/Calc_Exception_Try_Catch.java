package class24_Exception;

public class Calc_Exception_Try_Catch {

		
		
		public int addition(int oper1, int oper2) {
				return oper1 + oper2;
		}
		
		public double division(int oper1, int oper2) {
			double result = 0.0;
			
			try {
				result = oper1 / oper2;
			} catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			return result;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Calc_Exception_Try_Catch obj = new Calc_Exception_Try_Catch();
			double result = 0;
			char operation = '/';
			
			if(operation == '+') {
				result = obj.addition(100, 200);
				System.out.println("addition of num1 & num2 is "+result);
			}
			else
			if(operation == '/') {
				result = obj.division(1000, 0);
				//System.out.println("division of num1 & num2 is "+result);
			}
			
			System.err.println("Result is " + result + " ............operation is " +operation );
			System.out.println("Welcome to calculator");
			

		}

	}


	