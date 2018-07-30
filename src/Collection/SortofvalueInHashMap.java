package Collection;

import java.util.*;
import java.util.Map.Entry;

public class SortofvalueInHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> countryCapitalMap = new LinkedHashMap<String, Integer>();
		 
		  countryCapitalMap.put("Japan", 6);
		  countryCapitalMap.put("France", 3);
		  countryCapitalMap.put("Russia", 1);
		  countryCapitalMap.put("India", 2);
		  
		  System.out.println(countryCapitalMap);
		  
		  Set<Entry<String, Integer>> set = countryCapitalMap.entrySet();
	        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
		  Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			  @Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}

			
			

			
		});
		  for(Map.Entry<String, Integer> entry:list){
	          //  System.out.println(entry.getKey()+" ==== "+entry.getValue());
	        }
		  
		  // Storing the list into Linked HashMap to preserve the order of insertion. 
	      //  Map<String,Integer> aMap2 = new LinkedHashMap<String, Integer>();
		  countryCapitalMap.clear();
		 // Map<String,Integer> aMap2 = new LinkedHashMap<String, Integer>();
	        for(Entry<String,Integer> entry: list) {
	        	 System.out.println(entry.getKey()+" ==== "+entry.getValue());	        	
	        	 countryCapitalMap.put(entry.getKey(), entry.getValue());
	        }
	        System.out.println(countryCapitalMap);
	        // printing values after soring of map
	       /* System.out.println("Value " + " - " + "Key");
	        for(Entry<String,Integer> entry : aMap2.entrySet()) {
	            System.out.println(entry.getKey() + " - " + entry.getValue());
	        }*/
	}

}
