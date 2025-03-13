package class25;

public class TestAge {
	
	public void checkage(String age) {
		int ageInt = Integer.parseInt(age);
		
		if(ageInt >= 21 & ageInt <=65) {
			System.out.println("Age is valid");
		}
		
		else {
			System.err.println("Age is Invalid");
			
			try {
				throw new AgeInvalidException();
			} catch (AgeInvalidException e) {
				System.err.println(e.getMessage());
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestAge obj = new TestAge();
		obj.checkage(args[0]);

	}

}


