package Core_Java;

class OverloadingCalculation3{
	  void sum(String s){System.out.println("a method invoked");}
	  void sum(Object f){System.out.println("b method invoked");}
	 // void sum(Long d){System.out.println("c method invoked");}
	  public static void main(String args[]){
	  OverloadingCalculation3 obj=new OverloadingCalculation3();
	  obj.sum(null);//now ambiguity
	  }
	}