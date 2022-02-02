package Arrays;

import java.util.Scanner;

public class IndexofElement {
	
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
		int index = -1;
		for(int i=0;i<n;i++) {
			if(arr[i]==ele)
				index = i ;
		}
		System.out.println("Index of element is : "+index);
		sc.close();
	}
}
