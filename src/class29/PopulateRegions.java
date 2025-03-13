package class29;

import java.util.Hashtable;

public class PopulateRegions {
	
	public void populateregions(Regions regObj) {
		
		Hashtable regionsHashtab = new Hashtable();
		
		regionsHashtab.put("regionID", "NRT");
		regionsHashtab.put("regionName", "NorthAmerica");
		
		regObj.setRegionID(regionsHashtab.get("regionID").toString());
		regObj.setRegionName(regionsHashtab.get("regionName").toString());

		
	}

}
