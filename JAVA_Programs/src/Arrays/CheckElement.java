package Arrays;

import java.util.Scanner;

public class CheckElement {
	static boolean find(int ele,int arr[]) {
		int index = -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele)
				index = i ;
		}
		return index==-1;
	}
	public static void main(String args[]) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements : ");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		System.out.println("Enter element : ");
		int ele = sc.nextInt();
		if(find(ele,arr))
			System.out.println("Element not found");
		else
			System.out.println("Element found");
		sc.close();
	}
}
