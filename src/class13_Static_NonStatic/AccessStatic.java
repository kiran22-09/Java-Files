package class13_Static_NonStatic;

public class AccessStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticMethods.display(); //accessing the static method if the other class
		//Static methods can be accessed outside the class without any object creation
		
		StaticMethods obj = new StaticMethods();
		obj.show(); //Non-static method cannot be accessed outside the class without obj creation
		//Static variable can be accessed from outside class without any object creation i.e., classname.static_variable
		//Instance variable cannot be accessed outside the class without obj creation

	}

}
