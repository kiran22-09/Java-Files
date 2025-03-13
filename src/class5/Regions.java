package class5;

public class Regions {
	public boolean chkregId(String regionId) {
		if(regionId.length() == 0) {
			System.out.println("regionId is empty");
			return false;
		}else {
			System.out.println("regionId is not empty");
			return true;
		}
	}
		
		public boolean chkregName(String regionName) {
	        if (regionName.length() == 0) {
	            System.out.println("regionName is empty");
	            return false;
	        } else {
	            System.out.println("regionName is not empty");
	            return true;
	        }
	    
	}
		
		public boolean chkSen(String regionName) {
			if(regionName.equalsIgnoreCase("North America") || regionName.equalsIgnoreCase("Asia") || regionName.equalsIgnoreCase("Europe")){
				System.out.println("regionName is matched even if case INSENSITIVE");
				return true;
			}else {
				System.out.println("regionName is not matched");
				return false;
			}
		}
		
		public boolean regOptions(String regionId) {
			if(regionId.equals("NRT") || regionId.equals("EUR") || regionId.equals("ASA")) {
				System.out.println("region Id is matched with given the options");
				return true;
			}else {
				System.out.println("region Id not matched");
				return false;
			}
		}
		public boolean reglenLimit(String regionId) {
		if(regionId.length()>=3 & regionId.length()<=5) {
			System.out.println("regionID is valid case with in the limit ");
			return true;
		}else {
			System.out.println("regionID not valid case not with in the limit");
			return false;
		}
		}
		
		public boolean regNamLimit(String regionName) {
			if(regionName.length()>=2 & regionName.length()<=15) {
				System.out.println("regionName is valid case with in the limit ");
				return true;
			}else {
				System.out.println("regionName not valid case not with in the limit");
				return false;
			}
		}

}
