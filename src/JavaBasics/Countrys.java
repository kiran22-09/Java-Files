package JavaBasics;

public class Countrys {
	public boolean chkcounId(String countryId) {
	if(countryId.length() == 0) {
		System.out.println(" \ncountry Id is empty");	
		return false;
	}else {
		System.out.println("\ncountry Id is not empty");
		return true;
		}
	}
	
	public boolean chkcounName(String countryName) {
	if(countryName.length() == 0){
		System.out.println("country name is empty");
		return false;
	}else {
		System.out.println("country name is not empty ");
		return true;
	}
	}


	
	public boolean counSen(String countryName) {
		if(countryName.equalsIgnoreCase("USA") || countryName.equalsIgnoreCase("UK") || countryName.equalsIgnoreCase("India")){
			System.out.println("countryName is matched even if case INSENSITIVE");
			return true;
		}else {
			System.out.println("countryName is not matched");
			return false;
		}
	}
	
	public boolean counOptions(String countryId) {
		if(countryId.equals("A110") || countryId.equals("B220") || countryId.equals("C440")) {
			System.out.println("countryIdis matched with given the options");
			return true;
		}else {
			System.out.println("countryId not matched");
			return false;
		}
	}
	public boolean counlenLimit(String countryId) {
	if(countryId.length()>=3 & countryId.length()<=5) {
		System.out.println("countryId is valid case with in the limit ");
		return true;
	}else {
		System.out.println("countryId not valid case not with in the limit");
		return false;
	}
	}
	
	public boolean counNamLimit(String countryName) {
		if(countryName.length()>=3 & countryName.length()<=17) {
			System.out.println("countryName is valid case with in the limit ");
			return true;
		}else {
			System.out.println("countryName not valid case not with in the limit");
			return false;
		}
	}
}

