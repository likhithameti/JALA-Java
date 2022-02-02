package Loops;

import java.util.Scanner;

public class Gender {
	public static void main(String args[]) {
		Scanner  sc = new Scanner(System.in);
		char ch = sc.nextLine().charAt(0);
		switch(ch) {
		case 'M':
			System.out.println("Male");
			break;
		case 'F':
			System.out.println("Female");
			break;
		default:
			System.out.println("Enter M or F only ");
			break;
		}
		sc.close();
		
	}
}
