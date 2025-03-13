package class29;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable hashtabObj = new Hashtable();
		
		hashtabObj.put("rollnum", 123456);
		hashtabObj.put("fname", "Krishna");
		hashtabObj.put("mname", "murthy");
		hashtabObj.put("lname", "Gundra");
		hashtabObj.put("feespaid", 50000.99);
		hashtabObj.put("martialstatus", false);
		hashtabObj.put("gender", 'M');
		
		System.out.println("RollNum value is ............"+hashtabObj.get("rollnum"));
		System.out.println("Fname value is ............"+hashtabObj.get("fname"));
		
		String fullname =  "[" +hashtabObj.get("fname") + "," +hashtabObj.get("mname") + "," +hashtabObj.get("lname") + "]";
		System.out.println("Full name is ........."+fullname);
		
		//System.out.println("Full name is "+ "[" +hashtabObj.get("fname") + "," +hashtabObj.get("mname") + "," +hashtabObj.get("lname") + "]") ;
		//System.out.println("Full name is "+ "[" +hashtabObj.get("fname") + " " +hashtabObj.get("mname") + " " +hashtabObj.get("lname") + "]");

		String value1 = hashtabObj.get("feespaid").toString();
		System.out.println("Fees paid in String..........."+value1);
		double val1 = Double.parseDouble(value1);
		double annualfees = val1*2;
		System.out.println("Annual fees in value............."+annualfees);
		
		
		
		double feespaid = (double) hashtabObj.get("feespaid");
		double annualfeespaid = feespaid*2;
		System.out.println("Annual fees paid by casting........."+annualfeespaid);
		
		
		int annualfeepaid = (int) annualfeespaid;
		System.out.println("Annualfee paid by casting into int is............"+annualfeepaid);
	}

}
