package org.greens;

public class TaskOne {
    public static void main(String[] args)
    {
  try
  {
        System.out.println("1");
      int sum = 9 / 0;             // Exception occurs
        System.out.println("2");
  }
  catch(ArithmeticException e)		// match found => execute 
  {
        System.out.println("3");
  }
   catch(Exception e)
  {
        System.out.println("4");
  }
  finally // finally => execute
  {
     System.out.println("5");
  }
     }
}
