package StaticDemo;

class Pstatic5{
	int a = 10;
	
	static void m1() {
		System.out.println("static method");
		
	}
	void m2() {
		System.out.println("Instance method");
		m1();
		
	}
	
}
public class Program5 {
	public static void main(String args[]) {
		Pstatic5 d1 = new Pstatic5();
		d1.m2();
	}
}
