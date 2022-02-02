package Arrays;

import java.util.Scanner;

public class Reverse {
	static void reverse(int arr[]) {
		int start = 0,end= arr.length-1;
		while(start<=end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	public static void main(String args[]) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements : ");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		reverse(arr);
		System.out.println("Elements of Reverse array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		sc.close();
	}
}
