package class7;

public class hellowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sampleString = "Hello, World";
		int i =0;
		
		while(i<sampleString.length()) {
			
			char currentChar = sampleString.charAt(i);
			//System.out.println(" Char at index " +i+ " is " + currentChar);
			//i++;
			if(currentChar == ',') {
				break;
			}
			i++;
			System.out.println(" Char at index " +i+ " is " + currentChar);
			
		}

	}

}
