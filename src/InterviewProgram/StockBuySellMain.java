package InterviewProgram;

public class StockBuySellMain {
	
	  /*  Algorithm:

		Lets say we have array arr[] of stock prices.
		We will track two variables :lowestPriceTillThatDay and maxProfit.

		lowestPriceTillThatDay will be initialise to arr[0].
		Iterate over stock price array arr[]
		If current element is greater than lowestPriceTillThatDay
		calculate profit.
		If profit is greater than maxProfit then update the maxProfit.
		If current element is lesser than lowestPriceTillThatDay
		update lowestPriceTillThatDay with current element.
		We will get maxProfit in the end.*/
 
 public static void main(String[] args) {
  int arr[]={6, 12, 70};
  System.out.println("Maximum profit :"+calculateMaxProfit(arr));
 
 }
 
 public static int calculateMaxProfit(int[] arr)
 {
  int lowestPriceTillThatDay=arr[0];
  int maxProfit=0;
  for (int i = 0; i < arr.length; i++) {
   int profit=0;
   if(arr[i] >lowestPriceTillThatDay)
   {
    profit=arr[i]-lowestPriceTillThatDay;
    if(profit > maxProfit)
    {
     maxProfit=profit;
    }
   }
   else
   {
    lowestPriceTillThatDay=arr[i];
   }
  }
  return maxProfit;
 }
 
}