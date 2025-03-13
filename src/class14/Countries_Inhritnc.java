package class14;

public class Countries_Inhritnc extends RegionsInhritnc{
	
		public String countryID;
		public String countryName;
		
		public Countries_Inhritnc(String regionID, String regionName, String countryID, String countryName) {
		super(regionID, regionName);
		// TODO Auto-generated constructor stub
		
		System.out.println("Inside countries inheritance");
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
