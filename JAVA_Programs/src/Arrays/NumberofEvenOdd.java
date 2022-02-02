package Arrays;

import java.util.Scanner;
public class NumberofEvenOdd {
	static void count(int arr[]) {
		int ecount=0,ocount=0;
		for(int ele:arr) {
			if(ele%2==0) ecount++;
			else ocount++;
		}
		System.out.println("Number of odd elements : "+ocount+" even elements : "+ecount);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]  = new int[n];
		System.out.println("Enter Array Elements : ");;
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		count(arr);
		sc.close();
	}
}
