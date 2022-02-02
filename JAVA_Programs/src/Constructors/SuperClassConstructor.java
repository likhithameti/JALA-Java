package Constructors;


class SuperClass{
	SuperClass(){
		System.out.println("Super class default");
	}
	SuperClass(int ele){
		System.out.println("Super class Paramterised "+ele);
	}
}

class SubClass extends SuperClass{
	SubClass(){
		super();
		System.out.println("Sub class Default");
	}
	SubClass(int a,int b){
		super(a);
		System.out.println("Sub Class Parameterized "+b);
	}
}
public class SuperClassConstructor {
	public static void main(String args[]) {
		SubClass sb = new SubClass();
		SubClass sb1 = new SubClass(10,20);
	}
}
