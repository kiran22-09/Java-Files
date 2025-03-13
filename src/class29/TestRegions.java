package class29;

public class TestRegions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PopulateRegions obj = new PopulateRegions();
		Regions regObj = new Regions();
		obj.populateregions(regObj);
		
		System.out.println("regionID is ........."+regObj.getRegionID());
		System.out.println("regionNmae is ......."+regObj.getRegionName());

	}

}
