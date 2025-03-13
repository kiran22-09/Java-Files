package class25;

public class EmployeeIDEmptyException extends Exception{
	
	public EmployeeIDEmptyException() {
		super();
	}
	
	@Override
	public String getMessage() { 
		return "EmployeeID cannot be empty as per the requirements  in Locations"; 
	}

}
