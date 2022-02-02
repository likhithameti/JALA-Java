package Loops;

public class OddEven {
	public static void main(String args[]) {
		int start = 1;
		System.out.println("Odd Numbers : ");
		for(int i=start;i<=30;i++) {
			if(i%2!=0)
				System.out.print(i+" ");
		}
		
		System.out.println("");
		System.out.println("Even Numbers : ");
		for(int i=start;i<=30;i++) {
			if(i%2==0)
				System.out.print(i+" ");
		}
	}
}
