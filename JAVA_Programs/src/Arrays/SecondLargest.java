package Arrays;

public class SecondLargest {
		
		static int print2largest(int arr[], int arr_size)
		{
		    int i,second;
		    int largest = second = Integer.MIN_VALUE;
		    for(i = 0; i < arr_size; i++)
		    {
		        largest = Math.max(largest, arr[i]);
		    }
		 
		    for(i = 0; i < arr_size; i++)
		    {
		        if (arr[i] != largest)
		            second = Math.max(second, arr[i]);
		    }
		    return second;
		    
		}
		
		public static void main(String[] args)
		{
		    int arr[] = { 12, 35, 1, 10, 34, 1 };
		    int n = arr.length;
		    System.out.println("Second Largest element is : "+print2largest(arr, n));
		}
}
