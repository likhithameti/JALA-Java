package Arrays;

import java.util.Scanner;

public class Average {
	static float avg(int arr[]) {
		int sum = 0;
		for(int ele:arr)
			sum+=ele;
		return (sum/arr.length);
	}
	public static void main(String args[]) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements : ");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		System.out.println("Average of elements : "+avg(arr));
		sc.close();
	}
}
