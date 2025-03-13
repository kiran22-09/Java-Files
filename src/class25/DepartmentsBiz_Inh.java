package class25;

public class DepartmentsBiz_Inh {
	

		public static boolean chkdeptId(String deptId) {
			if(deptId.length() == 0) {
				System.out.println("department Id is empty");
				return false;
			}else {
				System.out.println("department is not empty");
				return true;
			}
		}
			
			public static boolean chkdeptName(String deptName) {
		        if (deptName.length() == 0) {
		            System.out.println("department Name is empty");
		            return false;
		        } else {
		            System.out.println("department Name is not empty");
		            return true;
		        }
		    
		}
			public static boolean deptNameOptions(String deptName) {
				if(deptName.equalsIgnoreCase("Accounts") || deptName.equalsIgnoreCase("Sales") || deptName.equalsIgnoreCase("IT") || deptName.equalsIgnoreCase("Finance")) {
					System.out.println("department Name is matched with given the options");
					return true;
				}else {
					System.out.println("department Name not matched");
					return false;
				}
			}
			
			public static boolean deptIdOptions(String deptId) {
				if(deptId.equals("10") || deptId.equals("20")  || deptId.equals("30")  || deptId.equals("40") ) {
					System.out.println("department Id is matched with given the options");
					return true;
				}else {
					System.out.println("department Id not matched");
					return false;
				}
			}

	}

