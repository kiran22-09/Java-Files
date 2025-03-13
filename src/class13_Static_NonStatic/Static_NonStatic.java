package class13_Static_NonStatic;

public class Static_NonStatic {

	//Non-static method can access another non static method 
	//Static method can access another static method
	//Non-Static method can access static method and static cannot access non_sataic method without obj creation
	public static void display () {
		System.out.println("This is a static method");
		see();
		//print();
	}
	
	public static void see() {
		System.out.println("This is a static method of see");
	}
	
	public void show() {
		System.out.println("This is a non-static method");
		print(); 
		display();
	}
	
	public void print() {
		System.out.println("This is a non-static method of print ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
		
		Static_NonStatic obj = new Static_NonStatic();
		obj.show();

	}

}
