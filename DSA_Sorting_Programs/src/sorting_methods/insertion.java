package sorting_methods;


// Time Complexity : O(n^2)


public class insertion {
	
	public int[] insertionsort(int[] arr)
	{
		
		int n = arr.length;
		
	    for(int i=0; i<n; i++)
	    {
	    	int curr = i;
	    	int prev = i-1;
	    	int currValue = arr[i];
	    	
	    	while(prev >= 0 && currValue < arr[prev])
	    	{
	    		arr[prev+1] = arr[prev];
	    		prev--;
	    	}
	    	
	    	arr[prev+1] = currValue;
	    }
		
		
		return arr;
	}
	
	
	public static void main(String []args)
	{
	
		int arr[] = {6,2,4,8,1};
		
		insertion b = new insertion();
		
		int value[] = b.insertionsort(arr);
		
		for(int val : value)
		{
			System.out.println(val+" ");
		}
		
	}
}

