package class7;

public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int upper_limit = 10;
				
		while(counter<upper_limit) {
		counter++;
			System.out.println("value is ..........."+counter);
			if(counter == 5) {
			break;
			}
		}
	}
}


