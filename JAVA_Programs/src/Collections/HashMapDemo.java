package Collections;

import java.util.*;
public class HashMapDemo {
	public static void main(String arfs[]) {
		HashMap<Integer,String> student  = new HashMap<>();
		
		student.put(1,"sample1");
		student.put(2,"sample2");
		student.put(3,"sample3");
		student.put(4,"sample4");
		student.put(5,"sample5");
		student.put(6,"sample6");
		student.put(7,"sample7");
		student.put(8,"sample8");
		student.put(9,"sample9");
		student.put(10,"sample10");
		student.put(11,"sample11");
		
		// fetch
		System.out.println("name of student with roll number 1 "+student.get(1));
		
		if(student.size()==0)
			System.out.println("map is empty ");
		else
			System.out.println("map is not empty");
		
		student.remove(1,"sample1");
		
		System.out.println("Keys of HashMap ");
		System.out.println();
		for(Integer ele:student.keySet())
			System.out.print(ele+" ");
		
		System.out.println("Values of HashMap ");
		for(String str:student.values()) {
			System.out.print(str+" ");
		}
		
		// clone
		 System.out.println("The cloned map : " + student.clone());
		
	}
}
