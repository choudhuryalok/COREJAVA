package Core_Java;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class overriden1 extends overriden {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//overriden1 ov1 = new overriden1();
//		overriden ov =new overriden1();
//		overriden ov = ov1;
//		ov.cat();
//		Map<Integer,String> m = new HashMap<Integer,String>();
//		m.put(1, "aaa"+"1");
//		m.put(-2, "bbb"+"2");
//		
//		System.out.println(m);
//		 ArrayList<Byte>  ms =  new ArrayList<Byte>();
//		ms.add(new Byte((byte) 128));
		
		overriden v = new overriden1();
		v.cat();
	}
	
	public   void cat(){
		System.out.println("hello overriden1");
	}
//	public   void cat1(){
//		System.out.println("hello overriden1");
//	}
	
}