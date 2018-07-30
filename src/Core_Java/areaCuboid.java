package Core_Java;


 class  Cuboid{
	 private final String name; 
	    private final int age;
	 
	 public    Cuboid(){
		 name="kk";
		 age=112;
	 }	   
	   public static void calculateVolume(double length,double breath,double height)
	    {		   
	     double volume = 0;
	     volume = (length * breath * height);
	     System.out.println("");
	     System.out.println("The Volume of Cuboid is : " + volume);

	    }

}

class areaCuboid extends Cuboid {
	 
	  public static void main(String[] args) {   
	  
		  Cuboid.calculateVolume(10.0,20.0,10.0);
	 
	 }
	}
