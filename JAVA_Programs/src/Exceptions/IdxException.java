package Exceptions;

public class IdxException
{
    public static void main(String args[])
    {
        int arr[]=new int[]{1,2,3,4,5};
        try{
            System.out.println("Element at index 5 is "+arr[5]);
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException)
        {
            indexOutOfBoundsException.printStackTrace();
        }

    }
}