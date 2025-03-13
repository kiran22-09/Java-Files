package Class26;

public class Number_FormatRuntimeException {
	
	public int addition (int oper1, int oper2) {
		return oper1+oper2;
	}

	public static void main(String args[]) {
		if(args.length != 0) {
			System.out.println("Length of args ........"+args.length);
			System.out.println("First command line argument is ....."+args[0]);
			System.out.println("Second command line argument is ...."+args[1]);
			
			Number_FormatRuntimeException obj =new Number_FormatRuntimeException();
			
			try {
			int oper1 = Integer.parseInt(args[0]);
			int oper2 = Integer.parseInt(args[1]);
			int result = obj.addition(oper1, oper2);
			System.out.println("Addition is " +result);
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
			System.out.println("Welcome to java");
		
		}else {
		System.out.println("Please give command line arguments");
		}
	}
}
