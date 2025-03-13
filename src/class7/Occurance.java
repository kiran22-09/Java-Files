package class7;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sampleString = "HelloWorld,it is a great world and it is consisting of old people.";
		
	
		int i =0;
		
		do {
			
			if(sampleString.charAt(i)=='o') {
			System.out.println("index of o is " + i);
			}
			i++;
			
			
		}while(i<sampleString.length());
	}

}
