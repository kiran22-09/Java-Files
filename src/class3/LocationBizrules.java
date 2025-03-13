package class3;

public class LocationBizrules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String locationID = "NrI";
		String streetAddress = "123 King St";
		String locationName = "NorthAmerica";
		String city = "London";
		String state = "Andhra";
		String zipcode = "520012";
		System.out.println("length of the location name is ...... "+locationName.length());
		System.out.println("length of the streetAddress is ...... "+streetAddress.length());
		System.out.println("length of the state is ...... "+state.length());
		System.out.println("length of the city is ...... "+city.length());
		System.out.println("length of the zipcode is ...... "+zipcode.length());
		
		
		
		//Location ID should not be null or empty
		if(locationName.length() ==0) {
			System.out.println("location Name is empty.......");
		}else {
			System.out.println("location Name is not empty.....");
		}
		
		//Street Address should not be null or empty
		if(streetAddress.isEmpty() == true) {
			System.out.println("streetAddress is empty.......");
		}else {
			System.out.println("streetAddress is not empty.....");
		}
		
		//City should not be null or empty
		if(city.length() ==0) {
			System.out.println("city  is empty.......");
		}else {
			System.out.println("city  is not empty.....");
		}
		
		//State should not be null or empty
		if(state.isEmpty() == true) {
			System.out.println("state  is empty.......");
		}else {
			System.out.println("state  is not empty.....");
		}
		
		//Zipcode  should not be null or empty
		if(zipcode.isEmpty() == true) {
			System.out.println("zipcode  is empty.......");
		}else {
			System.out.println("zipcode  is not empty.....");
		}


	}

}
