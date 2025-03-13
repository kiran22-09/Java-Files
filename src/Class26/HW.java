package Class26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HW {
	

	
	// Method to read content from a file
    public void readfile(String filelocation) {
        // Create a File object pointing to the specified location
        File fileObj = new File(filelocation);

        if (!fileObj.exists()) {
            System.out.println("File not found: " + filelocation);
            //return;
        }

        try (FileReader FOR = new FileReader(fileObj);
            BufferedReader obj = new BufferedReader(FOR)) {
            String read;
            System.out.println("Reading content from file:");
            while ((read = obj.readLine()) != null) {
                System.out.println(read);
            }
        } catch (IOException e) {
            // Print exception stack trace
            e.printStackTrace();
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String file1 = "C:\\Users\\kiran\\eclipse-workspace\\jv\\JavaBasics\\src\\Class26\\regionID.txt";
		String file2 = "C:\\Users\\kiran\\eclipse-workspace\\jv\\JavaBasics\\src\\Class26\\regionName.txt";
		HW obj = new HW();
		obj.readfile(file1);
		obj.readfile(file2);

	}

}
