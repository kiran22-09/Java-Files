package Class19;

public abstract class Employees extends Departments {
	
	public String empID;
	public String fname;
	public String lname;
	public int experience;
	public String jobID;
	

	public Employees(String regionID, String regionName, String countryID, String countryName, String locationID,
			String city, String deptID, String deptName) {
		super(regionID, regionName, countryID, countryName, locationID, city, deptID, deptName);
		// TODO Auto-generated constructor stub
		System.out.println("inside employees constructor");
	
	}


	public String getEmpID() {
		return empID;
	}


	public void setEmpID(String empID) {
		this.empID = empID;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public int getExperience() {
		return experience;
	}


	public void setExperience(int experience) {
		this.experience = experience;
	}


	public String getJobID() {
		return jobID;
	}


	public void setJobID(String jobID) {
		this.jobID = jobID;
	}

		
	
	

}