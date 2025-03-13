package class7;

public class regionname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sampleString = "NRT";
		
		boolean isValid = true;
		
		for(int i = 0;i<sampleString.length();i++) {
			char currentChar = sampleString.charAt(i);
			//System.out.println(" Charater at as pecified index is " +i);
			/*if(currentChar==1 || currentChar==2 || currentChar==3 || currentChar==4 || currentChar==5 || currentChar==6 ||
					currentChar==7 || currentChar==8 ||currentChar==9) {
				System.out.println("Invalid string");
			}else {
				System.out.println("Valid String");
			} */
			if(Character.isDigit(currentChar)) {
				isValid = false;
				break;
			}
		}
			if (isValid) {
	            System.out.println("Valid String");
	        } else {
	            System.out.println("Invalid String");
	        }
			
		}

	}


