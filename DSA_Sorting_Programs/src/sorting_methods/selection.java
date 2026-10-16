package sorting_methods;


// Time Complexity : O(n^2)

public class selection {
	
	public int[] selectionsort(int[] arr)
	{
		
		int n = arr.length;
		
		for(int i=0; i<n-1; i++)
		{
			int midIndex = i;
			
			for(int j=i+1; j<n; j++)
			{
				if(arr[j] < arr[midIndex])
				{
					midIndex = j;			
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[midIndex];
			arr[midIndex] = temp;
		}
		return arr;
	}
	
	
	public static void main(String []args)
	{
	
		int arr[] = {6,2,4,8,1};
		
		selection b = new selection();
		
		int value[] = b.selectionsort(arr);
		
		for(int val : value)
		{
			System.out.println(val+" ");
		}
		
	}
}
