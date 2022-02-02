package Collections;

import java.util.*;
public class ArrayListDemo {
	public static void main(String args[]) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("sample1");
		arr.add("sample2");
		arr.add("sample4");
		arr.add("sample3");
		arr.add("sample5");
		arr.add("sample6");
		arr.add("sample7");
		arr.add("sample8");
		arr.add("sample9");
		arr.add("sample10");
		arr.add("sample11");
		// iterate
		Iterator<String> i1 = arr.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		// remove at index
		arr.remove(2);
		// add at index
		arr.add(2, "Likhith");
		// get element 
		String ele = arr.get(3);
		System.out.println("Element at index 3 : "+ele);
		String element = "sample1";
		boolean exists = false;
		// finding element
		for(String str:arr) {
			if(str.equals(element))
				exists = true;
		}
		if(exists)
			System.out.println("Sample 1 found");
		else
			System.out.println("Sample 1 not found");
		
		// size
		System.out.println("The size of array list is : "+arr.size());
		
		// remove element
		arr.removeAll(arr);
		
	}
}
