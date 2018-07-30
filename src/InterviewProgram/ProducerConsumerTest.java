package InterviewProgram;

public class ProducerConsumerTest {
	   public static void main(String[] args) {
	      Resource c = new Resource();
	      Producer p1 = new Producer(c, 1);
	      Consumer c1 = new Consumer(c, 1);
	      p1.start(); 
	      c1.start();
	      System.out.println("completed");
	   }
	}
	class Resource {
	   private int contents;
	   private boolean available = false;
	   
	   public synchronized int get() {
	      while (available == false) {
	         try {
	            wait();
	         } catch (InterruptedException e) {}
	      }
	      available = false;
	      notify();
	      return contents;
	   }
	   public synchronized void put(int value) {
	      while (available == true) {
	         try {
	            wait();
	         } catch (InterruptedException e) { } 
	      }
	      contents = value;
	      available = true;
	      notify();
	   }
	}
	class Consumer extends Thread {
	   private Resource resource;
	   private int number;
	   
	   public Consumer(Resource c, int number) {
	      resource = c;
	      this.number = number;
	   }
	   public void run() {
	      int value = 0;
	      for (int i = 0; i < 10; i++) {
	         value = resource.get();
	         System.out.println("Consumer #" + this.number + " got: " + value);
	      }
	   }
	}
	class Producer extends Thread {
	   private Resource resource;
	   private int number;
	   public Producer(Resource c, int number) {
	      resource = c;
	      this.number = number;
	   } 
	   public void run() {
	      for (int i = 0; i < 10; i++) {
	         resource.put(i);
	         System.out.println("Producer #" + this.number + " put: " + i);
	         try {
	            sleep((int)(Math.random() * 100));
	         } catch (InterruptedException e) { }
	      } 
	   }
	} 
