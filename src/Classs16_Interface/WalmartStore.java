package Classs16_Interface;

public class WalmartStore implements Google_Interface{

	@Override
	public void displayImage(String image) {
		// TODO Auto-generated method stub
		System.err.println(" Display walmart store Canon PG-275 Black ink cartridge" +image);

		
	}

	@Override
	public void displayText(String adText) {
		// TODO Auto-generated method stub
		System.out.println(" Canon PG-275 Black ink cartridge in walamrt" +adText);

		
	}

	@Override
	public void displayPrice(float price) {
		// TODO Auto-generated method stub
		System.out.println(" Display the price in walmart" +price);

		
	}

	@Override
	public void displayStoreName(String storeName) {
		// TODO Auto-generated method stub
		System.out.println(" Display the storename " +storeName);

		
	}

	@Override
	public void displayRating(float rating) {
		// TODO Auto-generated method stub
		System.out.println(" Display the rating in walmart" +rating);

		
	}

}
