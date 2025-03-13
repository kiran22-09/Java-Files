package class7;

public class dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter = 0;
		int upper_limit = 10;
		
		do {
			counter++;
			System.out.println("value is ..........."+counter);
			
			if(counter == upper_limit/2) {
				break;
		}
			
		}
		while(counter<upper_limit) ;
		
		
		

	}
}


