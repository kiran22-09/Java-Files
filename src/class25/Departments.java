package class25;

public  class Departments  {
	
	public String deptID;
	public String deptName;

	public Departments(String deptID,String deptName) {
		//super(regionID, regionName, countryID, countryName, locationID, city);
		// TODO Auto-generated constructor stub
		
		
		System.out.println("inside Departments constructor.......");
		this.deptID = deptID;
		this.deptName = deptName;
	}	

	public String getDeptID() {
		return deptID;
	}

	public String getDeptName() {
		return deptName;
	}

	
}