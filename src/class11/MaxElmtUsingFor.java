package class11;

public class MaxElmtUsingFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Array = {12,44,55,66,12,44,55,88,99,87,12,33,12};
		int max = Array[0];
		
		for(int i=0;i<Array.length-1;i++) {
			for(int j=i+1;j<Array.length;j++) {
				
				if(Array[j] > max) {
					max =Array[j];	
				}
				
			}
		}
 
		System.out.println("Max element in the araay is " +max);
	}

}
