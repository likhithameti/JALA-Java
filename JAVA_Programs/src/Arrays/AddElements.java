package Arrays;

import java.util.Scanner;

public class AddElements {
	static int sum(int arr[]) {
		int sum = 0;
		for(int ele:arr)
			sum+=ele;
		return sum;
	}
	public static void main(String args[]) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements : ");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		System.out.println("Sum of elements : "+sum(arr));
		sc.close();
	}
}
