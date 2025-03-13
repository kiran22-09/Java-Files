package Class26;

public class homework {

	public int addition(int num1, int num2) {
		return num1+num2;
	}
	
	public int substraction(int num1, int num2) {
		return num1-num2;
	}
	
	public int multiplication(int num1, int num2) {
		return num1*num2;
	}
	
	public int division(int num1, int num2) {
		if(num2 == 0) {
			System.out.println("Division not Possible");
		}
		return num1/num2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length != 0) {
			System.out.println("Length of command line Arguments is....."+args.length);
			System.out.println("First command line Argument ............"+args[0]);
			System.out.println("Second command line Argument ..........."+args[1]);
			
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			homework obj = new homework();
			try {
				
				int result =0;
				String operation = "d";
				switch(operation) {
				
				case "a":
					result=obj.addition(num1, num2);
					System.out.println("Addtion of num1 & num2 is ........" +result);
					break;
					
				case "b":
					result=obj.substraction(num1, num2);
					System.out.println("Addtion of num1 & num2 is ........" +result);
					break;
					
				case "c":
					result=obj.multiplication(num1, num2);
					System.out.println("Addtion of num1 & num2 is ........" +result);
					break;
					
				case "d":
					result=obj.division(num1, num2);
					System.out.println("Addtion of num1 & num2 is ........" +result);
					break;
			}

		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
			System.err.println("Welcome to Java");
		}
		else {
			System.err.println("Please provide the 2 Command Line Arguments");
		}
			
	}

}
