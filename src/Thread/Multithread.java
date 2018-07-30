package Thread;
class MultithreadingDemo extends Thread
{
    public void run()
    {
        try
        {
        	Thread.sleep(1000);
            // Displaying the thread that is running
            System.out.println ("Thread " +
                  Thread.currentThread().getId() +
                  " is running");
 
        }
        catch (Exception e)
        {
            // Throwing an exception
            System.out.println ("Exception is caught");
        }
    }
}
 
// Main Class
public class Multithread
{
    public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i=0; i<n; i++)
        {
        	MultithreadingDemo mu=new MultithreadingDemo();   
        	Thread t1 = new Thread(mu);
        	t1.start();
        	
        }
    }
}