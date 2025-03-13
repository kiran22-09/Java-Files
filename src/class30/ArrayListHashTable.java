package class30;

import java.util.ArrayList;
import java.util.Hashtable;

public class ArrayListHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList arrayListRegionsObj = new ArrayList();
		
		Hashtable nrtRecordObj = new Hashtable();
		nrtRecordObj.put("regionID", "NRT");
		nrtRecordObj.put("regionName", "NorthAmerica");
		
		arrayListRegionsObj.add(nrtRecordObj);//adding the hashtable to arraylist
		

		Hashtable eurRecordObj = new Hashtable();
		eurRecordObj.put("regionID", "EUR");
		eurRecordObj.put("regionName", "Europe");
		arrayListRegionsObj.add(eurRecordObj);
		
		
		Hashtable asaRecordObj = new Hashtable();
		asaRecordObj.put("regionID", "ASA");
		asaRecordObj.put("regionName", "Asia");
		arrayListRegionsObj.add(asaRecordObj);
		
		System.out.println("Size of the arrayListRegions......." +arrayListRegionsObj.size());
		
		for(int i =0;i<arrayListRegionsObj.size();i++) {
			Hashtable records = (Hashtable) arrayListRegionsObj.get(i);
			
			if(i == 0) {
				String regionID =(String) records.get("regionID");
				System.out.println("In First record RegionID is ............"+regionID);
				String regionName =(String) records.get("regionName");
				System.out.println("In First record RegionName is ............"+regionName);

			}
			
			if(i == 1) {
				String regionID = (String) records.get("regionID");
				System.out.println("\nIn Secord record RegionID is ............"+regionID);
				String regionName = (String) records.get("regionName");
				System.out.println("in Secord record RegionName is ............"+regionName);

			}
			
			if(i == 2) {
				String regionID = (String) records.get("regionID");
				System.out.println("\nIn third record RegionID is ............"+regionID);
				String regionName = (String) records.get("regionName");
				System.out.println("in third record RegionName is ............"+regionName);

			}
		}

	}

}
