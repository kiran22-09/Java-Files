package class17_Mutliple_inheritance_interfaces;

public class ImpClass_1 implements Child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		int a =10;
		int b =20;
		int res = a+b;
		System.err.println("Addition Result = " +res);
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		int a =40;
		int b =20;
		int res = a-b;
		System.err.println("Substraction Result = " +res);
		
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		int a =20;
		int b =20;
		int res = a*b;
		System.err.println("Multiplication Result = " +res);
		
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		int a =40;
		int b =4;
		int res = a/b;
		System.err.println("Division Result = " +res);
		
	}

}
