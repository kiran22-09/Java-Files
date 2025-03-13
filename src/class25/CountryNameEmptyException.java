package class25;

public class CountryNameEmptyException extends Exception{
	
	public CountryNameEmptyException() { 
		super(); 
	}
	@Override
	public String getMessage() { 
		return "CountryName cannot be Empty in regions, It is a required field"; 
	}

}	

