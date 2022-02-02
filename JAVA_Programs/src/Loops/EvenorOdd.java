package Loops;

import java.util.Scanner;

public class EvenorOdd {
	
	public static void main(String args[]) {
		Scanner  sc = new Scanner(System.in);
		int ele = sc.nextInt();
		int mod = ele%2;
		switch(mod) {
		case 0:
			System.out.println("It is Even Number");
			break;
		case 1:
			System.out.println("It is Odd Number");
			break;
		default:
			break;
		}
		sc.close();
		
	}
}
