package Core_Java;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class OrderedPair<b,c,p> implements Pair<b,c> {

    private b key;
    private c value;
    private p pair;

    public OrderedPair(b key, c value,p pair) {
	this.key = key;
	this.value = value;
	this.pair = pair;
    }

    public b getKey()	{ return key; }
    public c getValue() { return value; }
    public p getPair() { return pair; }
    
    public static void main(String[] args) {		
	
    	//HashMap<String, Integer> map = new HashMap<String, Integer>();
    	
    	OrderedPair<String, Integer,String > p1 = new OrderedPair<String, Integer,String>("Even", 8,"rrr");
    	OrderedPair<String, Integer,String>  p2= new OrderedPair<String, Integer,String>("Even1", 81,"mmm");
        List<OrderedPair<String, Integer,String>> ao = new ArrayList<OrderedPair<String,Integer,String>>();   
    ao.add(p1);
    ao.add(p2);
  //  System.out.println("P1: " + p1.getKey());
    for (OrderedPair<String,Integer,String> pai : ao)
    {  	  
    
    	//System.out.println(pai.getKey());
    	//System.out.println(pai.getValue());
    	//System.out.println(pai.getPair());
    }
    
    List list = new ArrayList();

    list.add("a String");
    list.add(1f);
    for (Object o: list)
    {
    	//String s=(String)o;
    	System.out.println(o.toString());
    }
    
    }
}