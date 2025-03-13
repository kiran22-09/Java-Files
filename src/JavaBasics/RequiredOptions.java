package JavaBasics;

public class RequiredOptions {
	public boolean regOptions(String regionId) {
		if(regionId.equals("NRT") || regionId.equals("EUR") || regionId.equals("ASA")) {
			System.out.println("region Id is matched in the options");
			return true;
		}else {
			System.out.println("region Id not matched");
			return false;
		}
	}
}
