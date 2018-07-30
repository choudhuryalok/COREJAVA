package Core_Java;

public class reverse {
	public static void main(String[] args) {
		
	/* int[] a={2,4,6,8};
	 for (int i=a.length-1;0<=i;i--)
	 {
		 System.out.println(a[i]);
	 }*/
	 
	
	
	String str ="asdfghjk" ;
	
	char[] ch = str.toCharArray();
	
	for(int i=ch.length-1;-1<i;i--)
	{
		 System.out.print(ch[i]);
	}
}
}