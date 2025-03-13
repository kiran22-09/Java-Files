package class12.Polymorphism;

public class InstanceVariableMethodOverloading {
	
	public String fname;
	public String lname;
	
	public InstanceVariableMethodOverloading( String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	
	public void methodoverload() {
		System.out.println("Inside the method fname is " +this.fname);
		System.out.println("Inside the method lname is " +this.lname);
	}
	
	public String concat() {
		String name = "["+this.fname+ ", "+this.lname+"]";
		return name;
	}
	
	public String concat(String mname) {
		String name = "["+this.fname+","+mname+", "+this.lname+"]";
		return name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariableMethodOverloading obj = new InstanceVariableMethodOverloading("Krishna", "Gundra");
		obj.methodoverload();
		
		String name = obj.concat();
		System.out.println("name of the person is " +name);
		
		String fullname = obj.concat(" Murthy");
		System.out.println("Full name of a person is " +fullname);
		
		
		

	}

}
