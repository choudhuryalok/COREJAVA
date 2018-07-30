package Core_Java;
class FigureDemo
{
	
	static double a=10;
	static double b=20;
	double c;
	double d;
public static void main(String[] args)
  {
		Figure f = new Figure();		
		double math=f.area(a,b);
		System.out.println("Ratio is: "+math);
  }
}

class Figure extends FigureDemo
{

 double area(double a,double b) 
  {	
	 super.d=8;
	 super.c=9;
	double result=0;
	if(c-d>0){
        result=(a * b)/(c-d);
	    }
	else
	{
		result =0;
	}
	return result;
}

}