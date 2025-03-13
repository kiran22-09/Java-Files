package class25;

public class AgeInvalidException extends Exception {
	
	public AgeInvalidException() {
		super();
	}
	
	
	public String getMessage() {
		return "ablelogix101-Age should be in between 21 and 65";
	}
}


