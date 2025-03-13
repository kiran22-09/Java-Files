package class25;

public class TestDepartments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length < 2) {
			System.out.println("Please provide DepartmentID and DepartmentName as arguments");
		}
		
		String deptID   = args[0];
		String deptName = args[1];
		
		Departments deptObj = new Departments(deptID,deptName);
		System.out.println("DepartmentId is ......." +deptObj.getDeptID());
		System.out.println("DepartmentName is ......." +deptObj.getDeptName());
		
		boolean DeptIDValid = DepartmentsBiz_Inh.chkdeptId(deptObj.getDeptID());
		boolean DeptNameValid = DepartmentsBiz_Inh.chkdeptName(deptObj.getDeptName());
		boolean DeptIDoptions = DepartmentsBiz_Inh.deptIdOptions(deptObj.getDeptID());
		boolean DeptNameoptions = DepartmentsBiz_Inh.deptNameOptions(deptObj.getDeptName());

		if(DeptIDValid && DeptNameValid && DeptIDoptions && DeptNameoptions) {
			System.err.println("Valid Department Details");
		}
		else {
			System.err.println("InValid Department Details");
			
			try {
				throw new DepartmentIDEmptyException();
			}catch (DepartmentIDEmptyException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
