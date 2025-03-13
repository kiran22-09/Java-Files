package class25;

public class EmployeeNameEmptyException extends Exception{
	
	public EmployeeNameEmptyException() {
		super();
	}
	
	@Override
	public String getMessage() { 
		return "EmployeeName cannot be empty as per the requirements  in Locations"; 
	}

}
