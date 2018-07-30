package Core_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class simulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List<Integer> fixed = new ArrayList<Integer>(Arrays.asList(1,4,5,2,6,7,9));
		//List<Integer> changed = new ArrayList<Integer>(Arrays.asList(1,3,4,88));
		//final list  - > 1,4,5,2,6,7,9
		int[] fixed={1,4,5,2,6,7,9};
		ArrayList<Integer> changed = new ArrayList<Integer>(); //{1,3,4,88};	
		changed.add(1);
		changed.add(3);
		changed.add(4);
		changed.add(88);
		int temp=0;
		ArrayList<Integer> finals = new ArrayList<Integer>(); //{1,3,4,88};
		for (int i=0;i<fixed.length;i++)
		{
			for (int j=0;j<changed.size();j++)
			{
				if(fixed[i]==changed.get(j))
				{
					
				}
				else{
					 // System.out.println(j);
					  finals.add(j)	;		
				}
				
			}
		}
		
	    	  System.out.println(finals);
	    	 
	    
		
	}

}
