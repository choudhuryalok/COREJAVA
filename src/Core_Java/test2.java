package Core_Java;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;




public class test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap map =new HashMap();
		map.put(11,"aa");
		map.put(22,"bbb");
		map.put(33,"ccc");
	//	map.put("11","aa");
		//map.put(11.0,"aa");
		//map.put(11.0,"aa");
		//map.put(113,null);
		//map.put(null,new String("addds"));
	//	map.put(null,new String("addds"));
		Set s =map.entrySet();
		
		Iterator itr = s.iterator();
		
	while(itr.hasNext())
		{
		Map.Entry ent = (Map.Entry)itr.next();
		String sa= ent.getValue().toString();
		int sb=Integer.parseInt(ent.getKey().toString());
			 //System.out.println("key:"+ ent.getKey() +" value:  " + ent.getValue());
		}
		
//		for(Map.Entry ent : map.entrySet())
//			
//		{
//			 System.out.println(ent.getKey()+ ":::::"+ ent.getValue());
//		}
		

	Hashtable maps =new Hashtable();
	maps.put(11,"aa");
	maps.put(11,"aan");
	maps.put(22,"bbb");
	maps.put(33,"ccc");
	maps.put("11","aa");
	maps.put(11.0,"aa");
	//maps.put(11.0,"aa");
	//maps.put(null,"aa");	
	Set ss =maps.entrySet();
	
	Iterator itrs = ss.iterator();
	
while(itrs.hasNext())
	{
	Map.Entry ent = (Map.Entry)itrs.next();
	 System.out.println("keyss:"+ ent.getKey() +" valuesss:  " + ent.getValue());
	}
	
//for(Map.Entry ent : maps.entrySet())
//
//{
//	 System.out.println(ent.getKey()+ ":::::"+ ent.getValue());
//}
	
	}

}
