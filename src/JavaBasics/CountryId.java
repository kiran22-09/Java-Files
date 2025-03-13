package JavaBasics;

public class CountryId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String countryId = "A110";
		String countryName = "India";
		System.out.println("length if countryId is :"+countryId.length());
		
		if(countryId.length() == 0) {
			System.out.println("countryId is empty.....");
		}else {
			System.out.println("countryId is not an empty");
		}
		
		//isEmpty()
		if(countryId.isEmpty() == true) {
			System.out.println("countryId is empty");
		}else {
			System.out.println("country is not empty");
		}
		
		//options
		if(countryId.equals("A110") || countryId.equals("B220") || countryId.equals("C440")){
			System.out.println("countryId is matched");
		}else {
			System.out.println("countryId is not matched");
		}
		
		//equalsIgoreCase
		if(countryName.equalsIgnoreCase("India")){
			System.out.println("countryName is matched ");
		}else {
			System.out.println("countryName is not matched");
		}
		
		//Options
		if(countryName.equals("USA") || countryName.equals("UK") || countryName.equals("India") ){
			System.out.println("country name is matchd");
		}else {
			System.out.println("country name not matched with the above options ");
		}
		//Id length between 3 to 5
		if(countryId.length() >=3 & countryId.length() <=5) {
			System.out.println("coountry id length is valid");
		}else {
			System.out.println("country Id length is invalid");
		}
		
		//country name should not be <4 and > 17
		if(countryName.length() >=4 & countryName.length() <=17 ) {
			System.out.println("country name length is valid");
		}else {
			System.out.println("country name length is not valid");
		}
	}

}
