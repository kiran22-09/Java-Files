
package class10;

public class InstanceVariable {
	int hashnum= 99; // instance variable
	
	public InstanceVariable () {
		
		this.hashnum = 100;
		int hashnum = 88;
	}
	
	public void display() {
		this.hashnum++;
		int hashnum=77;
		this.hashnum=1000;
		System.out.println("Instance variable   " + this.hashnum);
		System.out.println("local variable  " + hashnum);
	}
	
	public void show() {
		this.hashnum++;
		System.out.println("Instance variable in show  " + this.hashnum);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceVariable obj = new InstanceVariable();
		obj.display();
		obj.show();
		

	}

}
