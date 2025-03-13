package class30;

import java.util.Hashtable;

public class HashTbaleOfHashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable hashtableRegionsObj = new Hashtable();
		
		Hashtable nrtRecordObj = new Hashtable();
		nrtRecordObj.put("regionID", "NRT");
		nrtRecordObj.put("regionName", "NorthAmerica");
		
		hashtableRegionsObj.put("FirstRecord", nrtRecordObj);
		
		Hashtable eurRecordObj = new Hashtable();
		eurRecordObj.put("regionID", "EUR");
		eurRecordObj.put("regionName", "Europe");
		hashtableRegionsObj.put("SecordRecord", eurRecordObj);
		
		Hashtable asaRecordObj = new Hashtable();
		asaRecordObj.put("regionID", "ASA");
		asaRecordObj.put("regionName", "Asia");
		hashtableRegionsObj.put("ThirdRecord", asaRecordObj);
		
		
		System.out.println("Size of regions ArrayList..........."+hashtableRegionsObj.size());
		
		//for(int i =0;i<hashtableRegionsObj.size();i++) {
			Hashtable firstrecordObj = (Hashtable) hashtableRegionsObj.get("FirstRecord");
			
			//FirstRecord
			String regionID =(String) firstrecordObj.get("regionID");
			System.out.println("\nIn First record RegionID is ............"+regionID);
			String regionName =(String) firstrecordObj.get("regionName");
			System.out.println("In First record RegionName is ............"+regionName);
			
			//SecondRecord
			Hashtable secondrecordObj = (Hashtable) hashtableRegionsObj.get("SecordRecord");
			regionID =(String) secondrecordObj.get("regionID");
			System.out.println("\nIn Second record RegionID is ............"+regionID);
			regionName =(String) secondrecordObj.get("regionName");
			System.out.println("In Second record RegionName is ............"+regionName);
			
			//ThirdRecord
			Hashtable thirdrecordObj = (Hashtable) hashtableRegionsObj.get("ThirdRecord");
			regionID =(String) thirdrecordObj.get("regionID");
			System.out.println("\nIn Third record RegionID is ............"+regionID);
			regionName =(String) thirdrecordObj.get("regionName");
			System.out.println("In Third record RegionName is ............"+regionName);
			
			
	}

}
