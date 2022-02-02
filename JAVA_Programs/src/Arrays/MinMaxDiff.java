package Arrays;

import java.util.Scanner;

public class MinMaxDiff {
	static void diff(int arr[]) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int ele:arr) {
			if(ele>max)
				max = Math.max(max, ele);
			if(ele<min)
				min = Math.min(min, ele);
		}
		System.out.println("Difference : "+(max-min));
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]  = new int[n];
		System.out.println("Enter Array Elements : ");;
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		diff(arr);
		sc.close();
	}
}
