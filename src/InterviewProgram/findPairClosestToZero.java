package InterviewProgram;
import java.util.Arrays;
 
public class findPairClosestToZero {
 
 public static void main(String[] args)
 {
  int array[]={30,-5,70,-8,20,-40,60,-1,-2,-1,1};
  findPairWithMinSumBruteForce(array);
 // findPairWithMinSum(array);
 }
 public static void  findPairWithMinSumBruteForce(int arr[])
 {
  if(arr.length<2)
   return;
  // Suppose 1st two element has minimum sum
  int minimumSum=arr[0]+arr[1];
  int pair1stIndex=0;
  int pair2ndIndex=1;
  for (int i = 0; i < arr.length; i++) {
   for (int j = i+1; j < arr.length; j++) {
    int tempSum=arr[i]+arr[j];
    if(Math.abs(tempSum) < Math.abs(minimumSum))
    {
     pair1stIndex=i;
     pair2ndIndex=j;
     minimumSum=tempSum;
    }
   }
  }
   System.out.println(" The pair whose sum is closest to zero using brute force method: "+arr[pair1stIndex]+" "+ arr[pair2ndIndex]);
 }
 
 /*public static void findPairWithMinSum(int arr[]) {
  
  // Sort the array, you can use any sorting algorithm to sort it
   Arrays.sort(arr);
   int sum=0; 
   int minimumSum = Integer.MAX_VALUE;
   int n=arr.length;
   if(n<0)
    return;
    // left and right index variables
    int l = 0, r = n-1;
   
    // variables to keep track of the left and right index pair for minimumSum
    int minLeft = l, minRight = n-1;
   
    while(l < r)
    {
      sum = arr[l] + arr[r];
   
      If abs(sum) is less than min sum, we need to update sum and pair 
      if(Math.abs(sum) < Math.abs(minimumSum))
      {
        minimumSum = sum;
        minLeft = l;
        minRight = r;
      }
      if(sum < 0)
        l++;
      else
        r--;
    }
   
    System.out.println(" The pair whose sum is minimun : "+arr[minLeft]+" "+ arr[minRight]);
  }*/
 }
 