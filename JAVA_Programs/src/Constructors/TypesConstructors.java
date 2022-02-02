package Constructors;


class Demo{
	int sum;
	Demo (){ 
		this.sum = 0;
		System.out.println("Sum : "  +sum);
	}
	Demo(int ele){
		this.sum = ele;
		System.out.println("Sum : "  +sum);
	}
	Demo(int x,int y){
		this.sum = x+y;
		System.out.println("Sum : "  +sum);
	}
}
public class TypesConstructors {
	public static void main (String args[]) {
		Demo d1 = new Demo();
		Demo d2 = new Demo(50);
		Demo d3 = new Demo(10,20);
	}
}
