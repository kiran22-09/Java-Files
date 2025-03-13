package JavaBasics;

public class Location {
	public boolean chklocId(String locationId) {
		if(locationId.length() == 0) {
			System.out.println("location Id is empty");
			return false;
		}else {
			System.out.println("location Id is not empty");
			return true;
		}
	}
}
