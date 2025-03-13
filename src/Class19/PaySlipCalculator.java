package Class19;

public class PaySlipCalculator {

	    public static void main(String[] args) {
	    	NetSalaryCalculator empObj1 = new NetSalaryCalculator(
	    			"NRT", "northamerica", "A110", "USA", "LOC1111", "Leesburg", "10", "Accounts");

	        System.out.println("First employee ....region ID......" + empObj1.getRegionID());
	        System.out.println("First employee ....region NAME......" + empObj1.getRegionName());
	       

	        boolean regionIDEmpty  = RegionsBiz.chkregId(empObj1.getRegionID());
	        boolean regionNameEmpty  = RegionsBiz.chkregName(empObj1.getRegionName());
	        boolean regionidcheck = RegionsBiz.regOptions(empObj1.getRegionID());
	        boolean regionNameckeck = RegionsBiz.chkSen(empObj1.getRegionName());
	        boolean regionidlenckeck = RegionsBiz.reglenLimit(empObj1.getRegionID());
	        boolean regionnamelenckeck = RegionsBiz.regNamLimit(empObj1.getRegionName());

	        if(regionIDEmpty == true && regionidcheck == true) {
	        	System.err.println("Both Biz rules are passed for countries");
	        }
	        
	        
	        
	        System.out.println("\nFirst employee ....country ID......" + empObj1.getCountryID());
	        System.out.println("First employee ....country NAME......" + empObj1.getCountryName());
	         
	       
	       boolean countryIDEmpty  = CountriesBiz_Inh.chkcounId(empObj1.getCountryID());
	        boolean countryNameEmpty  = CountriesBiz_Inh.chkcounName(empObj1.getCountryName());
	        boolean countryIdcheck  = CountriesBiz_Inh.counOptions(empObj1.getCountryID());
	        boolean countryNamecheck  = CountriesBiz_Inh.counSen(empObj1.getCountryName());
	        boolean countryidlen  = CountriesBiz_Inh.counlenLimit(empObj1.getCountryID());
	        boolean countryNamelen  = CountriesBiz_Inh.counNamLimit(empObj1.getCountryName());
	        
	        if(countryIDEmpty == true && countryNameEmpty == true) {
	        	System.err.println("Both Biz rules are passed for countries");

	        
	        
	        
	        System.out.println("\nFirst employee ....location ID......" + empObj1.getLocationID());
	        System.out.println("First employee ....city ......" + empObj1.getCity());
	     

	        boolean locationIDEmpty  = LocationsBiz_Inh.chklocId(empObj1.getLocationID());
	        boolean cityEmpty  = LocationsBiz_Inh.chkcity(empObj1.getCity());
	        boolean ZipcodeEmpty  = LocationsBiz_Inh.chkzip(empObj1.getCountryID());
	        
	        
	        if(locationIDEmpty == true && cityEmpty == true) {
	        	System.err.println("Both Biz rules are passed for locations ");
	        
	       
	        System.out.println("\nFirst employee ....department ID......" + empObj1.getDeptID());
	        System.out.println("First employee ....department namer Address......" + empObj1.getDeptName());
	        
	        boolean departmentIDEmpty  = DepartmentsBiz_Inh.chkdeptId(empObj1.getDeptID());
	        boolean departmentNameEmpty  = DepartmentsBiz_Inh.chkdeptName(empObj1.getDeptName());
	        boolean departmentIdCheck  = DepartmentsBiz_Inh.deptIdOptions(empObj1.getDeptID());
	        boolean departmentNameCheck  = DepartmentsBiz_Inh.deptNameOptions(empObj1.getDeptName());
	        
	        if(departmentIDEmpty == true && departmentNameEmpty == true) {
	        	System.err.println("Both Biz rules are passed for departments");

	        boolean allBizRulesPassed = false;
	        
	        if(regionIDEmpty & regionidcheck & countryIDEmpty & countryNameEmpty & locationIDEmpty & cityEmpty &  departmentIDEmpty & departmentNameEmpty) {
	        	System.err.println("All bizrules are satisfied Basic salary will bw calculated");
	        	empObj1.setEmpID("123");
	        	empObj1.setFname("kiran");
	        	empObj1.setLname("Gundra");
	        	empObj1.setExperience(3);
	        	empObj1.setJobID("SalesManager");
	        	
	        	double basicSalary = empObj1.calculateBasicSalary();
	        	
	        	System.out.println("Basic salary  " +basicSalary );	
	        }
	        else {
	        	System.out.println("Not eligible for basic salary");
	        }
	        
	    }
	}
	        }
	    }
}
	        
	     
