package Class21;

public abstract class Employees extends Departments {
	
	public String empID;
	public String fname;
	public String lname;
	public int experience;
	public String jobID;
	

	public Employees(String regionID, String regionName, String countryID, String countryName, String locationID,
            String city, String deptID, String deptName, String empID, String fname, String lname, int experience, String jobID)  {
		super(regionID, regionName, countryID, countryName, locationID, city,deptID, deptName);
		// TODO Auto-generated constructor stub
		System.out.println("inside employees constructor");
		
		this.empID = empID;
		this.fname = fname;
		this.lname = lname;
		this.experience = experience;
		this.jobID = jobID;
	
	}


	
}