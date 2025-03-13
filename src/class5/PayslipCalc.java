package class5;

public class PayslipCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int exp =3;
		String job = "salesrep";
		
		String regionId = "ASA";
		String regionName = "North america";
		
		String countryId = "A110";
		String countryName = "USA";
		
		String locationId = "LOC112";
		String streetAdd = "123 king st";
		String city = "Hyd";
		String state = "taylor";
		String zipcode = "533447";
		
		
		Regions regobj = new Regions();
		boolean regionid = regobj.chkregId(regionId);
		boolean regionname = regobj.chkregName(regionName);
		boolean regionsensitive = regobj.chkSen(regionName);
		boolean regionoptions = regobj.regOptions(regionId);
		boolean lenlimit = regobj.reglenLimit(regionId);
		boolean namelimit = regobj.regNamLimit(regionName);
		
		Countrys conobj = new Countrys();
		boolean countryid = conobj.chkcounId(countryId);
		boolean countryname = conobj.chkcounName(countryName);
		boolean countrysensitive = conobj.counSen(countryName);
		boolean counoptions = conobj.counOptions(countryId);
		boolean counlenlimit = conobj.counlenLimit(countryId);
		boolean counnamelimit = conobj.counNamLimit(countryName);
		
		Locations locobj = new Locations();
		boolean locationid = locobj.chklocId(locationId);
		boolean streetadd = locobj.chkstradd(streetAdd);
		boolean loccity = locobj.chkcity(city);
		boolean locstate = locobj.chkstate(state);
		boolean loczip = locobj.chkzip(zipcode);
		boolean locconId = locobj.locchkconId(countryId);
		boolean locOptions = locobj.locOptions(locationId);
		boolean locconOptions = locobj.locconOp(countryName);
		boolean locIdlimit = locobj.loclenLimit(locationId);
		boolean locstrlimit = locobj.locstrNamelimit(streetAdd);
		


		boolean allCondPass = false;
		
		if(regionid == true & regionname == true &  regionoptions == true & regionsensitive == true & lenlimit == true & namelimit == true &
				
		countryid == true & countryname == true  & countrysensitive == true & counoptions == true & counlenlimit == true & counnamelimit == true &
	
		locationid == true & streetadd == true & loccity == true & locstate == true & loczip == true & locconId == true & locOptions == true & 
		locconOptions == true & locIdlimit == true & locstrlimit == true) {
			allCondPass = true;
			
			 NetSalaryCalc obj = new NetSalaryCalc();
	            double net_salary = obj.netSalaryCalc(exp, job);
	            System.err.println("\nNET SALARY of " + job+ " for " +exp+ "  = " + net_salary);
				
		}else {
			System.out.println("One or more conditions not met." );
			//System.out.println("region" +region);
			//System.out.println("location" +location);
			//System.out.println("country" +country);
			allCondPass = false;	
		}
		}

	}


