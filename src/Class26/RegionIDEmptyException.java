package Class26;

public class RegionIDEmptyException extends Exception{
	
	public RegionIDEmptyException() { 
		super(); 
	}
	@Override
	public String getMessage() { 
		return "RegionID should not be empty or null"; 
	}

}	

