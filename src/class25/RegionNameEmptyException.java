package class25;

public class RegionNameEmptyException extends Exception{
	
	public RegionNameEmptyException() { 
		super(); 
	}
	@Override
	public String getMessage() { 
		return "RegionName cannot be empty regions"; 
	}

}	

