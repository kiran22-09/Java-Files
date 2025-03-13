package class25;

public class EmployeeJobIDEmptyException extends Exception{
	
	public EmployeeJobIDEmptyException() {
		super();
	}
	
	@Override
	public String getMessage() { 
		return "EmployeeName cannot be empty as per the requirements  in Locations"; 
	}

}
