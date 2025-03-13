package Class26;

public class TestRegions {

    public static void main(String[] args) {
    	
    	if(args.length < 2) {
    		System.out.println("Please provide the regionID and regionName as argumrnts");
    		return;
    	}
    	
    	String regionID   = args[0];
    	String regionName = args[1];
    	
    	Regions regionobj = new Regions(regionID, regionName);
    	System.out.println("RegionId is ..........." + regionobj.getRegionID());
    	System.out.println("RegionName is.......... " + regionobj.getRegionName());
    	
    	boolean regionIDValid   = RegionsBiz.chkregId(regionobj.getRegionID());
    	boolean regionNameValid = RegionsBiz.chkregName(regionobj.getRegionName());
    	boolean regionIDOptions = RegionsBiz.regOptions(regionobj.getRegionID());
    	boolean regionNameOptions = RegionsBiz.chkSen(regionobj.getRegionName());
    	boolean regionIDlenLimit = RegionsBiz.reglenLimit(regionobj.getRegionID());
    	boolean regionNamelenLimit = RegionsBiz.regNamLimit(regionobj.getRegionName());


    	if(regionIDValid && regionNameValid &&  regionIDOptions && regionNameOptions && regionIDlenLimit && regionNamelenLimit) {
    		System.err.println("Valid region details");
    	}
    	else {
    		System.err.println("Invalid region details");
    		
    		try {
    			throw new RegionIDEmptyException();
    		}catch (RegionIDEmptyException e) {
    			System.err.println(e.getMessage());
    		}
    		
    	}
    	
    }
}


/*package class25;

public class TestRegions {

    public static void main(String[] args) {
        // Check if arguments are provided
        if (args.length < 2) {
            System.err.println("Please provide RegionID and RegionName as arguments.");
            return;
        }

        
        String regionID = args[0];
        String regionName = args[1];

        // Create a Regions object
        Regions regionObj = new Regions(regionID, regionName);
        System.out.println("RegionID is ...." + regionObj.getRegionID());
        System.out.println("RegionName is ...." + regionObj.getRegionName());

        // Validate RegionID and RegionName
        boolean RegionIDValid = RegionsBiz.chkregId(regionObj.getRegionID());
        boolean RegionNameValid = RegionsBiz.chkregName(regionObj.getRegionName());

        if (RegionIDValid && RegionNameValid) {
            System.err.println("Valid region details.");
        } else {
            System.err.println("Invalid region details.");
            try {
                
                throw new RegionIDEmptyException();
            } catch (RegionIDEmptyException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
*/