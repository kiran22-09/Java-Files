package class25;

public  class Locations {

	public String locationID;
	public String city;
	//public String streetAdd;
	//public String state;
	//public String zipcode;
	//public String countryId;
	//public String countryName;
	//public String streetName;
	
	
	
	public Locations(String locationID,String city) {
		//super(regionID, regionName, countryID, countryName);
		
		
	    this.locationID = locationID;
	    this.city = city;
	    
		System.out.println("inside Locations contructor ..................");
		this.city = city;
		this.locationID = locationID;
	}

	public String getLocationID() {
		return locationID;
	}

	public String getCity() {
		return city;
	}
	

}