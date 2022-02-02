package JavaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Program1 {
	public static void main(String ars[]) {
		    File file = new File("Sample.txt");
		 
	        try (InputStream in = new FileInputStream(file))
	        {
	            String contents = in.toString();
	            System.out.println(contents);
	        }
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}
