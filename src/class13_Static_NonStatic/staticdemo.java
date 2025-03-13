package class13_Static_NonStatic;

public class staticdemo {
	
	//instances variable
	public int serialno = 0; //instance variable is associated with object creation
	public static int rollno = 0; //static variable does not have any effect on object creation 
	
	public staticdemo() { //constructor
		System.out.println("Inside default cons ----before instance variable -serialno " +serialno);
		serialno++;
		System.out.println("Inside default cons ----after instance variable -serialno " +serialno);
		System.out.println("Inside default cons ----before instance variable -rollno  " +rollno);
		rollno++;
		System.out.println("after instance variable -------rollnorollno " +rollno);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticdemo obj= new staticdemo();
		staticdemo obj1= new staticdemo();
		staticdemo obj2= new staticdemo();

	}

}
