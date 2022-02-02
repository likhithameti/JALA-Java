package Collections;

import java.util.*;
public class HashSetDemo {
	public static void main(String args[]) {
		HashSet<String> hs = new HashSet<>();
		hs.add("sample1");
		hs.add("sample2");
		hs.add("sample3");
		hs.add("sample4");
		hs.add("sample5");
		hs.add("sample6");
		hs.add("sample7");
		hs.add("sample8");
		hs.add("sample9");
		hs.add("sample10");
		hs.add("sample11");
		Iterator<String> i=hs.iterator();  
        while(i.hasNext())  
        {  
        	System.out.println(i.next());  
        }  
        hs.remove("Sample11");  
        System.out.println("After invoking remove(object) method: "+hs);  
        HashSet<String> set1=new HashSet<String>();  
        set1.add("Ajay");  
        set1.add("Gaurav");  
        hs.addAll(set1);  
        System.out.println("Updated List: "+hs);  
		
	}
}
