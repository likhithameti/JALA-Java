package MethodOverloading;

public class ProgramFourth {
	void m1(int a,int b) {
		System.out.println("Integers");
	}
	void m1(char a,char b) {
		System.out.println("Chars");
	}
	public static void main(String args[]) {
		ProgramFourth pm = new ProgramFourth();
		pm.m1(10,20);
		pm.m1('C','D');
	}
}

