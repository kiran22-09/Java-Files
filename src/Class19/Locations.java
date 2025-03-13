package Class19;

public abstract class Locations extends Countries{

	public String locationID;
	public String city;
	
	public Locations(String regionID, String regionName, String countryID, String countryName,String locationID,String city) {
		super(regionID, regionName, countryID, countryName);
		
		this.regionID = regionID;
	    this.regionName = regionName;
	    this.countryID = countryID;
	    this.countryName = countryName;
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