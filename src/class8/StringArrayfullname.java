package class8;

public class StringArrayfullname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String names[] = new String[3];
		names[0] = "krishna";
		names[1] = "Murthy";
		names[2] = "Gundra";
		
		String fname = null;
		String mname = null;
		String lname = null;
		
		for(int i = 0; i< names.length;i++)
		{
		
			if(i==0) {
				fname = names[i];
			}
			
			if(i==1) {
				mname = names[i];
			}
			
			if(i==2) {
				lname = names[i];
			}
		}
		String fullname = "["+fname+" "+mname+" "+lname+"]";
		System.out.println("FullName is " + fullname);		
			
				
			}
	}


