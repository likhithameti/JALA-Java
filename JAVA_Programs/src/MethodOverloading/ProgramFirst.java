package MethodOverloading;

public class ProgramFirst {
	void m1(int a) {
		System.out.println("Single Param");
	}
	void m1(int a,int b) {
		System.out.println("Double Param");
	}
	public static void main(String args[]) {
		ProgramFirst pm = new ProgramFirst();
		pm.m1(10);
		pm.m1(10,20);
	}
}
