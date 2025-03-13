package class11;

public class Division {
	
	public int division(int i,int j) {
		
		if(j>0) {
		int result = i /j;
		System.out.println("Division is " +result);
		return result;
		}else {
			System.out.println("Enter a number greater than 0 . TRY AGAIN");
		
		return -1;
		}
	}

}
