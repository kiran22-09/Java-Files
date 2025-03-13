package class25;

public class TestRegionsName {



    public static void main(String[] args) {
    	
    	if(args.length < 2) {
    		System.out.println("Please provide the regionName as argumrnts");
    		return;
    	}
    	
    	String regionID   = args[0];
    	String regionName = args[1];
    	
    	Regions regionobj = new Regions(regionID, regionName);
    	System.out.println("RegionId is ..........." + regionobj.getRegionID());
    	System.out.println("RegionName is.......... " + regionobj.getRegionName());
    	
    	//boolean regionIDValid   = RegionsBiz.chkregId(regionobj.getRegionID());
    	boolean regionNameValid = RegionsBiz.chkregName(regionobj.getRegionName());
    	boolean regionIDOptions = RegionsBiz.regOptions(regionobj.getRegionID());
    	boolean regionNameOptions = RegionsBiz.chkSen(regionobj.getRegionName());
    	boolean regionIDlenLimit = RegionsBiz.reglenLimit(regionobj.getRegionID());
    	boolean regionNamelenLimit = RegionsBiz.regNamLimit(regionobj.getRegionName());


    	if(regionNameValid &&  regionIDOptions && regionNameOptions && regionIDlenLimit && regionNamelenLimit) {
    		System.err.println("Valid region details");
    	}
    	else {
    		System.err.println("Invalid region details");
    		
    		try {
    			throw new RegionNameEmptyException();
    		}catch (RegionNameEmptyException e) {
    			System.err.println(e.getMessage());
    		}
    		
    	}
    	
    }
}


