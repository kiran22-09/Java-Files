package Classs16_Interface;

public class DepotStore implements Google_Interface{
	
	@Override
	public void displayImage(String image) {
		// TODO Auto-generated method stub
		System.err.println(" Display DepotStore store HP 958 Logo DepotStore" +image);

		
	}

	@Override
	public void displayText(String adText) {
		// TODO Auto-generated method stub
		System.out.println(" HP 958 ink cartridge" +adText);

		
	}

	@Override
	public void displayPrice(float price) {
		// TODO Auto-generated method stub
		System.out.println(" Display the price in DepotStore" +price);

		
	}

	@Override
	public void displayStoreName(String storeName) {
		// TODO Auto-generated method stub
		System.out.println(" Display the storename " +storeName);

		
	}

	@Override
	public void displayRating(float rating) {
		// TODO Auto-generated method stub
		System.out.println(" Display the rating in DepotStore" +rating);

	}

}
