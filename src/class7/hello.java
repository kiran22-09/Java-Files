package class7;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sampleString = "Hello, World";
		for (int i =0;i<sampleString.length();i++) {
			char currentChar = sampleString.charAt(i);
			//System.out.println("char at index " +i+ " is " +currentChar);
			if(currentChar == ',') {
				break;
				}
			System.out.println("char at index " +i+ " is " +currentChar);
			
			}
	}

}
