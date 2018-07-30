package Collection;

import java.util.ArrayList;

public class Array {
	
	public static void main(String[] args) {
	/*ArrayList<Integer> changed = new ArrayList<Integer>(); //{1,3,4,88};	
	changed.add(1);
	changed.add(3);
	changed.add(4);
	changed.add(88);
	changed.add(8,10);
	 System.out.println(changed);*/
		
		// reverse of a array
		
		 int arr[] = {1, 2, 3, 4, 5, 6};
		 for(int i=arr.length-1;0<=i;i--)
		 {
			 System.out.println(" reverse :"+arr[i]);
		 }
	 
		 for(int ii: arr)
		 {
			 System.out.println("out Put:"+ii);
		 }
		 
	 
	}
}
