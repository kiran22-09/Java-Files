package class14;

public class RegionsInhritnc {
	
	public String regionID;
	public String regionName;
	
	public RegionsInhritnc(String regionID, String regionName) {
		
		System.out.println("Inside regions inheritance");
		this.regionID = regionID;
		this.regionName = regionName;

	}

	public String getRegionID() {
		return regionID;
	}

	public String getRegionName() {
		return regionName;
	}
	

}


