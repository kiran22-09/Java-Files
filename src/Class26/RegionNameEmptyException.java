package Class26;

public class RegionNameEmptyException extends Exception{
	
	public RegionNameEmptyException() { 
		super(); 
	}
	@Override
	public String getMessage() { 
		return "RegionName is not matched with the requirements  in regions"; 
	}

}	

