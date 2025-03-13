package Classs16_Interface;

public class GoogleAddDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AmazonStore amazonObj = new AmazonStore();
		amazonObj.displayImage("\n\nDisplay HP cartridge image");
		amazonObj.displayText(" HP 67 Original Ink cartridges 2-pack in amazon");
		amazonObj.displayPrice( 34.99f);
		amazonObj.displayStoreName("");
		amazonObj.displayRating(4.5f );
		
		
		WalmartStore walmartObj = new WalmartStore();
		walmartObj.displayImage("\n\nWalmert Image");
		walmartObj.displayText("walmart text");
		walmartObj.displayPrice(16.00f);
		walmartObj.displayStoreName("walmart");
		walmartObj.displayRating(4.8f);
		
		
		Staples staplesObj = new Staples();
		staplesObj.displayImage("\n\nStaples Image");
		staplesObj.displayText("Staples Text");
		staplesObj.displayPrice(34.89f);
		staplesObj.displayStoreName("Staples store");
		staplesObj.displayRating(3.8f);
		
		
		SmartInk smartinkObj = new SmartInk();
		smartinkObj.displayImage("\n\nSmartInk Image");
		smartinkObj.displayText("SmartInk Text");
		smartinkObj.displayPrice(3269f);
		smartinkObj.displayStoreName("SmartInk Store");
		smartinkObj.displayRating(4.2f);
		
		
		
		Target targetObj = new Target();
		targetObj.displayImage("\n\n Display HP-67 cartridge image");
		targetObj.displayText("HP-67 cartridge");
		targetObj.displayPrice(18.99f);
		targetObj.displayStoreName("Target");
		targetObj.displayRating(4.5f);
		
		
		
		DepotStore depotObj = new DepotStore();
		depotObj.displayImage("\n\n Display HP-958");
		depotObj.displayText("HP 958");
		depotObj.displayPrice(134.49F);
		depotObj.displayStoreName("DepotStore");
		depotObj.displayRating(3.8f);

	}

}
