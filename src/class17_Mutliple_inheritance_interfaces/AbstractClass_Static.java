package class17_Mutliple_inheritance_interfaces;

public abstract class AbstractClass_Static {
	
	public static int rollno = 100;
	
	//Concrete method
	public void call() {
		rollno++;
		System.out.println("Inside call abstract class " +rollno);
	}
	
	//abstract method
	public abstract void answer();
	

}
