package AbstractClassDemo;

abstract class AbsDemo1{
	abstract void demo();
	public void SampleAbs() {
		System.out.println("Sample Non Abstarct Method ");
	}
}

public class ChildClassAbstract extends AbsDemo1 {
	public static void main(String args[]) {
		ChildClassAbstract a2 = new ChildClassAbstract();
		a2.demo();
	}

	@Override
	void demo() {
		System.out.println("Sample Demo");
	}
}
