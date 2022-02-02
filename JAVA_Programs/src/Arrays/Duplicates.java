package Arrays;

import java.util.*;
public class Duplicates {
	public static void main(String args[]) {
		int arr[] = {1,1,2,3,4,5,4,5,6,7,8};
		HashMap<Integer,Integer> hmap = new HashMap<>();
		for(int ele:arr) {
			if(hmap.containsKey(ele))
				hmap.put(ele, hmap.get(ele)+1);
			else
				hmap.put(ele,1);
		}
		System.out.println("Duplicate Elements : ");
		for(Map.Entry<Integer,Integer> maps:hmap.entrySet()) {
			if(maps.getValue()>1)
				System.out.println(maps.getKey());
		}
	}
}
