package Class28;

import java.util.*;

public class Student_Detailswith_add_Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList arrayListObj = new ArrayList();
		arrayListObj.add(987);
		arrayListObj.add("Krishna");
		arrayListObj.add("Murthy");
		arrayListObj.add("Gundra");
		arrayListObj.add(new Date());
		//arrayListObj.add('M');
		arrayListObj.add(4455.55);
		arrayListObj.add(false);
	
		System.out.println(" Name is ...[" +arrayListObj.get(1)+" , " +arrayListObj.get(2)+ " , " +arrayListObj.get(3) + "]");
		
		for(int i=0;i<arrayListObj.size();i++) {   
			System.out.println("Student Details is " +arrayListObj.get(i));
		}       
		
		arrayListObj.add(0,"Orange_Hrm");
		for(int i=0;i<arrayListObj.size();i++) {
			System.out.println("Student Details after upadte1 is " +arrayListObj.get(i));
		}
		
		arrayListObj.add(5,false);
		boolean martial_status = false ;
		if(martial_status == true) {
			System.out.println("Married");
		}
		if(martial_status == false) {
			System.err.println("Student martial status is Unmarried");
		}
		for(int i=0;i<arrayListObj.size();i++) {
			System.out.println("Student Details after upadte-2 is " +arrayListObj.get(i));
		}
		
		arrayListObj.add(arrayListObj.size(),"abc");
		for(int i=0;i<arrayListObj.size();i++) {
		System.out.println("Student Details after upadte-3 is " +arrayListObj.get(i));
		}
		
		arrayListObj.remove(arrayListObj.size()-1);
		for(int i=0;i<arrayListObj.size();i++) {
		System.out.println("Student Details after upadte-4 is " +arrayListObj.get(i));
		}

	}
}
