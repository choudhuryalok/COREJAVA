package Core_Java;
public class overload {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		overload b =new overload();
		//b.test(1);
		b.test2(1,1d,1.0);
		String a ="aaa";
		String bb="bbb";
		a="abc"+"defghij";
		String ss="";
		for(int i=a.length()-1;i>0;i--)
		{
			  ss =  ss+ a.charAt(i); 
		}
		
		//System.out.println(ss);
		
		
		 String s1="Sachin";  
		   String s2="Sachin";  
		   String s3="Ratan";  
//		   System.out.println(s1.compareTo(s2));//0  
//		   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
//		   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
	}
	
	void test(Object o){
		System.out.println("0");
	}
     void test(String o){
    	 System.out.println("st");
	}
     void test(StringBuffer o){
    	 System.out.println("bu");
 	}
     void test(Integer i){
    	 System.out.println("i");
 	}
     
     void test2(int i,double l,float f){
    	 System.out.println("i");
 	}
     void test2(int i,double l,double f){
    	 System.out.println("lf");
 	}
     
}
