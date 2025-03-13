package Class28;

import java.util.*;

public class While_Student_Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList arrayListObj = new ArrayList();
		arrayListObj.add(987);
		arrayListObj.add("Krishna");
		arrayListObj.add("Murthy");
		arrayListObj.add("Gundra");
		arrayListObj.add(new Date());
		arrayListObj.add('M');
		arrayListObj.add(4455.55);
		arrayListObj.add(false);
		
		
		//System.err.println("Student Details is");
		//System.out.println(" RollNum is ......" +arrayListObj.get(0));
		//System.out.println(" FirstName is....." +arrayListObj.get(1));
		//System.out.println(" MiddleName is...." +arrayListObj.get(2));
		//System.out.println(" LastName is......" +arrayListObj.get(3));
		//System.out.println(" Joining Date is.." +arrayListObj.get(4));
		//System.out.println(" Gender is........" +arrayListObj.get(5));
		//System.out.println(" Feespaid is......" +arrayListObj.get(6));
		//System.out.println(" Martial Status is false as unmarried and true as married...." +arrayListObj.get(7));

		System.out.println(" Name is ...[" +arrayListObj.get(1)+" , " +arrayListObj.get(2)+ " , " +arrayListObj.get(3) + "]");
		int i=0;
		while(i<arrayListObj.size()) {
			System.out.println("Student Details is " +arrayListObj.get(i));
			i++;
		}

	}
}
