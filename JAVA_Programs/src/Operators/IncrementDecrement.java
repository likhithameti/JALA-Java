package Operators;

public class IncrementDecrement {
	public static void main(String ar[]) {
	    int a = 12, b = 12;
	    int inc, dec;

	    System.out.println("Value of a: " + a);

	    // increment operator
	    inc = ++a;
	    System.out.println("After increment: " + inc);

	    System.out.println("Value of b: " + b);

	    // decrement operator
	    dec = --b;
	    System.out.println("After decrement: " + dec);
	}
}
