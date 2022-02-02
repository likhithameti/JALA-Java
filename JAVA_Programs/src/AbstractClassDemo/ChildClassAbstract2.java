package AbstractClassDemo;

abstract class AbsDemo2{
	abstract void demo();
	public void SampleAbs() {
		System.out.println("Sample Non Abstarct Method ");
	}
}

public class ChildClassAbstract2 extends AbsDemo1 {
	public static void main(String args[]) {
		ChildClassAbstract2 a2 = new ChildClassAbstract2();
		a2.SampleAbs();
	}

	@Override
	void demo() {
		System.out.println("Sample Demo");
	}
}