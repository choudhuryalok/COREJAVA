package Exception;
 
public class ExceptionTest {
  public static void main(String[] args) throws Exception {
  exceptionTest();
  }
  public static void exceptionTest()throws Exception
  {
   int i;
   try{
    i=50/0; 
   }
   catch(Exception e)
   {
	   //e.printStackTrace();
	   System.out.println("In catch block");   
   }  
   finally
   {    
    System.out.println("In finally block");   
   } 
   System.out.println("ok");   
  }
}