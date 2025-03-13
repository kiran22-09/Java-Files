package class14;

public class Locations_Inhritnc extends Countries_Inhritnc{
	
	
	public String locationID;
	public String streetAddress;
	public String city;
	public String state;
	public String zipcode;
	
	
	public Locations_Inhritnc(String regionID, String regionName, String countryID, String countryName, String locationID,String streetAddress,String city,String state,String zipcode) {
		super(regionID, regionName, countryID, countryName);
		
		
		System.out.println("Inside locations inheritance ");
		
		this.locationID = locationID;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public String getLocationID() {
		return locationID;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZipcode() {
		return zipcode;
	}
	
	
	
	

}
