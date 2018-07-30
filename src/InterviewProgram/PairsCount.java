package InterviewProgram;

public class PairsCount {
	
	public static void main(String args[])
	{
	    int[] arr = { 1, 5, 7, -1, 6 };
	    int sum = 6;
	    getPairsCount(arr, sum);
	}
	// Prints number of pairs in arr[0..n-1] with sum equal
    // to 'sum'
    public static void getPairsCount(int[] arr, int sum)
    {
 
        int count = 0;// Initialize result
        int f_index=0;
        int s_index=0;
        // Consider all possible pairs and check their sums
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == sum)
                {
                	f_index=arr[i];
                	s_index=arr[j];
                	System.out.println("1st index :"+f_index+" : 2nd index :"+s_index);
                    count++;
                }
        System.out.printf("Count of pairs is %d",count);
    }
}


