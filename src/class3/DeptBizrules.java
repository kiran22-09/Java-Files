package class3;

public class DeptBizrules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Dept_ID = "20";
		String Dept_Name ="Accounts";
		
		System.out.println("length of the Dept_ID is ...... "+Dept_ID.length());
		System.out.println("length of the Dept_Name is ...... "+Dept_Name.length());
		
		//Dept ID should not be empty
		if(Dept_ID.length() ==0) {
			System.out.println("DEPT_ID is empty.......");
		}else {
			System.out.println("DEPT_ID  is not empty.....");
		}
	
		//Dept NAME should not be empty
		if(Dept_Name.isEmpty() == true) {
			System.out.println("Dept_Name is an empty.......");
			
		}else {
			System.out.println("Dept_Name is not an empty.....");	
		}


	}

}
