package Inheritance;


class A{
	public void methodA1(){
		System.out.println("Class A method1");
	}
	public void methodA2(){
		System.out.println("Class A method2");
	}
	public void common() {
		System.out.println("Class A common");
	}
	
}

class B extends A{
	public void methodB1(){
		System.out.println("Class B method1");
	}
	public void methodB2(){
		System.out.println("Class B method2");
	}
	
	@Override
	public void common() {
		System.out.println("Class B common");
	}
}

class C extends B{
	public void methodC1(){
		System.out.println("Class C method1");
	}
	public void methodC2(){
		System.out.println("Class C method2");
	}
	@Override
	public void common() {
		System.out.println("Class C common");
	}
}

public class InheritanceDemo {
	public static void main(String args[]) {
		A objA = new A();
		B objB = new B();
		C objC = new C();
		
		objA.methodA1();
		objA.methodA2();
		
		objB.methodB1();
		objB.methodB2();
		
		objC.methodC1();
		objC.methodC2();
		
		A overridenB = new B();
		overridenB.common();
		
		A overridenC = new C();
		overridenC.common();
		
	
		
	}
}
