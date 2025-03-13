package class10;

public class EmployeesBiz {
	//1
	public boolean chkEmployeeNolen(String EmployeeNo) {
		if(EmployeeNo.length() == 0) {
			System.out.println("\nCountryID is Empty");
			return false;
		} else {
			System.err.println("\nEmp ID is not Empty");
			return true;
		}
	}
	
	// 2.empno can not be negative or equal to zero
	public boolean EmpNumLimit(int EmployeeNo1) {
		if(EmployeeNo1 <= 0) {
			System.out.println("empnum is negative or equal to zero");
			return false;
			} else {
				System.out.println("empnum is greater than zero Valid");
				return true;
			}
	}
	//3
	public boolean chkEmployeeNoLength(String EmployeeNo) {
		if(EmployeeNo.length() >= 3 & EmployeeNo.length() <= 6) {
			System.out.println("emplenth is valid");
			return true;
		} else {
			System.out.println("\nEmployeeNo length is not allowed");
			return false;
			
		}
	
	}
	//4
	public boolean chkEmployeeFirstNamelen(String EmployeeFirstName) {
		if(EmployeeFirstName.length() == 0) {
			System.out.println("EmployeeFirstName is Empty");
			return false;
		} else {
			System.out.println("Emp first name is not empty");
			return true;
		}
	}
	//5
	public boolean chkEmployeeLastNamelen(String EmployeeLastName) {
		if(EmployeeLastName.length() == 0) {
			System.out.println("EmployeeLastName is Empty");
			return false;
		} else {
			System.out.println("Emp last name is not empty");
			return true;
		}
	}
	//6
	public boolean chkEmployeeJoblen(String EmployeeJob) {
		if(EmployeeJob.length() == 0) {
			System.out.println("EmployeeJob is Empty");
			return false;
		} else {
			return true;
		}
	}
//7
	public boolean chkEmployeeJobEquals(String EmployeeJob) {
		// TODO Auto-generated method stub
		
			if(EmployeeJob.equalsIgnoreCase("Clerk") || EmployeeJob.equalsIgnoreCase("Manager") || EmployeeJob.equalsIgnoreCase("Sales rep") || EmployeeJob.equalsIgnoreCase("Programmer")
					|| EmployeeJob.equalsIgnoreCase("Analyst") || EmployeeJob.equalsIgnoreCase("Sales Manager")) {
				return true;
			} else {
				System.out.println("EmployeeJob is not matched");
				return false;
			}
			
		
	}

}