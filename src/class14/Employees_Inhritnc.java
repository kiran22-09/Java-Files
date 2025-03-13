package class14;

public class Employees_Inhritnc extends Departments_Inhritnc {

    public String EmployeeNo;
    public String EmployeeFirstName;
    public String EmployeeLastName;
    public String EmployeeJob;

    public Employees_Inhritnc(String regionID, String regionName, String countryID, String countryName,
                              String locationID, String streetAddress, String city, String state, String zipcode,
                              String deptID, String deptName, String EmployeeNo, String EmployeeFirstName,
                              String EmployeeLastName, String EmployeeJob) {
        super(regionID, regionName, countryID, countryName, locationID, streetAddress, city, state, zipcode, deptID, deptName);
        
        System.out.println("Inside Employees inheritance");

        this.EmployeeNo = EmployeeNo;
        this.EmployeeFirstName = EmployeeFirstName;
        this.EmployeeLastName = EmployeeLastName;
        this.EmployeeJob = EmployeeJob;
    }

    public String getEmployeeNo() {
        return EmployeeNo;
    }

    public String getEmployeeFirstName() {
        return EmployeeFirstName;
    }

    public String getEmployeeLastName() {
        return EmployeeLastName;
    }

    public String getEmployeeJob() {
        return EmployeeJob;
    }
}
