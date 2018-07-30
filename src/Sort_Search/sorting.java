package Sort_Search;

import java.util.*;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
	List<Integer> unsort = new ArrayList<Integer>(Arrays.asList(1,4,5,2,6,7,9));
		Collections.sort(unsort);
		// System.out.print(unsort);
		
		List<String> unsortstring = new ArrayList<String> (Arrays.asList ("Delhi","Hyderabad","Chennai","Mumbai"));
		Collections.sort(unsortstring);
		 System.out.print("DCS"+unsortstring);
		 Collections.sort(unsortstring, Collections.reverseOrder());
		 System.out.print("ASC"+unsortstring);
	  List<Integer> sort = new ArrayList<Integer>();
		
	  
	  int[] a ={1, 4, 5,44, 2, 6,55, 7, 9};
		
		for(int i =0;i<a.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(a[i]> a[j])
				{
					temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
	
	
       for(Integer aa:a)
       {
    	 //  System.out.print(aa.toString()+":");
       }
       System.out.println("sort ");
       for(int i =0;i<a.length;i++)
       {
    	   
    	  System.out.print(a[i]+ " ");
    	 
       }
       
      
		
	}
	

}
