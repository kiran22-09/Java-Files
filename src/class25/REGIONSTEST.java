package class25;

public class REGIONSTEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Regions regionObj = new Regions("","northamerica");
		System.out.println("region ID is ......."+regionObj.getRegionID());
		System.out.println("region name is ..............."+regionObj.getRegionName());
		
		boolean chkregID = RegionsBiz.chkregId(regionObj.getRegionID());
		
		if(chkregID == true) {
			System.out.println("Valid region Details");
		}
		else {
			System.out.println("Invalid region Details");
			
			try {
    			throw new RegionIDEmptyException();
    		}catch (RegionIDEmptyException e) {
    			System.err.println(e.getMessage());
    		}
    		
		}
		
	}

}