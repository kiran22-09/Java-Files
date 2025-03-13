package class25;

public class CountryIDEmptyException extends Exception{
	
	public CountryIDEmptyException() { 
		super(); 
	}
	@Override
	public String getMessage() { 
		return "CountryID cannot be empty in regions"; 
	}

}	

