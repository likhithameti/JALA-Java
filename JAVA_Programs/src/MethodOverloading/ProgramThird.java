package MethodOverloading;

public class ProgramThird {
	void m1(int a) {
		System.out.println("Single Param");
	}
	
	/* Ambuigity
	 * void m1(int a) {
		System.out.println("Double Param");
	}
	*/
	public static void main(String args[]) {
		ProgramThird pm = new ProgramThird();
		// ambuiguity
		pm.m1(10);
		
	}
}
