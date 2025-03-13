package class25;

public class DepartmentIDEmptyException extends Exception {
	
	public DepartmentIDEmptyException() {
		super();
	}
	
	@Override
	public String getMessage() { 
		return "DepartmentID cannot be as per the requirements  in Departments"; 
	}

}
