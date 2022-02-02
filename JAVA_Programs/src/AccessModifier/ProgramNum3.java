package AccessModifier;

class ProtectedClass{
	protected int ele=0;
	protected void print() {
		System.out.println("Hello");
	}
}


public class ProgramNum3 {
	public static void main(String args[]) {
		ProtectedClass cls = new ProtectedClass();
		cls.print();
		
		// it is accessible other package sub class method
	}
}