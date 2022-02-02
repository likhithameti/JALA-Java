package ThisandSuper;


class Currents{
	Currents(int ele){
		System.out.println("This is Parent Class "+ele);
	}
	
}

class ChildCurrent extends Currents{
	ChildCurrent(int ele){
		super(ele);
		System.out.println("This is Child Class "+ele);
	}
}


public class FifthProgram {
	public static void main(String args[]) {
		ChildCurrent ch = new ChildCurrent(10);
	}
}

