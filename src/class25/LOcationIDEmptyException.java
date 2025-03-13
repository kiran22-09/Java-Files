package class25;

public class LOcationIDEmptyException extends Exception {
	
	public LOcationIDEmptyException() {
		super();
	}
	@Override
	public String getMessage() { 
		return "LocationID cannot be nmpty in Locations, Its required field"; 
	}

}
