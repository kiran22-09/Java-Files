package Classs16_Interface;

public class BestbuyStore implements Google_Interface {
	
	@Override
	public void displayImage(String image) {
		// TODO Auto-generated method stub
		System.out.println(" Display bestbuy store HP 67 Black ink cartridge" +image);

		
	}

	@Override
	public void displayText(String adText) {
		// TODO Auto-generated method stub
		System.out.println(" HP 67 Black ink cartridge in bestbuy" +adText);

		
	}

	@Override
	public void displayPrice(float price) {
		// TODO Auto-generated method stub
		System.out.println(" Display the price in bestbuy" +price);

		
	}

	@Override
	public void displayStoreName(String storeName) {
		// TODO Auto-generated method stub
		System.out.println(" Display the storename " +storeName);

		
	}

	@Override
	public void displayRating(float rating) {
		// TODO Auto-generated method stub
		System.out.println(" Display the rating in bestbuy" +rating);

		
	}

}
