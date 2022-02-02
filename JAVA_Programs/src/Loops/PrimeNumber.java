package Loops;

import java.util.Scanner;

public class PrimeNumber {
	static boolean checkPrime(int ele) {
	    boolean flag = false;
	    for (int i = 2; i <= ele / 2; ++i) {
	      
	      if (ele % i == 0) {
	        flag = true;
	        break;
	      }
	    }
	    return !flag;
	}
	public static void main(String args[]) {
		Scanner  sc = new Scanner(System.in);
		int ele = sc.nextInt();
		if(checkPrime(ele))
			System.out.println("It is Prime ");
		else
			System.out.println("It is not Prime ");
		sc.close();
	}
}
