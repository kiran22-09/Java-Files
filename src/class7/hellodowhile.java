package class7;

public class hellodowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sampleString = "Hello, World";
		int i =0;
		
			do {
			char currentChar = sampleString.charAt(i);
			if(currentChar == ',') {
				break;
			}
			System.out.println(" CChar at index " +i+ " is " + currentChar);
			i++;
			
			
		}
			while(i <sampleString.length());

	}

}
