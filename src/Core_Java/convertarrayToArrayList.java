package Core_Java;

import java.util.*;

public class convertarrayToArrayList {
	
	public static void main(String[] args) {
		
		int[] ai = {1,4,3,5};
		
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(arr.length);
		List lst = Arrays.asList(arr);
		System.out.println(lst.size());
		
		List<Integer> lstx = new ArrayList<>( Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		lstx.add(33);
		
		System.out.println(lstx);
	}
}
