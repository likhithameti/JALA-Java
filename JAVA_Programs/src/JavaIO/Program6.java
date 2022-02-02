package JavaIO;

import java.io.*;
public class Program6 {
	public static void main(String[] args)throws IOException {
	        // initialize a string
	        String str = "ABC";
	        try {
	  
	           
	            FileWriter fw = new FileWriter("D:/data/file.txt");
	  
	            for (int i = 0; i < str.length(); i++)
	                fw.write(str.charAt(i));
	  
	            fw.close();
	        }
	        catch (Exception e) {
	            e.getStackTrace();
	        }
	    }
}
