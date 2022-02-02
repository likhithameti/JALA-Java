package AccessModifier;


class PublicSampleClass{
	public int ele=0;
	public void print() {
		System.out.println("Hello");
	}
}


public class ProgramNum4 {
	public static void main(String args[]) {
		PublicSampleClass cls = new PublicSampleClass();
		cls.print();  
	}
}