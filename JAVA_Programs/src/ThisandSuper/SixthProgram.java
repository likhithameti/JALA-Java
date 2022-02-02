package ThisandSuper;


class Psixth{
	void method1() {
		System.out.println("This is parent method 1");
	}
	void m2() {
		System.out.println("This is parent method 2");
		this.method1();
	}
}

class Csixth extends Psixth{
	void m1() {
		System.out.println("This is child method 1");
	}
	void m2() {
		System.out.println("This is Child method 2");
		super.m2();
	}
}
public class SixthProgram {
	public static void main(String args[]) {
		Csixth ch = new Csixth();
		ch.m2();
	}
}
