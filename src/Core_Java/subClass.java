package Core_Java;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Hashtable;
import java.util.Set;
import java.util.Vector;




class A{
	 int aa=1;
	void a(){
		
		System.out.println("out put from a");
	}
	
}
 class B extends A{
	int aa=2;
	 void a(){
			System.out.println("out put from b");
		}
 }

 class C extends B{
	 int aa =3;
	 void a(){
			System.out.println("out put from c");
		}
 }


public class subClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		 A aav=new B();
		aav.a();			
	    System.out.println("aaaaaaaaa::::"+aav.aa);
	//	 HashMap<String,String> map = new HashMap<String, String>();
//	Hashtable<String,String> map =new Hashtable<String,String>();
		HashMap map =new HashMap();
		
		Vector v =new Vector();
		
		// System.out.println("capasity :"+ v.capacity());
		 
		 ArrayList ar =new ArrayList();
		// System.out.println("capasity :"+ ar.ensureCapacity(minCapacity));
		 
		// HashSet ss =new HashSet();
		 Set ss=new HashSet();
		 ss.add(1);
		 ss.add(4);
		 ss.add("1ss");  // check : int ssa = Integer.parseInt(it.next().toString());
		 ss.add(new Integer(4));
		 ss.add(new Integer(4));
		// ss.add(new Integer(6));
		// ss.remove(2);
		 System.out.println("setttt:::"+ss );
		 for (Object s :ss) {
			// System.out.println("setttt:::"+ss );
			}
  String sp = "my name is alok";
  String[] rev =sp.split(" ");
  
//  for (String s :rev) {
	//System.out.println("rrrrrr:::"+rev.length );	
//		}
	for (int i=rev.length;i>0;i--)
	{
		
		//System.out.print(rev[i-1]+" "  );
	}
	//String sp = "my name is alok ";
	for (int i=sp.length();i>0;i--)
	{
		String revs = "";
		revs = revs + sp.charAt(i-1);
		//System.out.print(revs);
	}
	
	
///	Iterator it = ss.iterator();
	//while(it.hasNext())
//	{
	//	String ssa = it.next().toString();
		
	//	int ssa = Integer.parseInt(it.next().toString());
		// System.out.println("String :::"+ssa);
//	}
		 
		 
		///map.put(null,null);
		 map.put("","eee");
		map.put("aa", "aaaa");
		map.put(null,"bbb");
		map.put(null,"ccc");
		map.put("","ddd");
		map.put(null,null);
		Iterator itr =map.entrySet().iterator();
		
		while(itr.hasNext())
		{
			//Object ob =itr.next();
			Map.Entry m =(Map.Entry) itr.next(); 
			String s =(String)m.getKey();
			String sa =(String)m.getValue();
			System.out.println("key:::"+s+"::value:::"+sa );
			
		}
		
		for(int i=0;i<map.size();i++)
		{		 
				//System.out.println("map"+ map.keySet() +"value"+ map.values());
		}
		
//		for (Map.Entry<String, String> entry :map.entrySet()) {
//			System.out.println(entry.getKey()+":::welcome::" + entry.getValue() );
//		}
		
		//System.out.println(map);
		
	}

}
