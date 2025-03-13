package class11;

public class MaxElmtUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Array = {12,44,55,66,12,44,55,88,99,87,100,12,33,12};
		int max = Array[0];
		int i=0;
		while(i<Array.length-1) {
			int j=i+1;
			while(j<Array.length) {
				
				if(Array[j] > max) {
					max =Array[j];	
				}
			j++;	
			}
		i++;
		}
 
		System.out.println("Max element in the araay is " +max);
	}

}
