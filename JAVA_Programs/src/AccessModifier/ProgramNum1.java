package AccessModifier;


class SampleClass{
	private int ele=0;
	private void print() {
		System.out.println("Hello");
	}
}

class SubClass extends SampleClass{
	
	void printMessage() {
		// print();   => private method not accessible
	}
}
public class ProgramNum1 {
	public static void main(String args[]) {
		SampleClass cls = new SampleClass();
		// cls.print();  : not accessible
	}
}
