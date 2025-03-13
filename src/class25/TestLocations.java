package class25;

public class TestLocations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length < 2) {
			System.out.println("Please provide the LocationId and city as arguments");
		}
		
		String locationId = args[0];
		String city = args[1];
		
		Locations locObj = new Locations(locationId,city);
		System.out.println("LocationID is ...." + locObj.getLocationID());
		System.out.println("City is .........." + locObj.getCity());
		
		boolean locIDValid = LocationsBiz_Inh.chklocId(locObj.getLocationID());
		boolean cityValid  = LocationsBiz_Inh.chkcity(locObj.getCity());
		boolean loclenLimit  = LocationsBiz_Inh.loclenLimit(locObj.getLocationID());
		boolean locIDOptions  = LocationsBiz_Inh.locOptions(locObj.getLocationID());


		
		if(locIDValid && cityValid && loclenLimit && locIDOptions) {
			System.err.println("Valid locations details");
		}
		else {
			System.err.println("Invalid location details");
			
			try {
				throw new LOcationIDEmptyException();
			} catch (LOcationIDEmptyException e) {
				System.out.println(e.getMessage());
				
			}
		}
		

	}

}
