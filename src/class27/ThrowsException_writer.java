package class27;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileDescriptor;

public class ThrowsException_writer {

    public void writefile(String filelocation) throws IOException {
        // Create a File object pointing to the specified location
        File fileObj = new File(filelocation);
        FileWriter FOD =new FileWriter(new FileDescriptor());
        FileWriter FOW  = null;
        
        
            // Write content to the file
        	FOW = new FileWriter(fileObj);
            FOW.write("THE file is created in class 26 using filewriter method");
            System.out.println("File written successfully to: " + filelocation);
            FOW.flush();
            FOW.close();
        
    }
   

    public static void main(String[] args) throws IOException {
        // Define the file location
        String filelocation = "C:\\Users\\kiran\\eclipse-workspace\\jv\\JavaBasics\\src\\class27";

        // Create an instance of the class and call the writefile method
        ThrowsException_writer obj = new ThrowsException_writer();
        obj.writefile(filelocation);
        System.out.println("File ie written successfully");
    }
}
