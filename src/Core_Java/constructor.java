package Core_Java;
// Main.java
class Test {
   int i;
   Test t;
   boolean b;
   byte bt;
   float ft;
   
   Test(int i) 
   {
	   this.i=i;
	   try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }

public Test() {
	// TODO Auto-generated constructor stub
}
}
 
public class constructor {
    public static void main(String args[]) {
      Test t = new Test(); // default constructor is called.
      System.out.println(t.i);
      System.out.println(t.t);
      System.out.println(t.b);
      System.out.println(t.bt);
      System.out.println(t.ft);
    }
}