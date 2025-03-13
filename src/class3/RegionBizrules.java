package class3;

public class RegionBizrules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String regionID = "NrI";
		String regionName = "NorthAmerica";
		
		System.out.println("length of the string is ...... "+regionName.length());
		
		//region name should not be null or empty
		if(regionName.length() ==0) {
			System.out.println("region Name is empty.......");
		}else {
			System.out.println("region Name is not empty.....");
		}
	
		//isEmpty method
		if(regionName.isEmpty() == true) {
			System.out.println("region Name is an empty.......");
		}else {
			System.out.println("region Name is not an empty.....");	
		}
		
		//Region name should not be less than 2 and greater than 15 chars
		if(regionID.length()>=2 & regionID.length()<=15) {
			System.out.println("regionID is valid case ");
		}else {
			System.out.println("regionID not valid case");
		}
		

	}

}
