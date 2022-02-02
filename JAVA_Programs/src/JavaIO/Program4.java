package JavaIO;

import java.io.*;
public class Program4 {
	public static void main(String args[])throws Exception
    {
        FileOutputStream fout = new FileOutputStream("f1.txt");
       
        BufferedOutputStream bout = new BufferedOutputStream(fout);
  
       
        for(int i = 65; i < 75; i++)
        {
            bout.write(i);
        }
          
        byte b[] = { 75, 76, 77, 78, 79, 80 };
        bout.write(b);
  
        bout.flush();
       
        bout.close();
        fout.close();
    }
}
