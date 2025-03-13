package class25;

public class TestCountriesName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length < 2) {
			System.out.println("Please provide the countryID and countryName as arguments");
		}
		
		String countryID = args[0];
		String countryName = args[1];
		
    	Countries regionobj = new Countries(countryID, countryName);
    	System.out.println("CounrtyID is....." + regionobj.getCountryID());
    	System.out.println("CounrtyName is....." + regionobj.getCountryName());
    	
    	boolean countryIDValid = CountriesBiz_Inh.chkcounId(regionobj.getCountryID());
    	boolean countryNameValid = CountriesBiz_Inh.chkcounName(regionobj.getCountryName());
    	boolean countryIDoptions = CountriesBiz_Inh.counOptions(regionobj.getCountryID());
    	boolean countryNameoptions = CountriesBiz_Inh.counSen(regionobj.getCountryName());
    	boolean countryIDlenLimit = CountriesBiz_Inh.counlenLimit(regionobj.getCountryID());
    	boolean countryNamelenLimit = CountriesBiz_Inh.counNamLimit(regionobj.getCountryName());

		if(countryIDValid && countryNameValid && countryIDoptions && countryNameoptions && countryIDlenLimit && countryNamelenLimit) {
			System.err.println("Valid COUNTRY details");
		}
		else {
			System.out.println("InValid COUNTRY details");
			
			try {
				throw new CountryNameEmptyException();
			} catch (CountryNameEmptyException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
