package class11;

public class Employees {
	
	public String EmployeeNo;
	public int EmployeeNo1;
	public String EmployeeFirstName;
	public String EmployeeLastName;
	public String EmployeeJob;
	
	
	public Employees(String EmployeeNo, int EmployeeNo1, String EmployeeFirstName, String EmployeeLastName, String EmployeeJob ) {
		this.EmployeeNo = EmployeeNo;
		this.EmployeeNo1 = EmployeeNo1;
		this.EmployeeFirstName = EmployeeFirstName;
		this.EmployeeLastName = EmployeeLastName;
		this.EmployeeJob = EmployeeJob;
		
	}


	public String getEmployeeNo() {
		return EmployeeNo;
	}


	public int getEmployeeNo1() {
		return EmployeeNo1;
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