package class24_Exception;

public class CalcE_ifElse_xception {
	
	
	public int addition(int oper1, int oper2) {
			return oper1 + oper2;
	}
	
	public double division(int oper1, int oper2) {
		double result = 0.0;
		
		if(oper2 == 0) {
			System.out.println("Division not possible if num2 is Zero");
		}
		else {
			result = oper1 / oper2;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalcE_ifElse_xception obj = new CalcE_ifElse_xception();
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
		
		System.err.println("Result is " + result + " ......................operation is " +operation);
		System.out.println("Welcome to calculator");
		

	}

}

/*package class24;
O Data Utilijava
D Driverfacto
I ExcelReader..
public class Calculator (
60
100
17
8く
95t虹EZtE
842954t8382
18
19
20=
29
30
31
32
public int addition(int oper1, int oper2) (
return operl + oper2;
public double division (int oper1, int oper2) (
double result = 0.0;
if (oper2=0) (
Jalse {
System.out.printin("division not possible by oper2 eqaual to ZERO..
}
result L opert / oper?;
return result;
public static void main(String[] args) (
/I TODO Auto-generated method stub
Calculator obj = new Calculater (;
double result = 0;
char operation =
if(operation ==
*+') {
result = obj. addition (100, 200);
}
else
1f(operation s
result = obj. division (1000, 0);
System.out. printin("result is ....
System.out. printin("welcome to calculator
+resuIt+"
done with operation
");
37
¾//endof main wethod
38
39
}lend of class*/
