package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class GFG {
	public static void main(String[] args) {
		int[] arry = { 2, 5, 4, 8 };
		int temp;
		int last;
		for (int i = 0; i < arry.length; i++) {
			for (int j = 0; j < i; j++) {				
				if (arry[i] < arry[j]) {					
					temp = arry[i];
					arry[i] = arry[j];
					arry[j] = temp;
				}
			}
		}
		for (int i = 0; i < arry.length; i++) {
			//System.out.println(arry[i]-1);
			last = (arry.length);
		}
		System.out.println(arry[0]);
		//System.out.println(arry.length);
		
		LinkedList<String> al = new LinkedList<>();
				//(LinkedList<String>) Arrays.asList("dd","abc","xyx");
		al.add("dd");
		al.add("bb");
		al.add("aa");
		al.add("aa");
		Set<String> set =new HashSet<>(al);
		
		Collections.sort(al);
		System.out.println(al);
		System.out.println (al.get(1));
		System.out.println(set);
		
		
	}
	

	
}