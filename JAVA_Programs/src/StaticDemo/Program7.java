package StaticDemo;

class Pstatic7{
	static int a = 10;
	static int b = 20;
	int c = 30;
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
public class Program7 {
	public static void main(String args[]) {
		Pstatic7.m1();
		Pstatic7.m2();
		Pstatic7 obj = new Pstatic7();
		obj.m3();
		obj.m4();
		
		System.out.println("Static variables : "+Pstatic7.a+" "+Pstatic7.b);
		
		System.out.println("Instance variables : "+obj.c);
	}
}
