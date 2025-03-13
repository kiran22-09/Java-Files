/*package class30;

//import java.util.

//import com.google.common.collect.ArrayListMultimap;

public class MultiMappingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayListMultimap multiMapRegionsObj = new ArrayListMultimap.create();
		
		multiMapRegionsObj.put("regionID", "NRT");
		multiMapRegionsObj.put("regionName", "NorthAmerica");
		
		multiMapRegionsObj.put("regionID", "EUR");
		multiMapRegionsObj.put("regionName", "Europe");
		
		multiMapRegionsObj.put("regionID", "ASA");
		multiMapRegionsObj.put("regionName", "Asia");
		
		System.out.println("Size of Regions List is..............."+multiMapRegionsObj.size());
		System.out.println("Contents of regions ArrayList MultiMap............"+multiMapRegionsObj);
		
		List regionID_LIST = multiMapRegionsObj.get("regionID");
		System.out.println("regionId list is ........."+regionID_LIST);
		
		List regionName_LIST = multiMapRegionsObj.get("regionName");
		System.out.println("regionName list is ........."+regionName_LIST);
		
		for(int i=0;i<regionID_LIST.size();i++) {
			System.out.println("region ID is ................."+regionID_LIST.get(i));
		}

		

	}

} 
*/
