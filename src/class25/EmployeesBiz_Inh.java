package class25;

public class EmployeesBiz_Inh {
	

		public static boolean chkEmployeeId(String EmployeeId) {
			if(EmployeeId.length() == 0) {
				System.out.println("\nEmp is Empty");
				return false;
			} else {
				System.err.println("\nEmp ID is not Empty");
				return true;
			}
		}
		
		// 2.empno can not be negative or equal to zero
		public static boolean EmpNumLimit(int EmployeeNo1) {
			if(EmployeeNo1 <= 0) {
				System.out.println("empnum is negative or equal to zero");
				return false;
				} else {
					System.out.println("empnum is greater than zero Valid");
					return true;
				}
		}
		//3
		public static boolean chkEmployeeNoLength(String EmployeeId) {
			if(EmployeeId.length() >= 3 & EmployeeId.length() <= 6) {
				System.out.println("emplenth is valid");
				return true;
			} else {
				System.out.println("\nEmployeeNo length is not allowed");
				return false;
				
			}
		
		}
		//4
		public static boolean chkEmployeeFirstNamelen(String Fname) {
			if(Fname.length() == 0) {
				System.out.println("EmployeeFirstName is Empty");
				return false;
			} else {
				System.out.println("Emp first name is not empty");
				return true;
			}
		}
		//5
		public static boolean chkEmployeeLastNamelen(String LName) {
			if(LName.length() == 0) {
				System.out.println("EmployeeLastName is Empty");
				return false;
			} else {
				System.out.println("Emp last name is not empty");
				return true;
			}
		}
		//6
		public static boolean chkEmployeeJoblen(String EmployeeId) {
			if(EmployeeId.length() == 0) {
				System.out.println("EmployeeJob is Empty");
				return false;
			} else {
				System.out.println("EmployeeJob is not Empty");
				return true;
			}
		}
	//7
		public static boolean chkEmployeeJobEquals(String EmployeeId) {
			// TODO Auto-generated method stub
			
				if(EmployeeId.equalsIgnoreCase("Clerk") || EmployeeId.equalsIgnoreCase("Manager") || EmployeeId.equalsIgnoreCase("Sales rep") || EmployeeId.equalsIgnoreCase("Programmer")
						|| EmployeeId.equalsIgnoreCase("Analyst") || EmployeeId.equalsIgnoreCase("Sales Manager")) {
					System.out.println("EmployeeJob is matched");
					return true;
				} else {
					System.out.println("EmployeeJob is not matched");
					return false;
				}
				
			
		}

	}


