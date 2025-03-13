package class9;

public class duplicatesFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] Array = {12,44,55,12,44,55,66,88,99,87,12,33,12};
		int counter=0;
		
		for(int i=0;i<Array.length-1;i++) {
			for(int j=i+1;j<Array.length;j++)
			{
				if(Array[i] == Array[j]){
					System.out.println("Duplicates is " +Array[i]);
					counter++;
				}
			}
		}
		System.out.println(" No of duplicates are " + counter);

	}

}
