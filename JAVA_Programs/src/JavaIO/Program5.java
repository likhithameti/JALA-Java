package JavaIO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Program5 {
	public static void main(String[] args)
    {
        File file = new File("Sample.txt");
 
        try (FileReader fr = new FileReader(file))
        {
            int content;
            while ((content = fr.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
