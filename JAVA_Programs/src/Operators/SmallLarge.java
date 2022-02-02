package Operators;

import java.util.Scanner;

public class SmallLarge {
	public static void main(String args[]) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A value : ");
		a = sc.nextInt();
		System.out.println("Enter B value : ");
		b = sc.nextInt();
		
		if(a<b) {
			System.out.println("Smaller is : "+a);
			System.out.println("Larger is : "+b);
		}
		else {
			System.out.println("Smaller is : "+b);
			System.out.println("Larger is : "+a);
		}
		sc.close();
	}
	
}
