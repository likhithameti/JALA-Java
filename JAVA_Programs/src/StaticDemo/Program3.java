package StaticDemo;

class Pstatic3{
	static int a = 10;
	
	void m1() {
		System.out.println("Value of a : "+a);
	}
	
}
public class Program3 {
	public static void main(String args[]) {
		Pstatic3 d1 = new Pstatic3();
		d1.m1();
	}
}
