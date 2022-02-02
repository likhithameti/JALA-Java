package ThisandSuper;


class Current{
	Current(){
		System.out.println("This is Parent Class ");
	}
	Current(int ele){
		this();
		System.out.println("This Parameterized "+ele);
	}
}


public class ThirdProgram {
	public static void main(String args[]) {
		Current ch = new Current(10);
	}
}
