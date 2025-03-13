package class12.Polymorphism;

public class MethodOverloading {
	
	
	public int addition() { 
		int x = 100;
		int y = 200;
		int result = x+y;
		System.out.println("1.Method without input parameters " + result);
		return result;
	} 
	/* return type and its data type does not play any role in polymorphism i.e., in method overloading and also constructor overloading)*/
	
	
	public void addition (int x) {
		int y = 300;
		int result = x+y;
		System.out.println("2.Method with 1 input parameter as int " + result);
	}
	
	public void addition (int x, int y) {
		int result = x+ y;
		System.out.println("3.Method with 2 input parameters as integers only " + result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading obj = new MethodOverloading();
		obj.addition(); 
		obj.addition(200);
		obj.addition(200,500);
		obj.addition(800,6000);

	}

}
