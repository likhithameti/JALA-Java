package AbstractClassDemo;

abstract class AbsDemo{
	abstract void demo();
	public void SampleAbs() {
		System.out.println("Sample Non Abstarct Method ");
	}
}

class AbsChild extends AbsDemo{
	void demo() {
		System.out.println("Demo Method");
	}
}
public class AbstractClass {
	public static void main(String args[]) {
		AbsChild abs = new AbsChild();
		abs.demo();
		abs.SampleAbs();
	}
}
