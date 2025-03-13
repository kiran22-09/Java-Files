package Class21;

public abstract class Locations extends Countries{

	public String locationID;
	public String city;
	
	public Locations(String regionID, String regionName, String countryID, String countryName,String locationID,String city) {
		super(regionID, regionName, countryID, countryName);
		
		System.out.println("inside Locations contructor ..................");
	    this.locationID = locationID;
	    this.city = city;
	    
		
		
	}

	

}