package StaticDemo;


class Pstatic4{
	int a = 10;
	
	// cannot call instance method in static method
	static void m1() {
		System.out.println("static method");
		//m2();
	}
	void m2() {
		System.out.println("Instance method");
		
	}
	
}
public class Program4 {
	public static void main(String args[]) {
		Pstatic4 d1 = new Pstatic4();
		d1.m2();
	}
}
