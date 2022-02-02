package Arrays;

import java.util.Scanner;

public class FindElement12_23 {
	static void findEle(int arr[],int a,int b) {
		boolean aExist = false,bExist = false;
		for(int ele:arr) {
			if(ele==a) aExist = true;
			if(ele==b) bExist = true;
		}
		if(aExist)
			System.out.println(" 12 is present");
		if(bExist)
			System.out.println(" 23 is present");
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]  = new int[n];
		System.out.println("Enter Array Elements : ");;
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		int a = 12;
		int b = 23;
		findEle(arr,a,b);
		sc.close();
	}
}
