package class30;

import java.util.Hashtable;

public class HashTablewithMultipleRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable hashTableObj = new Hashtable();
		hashTableObj.put("rollnum", 123456);
		hashTableObj.put("fname", "Krishna");
		hashTableObj.put("mname", "murthy");
		hashTableObj.put("lname", "Gundra");
		hashTableObj.put("feespaid", 50000.99);
		hashTableObj.put("martialstatus", false);
		hashTableObj.put("gender", 'M');
		
		
		
		
		hashTableObj.put("rollnum", 987654);
		hashTableObj.put("fname", "kiran");
		hashTableObj.put("mname", "murthy");
		hashTableObj.put("lname", "Gundra");
		hashTableObj.put("feespaid", 25000.99);
		hashTableObj.put("martialstatus", true);
		hashTableObj.put("gender", 'M');
		
		System.out.println("RollNum value is ............"+hashTableObj.get("rollnum"));
		System.out.println("Fname value is ............"+hashTableObj.get("fname"));

		//Here it us printing only the latest record, it is eliminating the old records
		//To avoid that we use 1.multimapping 2.hash table and hash mapping 3.Hash table and arraylist
	}

}
