package Class28;

import java.util.ArrayList;
import java.util.Date;

public class ArrayListDemo {


	    public static void main(String[] args) {
	        // Creating a generic ArrayList
	        ArrayList<Object> arrayListObj = new ArrayList<>();
	        arrayListObj.add(1111);
	        arrayListObj.add("Krishna");
	        arrayListObj.add("Gundra");
	        arrayListObj.add(9874.56);
	        arrayListObj.add(true);
	        arrayListObj.add(new Date());

	        System.out.println("Size of th"
	        		+ "e ArrayList is: " + arrayListObj.size());

	        for (int i = 0; i < arrayListObj.size(); i++) {
	            System.out.println("Element at position [" + i + "]: " + arrayListObj.get(i));
	        }

	        arrayListObj.add(0, "Orange_Hrm");

	        for (int i = 0; i < arrayListObj.size(); i++) {
	            System.out.println("\nElement at position [" + i + "] after adding: " + arrayListObj.get(i));
	        }
	    }
	}
	 
