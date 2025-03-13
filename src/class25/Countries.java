package class25;

public  class Countries  {
	
	//instance variables
	public String countryID;
	public String countryName;

	public Countries(String countryID,String countryName) {
		//super(regionID, regionName);
		System.out.println("inside Countries Constructor ..........................");
		
		this.countryID = countryID;
		this.countryName = countryName;
	}

	public String getCountryID() {
		return countryID;
	}

	public String getCountryName() {
		return countryName;
	}
	

}