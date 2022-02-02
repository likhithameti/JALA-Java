package JavaIO;

import java.io.*;  
public class Program8 {  
	public static void main(String[] args) throws Exception {     
		FileWriter writer = new FileWriter("D:\\testout.txt");  
    
		BufferedWriter buffer = new BufferedWriter(writer);  
		buffer.write("Welcome to javaTpoint.");  
		buffer.close();    
    }  
}  