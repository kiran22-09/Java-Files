package JavaBasics;

public class RegionIgnore {
	public boolean chkSen(String regionName) {
		if(regionName.equalsIgnoreCase("North America") || regionName.equalsIgnoreCase("Asia") || regionName.equalsIgnoreCase("Europe")){
			System.out.println("regionName is matched");
			return true;
		}else {
			System.out.println("regionName is not matched");
			return false;
		}
	}

}
