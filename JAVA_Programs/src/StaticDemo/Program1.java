package StaticDemo;


class Pstatic{
	static int a = 10;
	static int b = 20;
	static void m1() {
		System.out.println("Static Method 1");
	}
	static void m2() {
		System.out.println("Static Method 2");
	}
	void m3() {
		System.out.println("Instance Method 1");
	}
	void m4() {
		System.out.println("Instance Method 2");
	}
}
public class Program1 {
	public static void main(String args[]) {
		Pstatic.m1();
		Pstatic.m2();
		Pstatic obj = new Pstatic();
		obj.m3();
		obj.m4();
	}
}
