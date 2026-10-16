package sorting_methods;


// Time-Complexity : O(n^2) 



public class bubble {

	public int[] bubblesort(int[] arr)
	{
		
		int n = arr.length;
		
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-i-1; j++)
			{
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	
	public static void main(String []args)
	{
	
		int arr[] = {6,2,4,8,1};
		
		bubble b = new bubble();
		
		int value[] = b.bubblesort(arr);
		
		for(int val : value)
		{
			System.out.println(val+" ");
		}
		
	}
}
