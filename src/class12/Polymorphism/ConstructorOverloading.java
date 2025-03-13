package class12.Polymorphism;



public class ConstructorOverloading  {
	
	public ConstructorOverloading() {
		System.out.println("1.Default constructor");
	}
	
	public ConstructorOverloading(String s) {
		System.out.println("2.Default constructor with 1 input parametr");
	}

	public ConstructorOverloading(String s , int x) {
		System.out.println("3.Default constructor with 2 input parameters of type string and int");
	}
	
	public ConstructorOverloading(int x) {
		System.out.println("4.Default constructor with 1 input parameter of type int");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorOverloading obj  = new ConstructorOverloading();
		ConstructorOverloading obj1 = new ConstructorOverloading("Hi");
		ConstructorOverloading obj2 = new ConstructorOverloading("hello", 6);
		ConstructorOverloading obj3 = new ConstructorOverloading(5);
		

	}

}
