package MethodOverloading;

// Not possible with same name : as it not overloading of method 
public class ProgramFifth {
	/*int m1(int a,int b) {
		System.out.println("Single Param");
		return 10;
	}
	*/
	void m1(int a,int b) {
		System.out.println("Double Param");
	}
	public static void main(String args[]) {
		ProgramFifth pm = new ProgramFifth();
		pm.m1(10,20);
	}
}

