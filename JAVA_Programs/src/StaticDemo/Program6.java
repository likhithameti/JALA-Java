package StaticDemo;

class Pstatic6{
	static int a = 10;
	static int b = 20;
	int c = 30;
	int d = 40;
	
}
public class Program6 {
	public static void main(String ards[]) {
		Pstatic6 obj = new Pstatic6();
		System.out.println("Static variables : "+Pstatic6.a+" "+Pstatic6.b);
		
		System.out.println("Instance variables : "+obj.c+" "+obj.d);
		
	}
}
