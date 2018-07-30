package Core_Java;
import java.util.*;
public class Demo
{
  public static void main(String args[])
  {
    List<String> cities = Arrays.asList("Delhi","Hyderabad","Chennai","Mumbai");
 
    System.out.println("\n\nTo print the values earlier to Java 8:");
    for(String str : cities)
    {
      System.out.print(str + "\t");
    }   
 
    System.out.println("\n\nTo print using Lamda in Java 8 in more readable way using type:");
    cities.forEach((String str) -> System.out.print(str + "\t"));
 
    System.out.println("\n\nTo print using Lamda in Java 8 without using type but using \"value\":");
    cities.forEach(value -> System.out.print(value + "\t"));
 
    System.out.println("\n\nTo print using more concisely with :: operator:");
    cities.forEach(System.out :: println);
  }
}