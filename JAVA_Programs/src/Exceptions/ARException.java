package Exceptions;

import java.util.*;
public class ARException {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=5,b=0;
        try
        {
            System.out.println("Result a/b is "+(a/b));
        }
        catch (ArithmeticException arithmeticException)
        {
            arithmeticException.printStackTrace();
        }

    }

}
