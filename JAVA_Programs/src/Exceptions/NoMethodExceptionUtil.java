package Exceptions;

class NoMethodException {
    public void print() {
        System.out.println("hello");
    }

	public void printOutput() {
		// TODO Auto-generated method stub
		
	}
}
public class NoMethodExceptionUtil{
    public static void main(String args[])
    {
        NoMethodException obj=new NoMethodException();
        obj.printOutput();
    }
}

