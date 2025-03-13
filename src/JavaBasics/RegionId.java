package JavaBasics;

public class RegionId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String regionID = "NrI";
		String regionName = "NorthAmerica";
		System.out.println("length of the string is ...... "+regionID.length());
		
		if(regionID.length() ==0) {
			System.out.println("region ID is empty.......");
		}else {
			System.out.println("region ID is not empty.....");
		}
		
		
		//isEmpty method
		if(regionID.isEmpty() == true) {
			System.out.println("region ID is an empty.......");
		}else {
			System.out.println("region ID is not an empty.....");	
		}
		
		//options
		if(regionID.equals("NrI")|| regionID.equals("EOR")||regionID.equals("ASA")) {
			System.out.println("region ID matched.......");
		}else {
			System.out.println("region ID is not matched.....");	
		}
		
		//equalsIgnore
		if(regionName.equalsIgnoreCase("NORTHamericA")) {
			System.out.println("region name is matched");
		}else {
			System.out.println("region name not matched");
		}
		
		//region length should not be less than 3 and greater than 5
		if(regionID.length()>=3 & regionID.length()<=5) {
			System.out.println("regionID is valid case ");
		}else {
			System.out.println("regionID not valid case");
		}

	}

}
