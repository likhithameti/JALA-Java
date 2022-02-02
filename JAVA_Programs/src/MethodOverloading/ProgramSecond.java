package MethodOverloading;

public class ProgramSecond {
	void m1(int a) {
		System.out.println("Single Param");
	}
	void m1(int a,char b) {
		System.out.println("Double Param");
	}
	public static void main(String args[]) {
		ProgramSecond pm = new ProgramSecond();
		pm.m1(10);
		pm.m1(10,'C');
	}
}
