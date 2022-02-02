package ThisandSuper;


class Parent{
	int a = 10;
	int b = 20;
}

class Child extends Parent{
	int a = 300;
	void print() {
		System.out.println("The Value of A in Child : "+this.a);
		System.out.println("The Value of A in Parent : "+super.a);
	}
}
public class SecondProgram {
	public static void main(String args[]) {
		Child ch = new Child();
		ch.print();
	}
}
