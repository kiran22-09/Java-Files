package Classs16_Interface;

public class SmartInk implements Google_Interface {
	
	
	@Override
	public void displayImage(String image) {
		// TODO Auto-generated method stub
		System.err.println(" Display staples store Smart Ink compatible ink cartridge" +image);

		
	}

	@Override
	public void displayText(String adText) {
		// TODO Auto-generated method stub
		System.out.println(" Smart Ink compatible ink cartridge" +adText);

		
	}

	@Override
	public void displayPrice(float price) {
		// TODO Auto-generated method stub
		System.out.println(" Display the price in smartInk" +price);

		
	}

	@Override
	public void displayStoreName(String storeName) {
		// TODO Auto-generated method stub
		System.out.println(" Display the storename " +storeName);

		
	}

	@Override
	public void displayRating(float rating) {
		// TODO Auto-generated method stub
		System.out.println(" Display the rating in smartInk" +rating);

		
	}


}
