package class25;

public class Employees  {
	
	public String empID;
	public String fname;
	public String lname;
	//public int experience;
	public String empJobID;
	

	public Employees(String empID, String fname, String lname, String empJobID) {
	    System.out.println("Inside employees constructor");
	    this.empID = empID;
	    this.fname = fname;
	    this.lname = lname;
	    this.empJobID = empJobID; // Correctly assign empJobID
	}



	public String getEmpID() {
		return empID;
	}


	public String getFname() {
		return fname;
	}


	public String getLname() {
		return lname;
	}


	public String getEmpJobId() {
		return empJobID;
	}
	
}