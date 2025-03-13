package class25;

public class TestEmployeesFname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (args.length < 4)
		{
			System.out.println("Please provide emp ID, empFName, empLName, empJobId");
		}
		
		String empID = args[0];
		String FName = args[1];
		String LName = args[2];
		String empJobId = args[3];
		
		
		Employees empObj = new Employees(empID, FName, LName, empJobId);
		System.out.println("EmployeeID is ....................." +empObj.getEmpID());
		System.out.println("EmployeeFirstName is .............." +empObj.getFname());
		System.out.println("EmployeeLastName is ..............." +empObj.getLname());
		System.out.println("EmployeeJobID  is ................." +empObj.getEmpJobId());

		boolean EmpIDValid = EmployeesBiz_Inh.chkEmployeeId(empObj.getEmpID());
		boolean EmpFNamelenLimit = EmployeesBiz_Inh.chkEmployeeFirstNamelen(empObj.getFname());
		boolean EmpLNamelenLimit = EmployeesBiz_Inh.chkEmployeeLastNamelen(empObj.getLname());
		boolean EmpJobIDValid = EmployeesBiz_Inh.chkEmployeeJobEquals(empObj.getEmpJobId());
		//boolean EmpJobIDlenLimit = EmployeesBiz_Inh.chkEmployeeJoblen(empObj.getEmpJobId());
		
		if(EmpIDValid && EmpFNamelenLimit && EmpLNamelenLimit && EmpJobIDValid ) {
			System.err.println("Valid Employee Details");
		}
		else {
			System.err.println("InValid Employee Details");
			
			try {
				throw new EmployeeNameEmptyException();
			}catch (EmployeeNameEmptyException e) {
				System.out.println(e.getMessage());
			}
		}
		}


	}


