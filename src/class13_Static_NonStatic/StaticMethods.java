package class13_Static_NonStatic;

public class StaticMethods {

	
	//Static method
	public static void display() { 
		System.out.println(" This is the static method ");//static variable does not have any effect on object creation
	}
	
	//Non-Static method
	public void show() {
		System.out.println(" This is the Non-Static method ");//instance variable is associated with object creation
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//StaticMethods obj = new StaticMethods();
		//obj.display();
		display(); // No need to create an obj as it is a static method
		
		StaticMethods obj = new StaticMethods();
		obj.show(); // Has to create obj as it is a non-static method

	}

}
