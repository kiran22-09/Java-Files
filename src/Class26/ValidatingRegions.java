package Class26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ValidatingRegions {
	
	public static String readfromFile(String Filelocation) {
		
		File fileObj = new File(Filelocation);
		if(! fileObj.exists() ) {
			System.err.println("File does not exists " +Filelocation);
		return null;	
		}
		
		try (BufferedReader BOR = new BufferedReader(new FileReader(fileObj))) {
			return BOR.readLine();
		}
		catch (IOException e) {
            e.printStackTrace();
		return null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String regionIDFile = "C:\\Users\\kiran\\eclipse-workspace\\jv\\JavaBasics\\src\\Class26\\regionID.txt";
        String regionNameFile = "C:\\Users\\kiran\\eclipse-workspace\\jv\\JavaBasics\\src\\Class26\\regionName.txt";
        
        String regionID = readfromFile(regionIDFile);
        String regionName = readfromFile(regionNameFile);
        
        if(regionID == null || regionName == null) {
        	try {
    			throw new RegionIDEmptyException();
    		}catch (RegionIDEmptyException e) {
    			System.err.println(e.getMessage());
    		}
        	return;
        	
        }
        
        Regions regObj = new Regions(regionID, regionID);
        
        try {
        	if(regionID.isEmpty()) {
        		throw new RegionIDEmptyException();
        	}
            System.out.println("Region ID is not empty.");
        }
        catch(RegionIDEmptyException e) {
        	System.out.println(e.getMessage());
        	return;
        }
        

        boolean regionIDValid   = RegionsBiz.chkregId(regObj.getRegionID());
    	boolean regionNameValid = RegionsBiz.chkregName(regObj.getRegionName());
    	boolean regionIDOptions = RegionsBiz.regOptions(regObj.getRegionID());
    	boolean regionNameOptions = RegionsBiz.chkSen(regObj.getRegionName());
    	boolean regionIDlenLimit = RegionsBiz.reglenLimit(regObj.getRegionID());
    	boolean regionNamelenLimit = RegionsBiz.regNamLimit(regObj.getRegionName());


    	if(regionIDValid && regionNameValid &&  regionIDOptions && regionNameOptions && regionIDlenLimit && regionNamelenLimit) {
    		System.err.println("Valid region details");
    	
    	
    	System.out.println("Regions Data is Valid");
    	System.out.println("RegionId is ..........." + regObj.getRegionID());
    	System.out.println("RegionName is.......... " + regObj.getRegionName());
    	}
    	
    	else {
            System.err.println("Region data is invalid. Please correct the input files.");
        }
	}

}

/*
package Class26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import class25.RegionIDEmptyException;

public class RegionValidator {

    // Read content from a file
    public static String readFromFile(String filePath) {
        File fileobj = new File(filePath);
        if (!fileobj.exists()) {
            System.err.println("File not found: " + filePath);
            return null;
        }

        try (BufferedReader BOR = new BufferedReader(new FileReader(fileobj))) {
            return BOR.readLine(); // Read only the first line
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        // File paths
        String regionIDFile = "C:\\Users\\kiran\\eclipse-workspace\\jv\\JavaBasics\\src\\Class26\\regionID.txt";
        String regionNameFile = "C:\\Users\\kiran\\eclipse-workspace\\jv\\JavaBasics\\src\\Class26\\regionName.txt";

        // Read data from files
        String regionID = readFromFile(regionIDFile);
        String regionName = readFromFile(regionNameFile);

        // Check if files were read successfully
        if (regionID == null || regionName == null) {
        	try {
    			throw new RegionIDEmptyException();
    		}catch (RegionIDEmptyException e) {
    			System.err.println(e.getMessage());
    		}
            
            return;
        }

        // Create Regions object
        Regions region = new Regions(regionID, regionName);

        // Validate Region ID
        try {
            if (regionID.isEmpty()) {
                throw new RegionIDEmptyException();
            }
            System.out.println("Region ID is not empty.");
        } catch (RegionIDEmptyException e) {
            System.err.println(e.getMessage());
            return;
        }

        // Check all business rules
        boolean isIDNotEmpty = RegionsBiz.chkregId(region.getRegionID());
        boolean isNameNotEmpty = RegionsBiz.chkregName(region.getRegionName());
        boolean isIDValid = RegionsBiz.regOptions(region.getRegionID());
        boolean isNameValid = RegionsBiz.chkSen(region.getRegionName());

        // Additional checks
        boolean isIDWithinLimit = RegionsBiz.reglenLimit(region.getRegionID());
        boolean isNameWithinLimit = RegionsBiz.regNamLimit(region.getRegionName());
        boolean isNameValidFormat = RegionsBiz.regNamechk(region.getRegionName());

        // Combine results
        boolean isValid = isIDNotEmpty && isNameNotEmpty && isIDValid && isNameValid &&
                          isIDWithinLimit && isNameWithinLimit && isNameValidFormat;

        if (isValid) {
            System.out.println("Region data is valid:");
            System.out.println("Region ID: " + region.getRegionID());
            System.out.println("Region Name: " + region.getRegionName());
        } else {
            System.err.println("Region data is invalid. Please correct the input files.");
        }
    }
}

*/