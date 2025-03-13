package class14;

public class PaySlipCalcInh {

    public static void main(String[] args) {
        Employees_Inhritnc empObj1 = new Employees_Inhritnc(
            "NRT", "North America", "A110", "USA", "LOC111", "Oxford", "Cumming", 
            "Georgia", "30040", "10", "Accounts", "10000", "Krishna", "Gundra", "Clerk"
        );

        System.out.println("First employee ....region ID......" + empObj1.getRegionID());
        System.out.println("First employee ....region NAME......" + empObj1.getRegionName());
       

        boolean regionIDEmpty  = RegionsBiz_inh.chkregId(empObj1.getRegionID());
        boolean regionNameEmpty  = RegionsBiz_inh.chkregName(empObj1.getRegionName());
        boolean regionidcheck = RegionsBiz_inh.regOptions(empObj1.getRegionID());
        boolean regionNameckeck = RegionsBiz_inh.chkSen(empObj1.getRegionName());
        boolean regionidlenckeck = RegionsBiz_inh.reglenLimit(empObj1.getRegionID());
        boolean regionnamelenckeck = RegionsBiz_inh.regNamLimit(empObj1.getRegionName());

        
        
        
        System.out.println("\nFirst employee ....country ID......" + empObj1.getCountryID());
        System.out.println("First employee ....country NAME......" + empObj1.getCountryName());
        
        boolean countryIDEmpty  = CountriesBiz_Inh.chkcounId(empObj1.getCountryID());
        boolean countryNameEmpty  = CountriesBiz_Inh.chkcounName(empObj1.getCountryName());
        boolean countryIdcheck  = CountriesBiz_Inh.counOptions(empObj1.getCountryID());
        boolean countryNamecheck  = CountriesBiz_Inh.counSen(empObj1.getCountryName());
        boolean countryidlen  = CountriesBiz_Inh.counlenLimit(empObj1.getCountryID());
        boolean countryNamelen  = CountriesBiz_Inh.counNamLimit(empObj1.getCountryName());

        
        
        
        System.out.println("\nFirst employee ....location ID......" + empObj1.getLocationID());
        System.out.println("First employee ....street Address......" + empObj1.getStreetAddress());
        System.out.println("First employee ....city ......" + empObj1.getCity());
        System.out.println("First employee ....state ......" + empObj1.getState());
        System.out.println("First employee ....zipcode ......" + empObj1.getZipcode());

        boolean locationIDEmpty  = LocationsBiz_Inh.chklocId(empObj1.getLocationID());
        boolean streetAddressEmpty  = LocationsBiz_Inh.chkstradd(empObj1.getStreetAddress());
        boolean cityEmpty  = LocationsBiz_Inh.chkcity(empObj1.getCity());
        boolean stateEmpty  = LocationsBiz_Inh.chkstate(empObj1.getState());
        boolean ZipcodeEmpty  = LocationsBiz_Inh.chkzip(empObj1.getCountryID());
        
       
        System.out.println("\nFirst employee ....department ID......" + empObj1.getDeptID());
        System.out.println("First employee ....department namer Address......" + empObj1.getDeptName());
        
        boolean departmentIDEmpty  = DepartmentsBiz_Inh.chkdeptId(empObj1.getDeptID());
        boolean departmentNameEmpty  = DepartmentsBiz_Inh.chkdeptName(empObj1.getDeptName());
        boolean departmentIdCheck  = DepartmentsBiz_Inh.deptIdOptions(empObj1.getDeptID());
        boolean departmentNameCheck  = DepartmentsBiz_Inh.deptNameOptions(empObj1.getDeptName());

        
        
        System.out.println("\nFirst employee ....employee No......" + empObj1.getEmployeeNo());
        System.out.println("First employee ....employee firstname......" + empObj1.getEmployeeFirstName());
        System.out.println("First employee ....employee lastname......" + empObj1.getEmployeeLastName());
        System.out.println("First employee ....employee job......" + empObj1.getEmployeeJob());

        
        boolean EmpNoEmpty  = EmployeesBiz_Inh.chkEmployeeNolen(empObj1.getEmployeeNo());
        boolean EmpFirstname  = EmployeesBiz_Inh.chkEmployeeFirstNamelen(empObj1.getEmployeeFirstName());
        boolean EmpLasttname  = EmployeesBiz_Inh.chkEmployeeLastNamelen(empObj1.getEmployeeLastName());
        boolean EmpJob  = EmployeesBiz_Inh.chkEmployeeJoblen(empObj1.getEmployeeJob());
        boolean EmpNolencheck  = EmployeesBiz_Inh.chkEmployeeNoLength(empObj1.getEmployeeNo());
        boolean Empjobcheck  = EmployeesBiz_Inh.chkEmployeeJobEquals(empObj1.getEmployeeJob());

        
    }
}
