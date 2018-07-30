package String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
 
public class DuplicateCharsInString {
 
    public void findDuplicateChars(String str){
         
        Map<Character, Integer> dupMap = new HashMap<Character, Integer>(); 
        char[] chrs = str.toCharArray();
        for(Character ch:chrs){
            if(dupMap.containsKey(ch)){
                dupMap.put(ch, dupMap.get(ch)+1);
            } else {
                dupMap.put(ch, 1);
            }
        }
        /*Set<Character> keys = dupMap.keySet();
        for(Character ch:keys){           
                System.out.println(ch+"--->"+dupMap.get(ch));            
        }
        for(Map.Entry<Character, Integer> map:dupMap.entrySet()){
        	  System.out.println(map.getKey()+"--->"+map.getValue());   
        }*/
        
        for(Character ch:dupMap.keySet()){
      	  System.out.println(ch+"--->"+dupMap.get(ch));   
      }
    }
     
    public static void main(String a[]){
        DuplicateCharsInString dcs = new DuplicateCharsInString();
        dcs.findDuplicateChars("Java2Novice");
    }
}