package Classs16_Interface;

public class Target implements Google_Interface{
	
	@Override
	public void displayImage(String image) {
		// TODO Auto-generated method stub
		System.err.println(" Display Target store HP cartridge Logo target" +image);

		
	}

	@Override
	public void displayText(String adText) {
		// TODO Auto-generated method stub
		System.out.println(" HP 67-Black ink cartridge" +adText);

		
	}

	@Override
	public void displayPrice(float price) {
		// TODO Auto-generated method stub
		System.out.println(" Display the price in Target" +price);

		
	}

	@Override
	public void displayStoreName(String storeName) {
		// TODO Auto-generated method stub
		System.out.println(" Display the storename " +storeName);

		
	}

	@Override
	public void displayRating(float rating) {
		// TODO Auto-generated method stub
		System.out.println(" Display the rating in Target" +rating);

	}


}
