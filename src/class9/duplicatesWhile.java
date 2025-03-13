package class9;

public class duplicatesWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] Array = {12,44,55,12,44,55,66,88,99,87,12,33,12};
		int counter=0;
		int i =0;
		while(i<Array.length-1) {
			
			int j =i+1;
			while(j<Array.length) {
				
				if(Array[i] == Array[j]) {
					System.out.println("Duplicate is " + Array[i]);
					counter++;
				}
				j++;
			}
			i++;
		}
		System.out.println("\nNo of Duplicates are " +counter);
	}

}
