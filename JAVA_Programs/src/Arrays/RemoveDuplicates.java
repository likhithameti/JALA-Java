package Arrays;

import java.util.*;
public class RemoveDuplicates {
	static void remove(int[] a, int n)
    {
        HashMap<Integer, Boolean> mp = new HashMap<>();
  
        for (int i = 0; i < n; ++i) {
  
            if (mp.get(a[i]) == null)
            {
                System.out.print(a[i] + " ");
                mp.put(a[i], true);
            }
        }
    }
 
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 5, 1, 7, 2, 4, 2 };
        int n = arr.length;
        remove(arr, n);
    }
}
