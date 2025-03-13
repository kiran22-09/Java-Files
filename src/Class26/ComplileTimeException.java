package Class26;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ComplileTimeException {

    public void writefile(String filelocation) {
        // Create a File object pointing to the specified location
        File fileObj = new File(filelocation);

        try (FileWriter FOW = new FileWriter(fileObj)) {
            // Write content to the file
        	
            FOW.write("THE file is created in class 26 using filewriter method");
            System.out.println("File written successfully to: " + filelocation);
        } catch (IOException e) {
            // Print exception stack trace
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Define the file location
        String filelocation = "C:\\Users\\kiran\\eclipse-workspace\\jv\\JavaBasics\\src";

        // Create an instance of the class and call the writefile method
        ComplileTimeException obj = new ComplileTimeException();
        obj.writefile(filelocation);
    }
}
