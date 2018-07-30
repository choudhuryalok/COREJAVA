package InterviewProgram;
public class fiboseries {

	public static void main(String[] args)
	 	
	{
		//evenodd(11);
		reverse(123);
		evenodd(12);
	}
		public static int fact(int number){
	        int result = 1;
	        while(number != 0){
	            result = result*number;
	            System.out.println(result);
	            number--;
	        }
	        System.out.println(result);
			return result;

	  }
		public static int fact1(int number){
			 if(number ==0){
		            return 1;
		        }
			int r= number*fact1(number-1);
			 System.out.println(r);
			return r;
		}
		
		public static int reverse(int number){
			 
			int reverse =0;
			int reminder =0;
			
			while(number>0)
			{
				reminder = number % 10;//3
				reverse = reverse * 10+reminder;
				number =number/10;
			}
			System.out.println(reverse);
			return reverse;
		}
		public static void swap(int number){
			
			int i=2;
			int j=3;
			
			i=i*j; // 6
			j= i/j;//2
			i= i/j;//3
			
			i=i+j; //5
			j=i-j; //2
			i=i-j;//3
		}
		
public static void evenodd(int number){
	 int counter =0;
			for(int i=1;i<=number;i++ )
			{
				if(number%i == 0)
				{
					counter ++; 
				}
			}
			if(counter >2)
			{
				System.out.println("Odd number");
			}
			else{
				System.out.println("even number");
			}
		}
	
}
