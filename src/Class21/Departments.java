package Class21;

public abstract class Departments extends Locations {
	
	public String deptID;
	public String deptName;

	public Departments(String regionID, String regionName, String countryID, String countryName, String locationID,
			String city,String deptID,String deptName) {
		super(regionID, regionName, countryID, countryName, locationID, city);
		// TODO Auto-generated constructor stub
		
		
		System.out.println("inside Departments constructor.......");
		this.deptID = deptID;
		this.deptName = deptName;
	}	

	
	
}