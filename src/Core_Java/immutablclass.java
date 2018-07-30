package Core_Java;
public final class immutablclass {

		      
	    private final static int amount=9;
	   
	  
//	    public immutablclass(int amount) {
//	        this.amount = amount;
//	       
//	    }
	  
	    public int getAmount() {
	        return amount;
	    }
	    public static void main(String[] args) {
			
			immutablclass cc =new immutablclass();
			System.out.println(amount);
		}
}
//
//class test extends immutablclass
//{
//	
//	
//
//	public test(int amount) {
//		super(amount);
//		// TODO Auto-generated constructor stub
//	}
//
//	public static void main(String[] args) {
//		
//		immutablclass cc =new test(11);
//	}
//	
//}