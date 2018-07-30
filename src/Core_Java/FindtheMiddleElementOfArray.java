package Core_Java;
	
	
	import java.util.ArrayList;
import java.util.Arrays;

	/*
	 * To execute Java, please define "static void main" on a class
	 * named Solution.
	 *
	 * If you need more classes, simply define them inline.
	 */

	class FindtheMiddleElementOfArray {
	  public static void main(String[] args) {
	   	    
	  /*  public static int[] combine(int[] a, int[] b){
	        int length = a.length + b.length;
	        int[] result = new int[length];
	        System.arraycopy(a, 0, result, 0, a.length);
	        System.arraycopy(b, 0, result, a.length, b.length);
	        return result;
	    }*/


	
	    
	    int[] a1 = {2,3,60,50};
	    
	    int[] a2 = {8,7,4,9,91};
	    
	    int[] combine = new int[a1.length + a2.length];
	    
	    System.out.println(combine);
	    int count=0;
	  /*  for(int i=0;i<a1.length;i++)
	    {
	       combine[i]=  a1[i];
	       count++;
	    }
	    
	     for(int i=0;i<a2.length;i++)
	    {
	       combine[count++]=  a2[i];
	    }*/
	    
	    
	    System.arraycopy(a1, 0, combine, 0, a1.length);
	    System.arraycopy(a2, 0, combine, a1.length, a2.length);
	    long sum = 0;
	    
	    Arrays.sort(combine);
	     for(int i=0;i<combine.length;i++)
	    {
	        System.out.print(combine[i] + " ");
	        sum = sum + combine[i];	      
	    }
	     System.out.println("  ");
	     System.out.println("sum : "+sum);
	    
	    int middle =   (combine.length)/2 ;
	    double middle2 =  (double) (combine[middle]+ combine[(middle-1)])/2;
	   // System.out.println("Middle : "+middle);
	    
	     if(combine.length % 2 == 0 )
	       {        
	    	 System.out.println("Middle2: "+middle2);
	       }
	    
	    else{	     
	      System.out.println("Middle1 : "+combine[middle]);
	    }
	    
	  }
	}


