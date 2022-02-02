package ThisandSuper;

class CurrentClass{
	CurrentClass(){
		this(30);
		System.out.println("This is Parent Class ");
	}
	CurrentClass(int ele){
		System.out.println("This Parameterized "+ele);
	}
}


public class FourthProgram {
	public static void main(String args[]) {
		CurrentClass ch = new CurrentClass();
	}
}

