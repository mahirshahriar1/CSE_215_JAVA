import java.util.*;

public class ExceptionExample0_Sol {
  
   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter number 1: ");
      int number1 = in.nextInt();
      System.out.println("Please enter number 2: ");
      int number2 = in.nextInt();
	  try {
	      int div = number1/number2;
	      System.out.println("Division result = " + div);
	  } catch (ArithmeticException ex) {
		  System.out.println("Failed to divide numbers : " + ex.getMessage());
	  }
    
      
   }
}