package Classs16_Interface;

public class AmazonStore implements Google_Interface {

	@Override
	public void displayImage(String image) {
		// TODO Auto-generated method stub
		
		System.err.println(" Display Amazon store HP cartridge Logo amazon " +image);
		
	}

	@Override
	public void displayText(String adText) {
		// TODO Auto-generated method stub
		
		System.out.println(" HP 67 Original Ink cartridges 2-pack in amazon " +adText);
		
	}

	@Override
	public void displayPrice(float price) {
		// TODO Auto-generated method stub
		
		System.out.println(" Display the price in amazon" +price);

		
	}

	@Override
	public void displayStoreName(String storeName) {
		// TODO Auto-generated method stub
		
		System.out.println(" Display the store name " +storeName);

		
	}

	@Override
	public void displayRating(float rating) {
		// TODO Auto-generated method stub
		
		System.out.println(" Display the rating of amazon  " +rating);

		
	}

	
}
