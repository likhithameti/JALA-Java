package Arrays;

import java.util.Scanner;

public class CopyArray {
	static void copy(int arr[],int temp[]) {
		for(int i=0;i<arr.length;i++)
			temp[i] = arr[i];
	}
	public static void main(String args[]) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int temp[] = new int[n];
		System.out.println("Enter elements : ");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		copy(arr,temp);
		System.out.println("Elements of copied array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(temp[i]+" ");
		}
		
		sc.close();
	}
}
