package Loops;

import java.util.*;
public class ArmstrongNumber {
	static boolean checkArmstrong(int ele) {
		int len = 0;
		int temp = ele;
		while(temp>0) {
			temp = temp/10;
			len++;
		}
		temp = ele;
		int sum = 0;
		while(temp>0) {
			int last = temp%10;
			sum = sum + (int)Math.pow(last, len);
			temp = temp/10;
		}
		return sum==ele;
	}
	public static void main(String args[]) {
		Scanner  sc = new Scanner(System.in);
		int ele = sc.nextInt();
		if(checkArmstrong(ele))
			System.out.println("It is Armstrong ");
		else
			System.out.println("It is not Armstrong ");
		sc.close();
	}
}
