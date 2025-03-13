package class25;

public class DepartmentNameEmptyException extends Exception {
	
	public DepartmentNameEmptyException() {
		super();
	}
	
	@Override
	public String getMessage() { 
		return "DepartmentName cannot be empty as per the requirements in Departments"; 
	}

}
