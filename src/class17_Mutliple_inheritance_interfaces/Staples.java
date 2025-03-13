package class17_Mutliple_inheritance_interfaces;

public class Staples implements GoogleImage  {


	@Override
	public String adText() {
		// TODO Auto-generated method stub
		System.out.println("ADImage is height is fixed by google " +adHeight);
		System.out.println("ADImage is width is fixed by google " +adWidth);
		
		String newAdText = "Staples is genuine printer";
		return newAdText;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Staples obj = new Staples();
		String returnedStr = obj.adText();
		System.out.println("AdText of Staples is " +returnedStr);
		
		
		

	}

}
