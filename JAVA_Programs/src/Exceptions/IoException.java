package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IoException {
    public static void main(String args[])
    {
        try
        {
            FileInputStream in = new FileInputStream("input.txt");
            System.out.println("This is not printed");
        }
        catch (FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
    }
}
