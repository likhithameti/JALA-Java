package Arrays;

import java.util.*;
public class CommonValues {
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5};
		int brr[] = {2,3,4,7};
		HashSet<Integer> hs = new HashSet<>();
		for(int ele:arr)
			hs.add(ele);
		System.out.println("Common Elements : ");
		for(int ele:brr) {
			if(hs.add(ele)==false)
				System.out.println(ele);
		}
	}
}
