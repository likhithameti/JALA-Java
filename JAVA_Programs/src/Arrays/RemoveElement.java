package Arrays;

import java.util.Scanner;

public class RemoveElement {
	static boolean find(int ele,int arr[]) {
		int index = -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele)
				index = i ;
		}
		return index==-1;
	}
	static void remove(int ele,int arr[]) {
		int index = -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele)
				index= i ;
		}
		for(int i=index;i<arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = 0;
	}
	public static void main(String args[]) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements : ");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		System.out.println("Enter element to be removed : ");
		int ele = sc.nextInt();
		if(find(ele,arr))
			System.out.println("Element not found");
		else {
			remove(ele,arr);
			System.out.println("Elements of array after deletion : ");
			for(int i=0;i<arr.length-1;i++) {
				System.out.print(arr[i]+" ");
			}
		}
		sc.close();
	}
}
