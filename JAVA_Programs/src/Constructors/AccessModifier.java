package Constructors;


class Demos{
	int sum;
	
	// default 
	Demos(){ 
		this.sum = 0;
		System.out.println("Sum : "  +sum);
	}
	/*
	private Demo(int ele){
		this.sum = ele;
		System.out.println("Sum : "  +sum);
	}
	*/
	
	// public 
	public Demos(int ele) {
		this.sum = ele;
		System.out.println("Sum : "  +ele);
	}
	protected Demos(int x,int y){
		this.sum = x+y;
		System.out.println("Sum : "  +sum);
	}
}
public class AccessModifier {
	public static void main (String args[]) {
		Demos d1 = new Demos();
		Demos d2 = new Demos(20);
		Demos d3 = new Demos(10,20);
	}
}