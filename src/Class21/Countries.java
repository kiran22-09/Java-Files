package Class21;

public abstract class Countries extends Regions {
	
	//instance variables
	public String countryID;
	public String countryName;

	public Countries(String regionID, String regionName,String countryID,String countryName) {
		super(regionID, regionName);
		System.out.println("inside Countries Constructor ..........................");
		
		this.countryID = countryID;
		this.countryName = countryName;
	}

	

}