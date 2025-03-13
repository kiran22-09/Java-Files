package JavaBasics;

public class Locations {
	
	public boolean chklocId(String locationId) {
		if(locationId.length() == 0) {
			System.out.println("\nlocation Id is empty");
			return false;
		}else {
			System.out.println("\nlocation Id is not empty");
			return true;
		}
	}
	
	public boolean chkstradd(String streetAdd) {
		if(streetAdd.length() == 0) {
			System.out.println("streetAdd is empty");
			return false;
		}else {
			System.out.println("streetAdd is not empty");
			return true;
		}
	}
	
	public boolean chkcity(String city) {
		if(city.length() == 0) {
			System.out.println("city is empty");
			return false;
		}else {
			System.out.println("city is not empty");
			return true;
		}
	}
	
	
	public boolean chkstate(String state) {
		if(state.length() == 0) {
			System.out.println("state is empty");
			return false;
		}else {
			System.out.println("state is not empty");
			return true;
		}
	}
	
	
	public boolean chkzip(String zipcode) {
		if(zipcode.length() == 0) {
			System.out.println("zipcode is empty");
			return false;
		}else {
			System.out.println("zipcode is not empty");
			return true;
		}
	}
	
	public boolean locchkconId(String countryId) {
		if(countryId.length() == 0) {
			System.out.println(" country Id is empty in loc");	
			return false;
		}else {
			System.out.println("country Id is not empty in loc ");
			return true;
			}
		}
	
	public boolean locOptions(String locationId) {
		if(locationId.equals("LOC111") || locationId.equals("LOC112") || locationId.equals("LOC114")) {
			System.out.println("locationId is matched with given the options in loc");
			return true;
		}else {
			System.out.println("locationId not matched with the given options in loc");
			return false;
		}
	}
	
	public boolean locconOp(String countryName) {
		if(countryName.equals("USA") || countryName.equals("UK") || countryName.equals("India")){
			System.out.println("countryName is matched even in loc");
			return true;
		}else {
			System.out.println("countryName is not matched in loc");
			return false;
		}
	}
	
	public boolean loclenLimit(String locationId) {
		if(locationId.length()>=3 & locationId.length()<=6) {  //it will fail if 5 
			System.out.println("locationID is valid case with in the limit in locations ");
			return true;
		}else {
			System.out.println("locationID not valid case not with in the limit in locations");
			return false;
		}
		}
	
	public boolean locstrNamelimit(String streetName) {
		if(streetName.length()>=2 & streetName.length()<=15) {
			System.out.println("streetName is valid case with in the limit in locations ");
			return true;
		}else {
			System.out.println("streetName not valid case not with in the limit in locations");
			return false;
		}
	}
	


	}


