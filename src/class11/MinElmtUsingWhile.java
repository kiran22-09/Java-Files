package class11;

public class MinElmtUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Array = {12,44,55,66,12,44,55,88,99,87,9,12,33,12};
		int min = Array[0];
		int i=0;
		while(i<Array.length-1) {
			int j=i+1;
			while(j<Array.length) {
				
				if(Array[j] < min) {
					min =Array[j];	
				}
			j++;	
			}
		i++;
		}
 
		System.out.println("Min element in the araay is " +min);
	}

}
