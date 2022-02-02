package Constructors;

class Sample{
	Sample(int ele){
		System.out.println(ele);
	}
}
public class MutipleTimes {
	public static void main(String args[]) {
		int ele = 10;
		Sample s1;
		
		// multiple times same object 
		while(ele>0) {
			s1 = new Sample(ele);
			ele--;
		}
	}
}
