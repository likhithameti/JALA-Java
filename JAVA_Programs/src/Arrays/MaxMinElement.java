package Arrays;

import java.util.Scanner;

public class MaxMinElement {
	static int max(int arr[]) {
		int MAX = Integer.MIN_VALUE;
		for(int ele:arr) {
			if(ele>MAX)
				MAX = ele;
		}
		return MAX;
	}
	static int min(int arr[]) {
		int MIN = Integer.MAX_VALUE;
		for(int ele:arr) {
			if(ele<MIN)
				MIN = ele;
		}
		return MIN;
	}
	public static void main(String args[]) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements : ");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		System.out.println("Max element "+max(arr));
		System.out.println("Min Element "+min(arr));
		sc.close();
	}
}
