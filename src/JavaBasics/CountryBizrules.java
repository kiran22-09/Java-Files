package JavaBasics;

public class CountryBizrules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String countryId = "A110";
		String countryName = "INdia";
		System.out.println("length if countryId is :"+countryId.length());
		
		//country ID should not be null or empty
		if(countryId.length() == 0) {
			System.out.println("countryId is empty.....");
		}else {
			System.out.println("countryId is not an empty");
		}
		
		//country Name should not be null or empty
		if(countryName.isEmpty() == true) {
			System.out.println("country Name is empty");
		}else {
			System.out.println("country Name is not empty");
		}
		
		//country ID should be only consisting of the following values (other values should not be allowed)
		//a.	A110
		//b.	B220
		//c.	C440
		if(countryId.equals("A110") || countryId.equals("B220") || countryId.equals("C440")){
			System.out.println("countryId is matched");
		}else {
			System.out.println("countryId is not matched");
		}
		
		//Country Name should be of the following names only (other values should not be allowed)
		//a.USA
		//b.UK
		//c.India
		if(countryName.equalsIgnoreCase("USA") || countryName.equalsIgnoreCase("UK") || countryName.equalsIgnoreCase("India") ){
			System.out.println("country name is matchd");
		}else {
			System.out.println("country name not matched with the above options ");
		}
		
		//equalsIgnore
		if(countryName.equalsIgnoreCase("India")){
			System.out.println("countryName is matched ");
		}else {
			System.out.println("countryName is not matched");
		}

	}

	

}
