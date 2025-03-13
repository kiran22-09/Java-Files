package class10;

public class Locations {

	
	public String locationID;
	public String streetAddress;
	public String city;
	public String state;
	public String zipcode;
	
	
	public Locations(String locationID,String streetAddress,String city,String state,String zipcode) {
				
				this.locationID = locationID;
				this.streetAddress = streetAddress;
				this.city = city;
				this.state = state;
				this.zipcode = zipcode;	
			
		}
	
			public String getlocationID() {
				return locationID;
			}
			
			public String getstreetAddress() {
				return streetAddress;
			}
			
			public String getcity() {
				return city;
			}
			
			public String getstate() {
				return state;
			}
			
			public String getzipcode() {
				return zipcode;
			}
			
			
		}




