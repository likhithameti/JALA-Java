package Operators;

import java.util.Scanner;
public class FindTwoEqualOrNot {
	public static void main(String args[]) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A value : ");
		a = sc.nextInt();
		System.out.println("Enter B value : ");
		b = sc.nextInt();
		
		if(a==b)
			System.out.println("A equals B");
		if(a!=b)
			System.out.println("A not equals B");
		sc.close();
	}
}
