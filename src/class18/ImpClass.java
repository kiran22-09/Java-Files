package class18;

public class ImpClass extends AbstractClass {


	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("Inside display in ImpClass");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImpClass obj = new ImpClass();
		obj.disp();
		obj.display();

	}

}
