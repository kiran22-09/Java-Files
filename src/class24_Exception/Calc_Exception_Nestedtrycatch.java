package class24_Exception;

public class Calc_Exception_Nestedtrycatch {
	
	public int addition(int oper1, int oper2) {
		int result = oper1 + oper2;
		return result;
	}
	
	public double division(String oper1, String oper2) {
		double result = 0.0;
		int oper1int , oper2int = 0;
		
		try {
			oper1int = Integer.parseInt(oper1);
			oper2int = Integer.parseInt(oper2);
			
			result = oper1int / oper2int;
		} catch(ArithmeticException ee) {
			System.err.println(ee.getMessage());
		} catch(NumberFormatException eee) {
			System.err.println(eee.getMessage());
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calc_Exception_Nestedtrycatch obj = new Calc_Exception_Nestedtrycatch();
		double result = 0;
		char operation = '/';
		
		if(operation == '+') {
			result = obj.addition(100,200);
		}
		else 
		if(operation == '/') {
			result = obj.division("1000","200A");
		}
		
		System.out.println("result is " +result+"...............operation is " +operation);
		System.out.println("Welcome to calc");

	}

}
