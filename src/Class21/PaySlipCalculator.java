package Class21;

public class PaySlipCalculator {

	    public static void main(String[] args) {
	    	NetSalaryCalculator empObj1 = new NetSalaryCalculator(
	                "NRT", "northamerica", "A110", "USA", "LOC1111", "Leesburg", "10", "Accounts","1111","kiran","Gundra",8,"ManaGEr");

	        System.out.println("First employee ....region ID......" + empObj1.regionID);	        
	        System.out.println("First employee ....region NAME......" + empObj1.regionName);
	       

	        boolean regionIDEmpty  = RegionsBiz.chkregId(empObj1.regionID);
	        boolean regionNameEmpty  = RegionsBiz.chkregName(empObj1.regionName);
	        boolean regionidcheck = RegionsBiz.regOptions(empObj1.regionID);
	        boolean regionNameckeck = RegionsBiz.chkSen(empObj1.regionName);
	        boolean regionidlenckeck = RegionsBiz.reglenLimit(empObj1.regionID);
	        boolean regionnamelenckeck = RegionsBiz.regNamLimit(empObj1.regionName);

	        if(regionIDEmpty == true && regionidcheck == true) {
	        	System.err.println("Both Biz rules are passed for countries");
	        }
	        
	        
	        
	        System.out.println("\nFirst employee ....country ID......" + empObj1.countryID);
	        System.out.println("First employee ....country NAME......" + empObj1.countryName);
	         
	       
	       boolean countryIDEmpty  = CountriesBiz_Inh.chkcounId(empObj1.countryID);
	        boolean countryNameEmpty  = CountriesBiz_Inh.chkcounName(empObj1.countryName);
	        boolean countryIdcheck  = CountriesBiz_Inh.counOptions(empObj1.countryID);
	        boolean countryNamecheck  = CountriesBiz_Inh.counSen(empObj1.countryName);
	        boolean countryidlen  = CountriesBiz_Inh.counlenLimit(empObj1.countryID);
	        boolean countryNamelen  = CountriesBiz_Inh.counNamLimit(empObj1.countryName);
	        
	        if(countryIDEmpty == true && countryNameEmpty == true) {
	        	System.err.println("Both Biz rules are passed for countries");

	        
	        
	        
	        System.out.println("\nFirst employee ....location ID......" + empObj1.locationID);
	        System.out.println("First employee ....city ......" + empObj1.city);
	     

	        boolean locationIDEmpty  = LocationsBiz_Inh.chklocId(empObj1.locationID);
	        boolean cityEmpty  = LocationsBiz_Inh.chkcity(empObj1.city);
	        boolean ZipcodeEmpty  = LocationsBiz_Inh.chkzip(empObj1.locationID);
	        
	        
	        if(locationIDEmpty == true && cityEmpty == true) {
	        	System.err.println("Both Biz rules are passed for locations ");
	        
	       
	        System.out.println("\nFirst employee ....department ID......" + empObj1.deptID);
	        System.out.println("First employee ....department namer Address......" + empObj1.deptName);
	        
	        boolean departmentIDEmpty  = DepartmentsBiz_Inh.chkdeptId(empObj1.deptID);
	        boolean departmentNameEmpty  = DepartmentsBiz_Inh.chkdeptName(empObj1.deptName);
	        boolean departmentIdCheck  = DepartmentsBiz_Inh.deptIdOptions(empObj1.deptID);
	        boolean departmentNameCheck  = DepartmentsBiz_Inh.deptNameOptions(empObj1.deptName);
	        
	        if(departmentIDEmpty == true && departmentNameEmpty == true) {
	        	System.err.println("Both Biz rules are passed for departments");

	        boolean allBizRulesPassed = false;
	        
	        if(regionIDEmpty & regionidcheck & countryIDEmpty & countryNameEmpty & locationIDEmpty & cityEmpty &  departmentIDEmpty & departmentNameEmpty) {
	        	System.err.println("All bizrules are satisfied Basic salary will bw calculated");
	        	/*empObj1.setEmpID("123");
	        	empObj1.setFname("kiran");
	        	empObj1.setLname("Gundra");
	        	empObj1.setExperience(3);
	        	empObj1.setJobID("SalesManager");
	        	*/
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
	        
	     
