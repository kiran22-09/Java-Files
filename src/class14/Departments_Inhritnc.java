package class14;

public class Departments_Inhritnc extends Locations_Inhritnc {

    public String deptID;
    public String deptName;

    public Departments_Inhritnc(String regionID, String regionName, String countryID, String countryName,
                                String locationID, String streetAddress, String city, String state, String zipcode,
                                String deptID,String deptName) {

        super(regionID, regionName, countryID, countryName, locationID, streetAddress, city, state, zipcode);

        System.out.println("Inside departments inheritance");

        this.deptID = deptID;
        this.deptName = deptName;
    }

    // Getters
    public String getDeptID() {
        return deptID;
    }

    public String getDeptName() {
        return deptName;
    }
}
