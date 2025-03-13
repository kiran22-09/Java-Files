package Class19;

public abstract class Regions {
	//instance variables
	public String regionID;
	public String regionName;
	
	//constructor
	public Regions(String regionID,String regionName) {
		this.regionID = regionID;
		this.regionName = regionName;
		System.out.println("inside Regions Constructor ..........................");
	}

	public String getRegionID() {
		return regionID;
	}

	public String getRegionName() {
		return regionName;
	}

}