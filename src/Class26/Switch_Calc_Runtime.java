package Class26;

public class Switch_Calc_Runtime {
	
	public int addition (int oper1, int oper2) {
		return oper1+oper2;
	}
	
	public int substraction (int oper1, int oper2) {
		return oper1-oper2;
	}
	
	public int multiplication (int oper1, int oper2) {
		return oper1*oper2;
	}

	public int division (int oper1, int oper2) {
		if(oper2 ==0) {
			System.out.println("Division not possible");
		}
		return oper1/oper2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length !=0) {
			System.out.println("Length of args ........"+args.length);
			System.out.println("First command line argument is ....."+args[0]);
			System.out.println("Second command line argument is ...."+args[1]);
			
			Switch_Calc_Runtime obj = new Switch_Calc_Runtime();
			int oper1 = Integer.parseInt(args[0]);
			int oper2 = Integer.parseInt(args[1]);
			try {
				
				int  result;
				int operation = 4;
				switch (operation) {
				case 1 : 
					 result = obj.addition(oper1, oper2);
					System.out.println("Addition is " +result);
					break;
					
				case 2 : 
					 result = obj.substraction(oper1, oper2);
					System.out.println("substraction is " +result);
					break;
				
				case 3 : 
					 result = obj.multiplication(oper1, oper2);
					System.out.println("multiplication is " +result);
					break;
				
				case 4 : 
					 result = obj.division(oper1, oper2);
					System.out.println("division is " +result);
					break;
					
				}
				
			}catch(NumberFormatException e) {
				System.out.println("Error message " +e.getMessage());
			}
			System.err.println("Welcome to Java");

		}else {
			System.err.println("Please give the Command Line Arguments");
		}

	}
}
