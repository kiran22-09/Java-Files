package class25;

public class LOcCityEmptyException extends Exception {
	
	public LOcCityEmptyException() {
		super();
	}
	@Override
	public String getMessage() { 
		return "Loc City cannot be nmpty in Locations, Its required field"; 
	}

}
