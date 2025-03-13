package Class28;

import java.util.*;

public class Iterator_Student_Details {

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
		System.out.println(" Name is ...[" +arrayListObj.get(1)+" , " +arrayListObj.get(2)+ " , " +arrayListObj.get(3) + "]");

		ListIterator iterator = arrayListObj.listIterator();
		while(iterator.hasNext()) {
			System.out.println("Student Details " +iterator.next());
		}
		
		while(iterator.hasPrevious()) {
			System.out.println("\n Student Details Backward " +iterator.previous());
		}
	}
}
