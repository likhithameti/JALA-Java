package Loops;

import java.util.Scanner;

public class Palindrome {
	static boolean checkPalindrome(int ele) {
	    int temp = ele;
	    int sum = 0;
	    while(temp>0) {
	    	sum = sum*10 + temp%10;
	    	temp = temp/10;
	    }
	    return sum==ele;
	}
	public static void main(String args[]) {
		Scanner  sc = new Scanner(System.in);
		int ele = sc.nextInt();
		if(checkPalindrome(ele))
			System.out.println("It is Palindrome ");
		else
			System.out.println("It is not palindrome ");
		sc.close();
	}
}
